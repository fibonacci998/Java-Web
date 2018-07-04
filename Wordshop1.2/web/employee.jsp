<%-- 
    Document   : employee
    Created on : Jun 26, 2018, 10:11:52 AM
    Author     : tuans
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <!-- -->
        <form action="ActionEmployee">
            <input type="submit" value="View">
        </form>
        <h1>Infomation of all employees</h1>
        <table border="1" cellspacing="0">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>DOB</th>
                <th>Gender</th>
                <th>Address</th>
            </tr>
            <s:iterator var="e" value="employees">
                <tr>
                    <td><s:property value="id"/></td>
                    <td><s:property value="name"/></td>
                    <td>
                        <s:date name="dob" format="dd/MM/yyyy"/>
                    </td>
                    <td>
                        <s:if test="%{gender==1}">Male</s:if>
                        <s:else>Female</s:else>
                    </td>
                    <td><s:property value="address"/></td>
                </tr>
            </s:iterator>
        </table>
    </body>
</html>
