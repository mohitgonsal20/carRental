<%-- 
    Document   : buyForm
    Created on : Apr 10, 2016, 1:28:07 PM
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
        <%
            String S1=request.getParameter("mod1");
            String S2=request.getParameter("nam");
        %>
        
        <%=S1%>
        <%=S2%>        
        
        hello :
        ${nam}
        
        
        <form method="post" action="../Buy.do">
        <table>
            <tr>
                <td>
                    Bank Name
                </td>
                <td ><input type="text" name="BankName">
                    
                </td>
            </tr>
             <tr>
                <td>
                    Account Number
                </td>
                 <td ><input type="text" name="AccNo">
                    
                </td>
            </tr>
            
             <tr>
                <td>
                    Transaction Number
                </td>
                 <td ><input type="text" name="TxNo">
                    
                </td>
            </tr>
            <td>
                <input type="hidden" name="param1" value=<%=S1%> />
                <input type="hidden" name="param2" value="xyz" />
                <input type="hidden" name="param3" value=<%=S2%> />
                    
                <input type="submit" name="submit" value="Buy">
                
            </td>
        </table>
    </form>
        
        
        
    </body>
</html>
