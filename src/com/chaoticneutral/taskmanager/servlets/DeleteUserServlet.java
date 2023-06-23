// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DeleteUserServlet.java

package com.chaoticneutral.taskmanager.servlets;

import com.chaoticneutral.taskmanager.dao.UserDao;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class DeleteUserServlet extends HttpServlet
{

    public DeleteUserServlet()
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
        int uid = Integer.valueOf(request.getParameter("uid")).intValue();
        UserDao ud = new UserDao();
        try
        {
            ud.deleteUser(uid);
        }
        catch(SQLException e)
        {
            throw new RuntimeException(e);
        }
        request.getRequestDispatcher("/AdminServlet").forward(request, response);
    }
}
