<%-- 
    Document   : product
    Created on : Jun 7, 2018, 8:14:31 AM
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
        <jsp:useBean id="p" class="bean.ProductBean" scope="session" />
        <jsp:setProperty name="p" property="*" />
        
        <form>
            <h2>Show <select name="pageSize">
                    <option value="5" ${param.pageSize==5?"selected":""}>5</option>
                    <option value="10" ${param.pageSize==10?"selected":""}>10</option>
                    <option value="15" ${param.pageSize==15?"selected":""}>15</option>
                </select>entries per page
            <input type="submit" value="Show">
        </form>
        
        
        
        
        <!--output value of beans-->
        <h2>Choose any product from the list</h2>
        <table border="1" cellspacing="0">
            <tr>
                <th>Product ID</th>
                <th>Product Name</th>
                <th>Price</th>
            </tr>
            <c:forEach var="i" items="${p.product}">
                <tr>
                    <td>${i.id}</td>
                    <td>${i.name}</td>
                    <td>${i.price}</td>
                    <td>
                        <c:url var="add" value="AddCart">
                            <c:param name="id" value="${i.id}"></c:param>
                            <c:param name="name" value="${i.name}"></c:param>
                            <c:param name="price" value="${i.price}"></c:param>
                        </c:url>
                        <a href="${add}">Add cart</a>
                    </td>
                </tr>
                
            </c:forEach>
        </table>
        <p>Total products:${p.product.size()}</p>
        <p>
            <!--show paging navigator-->
            <c:forEach begin="1" end="${p.pages}" step="1" var="i">
                <c:url var="next" value="product.jsp">
                    <c:param name="page">${i}</c:param>
                    <c:param name="pageSize">${param.pageSize}</c:param>
                </c:url>
                <a href="${next}">${i}</a>
            </c:forEach>
        </p>
    </body>
</html>
