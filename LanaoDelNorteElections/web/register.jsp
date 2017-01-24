<%-- 
    Document   : register
    Created on : Jan 19, 2017, 11:26:13 PM
    Author     : gokspoweroffour
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
    </head>
    <body>
        <h1>Sign up here</h1>
        <form action="RegisterServlet" method="post">
        <label>Username: </label><input type="text" name="username" value="" /><br/>
        <label>Password: </label><input type="password" name="password" value="" /><br/>
        <input type="submit" value="CREATE ACCOUNT"/><br/><br/>
        </form>
        <form action="LoginServlet">
        <input type="submit" value="Back" />
        </form>
    </body>
    <c:if test="${errormsg2}">
        <script>alert("Sign up failed! Try again.");</script>
    </c:if>
</html>
