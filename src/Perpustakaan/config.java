/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perpustakaan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author person
 */
public class config {
     private static Connection MySQLConfig;
     
    public static Connection configDB()throws SQLException{
        try {
            String url="jdbc:mysql://localhost:3306/dbPerpustakaan";
            String user="root"; 
            String pass="";
            
            DriverManager registerDriver = DriverManager.registerDriver(new MySQL.JBDC.Driver());
            MySQLConfig=DriverManager.getConnection(url, user, pass);            
        } catch (SQLException e) {
            System.out.println("koneksi gagal "+e.getMessage());
        }    
    return MySQLConfig;    
    }
}
