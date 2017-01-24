<%-- 
    Document   : login
    Created on : Jan 19, 2017, 11:25:59 PM
    Author     : gokspoweroffour
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Welcome! Please log in to view elections results</h1>
        <form action="LoginServlet" method="post">
        <label>Username: </label><input type="text" name="username" value="" /><br/>
        <label>Password: </label><input type="password" name="password" value="" /><br/>
        <input type="submit" value="LOGIN"/><br/><br/>
        </form>
        <form action="RegisterViewServlet">
        <input type="submit" value="Don't have an account?" />
        </form>
    </body>
    <c:if test="${errormsg}">
        <script>alert("Login failed! Try again.");</script>
    </c:if>
</html>
