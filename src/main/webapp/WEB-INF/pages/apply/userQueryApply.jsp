<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 14037
  Date: 2018/10/24
  Time: 0:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>我的申请</title>
</head>
<body>
<c:forEach items="${requestScope.applyList}" var="apply">
    ${apply.apply_id}申请编号<br/>
</c:forEach>
<h4 style="color: red">
    ${requestScope.message}
</h4>
</body>
</html>
