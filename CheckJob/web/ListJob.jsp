<%-- 
    Document   : ListJob
    Created on : Jul 15, 2018, 9:22:26 PM
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
        <h2>Information of all job(s)</h2>
            <c:if test="${not empty listJobsNow}">
                <table border="1" cellspacing="0">
                    <tr>
                        <th>Job ID</th>
                        <th>Job Name</th>
                        <th>Job Salary</th>
                        <th>Hire date</th>
                        <th>Activated(Yes/No)</th>
                    </tr>
                    <c:forEach var="a" items="${listJobsNow}">
                        <tr>
                            <c:url var="JobDetail" value="ShowAllEmpServlet">
                                <c:param name="idJob" value="${a.id}"></c:param>
                                <c:param name="nameJob" value="${a.name}"></c:param>
                            </c:url>
                            <td><a href="${JobDetail}">${a.id}</a></td>
                            <td><a href="${JobDetail}">${a.name}</a></td>
                            <td>${a.money}</td>
                            <td>
                                <fmt:formatDate value="${a.date}" pattern="MM/dd/yyyy"/>
                            </td>
                            <td>${a.actived==1?"Yes":"No"}</td>
                        </tr>
                    </c:forEach>
                </table>
            </c:if>
            <h2>This list has ${listJobsNow.size()} job(s) in total</h2>
    </body>
</html>
