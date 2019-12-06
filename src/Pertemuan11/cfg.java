/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan11;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author gemss
 */
public class cfg{
    
    Statement st;
    Connection con;
    ResultSet rs;
    
    public Connection conn(){
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String user = "gemss";
            String pass = "r00t";
            
            con = DriverManager.getConnection("jdbc:mysql://localhost/javaxx?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC", user, pass);
            st = con.createStatement();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Koneksi error " + e);
        }
        
        return con;
    }
    
}
