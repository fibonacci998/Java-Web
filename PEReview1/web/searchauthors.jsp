<%-- 
    Document   : searchauthors
    Created on : Jul 1, 2018, 4:35:42 PM
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
        <jsp:useBean id="authorsBean" class="bean.AuthorBean" scope="session"/>
        <jsp:useBean id="listBookBean" class="bean.TitleAuthorBean" scope="session"/>
        <jsp:setProperty name="listBookBean" property="auID" value="${param.authorID}"/>
        <jsp:setProperty name="authorsBean" property="inputName" value="${param.txtInputName}"/>
        <form action="searchauthors.jsp">
            <h2>Enter author name</h2>
            <input type="text" name="txtInputName" value="${param.txtInputName}">
            <input type="submit" value="search">
        </form>
        <br>
        <table border="1" cellspacing="0">
            <tr>
                <th>Author ID</th>
                <th>Author Name</th>
                <th>Author Address</th>
            </tr>
            <c:forEach var="a" items="${authorsBean.selectByInputName()}">
                <tr>
                    <c:url var="AuthorDetail" value="searchauthors.jsp">
                        <c:param name="txtInputName" value="${param.txtInputName}"/>
                        <c:param name="authorName" value="${a.name}"/>
                        <c:param name="authorID" value="${a.id}"/>
                    </c:url>
                    <td><a href="${AuthorDetail}">${a.id}</a></td>
                    <td>${a.name}</td>
                    <td>${a.address}</td>
                </tr>
            </c:forEach>
        </table>
        <c:if test="${not empty listBookBean.selectByID()}">
            <h2>All books are written by author name "${param.authorName}"</h2>
            <table border="1" cellspacing="0">
                <tr>
                    <th>Title ID</th>
                    <th>Title</th>
                    <th>PubID</th>
                    <th>Notes</th>
                    <th>Username</th>
                </tr>
                <c:forEach var="a" items="${listBookBean.selectByID()}">
                    <tr>
                        <c:url var="BookDetail" value="authors.jsp">
                            <c:param name="authorID" value="${param.authorID}"/>
                            <c:param name="titleID" value="${a.titleID}"/>
                        </c:url>
                        <td>
                            <a href="${BookDetail}">${a.titleID}</a>
                            
                        </td>
                        <td>${a.title}</td>
                        <td>${a.pubID}</td>
                        <td>${a.notes}</td>
                        <td>${a.username}</td>
                    </tr>
                    
                </c:forEach>
            </table>
        </c:if>
    </body>
</html>
