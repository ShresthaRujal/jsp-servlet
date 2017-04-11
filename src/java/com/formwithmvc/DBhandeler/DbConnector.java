/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.formwithmvc.DBhandeler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author root
 */
public class DbConnector {

    public static Connection getConnection(){
        
        Connection con=null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Cannot load Driver!");
        }
            
            try {
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","");
            } catch (SQLException ex1) {
                System.out.println("Database couldnot be loaded!!");
            }
            
        
        
        return con;
    }
    
}
