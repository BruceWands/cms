<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 14037
  Date: 2018/10/26
  Time: 2:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员查看职位</title>
    <script>
        function updatePost() {
            if(!confirm("确定修改吗？")){
                window.event.returnValue = false;
            }
        }
        function deletePost() {
            if(!confirm("确定删除吗？")){
                window.event.returnValue = false;
            }
        }
    </script>
</head>
<body>
<fieldset style="width: 400px">
    <legend>新建职位</legend>
    <form action="addPost.do" method="post">
        请选择部门：
        <select name="dept_id" required>
            <%--<option>--请选择--</option>--%>
            <c:forEach items="${sessionScope.deptList}" var="dept">
                <option value="${dept.dept_id}">${dept.dept_name}</option>
            </c:forEach>
        </select>
        <br/>
        职位名称：<input type="text" name="post_name" required>
        <input type="submit" value="创建" style="cursor: pointer">
    </form>
</fieldset>
<hr/>
<table>
    <tr>
        <td>职位编号</td>
        <td>职位名称</td>
        <td>所属部门</td>
    </tr>
    <c:forEach items="${sessionScope.postList}" var="post">
        <tr>
            <td>${post.post_id}</td>
            <td>${post.post_name}</td>
            <td>
                <c:forEach items="${sessionScope.deptList}" var="dept">
                    <c:if test="${dept.dept_id==post.dept_id}">
                        ${dept.dept_name}
                    </c:if>
                </c:forEach>
            </td>
            <td>
                <form action="updatePost.do" method="post">
                    <input type="text" name="post_name" placeholder="修改后的职位名称" required>
                    <input type="hidden" name="post_id" value="${post.post_id}">
                    <input type="submit" style="cursor: pointer" value="修改" onclick="updatePost()">
                </form>
            </td>
            <td>
                <form action="deletePost.do" method="post">
                    <input type="hidden" name="post_id" value="${post.post_id}">
                    <input type="submit" style="cursor: pointer" value="删除" onclick="deletePost()">
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
