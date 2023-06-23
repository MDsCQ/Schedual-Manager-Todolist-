// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DeleteAdminServlet.java

package com.chaoticneutral.taskmanager.servlets;

import com.chaoticneutral.taskmanager.dao.AdminDao;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class DeleteAdminServlet extends HttpServlet
{

    public DeleteAdminServlet()
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
        int uaid = Integer.valueOf(request.getParameter("uaid")).intValue();
        AdminDao ad = new AdminDao();
        try
        {
            ad.deleteAdmin(uaid);
        }
        catch(SQLException e)
        {
            throw new RuntimeException(e);
        }
        request.getRequestDispatcher("/AdminServlet").forward(request, response);
    }
}
