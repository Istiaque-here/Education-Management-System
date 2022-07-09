/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Students;

import javax.swing.JOptionPane;
import java.sql.*;
import java.util.*;

/**
 *
 * @author USER
 */
public class Student {
    public String name;
    public int id;
    public int admissionId;
    public int birthDate, birthMonth, birthYear;
    public int mobileNumber;
    public String email;
    public String religion;
    public String gender;
    public String program;
    public String fathersName;
    public String mothersName;
    public int batch;
    public String section;
    public double cgpa;
    public double credit;
    public String password;
    
    // <editor-fold defaultstate="collapsed" desc="addmember method"> 
    public static void addmember(Student obj)throws Exception{

        Statement st=getConnection("institute").createStatement();
        ResultSet rs;
        String query=null;
        try
        {
            rs=st.executeQuery("select * from studentinfo");
            rs.close();
        }
        catch(Exception ex)
        {
            query="create table studentinfo("+
                        "program varchar(25), " +
                        "name varchar(20), " +
                        "id int, " +
                        "fathersName varchar(20), " +
                        "MothersName varchar(20), "+
                        "birthdate int, " +
                        "birthmonth int, " +
                        "birthyear int, " +
                        "mobileNumber int, " +
                        "email varchar(25), " +
                        "gender varchar(10), "+
                        "religion varchar(10));";

            st.executeUpdate(query);
        }
        try
        {
            rs=st.executeQuery("select * from student");
            rs.close();
        }
        catch(Exception ex)
        {
            query="create table student("+
                        "id int, " +
                        "name varchar(45), " +
                        "department varchar(45), " +
                        "batch int, " +
                        "section varchar(5), " +
                        "total_credit decimal(5, 2), "+
                        "temp decimal(5, 2), "+
                        "cgp decimal(5, 2), "+
                        ");";

            st.executeUpdate(query);
        }
        query="insert into studentinfo values('"+
                obj.program+
                "', '"+
                obj.name +
                "', "+
                obj.id +
                ", '"+
                obj.fathersName +
                "', '"+
                obj.mothersName +
                "', "+
                obj.birthDate +
                ", "+
                obj.birthMonth +
                ", "+
                obj.birthYear +
                ", "+
                obj.mobileNumber +
                ", '"+
                obj.email +
                "', '"+
                obj.gender+
                "', '"+
                obj.religion+
                "');";


        st.executeUpdate(query);
        query="insert into student values("+
                obj.id + ", '"+
                obj.name + "', '"+
                obj.program+ "', "+
                obj.batch+", '"+
                obj.section + "', "+
                0 +", "+
                0 +", "+
                0+ ");";
        st.executeUpdate(query);
        st.close();

        deletePending(Integer.toString(obj.admissionId));

    }
    // </editor-fold>
    
    
    
    // <editor-fold defaultstate="collapsed" desc="assign_course"> 
    public static void assign_course(int batch, Vector<String> course_name) throws Exception{
        Statement st=getConnection("institute").createStatement();
         try
        {
            ResultSet rs=st.executeQuery("SElect * from students_course_assign");
        }
        catch(Exception e)
        {
            st.executeUpdate("create table students_course_assign(batch int, course_1 varchar(40), course_2 varchar(40), course_3 varchar(40), course_4 varchar(40));");
        }
        
        st.executeUpdate("insert into students_course_assign VAlues("+batch+",'null','null','null','null');");
        
        for(int i=0; i<course_name.size(); i++)
        {
            st.executeUpdate("Update students_course_assign set course_"+Integer.toString(i+1)+"='"+course_name.elementAt(i)+"' where batch="+batch+";");
        }
        
    }
    // </editor-fold>
    
    
    
    // <editor-fold defaultstate="collapsed" desc="deletePending"> 
    public static void deletePending(String IDs)throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Statement st=getConnection("institute").createStatement();
        ResultSet rs=st.executeQuery("select nmbrOfPndng from counter where chck=390;");
        
        rs.next();
        
        int total=rs.getInt("nmbrOfPndng");
        
        String query="delete from pendingstudents where id="+IDs+";";
//        st.executeUpdate("SET SQL_SAFE_UPDATES=0;");
        st.executeUpdate(query);
//    JOptionPane.showMessageDialog(null, "Deleted!!! ");
        st.close();
        rs.close();

    }
    // </editor-fold>
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Getconnection"> 
    public static Connection getConnection(String database)throws Exception{
        String usrnm="root", ps="";
        Connection con;
        Statement st;
        try 
        { 
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, " mysql Driver missing");
        }
        try
        {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+database, usrnm, ps);
        }
        catch(Exception e)
        {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/", usrnm, ps);
            st=con.createStatement();
            st.executeUpdate("create database institute");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+database, usrnm, ps);
            st.close();            
        }

        return con;
    }
    // </editor-fold>
    
    
    
    // <editor-fold defaultstate="collapsed" desc="addToPending"> 
    public static void addToPending(Student obj) throws Exception{

        String usrnm="root";
        String ps="Matirpatro@5";

        try 
        { 
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, " mysql Driver missing");
        }

        Statement st=getConnection("institute").createStatement();
        ResultSet rs;
        try{
            String query="select * from pendingstudents";
            rs=st.executeQuery(query);
        }
        catch(Exception ex)
        {

            String query="create table pendingstudents(name varchar(45)," +
                        "id int," +
                        "birthdate int," +
                        "birthmonth int," +
                        "birthyear int," +
                        "mobileNumber int," +
                        "email varchar(45)," +
                        "religion varchar(10)," +
                        "gender varchar(10)," +
                        "program varchar(45)," +
                        "fathersName varchar(45)," +
                        "MothersName varchar(45));";
            
            st.executeUpdate(query);
        }
        try
        {
            String query="select * from counter";
            rs=st.executeQuery(query);
        }
        catch(Exception e)
        {
            String query="Create table counter(nmbrOfPndng int, lastStudentId int, lastTeacherId int, chck int);";
            st.executeUpdate(query);
            query="insert into counter values(0, 0, 0, 390);";
            st.executeUpdate(query);
        }
        rs=st.executeQuery("select nmbrOfPndng from counter where chck=390");
        rs.next();
//        int d=rs.getInt("nmbrOfPndng");d++;
//        st.executeUpdate("update counter set nmbrOfPndng="+Integer.toString(d)+" where chck=390;");
        

        String q="Insert into pendingstudents values('"+obj.name
                +"', "
                +Integer.toString(obj.admissionId)
                +", "
                +Integer.toString(obj.birthDate)
                +", "
                +Integer.toString(obj.birthMonth)
                +", "
                +Integer.toString(obj.birthYear)
                +", "
                +Integer.toString(obj.mobileNumber)+", "+
                "'"+obj.email+"', '"+obj.religion+"', '"+obj.gender+"', '"+
                obj.program+"', '"+obj.fathersName+"', '"+obj.mothersName+"');";

        st.executeUpdate(q);
        st.close();
    }
    // </editor-fold>
    
}
