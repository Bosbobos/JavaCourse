<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: bosbobos
  Date: 31.03.2024
  Time: 22:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Head-to-Head Statistics</title>
    <style>
      .error {
        color:red;
        font-style: italic;
      }
    </style>
</head>
<body>
<h2>Head-to-Head Statistics</h2>
<form:form action = "processStatsForm" modelAttribute="playerStats">

  <br><br>
  Player 1: <form:input path = "player1"/> &emsp; vs. &emsp;

  Player 2: <form:input path = "player2"/>

  <br><br>
  Head-to-Head *:  <form:input path = "head2head" placeholder="##-##"/> &emsp;
  <form:errors path= "head2head" cssClass="error"/>

  <br><br>
  <input type ="submit" value = "Submit"/>

</form:form>

</body>
</html>
