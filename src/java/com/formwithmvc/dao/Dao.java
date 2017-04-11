/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.formwithmvc.dao;

import com.formwithmvc.DBhandeler.DbConnector;
import com.formwithmvc.model.Employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author root
 */
public class Dao {

    public static ArrayList<Employee> select() {
        //To throwchange body of generated methods, choose Tools | Templates.
        ArrayList<Employee> list=new ArrayList<Employee>();
        Connection con= DbConnector.getConnection();
        
        try {
            Statement stmt=con.createStatement();
        
            String sql="SELECT id,First_Name,Last_Name,Email,Password FROM Employee";

            
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
             list.add(new Employee(rs.getInt("id"),rs.getString("Email"),rs.getString("Password"),rs.getString("First_Name"),rs.getString("Last_Name")));
            }
            
            
            
        } catch (SQLException ex) {
           
        }
        return list;
        
    }

    public static int selectById(int id) {

           // ArrayList<Employee> list = new ArrayList<Employee>();
        int list = 0;
            Connection con=DbConnector.getConnection();
            String sql="select id from Employee where id='"+id+"'";
         try{
              Statement st = con.createStatement();
              ResultSet rs =  st.executeQuery(sql); 
              while(rs.next()){
                  list=rs.getInt("id");
                  Employee emp=new Employee();
                  emp.setId(list);
              }
              
            }
            catch(Exception e){
               
            }
         return list;
    }

    public static int deletebyID(int id) {

        Connection con=DbConnector.getConnection();
        try {
            Statement stmt=con.createStatement();
            String sql="Delete from Employee where id='"+id+"'";
             int value=stmt.executeUpdate(sql);
             return value;
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Deletion failure");
            return 0;
        }
        
        
    

}

    public int insert(Employee emp) {
        //To changide body of generated methods, choose Tools | Templates.
        
        int status =0;
        
        Connection con=DbConnector.getConnection();
        
        String sql="Insert into Employee(First_Name,Last_Name,Email,Password) Values(?,?,?,?)";
        
        try {
            PreparedStatement ps;
            ps = con.prepareStatement(sql);
            
            ps.setString(1, emp.getFname());
            ps.setString(2, emp.getLname());
            ps.setString(3, emp.getEmail());
            ps.setString(4, emp.getPassword());
             status=ps.executeUpdate();
            
             con.close();
        } catch (SQLException ex) {
            System.out.println("section sql error.! ");
           
        }
        
    return status;
    }

    public int update(Employee emp) {
        //To change body of generated methods, choose Tools | Templates.
        int status=0;
        
        Connection con=DbConnector.getConnection();
       String sql="update Employee set First_Name='"+emp.getFname()+"',Last_Name='"+emp.getLname()+"',Email='"+emp.getEmail()+"',Password='"+emp.getPassword()+"' where id="+emp.getId()+"";
       try{
            Statement st = con.createStatement();
            st.executeUpdate(sql);
        }
        catch(Exception e){
            
        }
       return status;
    }

    
    
            
        
}