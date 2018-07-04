<%-- 
    Document   : index.jsp
    Created on : Jun 26, 2018, 8:29:32 AM
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
        <h1>Hello ${username}</h1>
        <h1>Welcome <s:property value="username"></s:property></h1>
        <h1>Welcome <s:text name="%{username}"></s:text></h1>
        
    </body>
</html>
