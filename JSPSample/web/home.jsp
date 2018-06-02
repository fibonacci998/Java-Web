<%-- 
    Document   : home
    Created on : May 31, 2018, 8:06:03 AM
    Author     : tuans
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body> 
        
        <%@include file="header.jsp" %>
        <h1>Content of page goes here</h1>
        <p>Today is <%=today%></p>
        <jsp:include page="footer.html"></jsp:include>
    </body>
</html>
