<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 14037
  Date: 2018/10/26
  Time: 1:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员查看部门</title>
    <script>
        function updateDept() {
            if(!confirm("确定修改吗？")){
                window.event.returnValue = false;
            }
        }
        function deleteDept() {
            if(!confirm("确定删除吗？")){
                window.event.returnValue = false;
            }
        }
    </script>
</head>
<body>
<fieldset style="width: 400px">
    <legend>新建部门</legend>
    <form action="addDept.do" method="post">
        部门名称：<input type="text" name="dept_name" required>
        <input type="submit" value="创建" style="cursor: pointer">
    </form>
</fieldset>
<hr/>
<table>
    <tr>
        <td>部门编号</td>
        <td>部门名称</td>
        <td>创立时间</td>
    </tr>
    <c:forEach items="${sessionScope.deptList}" var="dept">
        <tr>
            <td>${dept.dept_id}</td>
            <td>${dept.dept_name}</td>
            <td>${dept.dept_create_time}</td>
            <td>
                <form action="updateDept.do" method="post">
                    <input type="text" name="dept_name" placeholder="修改后的部门名称" required>
                    <input type="hidden" name="dept_id" value="${dept.dept_id}">
                    <input type="submit" style="cursor: pointer" value="修改" onclick="updateDept()">
                </form>
            </td>
            <td>
                <form action="deleteDept.do" method="post">
                    <input type="hidden" name="dept_id" value="${dept.dept_id}">
                    <input type="submit" style="cursor: pointer" value="删除" onclick="deleteDept()">
                </form>
            </td>
        </tr>
    </c:forEach>
</table>
<a href="administratorView.do">返回</a>
<hr/>
<h4 style="color: red">
    ${requestScope.message}
</h4>
</body>
</html>
