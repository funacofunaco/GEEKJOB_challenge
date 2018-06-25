<%-- 
    Document   : for-bun3
    Created on : 2018/06/25, 14:51:49
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
        <h1>1~100まで足し算する</h1>
        <%
            long j = 0;
            for(long i=1;i<=100;i++){
            j = j+i;
            out.print(j+" "+ i +"回目<br>");
                    }
            %>
    </body>
</html>
