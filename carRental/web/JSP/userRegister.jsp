<%-- 
    Document   : userRegister
    Created on : Mar 9, 2016, 7:54:12 PM
    Author     : Mohit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Register</title>
    </head>
    <body>
        <form  name="ContactForm" action="../UserRegisterServlet.do" ">
            <table border="1">
               
                    <tr>
                        <td>Enter First Name:</td>
                        <td><input type="text" name="firstName" value="" /></td>
                    </tr>
                    <tr>
                        <td>Enter Last Name:</td>
                        <td><input type="text" name="lastName" value="" /></td>
                    </tr>
                    
                    
                   <tr>
                        <td>UserName:</td>
                        <td><input type="text" name="UserName" value="" /></td>
                    </tr>
                    
                     <tr>
                        <td>Password:</td>
                        <td><input type="text" name="Password" value="" /></td>
                    </tr>
                    
                    <tr>
                        <td><input type="submit" value="Register" name="s" /></td>
                        <td><input type="reset" value="Reset" name="s" /></td>
                    </tr>
                    
                    
                </tbody>
            </table>
            
          
            
            
            
            
        </form>
    </body>
</html>
