<%-- 
    Document   : AddJob
    Created on : Jul 15, 2018, 8:50:58 PM
    Author     : tuans
--%>

<%@page import="java.text.SimpleDateFormat"%>
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
        <form action="AddNewJobServlet">
            <h2>Enter the information of job</h2>
            <p></p>
            Job Name <input type="text" name="txtJobName" value="${param.txtJobName}">
            <p></p>
            Job Salary <input type="text" name="txtJobSalary" value="${param.txtJobSalary}">
            <p></p>
            Date created <input readonly type="text" name="txtDate" value="<% 
                Date date=new Date();
                SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
                out.print(sdf.format(date));
            %>"/>
            <p></p>
            Active <input type="radio" name="rdActive" value="Yes" ${param.rdActive=='Yes'||param.rdActive==null?"checked":""}>Yes
            <input type="radio" name="rdActive" value="No" ${param.rdActive=='No'?"checked":""}> No
            <p></p>
            <input type="submit" value="Save" name="btnSave">
            <input type="submit" value="All Job(s)" name="btnShow">
        </form>
            <c:if test="${not empty error}">
                ${error}
            </c:if>
    </body>
</html>
