<%-- 
    Document   : for-bun2
    Created on : 2018/06/25, 14:36:39
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
        <h1>Hello World!</h1>
        <%
            String show ="";
            String word = "花<br>";
            for(int i=0;i<30;i++){
            show  =show + word;
            }
            out.print(show);
        %>
            
    </body>
</html>
