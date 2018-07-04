<%-- 
    Document   : Login
    Created on : Jun 5, 2018, 10:26:28 AM
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
       <!--transfer data to loginbean-->
       <jsp:useBean id="login" class="bean.LoginBean" scope="session">
       </jsp:useBean>
       <jsp:setProperty name="login" property="username" param="uid"></jsp:setProperty>
       <jsp:setProperty name="login" property="password" param="pwd"></jsp:setProperty>
       
       <!--output value of bean-->
       <p>You have submit</p>
       <jsp:getProperty name="login" property="username"></jsp:getProperty>
       <p>Password:${login.password}</p><!--good style-->
       <p>Password:<%=login.getPassword()%></p><!--bad style-->
       <p>
           Go to index page click <a href="index.jsp">here</a>
       </p>
    </body>
</html>
