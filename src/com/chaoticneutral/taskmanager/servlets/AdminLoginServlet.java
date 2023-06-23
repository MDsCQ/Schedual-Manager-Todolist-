// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AdminLoginServlet.java

package com.chaoticneutral.taskmanager.servlets;

import com.chaoticneutral.taskmanager.dao.AdminDao;
import com.chaoticneutral.taskmanager.model.Admin;
import com.chaoticneutral.taskmanager.utils.EncryptionMD5;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class AdminLoginServlet extends HttpServlet
{

    public AdminLoginServlet()
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
        Admin admin = new Admin();
        admin.setAdminname(request.getParameter("adminname"));
        admin.setAdminpassword(request.getParameter("adminpassword"));
        AdminDao ad = new AdminDao();
        try
        {
            if(ad.isAdminnameExist(admin.getAdminname()))
                admin = ad.selectByAdminnamePassword(request.getParameter("adminname"), EncryptionMD5.md5(request.getParameter("adminpassword")));
            else
                request.getRequestDispatcher("404.jsp").forward(request, response);
        }
        catch(SQLException e)
        {
            throw new RuntimeException(e);
        }
        if(admin == null)
        {
            request.getRequestDispatcher("404.jsp").forward(request, response);
        } else
        {
            request.getSession().setAttribute("Admin", admin);
            request.getRequestDispatcher("/AdminServlet").forward(request, response);
        }
    }
}
