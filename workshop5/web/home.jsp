<%-- 
    Document   : home
    Created on : May 31, 2018, 8:02:23 PM
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
        
        <c:if test="${not empty nameStringArray}">
            <p>1. Send by array string</p>
            <c:forEach var="s" items="${nameStringArray}">
                ${s} 
            </c:forEach>
        </c:if>
        <c:if test="${not empty nameObjectArray}">
            <p>2. Send by array of name object</p>
            <table border="1" cellspacing="0">
                <c:forEach var="s" items="${nameObjectArray}">
                    <tr>
                        <td>
                            ${s.firstName}
                        </td>
                        <td>
                            ${s.lastName} 
                        </td>
                    </tr>
                </c:forEach>
            </table>
            <p>4. Send by array list of name object</p>
            <table border="1" cellspacing="0">
                <c:forEach var="s" items="${nameObjectArrayList}">
                    <tr>
                        <td>
                            ${s.firstName}
                        </td>
                        <td>
                            ${s.lastName} 
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </c:if>
        <c:if test="${not empty nameStringArrayList}">
            <p>3. Send by array list</p>
            <c:forEach var="s" items="${nameStringArrayList}">
                ${s}
            </c:forEach>    
        </c:if>
        <c:if test="${not empty listEmployee}">
            <p>5. Send by array list of 2 employee</p>
            <table border="1" cellspacing="0">
                <c:forEach var="s" items="${listEmployee}">
                    <tr>
                        <td>${s.name.firstName}</td>
                        <td>${s.name.lastName}</td>
                        <td>${s.address.streetAdress}</td>
                        <td>${s.address.city}</td>
                        <td>${s.address.zipCode}</td>
                    </tr>
                </c:forEach>
            </table>
        </c:if>
    </body>
</html>
