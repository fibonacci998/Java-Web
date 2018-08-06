<%-- 
    Document   : FilterArticle
    Created on : Jul 21, 2018, 11:23:55 AM
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
        <form action="/FinalQ2_SE05594/article/list">
            Filter
            <p>
                By Year
                <select name="slYear" onchange="document.forms[0].submit()">
                    <option value="All" >All</option>
                    <c:forEach var="a" items="${listByYear}">
                        <option value="${a}" ${a==param.slYear?"selected":""}>${a}</option>
                    </c:forEach>
                </select>
            </p>
            <p>
                By Author
                <select name="slName" onchange="document.forms[0].submit()">
                    <option value="All">All</option>
                    <c:forEach var="a" items="${listByAuthor}">
                        <option value="${a.authorID}" ${a.authorID==param.slName?"selected":""}>${a.authorName}</option>
                    </c:forEach>
                </select>
            </p>
            <table cellspacing="0" border="1">
                <tr>
                    <th>Article</th>
                    <th>Year</th>
                    <th>By</th>
                </tr>
                <c:forEach var="a" items="${listSearch}">
                    <tr>
                        <td>${a.title}</td>
                        <td>${a.year}</td>
                        <td>
                            
                            
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </form>
    </body>
</html>
