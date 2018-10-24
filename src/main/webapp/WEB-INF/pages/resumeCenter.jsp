<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 14037
  Date: 2018/10/23
  Time: 0:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>个人简历中心</title>
    <script>
        function delResume() {
            if(!confirm("确定删除吗？")){
                window.event.returnValue = false;
            }
        }
    </script>
</head>
<body>
<a href="addResumeView.do">创建简历</a>
<table>
    <c:forEach items="${sessionScope.resumeList}" var="resume">
        <tr>
            <td>
                    我的简历${resume.resume_id}
            </td>
            <td>
                对所有公开
            </td>
            <td>
                <a href="updateResumeView.do?resume_id=${resume.resume_id}">修改</a>
            </td><td>
                <a href="deleteResume.do?resume_id=${resume.resume_id}" onclick="delResume()">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
<h3 style="color: red">
    ${requestScope.message}
</h3>
</body>
</html>
