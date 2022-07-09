package Login;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Utsho
 */
public class MyData {
    
    // Getting new password
    private static Connection loadDrive() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/institute", "root", "");
    }
    
    // checking Password
    protected static ResultSet matchPassword(String user, String pass, String profession) throws Exception{
        try{
                String query = "SELECT * FROM password_manager WHERE username = "+user+" AND password = \""+pass+"\" AND profession = \""+profession+"\"";
                return loadDrive().createStatement().executeQuery(query);
        }
        catch(Exception e){
            // NEVER USED
//            JOptionPane.showMessageDialog(null, "Worng Password / username");
            return null;
        }
    }
    
    // Changing Password
    protected static void setPassword(String user, String pass, String profession) throws Exception{
        String query = "UPDATE password_manager set password = '" + pass + "' WHERE username = " + user;
        try{
            loadDrive().createStatement().executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Password Changed Successfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Something went worng...\n Try Again");
        }
    }
    
    // Finding short name of Teacher
    public static String getShortName(String id) throws Exception{
        String query = "SELECT short_name FROM teacher_info where id = " + id;
        try{
            ResultSet res = loadDrive().createStatement().executeQuery(query);
            if(res.next()){
                return res.getString("short_name");
            }
            else{
                new Exception();
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "No Teacher found!\n Please add Teacher of add short_name of the teacher");
            return null;
        }
        return null;
    }
    public static String getShortName(String course, String nUll){
        String query = "SELECT * FROM teachers_course_assign WHERE course_1 = '"+ course + "' OR course_2 = '"+ course + "' OR course_3 = '"+ course + "' OR course_4 = '"+ course + "'";
        try{
            ResultSet found = loadDrive().createStatement().executeQuery(query);
            if(found.next()){
                return found.getString("short_name");
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Cannnot find short name of the teacher");
        }
        return null;
    }
    // Combobox Updating...
    public static ResultSet updateCombo(String shortName) throws Exception {
        String query = "SELECT * FROM teachers_course_assign WHERE short_name = '" + shortName + "'";
        try{
               return loadDrive().createStatement().executeQuery(query);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "No Course Assigned to you");
            // This is a corner case
        }
        return null;
    }
    public static ResultSet updateCombo(String batch, String nUll){
        String query = "SELECT * FROM students_course_assign WHERE batch = " + batch;
        try{
               return loadDrive().createStatement().executeQuery(query);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "No Course Assigned to you");
            // This is a corner case
        }
        return null;
    }
    
    // Creating Mark Table
    public static void createMarkTable(String course) throws Exception{
        // Creating Mark Table
        int batch = 0;
        try{
            batch = getBatch(course);
            String query = "CREATE TABLE IF NOT EXISTS " + course + "_mark SELECT id, name FROM student WHERE batch = " + String.valueOf(batch);
            loadDrive().createStatement().executeUpdate(query);
            query = "ALTER TABLE " + course + "_mark ADD COLUMN attendance DECIMAL(5,2) AFTER name, ADD COLUMN assignment DECIMAL(5,2) AFTER attendance, ADD COLUMN tutorial_1 DECIMAL(5,2) AFTER assignment, ADD COLUMN tutorial_2 DECIMAL(5,2) AFTER tutorial_1, ADD COLUMN midterm DECIMAL(5,2) AFTER tutorial_2, ADD COLUMN finalterm DECIMAL(5,2) AFTER midterm, ADD COLUMN cgpa DECIMAL(5,2) AFTER finalterm";
            loadDrive().createStatement().executeUpdate(query);
            query = "ALTER TABLE " + course + "_mark MODIFY COLUMN id INT PRIMARY KEY";
            loadDrive().createStatement().executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Marksheet Created");
        }
        catch(Exception e){
            updateMarkTable(course, batch);
        }
    }
    private static void updateMarkTable(String course, int batch) throws Exception{
        String query = "SELECT * FROM student WHERE batch = " + String.valueOf(batch);
        ResultSet list = loadDrive().createStatement().executeQuery(query);
        int counter = 0;
        while(list.next()){
            int id = list.getInt("id");
            query = "INSERT INTO " + course + "_mark VALUE (" + String.valueOf(id) + ", '" + list.getString("name") + "', NULL, NULL, NULL, NULL, NULL, NULL)";
            try{
                loadDrive().createStatement().executeUpdate(query);
                counter++;
            }
            catch(Exception e){
                //NOT IN USE
            }
        }
        JOptionPane.showMessageDialog(null, "Student Updated: " + String.valueOf(counter));
    }
    
    // Batch
    private static int getBatch(String course) throws Exception{
        String query = "SELECT * FROM students_course_assign WHERE course_1 = '" + course + "' OR course_2 = '" + course + "' OR course_3 = '" + course + "' OR course_4 = '" + course + "'";
        try{
            ResultSet temp = loadDrive().createStatement().executeQuery(query);
            if(temp.next()){
                return temp.getInt("batch");
            }
            else{
                new Exception();
            }
        }
        catch(Exception e){
            return 0;
        }
        return 0;
    }
    
    // Attendance
    public static void createAttendanceTable(String course) throws Exception{
        int batch = 0;
        try{
            batch = getBatch(course);
            String query = "CREATE TABLE IF NOT EXISTS " + course + "_attendance SELECT id, name FROM student WHERE batch = " + String.valueOf(batch);
            loadDrive().createStatement().executeUpdate(query);
            query = "ALTER TABLE " + course + "_attendance ADD COLUMN total INT NOT NULL AFTER name, ADD COLUMN courseplan VARCHAR(300) AFTER total, ADD COLUMN totalClass INT NOT NULL AFTER coursePlan";
            loadDrive().createStatement().executeUpdate(query);
//            query = "UPDATE " + course + "_attendance SET ="
            query = "ALTER TABLE " + course + "_attendance MODIFY COLUMN id INT PRIMARY KEY";
            loadDrive().createStatement().executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Attendancesheet Created");
        }
        catch(Exception e){
            // NOT IN USE
            updateAttendanceTable(course, batch);
        }
    }
    private static void updateAttendanceTable(String course, int batch) throws Exception{
        String query = "SELECT * FROM student WHERE batch = " + String.valueOf(batch);
        ResultSet list = loadDrive().createStatement().executeQuery(query);
        int counter = 0;
        while(list.next()){
            int id = list.getInt("id");
            query = "INSERT INTO " + course + "_attendance VALUE (" + String.valueOf(id) + ", '" + list.getString("name") + "', 0, DEFAULT, 0)";
            try{
                loadDrive().createStatement().executeUpdate(query);
                counter++;
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Attendance Table cannot update");
            }
        }
//        JOptionPane.showMessageDialog(null, "Student Updated: " + String.valueOf(counter));
    }
    public static void columnAutoIncrease(String course, String tableExtension, String column, String intValue){
        String query = "UPDATE " + course + "_" + tableExtension + " SET " + column + " = (" + intValue + " + 1) WHERE id != 0";
        try{
            loadDrive().createStatement().executeUpdate(query);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Cannot count todays class");
        }
        
    }
            
    public static ResultSet getResultSet(String course, String thisTable) throws Exception{
        String query = "SELECT * FROM " + course + "_" + thisTable;
        try{
            ResultSet list = loadDrive().createStatement().executeQuery(query);
            return list;
        }
        catch(Exception e){
            // NOT IN USE
//            JOptionPane.showMessageDialog(null, "No Student Found");
        }
        return null;
    }
    public static ResultSet getResultSet(String course, String id, String overl) throws Exception{
        String query = "SELECT * FROM " + course + " WHERE id = " + id;
        try{
            ResultSet list = loadDrive().createStatement().executeQuery(query);
            return list;
        }
        catch(Exception e){
            // NOT IN USE
//            JOptionPane.showMessageDialog(null, "No Student Found");
        }
        return null;
    }
    public static ResultSet getResultSet(String course, String tableExtension, String studentId, String nUll){
        String query = "SELECT * FROM " + course + "_" + tableExtension + " WHERE id = " + studentId;
        try{
            ResultSet list = loadDrive().createStatement().executeQuery(query);
//            list.next();
            return list;
        }
        catch(Exception e){
            // NOT IN USE
//            JOptionPane.showMessageDialog(null, "No Student Found");
        }
        return null;
    }
    public static void giveAttendance(String course, String id, String total_attendance){
        String query = "UPDATE " + course + "_attendance SET total = (" + String.valueOf(total_attendance) + " + 1) WHERE id = " + String.valueOf(id);
        try{
            loadDrive().createStatement().executeUpdate(query);
        }
        catch(Exception e){
            // NOT IN USE
        }
    }
    public static void updateData(String course, String conditionColumnValue, String settingColumn, String settingColumnValue, String tableExtension, String conditionColumn){
//        String query = INSERT INTO course_mark 
        String query = "UPDATE " + course + "_" + tableExtension + " SET " + settingColumn + " = " + settingColumnValue + " WHERE " + conditionColumn + " = " + conditionColumnValue;
        try{
//            JOptionPane.showMessageDialog(null, query);
            loadDrive().createStatement().executeUpdate(query);
//            JOptionPane.showMessageDialog(null, query);
        }catch(Exception e){
            // NOT IN USE
            JOptionPane.showMessageDialog(null, "MyData");
        }
    }
    public static void updateData(String course, String columnName, String columnValue){
        String query = "UPDATE " + course + "_attendance SET " + columnName + " = '" + columnValue + "' WHERE id!= 0";
        try{
            loadDrive().createStatement().executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Course-plan Updated");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Course-plan cannot be updated");
        }
    }
    public static void updateData(String course, String tableExtension, String columnName, String columnValue, String id){
        String query = "UPDATE " + course + "_" + tableExtension + " SET " + columnName + " = " + columnValue + " WHERE id = " + id;
        try{
            loadDrive().createStatement().executeUpdate(query);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Cannot update attendance in mark");
        }
    }
    public static void getResultSet(String table){
        String query = "SELECT * FROM " + table;
        try{
            loadDrive().createStatement().executeQuery(query);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, table + "Not Found");
        }
    }
    public static void updateData(String table, String id, String value, String credit, int nUl){
        String query = "UPDATE " + table + " SET temp = ( temp + " + value + "), total_credit = (total_credit + " + credit + ") WHERE id = " + id;
        try{
            loadDrive().createStatement().executeUpdate(query);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Temp value cannot update!");
        }
    }
    public static void commandUpdate(String query){
        try {
            loadDrive().createStatement().executeUpdate(query);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Cannot load driver.");
        }
    }
    public static double getCredit(String course){
        String query = "SELECT * FROM course_credit WHERE course = '" + course + "'";
        try{
            ResultSet list = loadDrive().createStatement().executeQuery(query);
            if(list.next()){
                return list.getDouble("credit");
            }
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Credit not found" + e);
        }
        return 0;
    }
    public static Statement getSt(){
        try {
            return loadDrive().createStatement();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return null;
    }
}
