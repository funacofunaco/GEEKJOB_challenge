<%-- 
    Document   : chellenge-switch
    Created on : 2018/05/28, 21:19:20
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
                int num1 = 10;
        switch ( num1 ) {
            case 1:
                out.print("one");
                break;
            case 2:
                out.print("two");
                break;
            default:
                out.print("想定外");
        }    
        
       out.print("<br>");
        
        char m1 = 'A';
        switch ( m1 ) {
            case 'A':
                out.print("英語");
                break;
            case 'あ':
                out.print("日本語");
                break;
            
        }    
         

%>
    </body>
</html>
