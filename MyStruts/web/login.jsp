<%-- 
    Document   : login
    Created on : Jun 26, 2018, 8:49:16 AM
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
        <form action="">
            <s:i18n name="resource.global">
                <p><s:property value="getText('login.username')"/> <input type="text"></p>
                <p><s:text name="login.password"/> <input type="password"></p>
                <p><input type="submit" 
                          value="<s:text name="login.signin"/>"></p>
            </s:i18n>
            <p></p>
            <s:url var="en" action="ActionLocale">
                <s:param name="request_locale" value="{'en_US'}"></s:param>
            </s:url>
            <s:url var="vi" action="ActionLocale">
                <s:param name="request_locale">vi_VN</s:param>
            </s:url>
            <s:a href="%{en}">English</s:a>
            <s:a href="%{vi}">Tiếng việt</s:a>
        </form>
    </body>
</html>
