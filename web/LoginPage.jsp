<%-- 
    Document   : LoginPage
    Created on : Jan 11, 2021, 3:49:11 PM
    Author     : phuch_cqzh776
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login Page</h1>
        
        <form action="LoginAction" method="post">
            <label for="username"> User Name: </label>
            <input type="text" name="username" id="username" value="">
            <br>
            <label for="pass"> Password: </label>
            <input type="password" name="pass" id="pass" value="">
            <br>
            <input type="submit" value="Login">
            
        </form>
        
    </body>
</html>
