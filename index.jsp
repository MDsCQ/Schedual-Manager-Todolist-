<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2023/6/11
  Time: 03:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
  <title>登录</title>
  <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i&amp;display=swap">
  <link rel="stylesheet" href="assets/fonts/fontawesome-all.min.css">
</head>

<body id="page-top">
<div id="wrapper">
  <nav class="navbar navbar-dark align-items-start sidebar sidebar-dark accordion bg-gradient-primary p-0">
    <div class="container-fluid d-flex flex-column p-0"><a class="navbar-brand d-flex justify-content-center align-items-center sidebar-brand m-0" href="#">
      <div class="sidebar-brand-icon rotate-n-15"><i class="fas fa-laugh-wink"></i></div>
      <div class="sidebar-brand-text mx-3"><span>ToDo</span></div>
    </a>
      <hr class="sidebar-divider my-0">
      <ul class="navbar-nav text-light" id="accordionSidebar">
        <li class="nav-item"><a class="nav-link" href="index.jsp"><i class="fas fa-tachometer-alt"></i><span>首页</span></a></li>
        <li class="nav-item"><a class="nav-link" href="index.jsp"><i class="far fa-user-circle"></i><span>登录</span></a></li>
        <li class="nav-item"><a class="nav-link" href="Register.jsp"><i class="fas fa-user-circle"></i><span>注册</span></a></li>
      </ul>
      <div class="text-center d-none d-md-inline"><button class="btn rounded-circle border-0" id="sidebarToggle" type="button"></button></div>
    </div>
  </nav>
  <div class="d-flex flex-column" id="content-wrapper">
    <div id="content">
      <div class="container-fluid">
        <h3 class="text-dark mb-4">登录</h3>
        <div class="row mb-3">
          <div class="col-lg-8">
            <div class="row">
              <div class="col-xxl-12">
                <div class="card shadow mb-3">
                  <div class="card-header py-3">
                    <p class="text-primary m-0 fw-bold">用户登录</p>
                  </div>
                  <div class="card-body">
                    <form action="/UserLoginServlet" method="post">
                      <div class="row">
                        <div class="col">
                          <div class="mb-3"><label class="form-label" for="username"><strong>用户名</strong></label><input class="form-control" type="text" id="username" placeholder="用户名" name="username"></div>
                        </div>
                      </div>
                      <div class="row">
                        <div class="col">
                          <div class="mb-3"><label class="form-label" for="userpassword"><strong>密码</strong></label><input class="form-control" type="password" id="userpassword" placeholder="密码" name="userpassword"></div>
                        </div>
                      </div>
                      <div class="mb-3"><button class="btn btn-primary btn-sm" type="submit">用户登录</button></div>
                    </form>
                  </div>
                </div>
                <div class="card shadow">
                  <div class="card-header py-3">
                    <p class="text-primary m-0 fw-bold">管理员登录</p>
                  </div>
                  <div class="card-body">
                    <form action="/AdminLoginServlet" method="post">
                      <div class="row">
                        <div class="col">
                          <div class="mb-3"><label class="form-label" for="adminname"><strong>管理员用户名</strong></label><input class="form-control" type="text" id="adminname" placeholder="管理员用户名" name="adminname"></div>
                        </div>
                      </div>
                      <div class="row">
                        <div class="col">
                          <div class="mb-3"><label class="form-label" for="adminpassword"><strong>管理员密码</strong></label><input class="form-control" type="password" id="adminpassword" placeholder="管理员密码" name="adminpassword"></div>
                        </div>
                      </div>
                      <div class="mb-3"><button class="btn btn-primary btn-sm" type="submit">管理员登录</button></div>
                    </form>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <footer class="bg-white sticky-footer">
      <div class="container my-auto">
        <div class="text-center my-auto copyright"><strong>This Proj. only use for JavaWeb Course</strong><sub>Written by M.Ds.CQ</sub></div>
      </div>
    </footer>
  </div><a class="border rounded d-inline scroll-to-top" href="#page-top"><i class="fas fa-angle-up"></i></a>
</div>
<script src="assets/bootstrap/js/bootstrap.min.js"></script>
<script src="assets/js/bs-init.js"></script>
<script src="assets/js/theme.js"></script>
</body>
</html>
