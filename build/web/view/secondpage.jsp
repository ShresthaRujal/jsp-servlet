<%-- 
    Document   : secondpage
    Created on : Feb 27, 2017, 3:52:34 PM
    Author     : root
--%>

<%@page import="com.formwithmvc.model.Employee"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.io.*,java.util.*,java.sql.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/style.css" rel="stylesheet" >
        <link href="css/bootstrap.min.css.css" rel="stylesheet" >
        
        <title>JSP Page</title>
    </head>
    <body>
        <div> 
            <form action="EmployeeController" method="get" class="login">
                <table border="1" align="center" id="table-spacing" style="width: 75%">
                           <tr class="bold">
                               
                               <th height="30">Id</th>
                                <th>Email</th>
                                <th>Password</th>
                                <th>First Name</th>
                                <th>Last Name</th>
                                <th><img src="../img/upload.png" alt="" style="width:20px; height:auto;"></th>
            </tr>
            
            <tbody>
                
                 
            <c:forEach items="${display}" var="display">
            
            <tr>
                <td width="5%" height="10">${display.id}</td>
                <td width="15%">${display.fname}</td>
                <td width="15%">${display.lname}</td>
                <td width="15%">${display.email}</td>
                <td width="15%">${display.password}</td>
                
                <td width="7%">
                  <a class="btn btn-success btn-danger" href="EmployeeController?editid=${display.id}&action=update">Update!</a>
                </td>
                <td width="7%">
                  <a class="btn btn-success btn-danger" href="EmployeeController?editid=${display.id}&action=delete">Delete!</a>
                </td>
                
            </tr>
            </c:forEach>
            
            </tbody>
          
        </table>
            </form>
                </div>
        
    </body>
</html>
