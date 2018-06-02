<%-- 
    Document   : index
    Created on : May 22, 2018, 7:51:09 AM
    Author     : tuans
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String num1,num2,result,operator;
            num1=num2=result=operator="";
            //if user click compute button
            if (request.getParameter("btnCompute")!=null){
                num1=request.getParameter("num1");
                num2=request.getParameter("num2");
                operator=request.getParameter("operator");
                if (operator.equals("+")){
                    result=String.valueOf(Double.valueOf(num1)+Double.valueOf(num2));
                }
                else if (operator.equals("-")){
                    result=String.valueOf(Double.valueOf(num1)-Double.valueOf(num2));
                }
                else if (operator.equals("*")){
                    result=String.valueOf(Double.valueOf(num1)*Double.valueOf(num2));
                }
            }
        %>
        <form>
            <p>number 1<input type="text" name="num1" value="<%=num1%>"></p>
            <p>number 2<input type="text" name="num2" value="${param.num2}"></p>
            <p><select name="operator">
                    <option value="+">+</option>
                    <option value="-">-</option>
                    <option value="*">*</option>
                </select>
            </p>
            <p>Result <input type="text" name="result" readonly value="<%=result%>"/></p>
            <p><input type="submit" value="Compute" name="btnCompute"/></p>
        </form>
        <h1>Hello World!</h1>
        <%! Date today = new Date();%>
        <h1>Today is <%=today%></h1>
            <jsp:expression>today</jsp:expression>
        <c:forEach var="i" begin="1" end="7" step="1">
            <p>
                <font color="blue" size="${i}">
                    welcome to jsp
                </font>
            </p>
        </c:forEach>
                 
        
    </body>
</html>
