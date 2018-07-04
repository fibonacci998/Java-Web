<%-- 
    Document   : Class.jsp
    Created on : Jun 5, 2018, 7:52:03 AM
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
        <form action="showNumberClassController">
            Number of classes <input type="text" name="txtNumber"> 
            <input type="submit">
        </form>
        <c:if test="${empty listClass}">
            <h1>Nothing to show</h1>
        </c:if>
        <c:if test="${not empty listClass}">
            <table border="1" cellspacing="0">
                <tr>
                    <th>Class ID</th>
                    <th>Class name</th>
                    <th>Started Date</th>
                    <th>Activated</th>
                </tr> 
                <c:forEach var="s" items="${listClass}">
                    <tr>
                        <td>
                            <c:url var="ClassDetail" value="showStudentsInClassController">
                                <c:param name="ClassID" value="${s.id}"></c:param>
                            </c:url>
                            <a href="${ClassDetail}">${s.id}</a>
                        </td>
                        <td>${s.name}</td>
                        <td>${s.startedDate}</td>
                        <td><input type="checkbox" ${s.activated==1?"checked":""} onclick="return false;" ></td>
    
                    </tr>
                </c:forEach>
            </table>
            <p>Total class(s): ${listClass.size()}</p>
        </c:if>
        
    </body>
</html>
