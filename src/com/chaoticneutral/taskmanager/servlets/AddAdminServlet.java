// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AddAdminServlet.java

package com.chaoticneutral.taskmanager.servlets;

import com.chaoticneutral.taskmanager.dao.AdminDao;
import com.chaoticneutral.taskmanager.model.Admin;
import com.chaoticneutral.taskmanager.utils.EncryptionMD5;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class AddAdminServlet extends HttpServlet
{

    public AddAdminServlet()
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
        admin.setAdminpassword(EncryptionMD5.md5(request.getParameter("adminpassword")));
        AdminDao ad = new AdminDao();
        try
        {
            ad.addAdmin(admin);
        }
        catch(SQLException e)
        {
            throw new RuntimeException(e);
        }
        request.getRequestDispatcher("/AdminServlet").forward(request, response);
    }
}
