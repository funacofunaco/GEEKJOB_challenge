<%-- 
    Document   : while-renshu
    Created on : 2018/06/25, 15:27:02
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
        int key =1000;
        int count = 0;
        while(key<=100 == false){
            key =key / 2;
            count++;
            out.print(count + "回目のループで値は" + key +"<br>");
        }
        %>
        </body>
</html>
