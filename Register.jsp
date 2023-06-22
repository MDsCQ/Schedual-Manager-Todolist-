<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2023/6/11
  Time: 15:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>注册</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i&amp;display=swap">
</head>

<body class="bg-gradient-primary">
<div class="container" style="padding-bottom: 0px;">
    <div class="card shadow-lg o-hidden border-0 my-5">
        <div class="card-body p-0">
            <div class="row">
                <div>
                    <div class="p-5">
                        <div class="text-center">
                            <h4 class="text-dark mb-4">提交注册申请!</h4>
                        </div>
                        <form class="user" action="/AddRegister">
                            <div class="mb-3"><input class="form-control form-control-user" type="text" id="username" placeholder="用户名" name="username"></div>
                            <div class="mb-3"><input class="form-control form-control-user" type="password" id="examplePasswordInput" placeholder="密码" name="userpassword"></div>
                            <button class="btn btn-primary d-block btn-user w-100" type="submit">提交申请</button>
                        </form>
                        <div class="text-center"><a class="small" href="index.jsp">已有账户? 登录!</a></div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script src="assets/bootstrap/js/bootstrap.min.js"></script>
<script src="assets/js/bs-init.js"></script>
<script src="assets/js/theme.js"></script>
</body>

</html>
