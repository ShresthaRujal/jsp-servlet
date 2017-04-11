/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.formwithmvc.controller;

import com.formwithmvc.dao.Dao;
import com.formwithmvc.model.Employee;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author root
 */
public class EmployeeController extends HttpServlet {
    public int id;


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //for display
        request.setAttribute("display", Dao.select());
       
        RequestDispatcher requestdispatcher = request.getRequestDispatcher("view/secondpage.jsp");
        requestdispatcher.forward(request, response);
       
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           
            int sid = Integer.parseInt(request.getParameter("editid"));
                
              this.id=sid; 
        
            if("update".equals(request.getParameter("action"))){
             
              request.setAttribute("data",Dao.selectById(sid));
            RequestDispatcher rd = request.getRequestDispatcher("view/try.jsp");
            rd.forward(request,response);
            
            
            }
            else{
                int value=Dao.deletebyID(id);
                if(value>0){
                    PrintWriter pr= response.getWriter();
                    pr.print("<script>alert('Deleted');</script>");
                    processRequest(request, response);
                }
            }
           
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
   
                Dao dao=new Dao();
               
               String choice=request.getParameter("button");
               
               
               String fname=request.getParameter("firstname");
               String lname=request.getParameter("lastname");
               String email=request.getParameter("email");
               String pass=request.getParameter("password");
               
               Employee emp=new Employee();
               
               switch(choice){
               
                   case "SignUp!":

                       emp.setId(0);
                        emp.setFname(fname);
                        emp.setLname(lname);
                        emp.setEmail(email);
                        emp.setPassword(pass);
                        
                       
                        dao.insert(emp);
                            processRequest(request, response);

                    break;
                    
                   case "Update":
                       
                       System.out.println(this.id);
                       
                            emp.setId(this.id);
                            emp.setFname(fname);
                            emp.setLname(lname);
                            emp.setEmail(email);
                            emp.setPassword(pass);

                            dao.update(emp);
                         processRequest(request, response);
               }
        }
        

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
