<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 14037
  Date: 2018/10/25
  Time: 1:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员查看简历</title>
</head>
<body>
<table cellpadding="10px" cellspacing="10px">
    <tr>
        <td>申请编号</td>
        <td>求职者姓名</td>
        <td>应聘职位</td>
        <td>查看他（她）的简历</td>
    </tr>
    <c:forEach items="${sessionScope.applyList}" var="apply">
        <tr>
            <td>${apply.apply_id}</td>
            <c:forEach items="${sessionScope.resumeList}" var="resume">
                <c:if test="${resume.resume_id==apply.resume_id}">
                    <td>${resume.resume_name}</td>
                </c:if>
            </c:forEach>
            <c:forEach items="${sessionScope.recruitList}" var="recruit">
                <c:if test="${recruit.recruit_id==apply.recruit_id}">
                    <td>${recruit.recruit_company_post}</td>
                </c:if>
            </c:forEach>
            <td><a href="adQueryResumeById.do?resume_id=${apply.resume_id}">点击查看</a></td>
        </tr>
    </c:forEach>
</table>
<a href="administratorView.do">返回</a>
</body>
</html>
