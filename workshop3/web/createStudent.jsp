<%-- 
    Document   : createStudent
    Created on : May 29, 2018, 10:51:03 PM
    Author     : tuans
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="createStudentController">
            <p>Name:<input type="text" name="txtName"></p>
            <p>Gender:<input type="radio" name="rdGender" value="Male">Male<input type="radio" name="rdGender" value="Female">Female</p>
            <p>DOB:<input type="text" name="txtDOB"></p>
            <p><input type="submit" value="submit"></p>
        </form>
    </body>
</html>
