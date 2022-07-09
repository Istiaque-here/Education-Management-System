/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin.database;




import Admin.jframe.*;
import Students.*;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;



public class PendingStudentsDatabase
{

    public static void main(String[] args)throws Exception {
        String usrnm="root";
        String ps="";
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(ClassNotFoundException e)
        {
            JOptionPane.showMessageDialog(null, "Driver no found");
        }
        try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/institute", usrnm, ps);
        }
        catch(Exception e)
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/", usrnm, ps);
            Statement st=con.createStatement();
            st.executeUpdate("create database institute");
            st.close();
            con.close();
        }
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/institute", usrnm, ps);
        Statement st=con.createStatement();
        try
        {
            ResultSet rs=st.executeQuery("select * from pendingstudents");
        }
        catch(Exception e)
        {
            st.executeUpdate("create table student(serialno int, id int, name varchar(15), age int(3));");
        }
        
        ResultSet rs=st.executeQuery("select nmbrOfPndng from counter where chck=390;");
        rs.next();
        int total=rs.getInt("nmbrOfPndng");

        String get="Select * from pendingstudents;";
        rs=st.executeQuery(get);
        
        Vector<Student> data=new Vector<Student>();
        while(rs.next())
        {

            Student tmp=new Student();
            tmp.program=(rs.getString("program"));
            tmp.name=(rs.getString("Name"));
            tmp.admissionId=rs.getInt("id");
            tmp.fathersName=(rs.getString("fathersName"));
            tmp.mothersName=(rs.getString("MothersName"));
            tmp.birthDate=Integer.parseInt(rs.getString("birthdate"));
            tmp.birthMonth=Integer.parseInt(rs.getString("birthmonth"));
            tmp.birthYear=Integer.parseInt(rs.getString("birthyear"));
            tmp.mobileNumber=Integer.parseInt(rs.getString("mobileNumber"));
            tmp.email=(rs.getString("email"));
            tmp.gender=(rs.getString("gender"));
            tmp.religion=(rs.getString("religion"));
            data.add(tmp);

        }

        con.close();
        st.close();
        rs.close();
        new PendingStudents(data).Show(data);
    }
    
    
    
    
    
    
    
    
    
    //------------------------------------------------------------------
    public static void admitselected(Vector<String> data)throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/institute", "root", "");
        Statement st=con.createStatement();
        ResultSet rs;
        String query;
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
            st.close();
        }
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code">
        query="insert into studentinfo values('"+
                data.elementAt(0)+
                "', '"+
                data.elementAt(1) +
                "', "+
                data.elementAt(2) +
                ", '"+
                data.elementAt(3) +
                "', '"+
                data.elementAt(4) +
                "', "+
                data.elementAt(5) +
                ", "+
                data.elementAt(6) +
                ", "+
                data.elementAt(7) +
                ", "+
                data.elementAt(8) +
                ", '"+
                data.elementAt(9) +
                "', '"+
                data.elementAt(10)+
                "', '"+
                data.elementAt(11)+
                "');";
        // </editor-fold>
        
        st=con.createStatement();
        st.executeUpdate(query);
        st.close();
        con.close();
        deletePending(data.elementAt(2));
    }
    //--------------------------------------------------------------------------------
    
    
    
    //--------------------------------------------------------------------------------
    public static void deletePending(String IDs)throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/institute", "root", "");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select nmbrOfPndng from counter where chck=390;");
        rs.next();
        int total=rs.getInt("nmbrOfPndng");

        String dd="delete from pendingstudents where id="+IDs+";";
        System.out.println(dd);
        st.executeUpdate(dd);

        st.close();
        con.close();
        rs.close();

    }
    //--------------------------------------------------------------------------------
    
    
}
