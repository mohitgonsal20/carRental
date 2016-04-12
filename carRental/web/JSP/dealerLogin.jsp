<%-- 
    Document   : dealerLogin
    Created on : Mar 18, 2016, 12:12:13 AM
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

        <form method="post" action="../DealerLoginServlet.do">
        <table>
            <tr>
                <td>
                    UserName
                </td>
                <td ><input type="text" name="UserName_d">
                    
                </td>
            </tr>
             <tr>
                <td>
                    password
                </td>
                 <td ><input type="text" name="Password_d">
                    
                </td>
            </tr>
            <td>
                <input type="submit" name="submit">
                <input type="reset">
            </td>
        </table>
    </form>
    
    
    </body>
</html>
