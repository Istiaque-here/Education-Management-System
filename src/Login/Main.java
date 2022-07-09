/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Login;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Utsho
 */
public class Main { 
    public static void main(String[] args){
        Welcome.welcome();
        try{
            Statement st = MyData.getSt();
            st.executeQuery("SELECT * FROM password_manager");
        }catch(Exception e){
            MyData.commandUpdate("CREATE TABLE IF NOT EXISTS password_manager (username INT NOT NULL, password VARCHAR(45) NOT NULL, profession VARCHAR(45) NOT NULL);");
            MyData.commandUpdate("INSERT INTO password_manager VALUE(123, 'admin', 'admin')");
        }
        Login.run();
    }
}
