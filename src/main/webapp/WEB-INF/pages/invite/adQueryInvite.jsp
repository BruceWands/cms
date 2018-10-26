<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 14037
  Date: 2018/10/25
  Time: 13:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>录用页面</title>
    <script>
        function hire() {
            if(!confirm("确定录用吗？")){
                window.event.returnValue = false;
            }
        }
    </script>
</head>
<body>
<table>
    <c:forEach items="${sessionScope.inviteList}" var="invite">
        <tr>
            <td>面试者</td>
            <td>学历</td>
            <td>专业</td>
            <td>应聘职位</td>
            <td>是否录用</td>
        </tr>
        <tr>
            <c:forEach items="${sessionScope.resumeList}" var="resume">
                <c:if test="${resume.resume_id==invite.resume_id}">
                    <td>${resume.resume_name}</td>
                    <td>${resume.resume_diploma}</td>
                    <td>${resume.resume_major}</td>
                </c:if>
            </c:forEach>
            <td>
                <c:forEach items="${sessionScope.recruitList}" var="recruit">
                    <c:if test="${recruit.recruit_id==invite.recruit_id}">
                        ${recruit.recruit_company_post}
                    </c:if>
                </c:forEach>
            </td>
            <td>
                <form action="addEmployee.do" method="post">
                    <input type="hidden" name="" value="">
                    <input type="submit" name="" value="录用" onclick="hire()">
                </form>
            </td>
        </tr>
    </c:forEach>
</table>
<a href="administratorView.do">返回</a>
<h4 style="color: red">
    ${requestScope.message}
</h4>
</body>
</html>
