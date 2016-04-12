<%-- 
    Document   : adminLogin
    Created on : Mar 2, 2016, 7:19:58 PM
    Author     : Mohit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="/carRental/Scripts/angular.min.js"></script>
    </head>
    <body>
        <div ng-app>
            {{ 2+3 }}
            <form method="post" action="../AdminLoginServlet.do">
        <table>
            <tr>
                <td>
                    UserName
                </td>
                <td ><input type="text" name="UserName">
                    
                </td>
            </tr>
             <tr>
                <td>
                    password
                </td>
                 <td ><input type="text" name="Password">
                    
                </td>
            </tr>
            <td>
                <input type="submit" name="submit">
                <input type="reset">
            </td>
        </table>
    </form>
            
        </div>
    </body>
</html>
