<%-- 
    Document   : index
    Created on : Feb 26, 2017, 9:58:04 PM
    Author     : root
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.formwithmvc.dao.Dao" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
          <link rel="stylesheet" href="css/style.css">
          <link rel="stylesheet" href="css/bootstrap.min.css">
    </head>
    <body class="register">

            <form action="EmployeeController" name="signup" method="post" align="center" class="login">
                <div>
                    <h1 align="center" id="headerstyle" class="bold">Sign Up!</h1>
                    
        <div>
                <div>
                    <table id="table-spacing" style="border-collapse: collapse;
                    width: 100%;">
                        <tr>
                                
                            <td id="td"><label for="login">
                                        FirstName:
                                        </label>
                                    </td>
                                    
                                
                                <td>
                                        <label for="login">
                                            <input type="text" name="firstname" placeholder="Your first name!" autofocus="">   </label>                                     </label>
                                    </td>
                                    
                        </tr>
                                <tr><td>
                                        <label for="login">
                                         LastName:
                                        </label>
                            </td>
                            <td>
                                <label for="login">
                                    <input type="text" name="lastname" placeholder="Your last name!"></label>
                            </td>
                                </tr>
                                <tr>
                                    <td><label for="login">
                                        Email :
                                        </label>
                                    </td>
                                    <td>
                                        <label for="login">
                                        <input type="text" name="email" placeholder="Your email!" >
                                        </label>
                                    </td>
                                </tr>
                                
                                <tr><td>
                                        <label for="login">
                                         Password:
                                        </label>
                            </td>
                            <td>
                                <label for="login">
                                    <input type="password" name="password" placeholder="Your Password!"></label>
                            </td>
                                </tr>
                                <tr>
                                    <td></td>
                                
                                <td class="forgot-password">
                                    <style>
                                    a:hover{
                                        color: white; 
                                        
                                    }
                                </style>
                                <a href="view/findId.jsp">Forgot Account !</a></td>
                                    <td style="float: right">
                                            
                                                <input class="btn btn-success" type="submit" value="SignUp!" name="button">
                                                
                                            
                                        </td>    
                                    
                                </tr>
                                
                                <tr>
                                    <td>
                                        </td>
                                </tr>
                                
                    </table>
                </div>
                
                
                    
        </div>
                </div>
            </form>
        
        
    </body>
</html>
