<%-- 
    Document   : ArrangeJob
    Created on : Jul 15, 2018, 11:01:10 PM
    Author     : tuans
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="AssignJobServlet">
            <input type="hidden" name="nameJob" value="${param.nameJob}"/>
            <h2>Assign a job "${param.nameJob}" to an employee</h2>
            <p>
                Select an employee
                <select name="nameAssign">
                    <c:forEach items="${listByName}" var="a">
                        <option>${a}</option>
                    </c:forEach>
                </select>
            </p>
            <input type="submit" value="Assign">
        </form>
    </body>
</html>
