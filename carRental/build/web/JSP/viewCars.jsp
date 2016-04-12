<%-- 
    Document   : viewCars
    Created on : Apr 6, 2016, 12:41:28 AM
    Author     : Mohit
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
       <table>
            <c:forEach var="car1" items="${pCars}"  >
                <form action="./JSP/buyForm.jsp&quest;mod1=${car1.model}&AMP;nam=${car1.cName}" method="post">
                
                <tr><td>Car Name:</td><td><c:out value="${car1.cName}" /> </td> </tr>
                <tr><td>Car Model:</td><td><c:out value="${car1.model}" /></td> </tr>
                <tr><td>Car Type:</td><td><c:out value="${car1.cType}" /> </td> </tr>
                <tr><td>Car Owner Name :</td><td><c:out value="${car1.owner}" /></td> </tr>
                <tr><td>Car Owner type:</td><td><c:out value="${car1.t2}" /></td> </tr>
                <tr><td><input type="submit" name="submit" value="Buy" ></td></tr>
                
                <tr><td>---------------</td></tr>
                <tr></tr>
                </form>
            </c:forEach>
          
        </table>
        
        
    </body>
</html>
