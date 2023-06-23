// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AdminServlet.java

package com.chaoticneutral.taskmanager.servlets;

import com.chaoticneutral.taskmanager.dao.AdminDao;
import com.chaoticneutral.taskmanager.dao.UserDao;
import com.chaoticneutral.taskmanager.model.Admin;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class AdminServlet extends HttpServlet
{

    public AdminServlet()
    {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException
    {
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException
    {
        Admin admin = (Admin)request.getSession().getAttribute("Admin");
        if(admin == null)
            request.getRequestDispatcher("404.jsp").forward(request, response);
        UserDao ud = new UserDao();
        List ulist;
        try
        {
            ulist = ud.selectByPermissiond(admin.getUaid());
        }
        catch(SQLException e)
        {
            throw new RuntimeException(e);
        }
        request.setAttribute("userlist", ulist);
        AdminDao ad = new AdminDao();
        List adlist;
        try
        {
            adlist = ad.selectAllAdmin();
        }
        catch(SQLException e)
        {
            throw new RuntimeException(e);
        }
        request.setAttribute("adminlist", adlist);
        request.getRequestDispatcher("AdminManage.jsp").forward(request, response);
    }
}
