<%-- 
    Document   : employee3
    Created on : Jun 28, 2018, 8:40:41 AM
    Author     : tuans
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="eb" class="dal.EmployeeDAO" scope="request"/>
        <jsp:useBean id="ab" class="dal.AccountDAO" scope="request"/>
        <jsp:setProperty name="ab" property="*"/>
        <form action="employee3.jsp">
            Select an employee 
            <select name="employeeID" onchange="document.forms[0].submit()">
                <c:forEach var="e" items="${eb.selectAll()}">
                    <option value="${e.id}" ${e.id==param.employeeID ? "selected":""}>${e.name}</option>
                </c:forEach>
            </select>
            <p>List of accounts</p>
            <c:if test="${not empty ab.selectByEmployeeID()}">
                <table cellspacing="0" border="1">
                    <tr>
                        <th>UserID</th>
                        <th>DisplayName</th>
                        <th>JoinedDate</th>
                    </tr>
                    <c:forEach var="a" items="${ab.selectByEmployeeID()}">
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
