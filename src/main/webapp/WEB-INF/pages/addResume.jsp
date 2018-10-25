<%--
  Created by IntelliJ IDEA.
  User: 14037
  Date: 2018/10/23
  Time: 9:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>创建简历</title>
</head>
<body>
<form action="addResume.do" method="post">
<table cellspacing="10px" cellpadding="10px">
    <tr>
        <td>
            姓名*<input type="text" name="resume_name" required>
        </td>
        <td>
            性别*
            <select name="resume_gender">
                <option>男</option>
                <option>女</option>
            </select>
        </td>
    </tr>
    <tr>
        <td>出生日期*<input type="text" name="resume_birth" required></td>
        <td>民族*<input type="text" name="resume_nation" required></td>
    </tr>
    <tr>
        <td>政治面貌*<input type="text" name="resume_politics_status" required></td>
        <td>学历*<input type="text" name="resume_diploma" required></td>
    </tr>
    <tr>
        <td>籍贯*<input type="text" name="resume_native_place" required></td>
        <td>e-mail*<input type="text" name="resume_email" required></td>
    </tr>
    <tr>
        <td>联系电话*<input type="text" name="resume_phone" required></td>
        <td>专业*<input type="text" name="resume_major" required></td>
    </tr>
    <tr>
        <td>身高（cm）<input type="number" name="resume_stature" min="1" max="300"></td>
        <td>毕业院校<input type="text" name="resume_schoolTag"></td>
    </tr>
    <tr>
        <td>外语水平<input type="text" name="resume_language_skill"></td>
        <td>计算机等级<input type="text" name="resume_computer_rank"></td>
    </tr>
    <tr>
        <textarea name="resume_work_experience" cols="30" rows="10">
            工作经历：
        </textarea>
    </tr>
    <tr>
        <textarea name="resume_self_appraisal" cols="30" rows="10">
        自我评价：
        </textarea>
    </tr>
</table>
    <input type="hidden" name="user_id" value="${sessionScope.user.user_id}">
    <input type="submit" value="确定">
</form>
<h4 style="color: red">
    ${requestScope.message}
</h4>
</body>
</html>
