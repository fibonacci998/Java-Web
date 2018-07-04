<%-- 
    Document   : index
    Created on : Jun 19, 2018, 8:19:52 AM
    Author     : tuans
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="mt"  uri="/WEB-INF/tlds/mytld" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Today is <mt:MyDate format="yyyy-MMM-dd EEEEEEEEEE"/></h1>
        <h1>Today is <mt:MyDate format="abc"/></h1>
        <h1>
            <mt:MyString upper="true" value="The fox"/><br/>
            <mt:MyString value="the fox"/>
        </h1>
        <h1>Unicode table</h1>
        <table border="1" cellspacing="0">
            <tr>
                <th>Index</th><th>Unicode</th>
            </tr>
            <mt:MyUnicode start="1040" end="1059">
                <tr>
                    <td>${i}</td>
                    <td>${unicode}</td>
                </tr>
            </mt:MyUnicode>
        </table>
        <mt:MyPrint repeat="5">
            <%="hello"%>
            
        </mt:MyPrint>
    </body>
</html>
