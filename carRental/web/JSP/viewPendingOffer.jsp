<%-- 
    Document   : viewPendingOffer
    Created on : Apr 10, 2016, 11:51:36 PM
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
        
        
        Following Request are pending :
        
        <table>
            <c:forEach var="car1" items="${pManage}"  >
                <form action="./UpdateServlet2.do?id=${car1.model}" method="post">
                
                <tr><td>User Name:</td><td><c:out value="${car1.bUser}" /> </td> </tr>
                <tr><td>Car Name:</td><td><c:out value="${car1.cName}" /></td> </tr>
                
                <tr><td>Bank Name :</td><td><c:out value="${car1.bankName}" /></td> </tr>
                <tr><td>Account No:</td><td><c:out value="${car1.accNo}" /> </td> </tr>
                
                <tr><td>Transaction No:</td><td><c:out value="${car1.Txno}" /> </td> </tr>
                <tr>
                    <td>Select Drop Site : </td>
                    <td>
                <select name="item">
                 <option value="Vasai">Vasai</option>
                 <option value="Borivali">Borivali</option>
                 <option value="Bandra">Bandra</option>
                </select>
                    </td>
                </tr>
                <tr><td><input type="radio" name="status1" value="approved">Approve </td><td><input type="radio" name="status1" value="rejected">Reject</td></tr>
                <tr><td><input type="submit" name="status1"></td></tr>
                <tr><td>---------------</td></tr>
                <tr></tr>
                </form>
            </c:forEach>
          
        </table>
        
       
        
    </body>
</html>
