<%-- 
    Document   : for-bun
    Created on : 2018/06/25, 14:20:10
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>8を20乗した</h1>
        <%
        long a = 1;
        for(long i=1;i<20;i++){
        a = a * 8;
        out.print(a + "<br>");
        }

            %>
    </body>
</html>
