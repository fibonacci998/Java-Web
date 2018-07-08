<%-- 
    Document   : student
    Created on : May 29, 2018, 4:40:15 PM
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
        <form action="StudentServlet">
            <c:if test="${empty listStudent}">
                <script>
                    //document.forms[0].submit();
                </script>
            </c:if>
            <p>
                Number of Students:
                <input type="text" name="txtNumber">
                <input type="submit" value="generate">
            </p>
        </form>
        <c:if test="${not empty listStudent}">
            <table border="1" cellspacing="0">
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Gender</th>
                    <th>DOB</th>
                </tr>
                <c:forEach var="s" items="${listStudent}">
                    <tr>
                        <td>${s.id}</td>
                        <td>${s.name}</td>
                        <td><input type="checkbox" onclick="return false;" ${s.gender==true?"checked":""} ></td>
                        <td>${s.dob}</td>
                    </tr>
                </c:forEach>
            </table>
        </c:if>
    </body>
</html>
