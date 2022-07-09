
package Admin.database;
import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;

public class Teacher {
    public int id;
    public String name;
    public String short_name;

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
    public void addmember(Teacher a)throws Exception{
        Statement st=getConnection("institute").createStatement();

        try
        {
            ResultSet rs=st.executeQuery("Select * from teacher_info");
        }
        catch(Exception e)
        {

            st.executeUpdate("create table teacher_info(id int, name varchar(30), short_name varchar(5))");
        }
        String query="Insert into teacher_info values("+
                a.id+
                ", '"+
                a.name+
                "', '"+
                a.short_name+
                "');";
        st.executeUpdate(query);
         ResultSet rs=null;
            st=a.getConnection("institute").createStatement();
            try
            {
                rs=st.executeQuery("Select * from password_manager");
            }
            catch(Exception e){
                st.executeUpdate("create table password_manager(username int, password varchar(45), profession varchar(45));");
            }
            query="insert into password_manager values("+
                    a.id+", 'luteacherpass', "+
                    "'Teacher');";
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Teacher Password is: \"luteacherpass\"");

    }
    public static void assign_course(String Short_name, Vector<String> course_name)throws Exception {
        
        Statement st=getConnection("institute").createStatement();
        try
        {
            ResultSet rs=st.executeQuery("SElect * from teachers_course_assign");
        }
        catch(Exception e)
        {
            st.executeUpdate("create table teachers_course_assign(short_name varchar(45), course_1 varchar(40), course_2 varchar(40), course_3 varchar(40), course_4 varchar(40));");
        }
        
        st.executeUpdate("insert into teachers_course_assign VAlues('"+Short_name+"','null','null','null','null');");
        
        for(int i=0; i<course_name.size(); i++)
        {
            st.executeUpdate("Update teachers_course_assign set course_"+Integer.toString(i+1)+"='"+course_name.elementAt(i)+"' where short_name='"+Short_name+"';");
        }
    }
    
}
