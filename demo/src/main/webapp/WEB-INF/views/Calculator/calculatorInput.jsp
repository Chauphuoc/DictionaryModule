<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 30/01/2023
  Time: 23:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
  <h1>CALCULATOR</h1>
    <form action="/calculation-result" method="post">
        <input type="text" name="input1">
        <input type="text" name="input2">
        <input type="submit" name="calculation" value="Addition(+)">
        <input type="submit" name="calculation" value="Suptraction(-)">
        <input type="submit" name="calculation" value="Multiplication(*)">
        <input type="submit" name="calculation" value="Division(/)">
    </form>
</body>
</html>
