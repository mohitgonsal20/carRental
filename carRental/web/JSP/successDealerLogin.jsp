<%-- 
    Document   : successDealerLogin
    Created on : Mar 18, 2016, 12:23:52 AM
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
        Hello ${dealer.dealerName}<br>
        <a href="JSP/addCarDealer.jsp">  Add Car</a><br />
        <a href="./DisplayCars.do">  Buy Car</a><br /> 
        <a href="./PendingOfferServlet.do?dname1=${dealer.dealerName}">Pending Offers</a>
        ${message1}
    </body>
</html>
