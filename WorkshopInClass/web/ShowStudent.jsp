<%-- 
    Document   : ShowStudent.jsp
    Created on : Jun 5, 2018, 8:26:37 AM
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
        <h1>List student in class ${ClassID}</h1>
        <c:if test="${empty list}">
            <h1>Nothing to show</h1>
        </c:if>
        <c:if test="${not empty list}">
            <table border="1" cellspacing="0">
                <tr>
                    <th>Student ID</th>
                    <th>Student name</th>
                    <th>Class ID</th>
                    <th>Is male</th>
                    <th>Date of Birth</th>
                </tr> 
                <c:forEach var="ss" items="${list}">
                    <tr>
                        <td>${ss.id}</td>
                        <td>${ss.name}</td>
                        <td>${ClassID}</td>
                        <td><input type="checkbox" ${ss.gender==true?"checked":""} onclick="return false;" ></td>
                        <td>${ss.dob}</td>
    
                    </tr>
                </c:forEach>
            </table>
            <p>Total student(s): ${list.size()}</p>
        </c:if>
    </body>
</html>
