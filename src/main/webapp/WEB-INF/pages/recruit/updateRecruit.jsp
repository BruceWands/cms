<%--
  Created by IntelliJ IDEA.
  User: 14037
  Date: 2018/10/25
  Time: 23:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改招聘信息页面</title>
    <style>
        td> input{
            width: 100%;
            height: 100%;
        }
    </style>
    <script>
        function updateRecruit() {
            if(!confirm("确定修改吗？")){
                window.event.returnValue = false;
            }
        }
    </script>
</head>
<body>
<form action="updateRecruit.do" method="post">
    <table border="1">
        <tr>
            <td>公司名称</td><td><input type="text" name="recruit_company_name" value="${requestScope.recruit.recruit_company_name}" required></td>
            <td>招聘职位</td><td><input type="text" name="recruit_company_post" value="${requestScope.recruit.recruit_company_post}" required></td>
        </tr>
        <tr>
            <td>所在地区</td><td><input type="text" name="recruit_region" value="${requestScope.recruit.recruit_region}" required></td>
            <td>招聘薪资</td><td><input type="text" name="recruit_salary" value="${requestScope.recruit.recruit_salary}" required></td>
        </tr>
        <tr>
            <td>联系我们</td><td><input type="text" name="recruit_contact" value="${requestScope.recruit.recruit_contact}" required></td>
        </tr>
        <tr><td>职位信息</td></tr>
        <tr>
            <td colspan="4">
                <textarea style="width: 100%;height: 100%" name="recruit_post_info" required>${requestScope.recruit.recruit_post_info}</textarea>
            </td>
        </tr>
        <tr><td>任职需求</td></tr>
        <tr>
            <td colspan="4">
                <textarea style="width: 100%;height: 100%" name="recruit_demand" required>${requestScope.recruit.recruit_demand}</textarea>
            </td>
        </tr>
    </table>
    <input type="hidden" name="recruit_id" value="${requestScope.recruit.recruit_id}">
    <input type="submit" value="提交" onclick="updateRecruit()">
</form>
<a href="administratorView.do">返回</a>
</body>
</html>
