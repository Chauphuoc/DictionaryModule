<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 30/01/2023
  Time: 23:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <c:forEach var="item" items="${condiments}">
      <h1>${item.toString()}</h1>
  </c:forEach>
</body>
</html>
