<%-- 
    Document   : cart
    Created on : Jun 12, 2018, 7:48:34 AM
    Author     : tuans
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>


        <c:choose>
            <c:when test="${empty sessionScope.cart}">
                <h3>Your shopping cart is empty</h3>
            </c:when>
            <c:otherwise>
                <form action="AddOrder">
                    <p>Customer id: <input type="text" name="custID" value="" /></p>
                    <p>Customer name: <input type="text" name="custName" value="" /></p>
                    <p>Order date: <fmt:formatDate pattern="MM/dd/yyyy" value="<%=new Date()%>"></fmt:formatDate></p>
                    <p>Payment method:
                        <input type="radio" name="payment" value="Cash" checked> Cash
                        <input type="radio" name="payment" value="Cart">Cart
                    </p>
                    <p><input type="submit" value="Order now"></p>
                </form>

                <table border="1" cellspacing="0">
                    <tr>
                        <th>Product ID</th>
                        <th>Product name</th>
                        <th>Price</th>
                        <th>Quantity</th>
                        <th>Amount</th>
                    </tr>
                    <c:forEach var="i" items="${sessionScope.cart.items}">
                        <tr>
                            <td>${i.id}</td>
                            <td>${i.name}</td>
                            <td>${i.price}</td>
                            <td>${i.quantity}</td>
                            <td>${i.price*i.quantity}</td>
                        </tr>
                    </c:forEach>
                </table>
            </c:otherwise>
        </c:choose>
        <p>Continue buying, click <a href="product.jsp">here</a></p>
        <p>Checkout the shopping cart, click <a href="checkout.jsp">here</a></p>

    </body>
</html>
