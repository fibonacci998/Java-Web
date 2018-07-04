<%-- 
    Document   : informationOrder
    Created on : Jun 12, 2018, 8:52:45 AM
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
    <body>
        <h3>Order complete</h3>
        <p>Your customer ID: ${custID}</p>
        <p>Your customer name: ${custName}</p>
        <p>Payment: ${payment}</p>
    </body>
</html>
