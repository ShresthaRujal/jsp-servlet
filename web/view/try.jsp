<%-- 
    Document   : index
    Created on : Feb 26, 2017, 9:58:04 PM
    Author     : root
--%>

<%@page import="com.formwithmvc.model.Employee"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.formwithmvc.dao.Dao" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
          
          <link rel="stylesheet" href="css/bootstrap.min.css">
          
    </head>
    <body>        
        <div class="container">
            <div class="row">
               <div class="col-sm-2"></div>
               <h1 align="center">Update!!</h1>
                <div class="col-sm-8"  align="center">
                    
                        <form class="form-horizontal" action="EmployeeController" method="post">
                        
                        
<!--                        <div class="form-group">
                            <label hidden="hidden">Id:</label>
                            <div class="col-sm-5">
                            <input type="hidden" class="form-control" name="hidden"
                                   id="id" value=${student.id}>
                            </div>
                        </div>-->
                        
                        
                        
                        
                            <div class="form-group">
                            <label class="control-label col-sm-2" for="firstName">First Name:</label>
                            <div class="col-sm-5">
                                <input type="text" class="form-control" id="firstname" name="firstname" placeholder="Enter First Name" value="${student.fname}">
                            </div>
                         </div>
                         <div class="form-group">
                            <label class="control-label col-sm-2" for="lastName">Last Name:</label>
                            <div class="col-sm-5">
                                <input type="text" class="form-control" id="lastname" name="lastname" placeholder="Enter Last Name" value="${student.lname}">
                            </div>
                         </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="email">Email:</label>
                            <div class="col-sm-5">
                                <input type="email" class="form-control" id="email" name="email" placeholder="Enter Email" value="${student.email}">
                            </div>
                         </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="password">Password:</label>
                            <div class="col-sm-5">
                                <input type="password" class="form-control" id="password" name="password" placeholder="Enter Password" value="${student.password}">
                            </div>
                         </div>
                            <div class="form-group">
                           
                               
                                <input type="submit" class="btn btn-success" value="Update" name="button">
                                
                               
                                </div>
                            
                            
                    </form>
                        

                </div>
                <div class="col-sm-2"></div>
            </div>
        </div>
    </body>
</html>
