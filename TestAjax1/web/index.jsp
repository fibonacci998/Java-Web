<%-- 
    Document   : index
    Created on : Jul 16, 2018, 9:05:55 PM
    Author     : tuans
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script type="text/javascript">
            $(document).ready(function(){
                $('#bttHello').click(function(){
                    var fullname=$('#fullname').val();
                    $.ajax({
                        type:'POST',
                        data:{fullname: fullname},
                        url:'AjaxController',
                        success:function(result){
                            $('#result1').html(result);
                        }
                    });
                });
            });
            
        </script>
    </head>
    <body>
        <form>
            Name <input type="text" id="fullname">
            <input type="button" value="Hello" id="bttHello">
            <br>
            <span id="result1"></span>
        </form>
    </body>
</html>
