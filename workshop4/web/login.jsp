<%-- 
    Document   : login.jsp
    Created on : May 31, 2018, 3:40:46 PM
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
        <form action="loginController">
            <p>Username: <input type="text" name="txtUsername"></p>
            <p>Password: <input type="password" name="txtPassword"></p>
            <p><input type="checkbox" name="chkRemember" value="true">Remember me</p>
            <p><input type="submit" value="login"></p>
        </form>
    </body>
</html>
