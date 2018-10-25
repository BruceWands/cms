<%--
  Created by IntelliJ IDEA.
  User: 14037
  Date: 2018/10/24
  Time: 15:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工登录</title>
</head>
<body>
<fieldset>
    <legend>员工登录</legend>
    <form action="eLogin.do" method="post">
        <br/>
        <input type="text" name="emp_id" placeholder="请输入员工号" required>
        <br/><br/>
        <input type="password" name="emp_pass" placeholder="请输入密码" required>
        <br/><br/>
        <input type="submit" value="登录">
        <br/>
        <a href="index.do" style="text-decoration: none">返回官网</a>
    </form>
</fieldset>
<h4 style="color: red">
    ${requestScope.message}
</h4>
</body>
</html>
