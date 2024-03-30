<%--
  Created by IntelliJ IDEA.
  User: Matvey Konovalov
  Date: 30.03.2024
  Time: 18:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Add Player</title>
</head>
<body>
    <h2>Player form</h2>
    <hr>
    <form:form action="processPlayerForm" modelAttribute="athlete">
        <p>Name: <form:input path="lastName" /></p>
        <p>
            Country: <form:select path="country">
            <form:option value="AUT" label="Austria"/>
            <form:option value="FRA" label="France"/>
            <form:option value="SRB" label="Serbia"/>
            <form:option value="SUI" label="Switzerland"/>
            <form:option value="RUS" label="Russia"/>
            <form:option value="USA" label="United States of America"/>
        </form:select>
        </p>
        <p>
            Handedness:
            <form:radiobutton path="handedness" value="Right-Handed"/> Right-Handed
            <form:radiobutton path="handedness" value="Left-Handed"/> Left-Handed
            <form:radiobutton path="handedness" value="Ambidextrous"/> Ambidextrous
        </p>
        <p>
            Grand Slam Titles Won
            <form:checkbox path="grandSlams" value="Australian Open"/> Australian Open
            <form:checkbox path="grandSlams" value="French Open"/> French Open
            <form:checkbox path="grandSlams" value="Wimbledon"/> Wimbledon
            <form:checkbox path="grandSlams" value="US Open"/> US Open
        </p>
        <p><input type="submit" value = "Add Player"/></p>
    </form:form>
</body>
</html>
