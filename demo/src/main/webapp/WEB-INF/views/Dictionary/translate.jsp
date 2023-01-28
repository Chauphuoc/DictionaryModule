<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 28/01/2023
  Time: 12:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Translate</title>
</head>
<body>
<form method="post" action="/dictionary">
  <label>English</label>
  <input type="text" name="english" placeholder="hello">
  <label>Viet Nam</label>
  <input type="text" name="vietnam" value="${result}">
  <input type="submit" value="translate"/>
</form>
</body>
</html>
