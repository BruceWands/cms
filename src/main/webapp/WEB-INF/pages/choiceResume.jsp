<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 14037
  Date: 2018/10/24
  Time: 13:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>选择简历</title>
</head>
<body>
请选择收货地址<br/>
<form action="addApply.do" method="post">
    <table cellpadding="10px" cellspacing="10px">
        <tr>
            <td>请选择</td>
            <td>简历</td>
            <td>姓名</td>
            <td>联系电话</td>
        </tr>
        <c:forEach items="${requestScope.resumeList}" var="resume">
            <tr>
                <td><input type="radio" name="resume_id" value="${resume.resume_id}"></td>
                <td>我的简历${resume.resume_id}</td>
                <td>${resume.resume_name}</td>
                <td>${resume.resume_phone}</td>
            </tr>
        </c:forEach>
    </table>
    <input type="hidden" name="recruit_id" value="${requestScope.recruit_id}">
    <input type="hidden" name="user_id" value="${requestScope.user_id}">
    <input type="submit" value="确定">
</form>
<br/>
<a href="homeView.do">返回</a>
<br/>
<br/>
<h4 style="color: red">
    ${requestScope.message}
</h4>
</body>
</html>
