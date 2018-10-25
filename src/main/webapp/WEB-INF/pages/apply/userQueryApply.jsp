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
<table>
    <tr>
        <td>申请编号</td>
        <td>招聘编号</td>
        <td>简历编号</td>
    </tr>
    <c:forEach items="${requestScope.applyList}" var="apply">
        <tr>
            <td>${apply.apply_id}</td>
            <td>${apply.recruit_id}</td>
            <td>${apply.resume_id}</td>
        </tr>
    </c:forEach>
</table>
<h4 style="color: red">
    ${requestScope.message}
</h4>
</body>
</html>
