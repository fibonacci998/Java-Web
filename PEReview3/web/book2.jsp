<%-- 
    Document   : book2
    Created on : Jul 19, 2018, 8:45:23 AM
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
        <form action="/PEReview3/Book/list2">
            <h2>
                Select a book 
                <select name="bookId" onchange="document.forms[0].submit()">
                    <option>All</option>
                    <c:forEach var="a" items="${books}">
                        <option value="${a.titleId}" ${a.titleId==param.bookId?"selected":""}>
                            ${a.title}
                        </option>
                    </c:forEach>
                </select>
            </h2>   
        </form>
        <c:if test="${not empty book}">
            <h2>Information of selected book and authors</h2>
            <p>Book title: ${book.title}</p>
            <p>Book ID: ${book.titleId}</p>
            <p>Book Note: ${book.note}</p>
            <p></p>
            <h2>Information of authors</h2>
            <table border="1" cellspacing="0">
                <tr>
                    <th>Author ID</th>
                    <th>Author Name</th>
                    <th>Author Address</th>
                </tr>
                <c:forEach items="${book.authors}" var="x">
                    <tr>
                        <td>
                            <a href="">${x.id}</a>
                        </td>
                        <td>${x.name}</td>
                        <td>${x.address}</td>
                    </tr>
                </c:forEach>
            </table>
        </c:if>
            <c:if test="${empty book}"> 
                <h2>Select a book to start</h2>
            </c:if>
    </body>
</html>
