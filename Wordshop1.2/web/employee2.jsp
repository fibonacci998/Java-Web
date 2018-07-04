<%-- 
    Document   : employee2
    Created on : Jun 28, 2018, 8:09:35 AM
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
        <form action="EmployeeController">
            Select an employee 
            <select name="employeeID" onchange="document.forms[0].submit()">
                <c:forEach var="e" items="${employees}">
                    <option value="${e.id}" ${e.id==param.employeeID ? "selected":""}>${e.name}</option>
                </c:forEach>
            </select>
            <p>List of accounts</p>
            <c:if test="${not empty accounts}">
                <table cellspacing="0" border="1">
                    <tr>
                        <th>UserID</th>
                        <th>DisplayName</th>
                        <th>JoinedDate</th>
                    </tr>
                    <c:forEach var="a" items="${accounts}">
                        <tr>
                            <td>${a.id}</td>
                            <td>${a.name}</td>
                            <td>${a.joinedDate}</td>
                        </tr>
                    </c:forEach>
                </table>
            </c:if>
        </form>
        
    </body>
</html>
