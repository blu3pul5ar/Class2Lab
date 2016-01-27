<%-- 
    Document   : Welcome
    Created on : Jan 27, 2016, 1:02:16 PM
    Author     : Nicholas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <body>
        <%
            Object msg = request.getAttribute("name");
            if(msg !=null){
                out.println(msg);
            }
            else{
                out.println("error");
            }
            %>
        
    </body>
</html>

