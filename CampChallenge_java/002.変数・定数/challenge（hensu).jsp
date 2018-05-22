<%-- 
    Document   : challenge1-1
    Created on : 2018/05/22, 17:11:47
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
        <h1>自己紹介を変数で表示！</h1>
        <%
        String name = "私の名前は久保亜莉紗です。";
        out.print(name);
            %>
    </body>
</html>
