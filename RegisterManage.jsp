<%@ page import="com.chaoticneutral.taskmanager.model.Requestion" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2023/6/11
  Time: 21:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
  <title>申请管理</title>
  <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i&amp;display=swap">
  <link rel="stylesheet" href="assets/fonts/fontawesome-all.min.css">
</head>

<body id="page-top">
<div id="wrapper">
  <nav class="navbar navbar-dark align-items-start sidebar sidebar-dark accordion bg-gradient-primary p-0">
    <div class="container-fluid d-flex flex-column p-0"><a class="navbar-brand d-flex justify-content-center align-items-center sidebar-brand m-0" href="index.jsp">
      <div class="sidebar-brand-icon rotate-n-15"><i class="fas fa-laugh-wink"></i></div>
      <div class="sidebar-brand-text mx-3"><span>ToDo</span></div>
    </a>
      <hr class="sidebar-divider my-0">
      <ul class="navbar-nav text-light" id="accordionSidebar">
        <li class="nav-item"><a class="nav-link" href="index.jsp"><i class="fas fa-tachometer-alt"></i><span>首页</span></a></li>
        <li class="nav-item"><a class="nav-link" href="/AdminServlet"><i class="far fa-user-circle"></i><span>用户管理</span></a></li>
        <li class="nav-item"><a class="nav-link" href="/RegisterServlet"><i class="fas fa-user-circle"></i><span>申请管理</span></a></li>
        <li class="nav-item"><a class="nav-link" href="/Logout"><i class="fas fa-user-circle"></i><span>退出登录</span></a></li>
      </ul>
      <div class="text-center d-none d-md-inline"><button class="btn rounded-circle border-0" id="sidebarToggle" type="button"></button></div>
    </div>
  </nav>
  <div class="d-flex flex-column" id="content-wrapper">
    <div id="content">
      <div class="container-fluid">
        <div class="card shadow">
          <div class="card-header py-3">
            <p class="text-primary m-0 fw-bold">申请列表</p>
          </div>
          <div class="card-body">
            <div class="table-responsive table mt-2" id="dataTable" role="grid" aria-describedby="dataTable_info">
              <table class="table my-0" id="dataTable">
                <thead>
                <tr>
                  <th>申请用户名</th>
                  <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <%
                  List<Requestion> adlist= (List<Requestion>) request.getAttribute("registerlist");
                  for(Requestion requestion:adlist){
                    out.print("<tr>\n" +
                            "<td>"+requestion.getUsername()+"</td>\n" +
                            "<td><form style=\"display: inline-block\" method=\"post\" action=\"/AddUserServlet\">\n" +
                            "<input type=\"hidden\" name=\"urid\" value=\""+requestion.getUid()+"\">\n" +
                            "<button class=\"btn btn-primary py-0\" type=\"submit\" value=\"add\">通过</button>\n" +
                            "</form>" +
                            "</td>\n" +
                            "</tr>");
                  }
                %>
                </tbody>
                <tfoot>
                <tr>
                  <td><strong>申请用户名</strong></td>
                  <td><strong>操作</strong></td>
                </tr>
                </tfoot>
              </table>
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
