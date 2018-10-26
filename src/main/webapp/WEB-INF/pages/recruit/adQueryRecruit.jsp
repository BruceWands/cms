<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 14037
  Date: 2018/10/25
  Time: 23:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员查看招聘信息</title>
    <script>
        function delRecruit() {
            if(!confirm("确定删除吗？")){
                window.event.returnValue = false;
            }
        }
    </script>
</head>
<body>
<table cellspacing="10px" cellpadding="10px">
    <c:forEach items="${sessionScope.recruitList}" var="recruit">
        <tr>
            <td width="800px">
                职位：${recruit.recruit_company_post}&nbsp;&nbsp;&nbsp;
                公司：${recruit.recruit_company_name}&nbsp;&nbsp;&nbsp;
                地区：${recruit.recruit_region}&nbsp;&nbsp;&nbsp;
                薪资：${recruit.recruit_salary}<br/><br/>
                任职要求：${recruit.recruit_demand}<br/><br/>
                职位信息：${recruit.recruit_post_info}<br/><br/>
                联系我们：${recruit.recruit_contact}
            </td>
            <td>
                <form action="updateRecruitView.do" method="post">
                    <input type="hidden" name="recruit_id" value="${recruit.recruit_id}">
                    <input style="background-color: coral;cursor: pointer" type="submit" value="修改">
                </form>
            </td>
            <td>
                <form action="deleteRecruit.do" method="post">
                    <input type="hidden" name="recruit_id" value="${recruit.recruit_id}">
                    <input style="background-color: coral;cursor: pointer" type="submit" value="删除" onclick="delRecruit()">
                </form>
            </td>
        </tr>
    </c:forEach>
</table>
<form action="recruitView.do" method="post">
    <c:forEach begin="1" end="${sessionScope.maxPage}" var="i">
        <input style="cursor: pointer" type="submit" name="currentPage" value="${i}">
    </c:forEach>
</form>
<h4 style="color: red">
    ${requestScope.message}
</h4>
<a href="administratorView.do">返回</a>
</body>
</html>
