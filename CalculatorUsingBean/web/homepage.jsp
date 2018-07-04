<%-- 
    Document   : homepage
    Created on : Jul 2, 2018, 7:40:00 PM
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
        <jsp:useBean id="CalculationBean" class="bean.CalculationBean" scope="request"/>
        <jsp:setProperty name="CalculationBean" property="operand1" value="${param.txtOperand1}"/>
        <jsp:setProperty name="CalculationBean" property="operand2" value="${param.txtOperand2}"/>
        <jsp:setProperty name="CalculationBean" property="operation" value="${param.txtOperation}"/>
        <form action="homepage.jsp">
            <p></p>
            First operand <input type="text" value="${param.txtOperand1}" name="txtOperand1"/>
            <p></p>
            Second operand <input type="text" value="${param.txtOperand2}" name="txtOperand2"/>
            <p></p>
            <select name="txtOperation" >
                <option value="add" ${param.txtOperation=="add"?"selected":""}>+</option>
                <option value="sub" ${param.txtOperation=="sub"?"selected":""}>-</option>
                <option value="mul" ${param.txtOperation=="mul"?"selected":""}>*</option>
                <option value="div" ${param.txtOperation=="div"?"selected":""}>/</option>
            </select>
            <p></p>
            <input type="submit" value="Calculate">
            <p></p>
            Result
            <input type="text" value="${CalculationBean.doFunc()}">
            
            
        </form>
    </body>
</html>
