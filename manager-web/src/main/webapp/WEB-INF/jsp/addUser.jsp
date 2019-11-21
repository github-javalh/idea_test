<%--
  Created by IntelliJ IDEA.
  User: liuh1
  Date: 2019/11/20
  Time: 17:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户</title>
</head>
<body>
<form action="/user/addUser" method="post">
    用户名:<input type="text" name="userName"><br>
    密码:<input type="password" name="password"><br>
    年龄:<input type="text" name="age"><br>
    <input type="submit" value="OK">
</form>
</body>
</html>
