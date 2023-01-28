<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 28/01/2023
  Time: 10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
    <form method="post" action="/translate">
      <label>English</label>
      <input type="text" name="keyword" placeholder="hello">
      <label>Viet Nam</label>
      <input type="text" name="vietnam">
      <input type="submit" value="translate"/>
    </form>
</body>
</html>
