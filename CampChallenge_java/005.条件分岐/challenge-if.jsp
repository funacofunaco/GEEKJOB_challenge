<%-- 
    Document   : challenge-if
    Created on : 2018/05/28, 19:12:35
    Author     : guest1Day
--%>
        <!--変数の値が１の場合 ... 「１です！」と表示する変数の値が２の場合 ...
        「プログラミングキャンプ！」と表示する
        それ以外の場合 ... 「その他です！」と表示する-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>ifを使う！</h1>

        <%
           int num = 3;
           if(num==1){
               out.print("1です！");
           }else if(num==2){
               out.print("プログラミングキャンプ！");
           }else{
               out.print("その他です！");
           }
           
           
           
            %>
    </body>
</html>
