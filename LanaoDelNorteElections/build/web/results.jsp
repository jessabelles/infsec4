<%-- 
    Document   : results
    Created on : Jan 19, 2017, 11:26:22 PM
    Author     : gokspoweroffour
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lanao del Norte Election Results</title>
    </head>
    <body>
        <h1>Lanao del Norte Election Results</h1>
        <form action="LogoutServlet">
        <input type="submit" value="LOGOUT"/> <br/><br/><br/>
        </form>
        <table id="electionresults" class="display" cellspacing="0" width="100%">
        <thead>
            <tr>
                <th>City or Municipality</th>
                <th>Position</th>
                <th>Name</th>
                <th>Nickname</th>
                <th>Party affiliation</th>
                <th>Votes Obtained</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="result" items="${result}">
            <tr>
                <td><c:out value="${result.getCity_or_municipality()}"/></td>
                <td><c:out value="${result.getPosition()}"/></td>
                <td><c:out value="${result.getName()}"/></td>
                <td><c:out value="${result.getNickname()}"/></td>
                <td><c:out value="${result.getParty_affiliation()}"/></td>
                <td><c:out value="${result.getVotes_obtained()}"/></td>
            </tr>
            </c:forEach>
        </tbody>
    </table>
    </body>
</html>
