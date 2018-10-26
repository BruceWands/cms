<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 14037
  Date: 2018/10/22
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title>主页</title>
    <link href="../../css/homePage.css" type="text/css" rel="stylesheet"/>
    <%--<script src="../../resources/js/jquery-3.2.1.js"></script>
    <script>
        $(function () {
            $("#btn").click(function () {
                $.ajax({
                    type:"get",
                    url:"choiceResume.do",
                    success:function (obj) {
                        if(obj=="123"){
                        }else if(obj=="暂无简历"){
                            alert(obj);
                        }
                    }
                })
            })
        })
    </script>--%>
</head>
<body>
<h2 style="font-family: 华文行楷">
    &nbsp;&nbsp;
    尊敬的${sessionScope.user.user_name}，你好！
    <br/>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;欢迎来到个人主页！
    <br/>
</h2>
<a href="showResume.do">简历中心</a>
<%--<a href="good/queryAllGood.do?currentPage=1">谁看过我</a>--%>
<a href="showApplyView.do">我的申请</a>
<a href="userQueryInvite.do?user_id=${sessionScope.user.user_id}">查看面试邀请</a>
<a href="index.do">退出</a>
<br/>
<h3>为您推荐</h3>
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
                <form action="choiceResumeView.do" method="post">
                    <input type="hidden" name="recruit_id" value="${recruit.recruit_id}">
                    <input type="hidden" name="user_id" value="${sessionScope.user.user_id}">
                    <input style="background-color: coral;cursor: pointer" type="submit" value="立即申请">
                </form>
            </td>
        </tr>
    </c:forEach>
</table>
<form action="showRecruit.do" method="post">
    <c:forEach begin="1" end="${sessionScope.maxPage}" var="i">
        <input style="cursor: pointer" type="submit" name="currentPage" value="${i}">
    </c:forEach>
</form>
<h4 style="color: red">
    ${requestScope.message}
</h4>
</body>
</html>
