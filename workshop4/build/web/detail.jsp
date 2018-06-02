<%-- 
    Document   : detail
    Created on : May 31, 2018, 3:41:07 PM
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
        <%
            HttpSession sessionTemp = request.getSession(false);
            int i=0;
            if (!session.isNew()){
            %>
                <h1>Hello: <%=request.getAttribute("username") %></h1>
            <%
            }else{
            %>
                <jsp:forward page="login.jsp"></jsp:forward>
            <%
            }
        %>

    </body>
</html>
