<%-- 
    Document   : EmployeeJob
    Created on : Jul 15, 2018, 10:16:11 PM
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
        <h2>List of all employees are working as "${param.nameJob}"</h2>
        <c:forEach var="a" items="${listEmpWithJob}">
            <p><input onclick="return false;" type="checkbox" ${a.active==1?"checked":""}/> ${a.empName}</p>
        </c:forEach>
        <h2>This list has ${numberEmp} employee(s) are available for current job</h2>

            <c:url var="nameJob" value="LoadBeforeAssignServlet">
                <c:param name="nameJob" value="${param.nameJob}"></c:param>
                
            </c:url>
            <a href="${nameJob}">
                <input type="submit" value="Arrange Job"/>
            </a>
        
    </body>
</html>
