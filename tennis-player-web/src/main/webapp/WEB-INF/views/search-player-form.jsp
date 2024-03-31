<%--
  Created by IntelliJ IDEA.
  User: Matvey Konovalov
  Date: 30.03.2024
  Time: 17:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Player Form</title>
</head>
<body>
    <h2>Player Form</h2>
    <br>
        <form action="processPlayerForm" method="post">
            Enter player name:
            <input type = "text" name = "playerName" />
            <input type = "submit" value = "Submit" />
        </form>
</body>
</html>
