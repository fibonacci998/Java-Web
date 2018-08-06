<%-- 
    Document   : index
    Created on : Jul 13, 2018, 8:51:39 AM
    Author     : tuans
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script language="JavaScript" type="text/javascript" src="./js/jquery.js"></script>
    </head>
    <body>
        Name <input type="text" id="fullname"/>
        <input type="button" value="Hello" id="btHello"/>
        <br>
        <span id="result"></span>
        <script type="text/javascript">
            $(document).ready(function(){
                $('#btHello').click(function(){
                   var fullname=$('#fullname').val();
                   $.ajax({
                       type: 'post',
                       url:'/ajaxServlet',
                       data:{fullname: fullname},
                       success:function(html){
                           $('#result').html(result);
                       }
                   })
                });
            });
        </script>
    </body>
</html>
