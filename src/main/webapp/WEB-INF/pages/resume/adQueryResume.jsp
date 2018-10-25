<%--
  Created by IntelliJ IDEA.
  User: 14037
  Date: 2018/10/25
  Time: 1:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员查看用户简历详情页面</title>
    <link rel="stylesheet" href="../../../static/layui/layui/css/layui.css">
    <script>
        function conInvite() {
            if(!confirm("确定发送面试邀请吗？")){
                window.event.returnValue = false;
            }
        }
    </script>
</head>
<body>
<table cellspacing="10px" cellpadding="10px">
    <tr>
        <td>
            姓名*${requestScope.resume.resume_name}
        </td>
        <td>
            性别*${requestScope.resume.resume_gender}
        </td>
    </tr>
    <tr>
        <td>出生日期*${requestScope.resume.resume_birth}</td>
        <td>民族*${requestScope.resume.resume_nation}</td>
    </tr>
    <tr>
        <td>政治面貌*${requestScope.resume.resume_politics_status}</td>
        <td>学历*${requestScope.resume.resume_diploma}</td>
    </tr>
    <tr>
        <td>籍贯*${requestScope.resume.resume_native_place}</td>
        <td>e-mail*${requestScope.resume.resume_email}</td>
    </tr>
    <tr>
        <td>联系电话*${requestScope.resume.resume_phone}</td>
        <td>专业*${requestScope.resume.resume_major}</td>
    </tr>
    <tr>
        <td>身高（cm）${requestScope.resume.resume_stature}</td>
        <td>毕业院校 ${requestScope.resume.resume_schoolTag}</td>
    </tr>
    <tr>
        <td>外语水平${requestScope.resume.resume_language_skill}</td>
        <td>计算机等级${requestScope.resume.resume_computer_rank}</td>
    </tr>
    <tr>
        工作经历
            ${requestScope.resume.resume_work_experience}
    </tr>
    <tr>
        自我评价
            ${requestScope.resume.resume_self_appraisal}
    </tr>
</table>
<hr/>
<fieldset>
    <legend>发送面试邀请</legend>
    <form action="addInvite.do" method="post">
        <div class="layui-form">
            <div class="layui-form-item">
                <div class="layui-inline">
                    <label class="layui-form-label">选择面试时间</label>
                    <div class="layui-input-inline">
                        <input type="text" class="layui-input" name="invite_time" id="test5" placeholder="yyyy-MM-dd HH:mm:ss" required>
                    </div>
                </div>
            </div>
        </div>
        <input type="hidden" name="user_id" value="${requestScope.resume.user_id}">
        <input type="submit" value="确定" onclick="conInvite()">
    </form>
</fieldset>
<a href="adQueryApply.do">返回</a>

<script src="../../../static/layui/layui/layui.all.js"></script>
<script>
    layui.use('laydate', function(){
        var laydate = layui.laydate;

        //日期时间选择器
        laydate.render({
            elem: '#test5'
            ,type: 'datetime'
        });
    });
</script>
</body>
</html>
