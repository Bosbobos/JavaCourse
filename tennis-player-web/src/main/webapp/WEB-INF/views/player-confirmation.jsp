<%--
  Created by IntelliJ IDEA.
  User: Matvey Konovalov
  Date: 30.03.2024
  Time: 19:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Player Confirmation</title>
</head>
<body>
    <h2>Player Confirmation</h2>
    <hr>
    <p>First Name: ${athlete.firstName}</p>
    <p>Last Name: ${athlete.lastName}</p>
    <p>Current Rank: ${athlete.rank}</p>
    <p>Last Won: <fmt:formatDate value="${athlete.lastWon}" type="date" pattern="dd-MM-yyyy" /> </p>
    <p>Prize Money: ${athlete.prizeMoney}</p>
    <p>Country: ${athlete.country}</p>
    <p>Handedness: ${athlete.handedness}</p>
    <p>
        Grand Slam Titles:
        <c:forEach items="${athlete.grandSlams}" var="title">
            <li>${title}</li>
        </c:forEach>
    </p>
</body>
</html>
