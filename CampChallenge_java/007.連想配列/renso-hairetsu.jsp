<%-- 
    Document   : renso-hairetsu
    Created on : 2018/06/19, 16:32:57
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
        <%@ page import="java.util.HashMap" %>
        <%
          
            HashMap<String, String> data1 =
                new HashMap<String, String>();
            HashMap<String, String> data2 =
                new HashMap<String, String>();
            HashMap<String, String> data3 =
                new HashMap<String, String>();
            HashMap<String, String> data4 =
                new HashMap<String, String>();
            
        data1.put("1","aaa");
        data4.put("hello" ,"world");
        data2.put("soeda","33");
        data3.put("20","20");
        
        out.print("キーが1の中身は" + data1.get("1") + "<br>");

        out.print("キーがhelloの中身は" + data1.get("1") + "<br>");

        out.print("キーがsoedaの中身は" + data2.get("soeda") + "<br>");
        
        out.print("キーが20の中身は" + data3.get("20") + "<br>");
        %>
        
    </body>
</html>
