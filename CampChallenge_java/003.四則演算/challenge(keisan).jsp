<%-- 
    Document   : challenge1-2
    Created on : 2018/05/22, 18:07:52
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
        <%
        int a = 1;
        final int b = 10;
        int result =a+b;
        out.print("a+bは？<br>変数aは");
        out.print(a);
        out.print("<br>定数bは");
        out.print(b);
        out.print("<br>答えは");
        out.print(result);
        out.print("<br>a++は？");
        out.print(a++);
        out.print("<br>↑の値は変わらないけど、もう一度表示すると↓<br>a=");
        out.print(a);
        out.print("<br>a×bは？<br>");
        out.print(a*b);
        out.print("<br>b/aは？<br>");
        out.print(b/a);
        out.print("<br>b%aは？<br>");
        out.print(b%a);
        out.print("<br>最後に--a<br>a=");
        out.print(--a);
        
            %>
    </body>
</html>
