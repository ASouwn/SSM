<%--
  Created by IntelliJ IDEA.
  User: asouwn
  Date: 2024/3/22
  Time: 13:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>说说列表</title>
    <meta  http-equiv="Content-Type" content="text/html"/>
</head>
<body>
<div>
    <b>说说列表</b><br>
    ------------------------------------------------<br>
    <c:forEach items = "moods" var="mood" >
        <b>发表人:</b>${mood.userName}<br>
        <b>说说内容</b>${mood.content}<br>
        <b>点赞数</b>${mood.parseNnum}<br>
        <input  type="button" value="赞">
    </c:forEach>
</div>
</body>
</html>
