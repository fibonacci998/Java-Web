<%-- 
    Document   : tran
    Created on : May 31, 2018, 8:32:21 AM
    Author     : tuans
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            String tranType=request.getParameter("txtTran");
            if (tranType.equals("1")){
            %>
            <jsp:forward page="withdraw.jsp?code=105">
                <jsp:param name="date" value="<%=new Date()%>"></jsp:param>
                <jsp:param name="code" value="504"></jsp:param>
            </jsp:forward>
            <%   
            }else if (tranType.equals("2")){
                
            }
        %>
    </body>
</html>
