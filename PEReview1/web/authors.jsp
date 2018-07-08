<%-- 
    Document   : authors
    Created on : Jun 30, 2018, 9:17:30 AM
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
        <jsp:useBean id="authorsBean" class="bean.AuthorBean" scope="request"/>
        <jsp:useBean id="listBookBean" class="bean.TitleAuthorBean" scope="request"/>
        <jsp:setProperty name="authorsBean" property="titleID" value="${param.titleID}"/>
        <jsp:setProperty name="listBookBean" property="auID" value="${param.authorID}"/>
        <form action="authors.jsp" name="main_form">
            <h2>Select an author</h2>
            <select name="authorID" onchange="document.forms[0].submit()">
                <c:forEach var="e" items="${authorsBean.selectAll()}">
                    <option value="${e.id}" ${e.id==param.authorID or e.id=="172-32-1176"?"selected":""}>
                        ${e.name}
                    </option>
                </c:forEach>
            </select>
            
            <c:if test="${empty param.authorID}">
                <jsp:setProperty name="listBookBean" property="auID" value="172-32-1176"/>
            </c:if>
            <p>List of accounts</p>
            <c:if test="${not empty listBookBean.selectByID()}">
                <table cellspacing="0" border="1">
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
            <c:if  test="${empty listBookBean.selectByID()}">
                <h2>Nothing to show</h2>
            </c:if>
            <c:if test="${not empty authorsBean.selectByTitleID()}">
                <h2>List of all authors of the book ${authorsBean.name}</h2>
                <table cellspacing="0" border="1">
                    <tr>
                        <th>Author ID</th>
                        <th>Author name</th>
                        <th>Author address</th>
                    </tr>
                    <c:forEach var="a" items="${authorsBean.selectByTitleID()}">
                        <tr>
                            <td>${a.id}</td>
                            <td>${a.name}</td>
                            <td>${a.address}</td>
                        </tr>
                    </c:forEach>
                </table>
            </c:if>
        </form>
    </body>
</html>
