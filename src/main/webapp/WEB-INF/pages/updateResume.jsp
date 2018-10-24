<%--
  Created by IntelliJ IDEA.
  User: 14037
  Date: 2018/10/23
  Time: 1:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改个人简历</title>
    <script>
        function updResume() {
            if(!confirm("确定修改吗？")){
                window.event.returnValue = false;
            }
        }
    </script>
</head>
<body>
<form action="updateResume.do" method="post">
    <table cellspacing="0px" cellpadding="10px" style="text-align: center">
        <tr>
            <td>
                姓名*<input type="text" name="resume_name" value="${sessionScope.resume.resume_name}" required>
            </td>
            <td>
                性别*
                <select>
                    <option name="resume_gender" value="男">男</option>
                    <option name="resume_gender" value="女">女</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>出生日期*<input type="text" name="resume_birth" value="${sessionScope.resume.resume_birth}" required></td>
            <td>民族*<input type="text" name="resume_nation" value="${sessionScope.resume.resume_nation}" required></td>
        </tr>
        <tr>
            <td>政治面貌*<input type="text" name="resume_politics_status" value="${sessionScope.resume.resume_politics_status}" required></td>
            <td>学历*<input type="text" name="resume_diploma" value="${sessionScope.resume.resume_diploma}" required></td>
        </tr>
        <tr>
            <td>籍贯*<input type="text" name="resume_native_place" value="${sessionScope.resume.resume_native_place}" required></td>
            <td>e-mail*<input type="text" name="resume_email" value="${sessionScope.resume.resume_email}" required></td>
        </tr>
        <tr>
            <td>联系电话*<input type="text" name="resume_phone" value="${sessionScope.resume.resume_phone}" required></td>
            <td>专业*<input type="text" name="resume_major" value="${sessionScope.resume.resume_major}" required></td>
        </tr>
        <tr>
            <td>身高（cm）<input type="number" name="resume_stature" value="${sessionScope.resume.resume_stature}" min="1" max="300"></td>
            <td>毕业院校<input type="text" name="resume_schoolTag" value="${sessionScope.resume.resume_schoolTag}"></td>
        </tr>
        <tr>
            <td>外语水平<input type="text" name="resume_language_skill" value="${sessionScope.resume.resume_language_skill}"></td>
            <td>计算机等级<input type="text" name="resume_computer_rank" value="${sessionScope.resume.resume_computer_rank}"></td>
        </tr>
        <tr>
        <textarea name="resume_work_experience" value="${sessionScope.resume.resume_work_experience}" cols="30" rows="10">
            工作经历：
        </textarea>
        </tr>
        <tr>
        <textarea name="resume_self_appraisal" value="${sessionScope.resume.resume_self_appraisal}" cols="30" rows="10">
        自我评价：
        </textarea>
        </tr>
    </table>
    <input type="hidden" name="user_id" value="${sessionScope.user.user_id}">
    <input type="submit" value="确定" onclick="updResume()">
    <a href="showResume.do">返回</a>
</form>
<h4 style="color: red">
    ${requestScope.message}
</h4>
</body>
</html>
