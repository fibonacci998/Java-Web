<%-- 
    Document   : index.jsp
    Created on : Jun 7, 2018, 7:49:43 AM
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
        <jsp:useBean id="login" class="bean.LoginBean" scope="session">
        </jsp:useBean>
        
        <p>You had submit</p>
        <jsp:getProperty name="login" property="username"></jsp:getProperty>
        <p>Password:${login.password}</p><!--good style-->
        <p>Password:<%=login.getPassword()%></p><!--bad style-->
    </body>
</html>
