/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lat;

import java.sql.*;

/**
 *
 * @author gemss
 */
public class cfg {
    
    public static Connection mysqlconfig;
    public static Connection configDB(){
        if(mysqlconfig == null){
            try{

                String sql = "jdbc:mysql://localhost/javaxx?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
                String us  = "gemss";
                String ps  = "r00t";

                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                mysqlconfig = DriverManager.getConnection(sql, us, ps);

            }catch (SQLException e){
                System.err.println("Koneksi Error" + e.getMessage());
            }
        }
        return mysqlconfig;
        
    }
    
}
