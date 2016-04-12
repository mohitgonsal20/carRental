<%-- 
    Document   : addCarUser
    Created on : Mar 22, 2016, 9:30:31 PM
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
        
        <form  name="ContactForm" action="../UserAddCarServlet.do">
            <table border="1">
               
                    <tr>
                        <td>Enter Car Name</td>
                        <td><input type="text" name="Cname" value="" /></td>
                    </tr>
                    
                    <tr>
                        <td>Model</td>
                        <td><input type="text" name="model" value="" /></td>
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
