<%-- 
    Document   : listEmployee
    Created on : Jul 20, 2018, 8:14:35 AM
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
        <form action="/WS2_RequestDB/EmployeeRequest/list">
            Select an employee<select onchange="document.forms[0].submit()" name="selectedID">
                <option value="ALL">--All--</option>
                <c:forEach var="a" items="${listNameEmp}">
                    <option value="${a.employeeId}" ${param.selectedID==a.employeeId?"selected":""}>
                        ${a.employeeName}
                    </option>
                </c:forEach>
            </select>
            <c:if test="${not empty listEmp}">
                <table border="1" cellspacing="0">
                    <tr>
                        <th>Request ID</th>
                        <th>Request Name</th>
                        <th>Request Type Name</th>
                        <th>From</th>
                        <th>To</th>
                        <th>Reason</th>
                        <th>Status</th>
                        <c:if test="${checkBonusCol=='1'}">
                            <th></th>
                        </c:if>
                        
                    </tr>
                    <c:forEach items="${listEmp}" var="a">
                        <tr>
                            <td>${a.requestId}</td>
                            <td>${a.employee.employeeName}</td>
                            <td>${a.requestType.typeName}</td>
                            <td>${a.fromDate}</td>
                            <td>${a.toDate}</td>
                            <td>${a.reason}</td>
                            <td>${a.status}</td>
                            <c:if test="${checkBonusCol=='1'}">
                                <td>
                                    <!---------cach 2---->
                                    <c:url var="Approve" value="/EmployeeRequest/list">
                                        <c:param name="label" value="Approve"></c:param>
                                        <c:param name="empID" value="${a.requestId}"></c:param>
                                    </c:url>
                                    <c:url var="Reject" value="/EmployeeRequest/list">
                                        <c:param name="label" value="Reject"></c:param>
                                        <c:param name="empID" value="${a.requestId}"></c:param>
                                    </c:url>
                                    <a href="${Approve}">Approve</a>
                                    <a href="${Reject}">Approve</a>
                                    <!---------cach 2---->
                                    
                                    <c:if test="${a.status eq 'Processing'}">
                                        <input type="hidden" name="empID" value="${a.requestId}">
                                        <input type="submit" value="Approve" name="btnApprove">
                                        <input type="submit" value="Reject" name="btnReject">
                                    </c:if>
                                </td>
                            </c:if>
                        </tr>
                    </c:forEach>
                </table>
            </c:if>
        </form>
        
        
    </body>
</html>
