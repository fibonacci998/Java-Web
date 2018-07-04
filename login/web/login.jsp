<%-- 
    Document   : login
    Created on : Jun 2, 2018, 11:48:38 PM
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
        <div>LOGIN FORM</div>
        <form method="POST" action="RegisterServlet">
            <p>Email:<input type="email" name="txtEmail"></p>
            <p>Fullname:<input type="text" name="txtName"></p>
            <p>Password:<input type="password" name="txtPass"></p>
            <p>Re-Password:<input type="password" name="txtRePass"></p>
            <p><input type="submit" value="Register"></p>
        </form>
        <h3>${error}</h3>
    </body>
</html>
