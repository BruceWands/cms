<%--
  Created by IntelliJ IDEA.
  User: 14037
  Date: 2018/10/24
  Time: 13:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员主页</title>
</head>
<body>
<a href="recruitView.do?currentPage=1">查看招聘信息</a>
<a href="addRecruitView.do">添加招聘信息</a>
<a href="adQueryApply.do">查看人才申请</a>
<a href="adQueryInvite.do">录用人才</a>
<a href="adQueryDept.do">查看部门</a>
<a href="adQueryPost.do">查看职位</a>
<a href="index.do">退出</a>
<h4 style="color: red">
    ${requestScope.message}
</h4>
</body>
</html>
