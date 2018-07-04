<%-- 
    Document   : login
    Created on : Jun 19, 2018, 9:58:44 AM
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
        <!---->
        <jsp:include page="menu.jsp"/>
        <p style="color:red;font-style: italic">
            ${sessionScope.loginError}
        </p>
        <form action="LoginServlet" method="POST">
            <p>Username <input type="text" name="uid"></p>
            <p>Password <input type="password" name="pwd"></p>
            <p><input type="submit" value="Sign in"></p>
        </form>
    </body>
</html>
