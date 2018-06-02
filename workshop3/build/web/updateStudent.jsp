<%-- 
    Document   : addStudent
    Created on : May 30, 2018, 7:57:18 AM
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
        <form action="updateStudentController">
            <p>Id:<input type="text" name="txtID" readonly="true" value="${param.studentID}"></p>
            <p>Name:<input type="text" name="txtName"></p>
            <p>Gender:<input type="radio" name="rdGender" value="Male">Male
                <input type="radio" name="rdGender" value="Female">Female
            </p>
            <p>DOB:<input type="text" name="txtDOB"></p>
            <input type="submit" value="Update">
        </form>
    </body>
</html>
