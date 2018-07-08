<%-- 
    Document   : index.jsp
    Created on : Jul 5, 2018, 9:33:50 PM
    Author     : tuans
--%>

<%@page import="java.util.Date"%>
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
        <form action="EmployeeServlet">
            <input type="submit" value="view">
            <c:if test="${empty listByName}">
                <script>
                    document.forms[0].submit();
                </script>
            </c:if>
            <select name="idSelected" onchange="document.forms[0].submit()">
                <option value="">---ALL---</option>
                <c:forEach var="a" items="${listByName}">
                    <option value="${a.employeeID}" ${param.idSelected==a.employeeID?"selected":""}>${a.employeeName}</option>
                </c:forEach>            
            </select> 
         
            <table border="1" cellspacing="1">
                <tr>
                    <th>Employee Name</th>
                    <th>Type</th>
                    <th>From</th>
                    <th>To</th>
                    <th>Reason</th>
                    <th>Status</th>
                </tr>
                <c:forEach var="a" items="${listByID}">
                    <tr>
                        <td>${a.employeeName}</td>
                        <td>${a.typeName}</td>
                        <td><fmt:formatDate value="${a.dateFrom}" pattern="dd/MM/yyyy"/></td>
                        <td><fmt:formatDate value="${a.dateTo}" pattern="dd/MM/yyyy"/></td>
                        <td>${a.reason}</td>
                        <c:if test="${a.status eq 'Processing'}">
                        <td>
                            <input type="hidden" name="idInfo" value="${a.resquestID}">
                            <input type="submit" name="action" value="Approve" />
                            <input type="submit" name="action" value="Reject"/>
                        </td>
                        </c:if>
                        <c:if test="${a.status ne 'Processing'}">
                            <td>${a.status}</td>
                        </c:if>
                    </tr>
                </c:forEach>
            </table>
        </form> 
    </body>
</html>
