<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>学生信息</title>
</head>
<body>
    <table border="1" align="center" width="500px" cellspacing="0" style="text-align: center;border: 1px solid red;">
        <tr>
            <td>序号</td>
            <td>名字</td>
            <td>性别</td>
            <td>年龄</td>
            <td>成绩</td>
        </tr>
        <#list stuList as stu >
            <tr>
                <td>${stu_index+1}</td>
                <td>${stu.sname}</td>
                <td>${stu.ssex}</td>
                <td>${stu.sage}</td>
                <td>${stu.sscore}</td>
            </tr>
        </#list>
    </table>
</body>
</html>