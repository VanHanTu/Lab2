<%-- 
    Document   : LAB2
    Created on : Sep 13, 2019, 3:31:04 PM
    Author     : 759841
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Servlet</title>
    </head>
    <body>
        <form action="SimpleLab2" method="post">
        <h1>Age Calculator </h1>
        <p>Enter your age: <input type="text" name="age"> </p> <br>
        <div> ${nAge} </div> <br>
        <input type="submit" value="Age your birthday"> <br>
        <a href="ArithmeticCalculator">Arithmetic Calculator</a>
        </form>
    </body>
</html>
