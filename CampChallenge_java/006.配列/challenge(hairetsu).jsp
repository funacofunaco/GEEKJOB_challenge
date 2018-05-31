<%-- 
    Document   : che
    Created on : 2018/05/31, 19:45:19
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
        <%--配列型から   --%>
  <%@page import="java.util.ArrayList"%>
  
  <%
         String[] list1 = {"10", "100", "soeda", "hayashi", "-20", "118", "END"};
         
         for(int i = 0;i<list1.length;i++){
           out.print(i+1 + "." + list1[i]);
           out.print("<br>");
           
                             
         }
        out.print("<br>ArrayListでもやってみる<br><br>");
   
   

        ArrayList<String> alist = new ArrayList<String>();
        alist.add("10");
        alist.add("100");
        alist.add("soeda");
        alist.add("hayashi");
        alist.add("-20");
        alist.add("118");
        alist.add("end");
 
        for(int i = 0;i<alist.size();i++){
          out.print(i+1 + "." + alist.get(i));
          out.print("<br>"); 
        }
   %>     
        
    </body>
</html>
