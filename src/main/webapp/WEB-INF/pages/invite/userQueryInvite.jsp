<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 14037
  Date: 2018/10/25
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户查看面试邀请页面</title>
    <script>
        function acceptInvite() {
            if(!confirm("确定接受吗？")){
                window.event.returnValue = false;
            }
        }
    </script>
</head>
<body>
    <c:forEach items="${sessionScope.inviteList}" var="invite">
        <c:forEach items="${sessionScope.recruitList1}" var="recruit">
            <c:if test="${recruit.recruit_id==invite.recruit_id}">
                ${sessionScope.user.user_name}您好！<br/>
                我是${recruit.recruit_company_name}的HR，您投递了我们公司的${recruit.recruit_company_post}职位，我们查看了您的简历，对您非常感兴趣。<br/>
                在此向您发出诚挚的邀请，请于${invite.invite_time}之前，到达上海市浦东新区桂林路188号5楼。
                <form action="acceptInvite.do" method="post">
                    <input type="hidden" name="invite_id" value="${invite.invite_id}">
                    <input type="submit" value="接受面试" onclick="acceptInvite()">
                </form>
            </c:if>
        </c:forEach>
    </c:forEach>
<a href="user/homeView.do">返回</a>
<h4 style="color: red">
    ${requestScope.message}
</h4>
</body>
</html>
