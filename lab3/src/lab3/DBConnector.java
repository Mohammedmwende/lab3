/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author user
 */import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnector {
  Connection con = null;
    
public DBConnector(){
    try {
        Class.forName("com.mysql.jdbc.Driver");
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(DBConnector.class.getName()).log(Level.SEVERE, null, ex);
    }
               
        
    try {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ics1202","root","");
//            Statement st = con.createStatement();
//            ResultSet rs = st.executeQuery("Select * from student_details");
//            while(rs.next()){
//                System.out.println(rs.getInt("student_no") + ", " +rs.getString("first_name") + ", " +rs.getString("last_name") +", " +rs.getInt("gender") + ", " + rs.getString("programme"));
    } catch (SQLException ex) {
        Logger.getLogger(DBConnector.class.getName()).log(Level.SEVERE, null, ex);
    }
            }
            
      
}  

