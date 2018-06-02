<%-- 
    Document   : header
    Created on : May 31, 2018, 7:51:56 AM
    Author     : tuans
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" 
        isErrorPage="true" errorPage="error.htm" pageEncoding="UTF-8"%>
<%!Date today=new Date();%>
<style type="text/css">
    table{width:100%;border:none;}
    a{text-decoration: none;color:blur;padding: 15px;}
</style>
<table>
    <tr>
        <td><img src="media/logo.jpg"></td>
    </tr>
    <tr>
        <td align="center">
            <a href="#">Home</a>
            <a href="#">New</a>
            <a href="#">Courses</a>
        </td>
    </tr>
</table>
<p>
    Today is <jsp:expression>today</jsp:expression>
</p>