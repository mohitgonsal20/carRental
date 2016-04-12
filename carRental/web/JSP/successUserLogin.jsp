<%-- 
    Document   : successUserLogin
    Created on : Oct 22, 2015, 1:30:23 PM
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
        Hello ${user.firstName}<br>
        
        <a href="JSP/addCarUser.jsp">  Add Car</a><br />
        <a href="./DisplayCars.do">  Buy Car</a><br />
        <a href="./CheckStatusServlet.do?id=${user.firstName}">Check Status</a>
        ${message1}
        
        
    </body>
</html>
