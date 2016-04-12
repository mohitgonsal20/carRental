<%-- 
    Document   : dealerRegister
    Created on : Mar 4, 2016, 9:15:45 PM
    Author     : Mohit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <form method="post" action="../DealerRegisterServlet.do" >
            <table border="1">
               
                    <tr>
                        <td>Enter Name :</td>
                        <td><input type="text" name="dealerName" value="" /></td>
                    </tr>
                    <tr>
                        <td>Enter User Name :</td>
                        <td><input type="text" name="dealerUserName" value="" /></td>
                    </tr>
                   <tr>
                        <td>Enter Password :</td>
                        <td><input type="text" name="dealerPassword" value="" /></td>
                    </tr>
                     <tr>
                        <td><input type="submit" value="Register" name="s" /></td>
                        <td><input type="reset" value="Reset" name="s" /></td>
                    </tr>
                     
            </table>
            
            
            
        </form>
        
    </body>
</html>
