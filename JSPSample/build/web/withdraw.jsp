<%-- 
    Document   : withdraw
    Created on : May 31, 2018, 8:38:35 AM
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
        <%
            String date=request.getParameter("date");
            String [] code=request.getParameterValues("code");
        %>
        <h1>Withdraw transaction detail:</h1>
        <p>Date: <%=date%></p>
        <p>Transaction code:<%=code[0]%></p>
        <p>Receive code: <%=code[1]%></p>
    </body>
</html>
