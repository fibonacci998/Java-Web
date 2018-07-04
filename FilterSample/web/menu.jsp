<%-- 
    Document   : menu
    Created on : Jun 19, 2018, 10:01:28 AM
    Author     : tuans
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style type="text/css">
        a{text-decoration: none;padding: 10px;}
    </style>
    <body>
        <p>
            <a href="/FilterSample/home.jsp">Home</a>
            <a href="/FilterSample/admin/index.jsp">Admin</a>
            <a href="/FilterSample/user/index.jsp">User</a>
            <c:if test="${not empty sessionScope.user}">
                Welcome ${sessionScope.user.username}
                <a href="#">Logout</a>
            </c:if>
        </p>
    </body>
</html>
