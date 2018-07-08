<%-- 
    Document   : jspStudent
    Created on : May 29, 2018, 7:44:15 PM
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
                    document.forms[0].submit();
                </script>
            </c:if>
            <table border="1" cellspacing="0"  onchange="doSubmit()">
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Gender</th>
                    <th>DOB</th>
                    <th></th>
                </tr>
                <c:forEach var="s" items="${listStudent}">
                    <tr>
                        <td>${s.id}</td>
                        <td>${s.name}</td>
                        <td>${s.gender==true?"Male":"Female"}</td>
                        <td>${s.dob}</td>
                        <td>
                            <c:url var="StudentDetail" value="updateStudent.jsp">
                                <c:param name="label" value="ShowDetail"></c:param>
                                <c:param name="studentID" value="${s.id}"></c:param>
                            </c:url>
                            <a href="${StudentDetail}">Update</a>

                            <c:url var="StudentDelete" value="deleteStudentController">
                                <c:param name="label" value="DeleteStudent"></c:param>
                                <c:param name="studentID" value="${s.id}"></c:param>
                            </c:url>
                            <a href="${StudentDelete}"  onclick="return confirm('Delete confirmation?')">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </form>
        
        <a href="createStudent.jsp">Create</a>
        <script type="text/javascript">
            function doSubmit(){
                document.forms[0].submit();
            }
        </script>
    </body>
</html>
