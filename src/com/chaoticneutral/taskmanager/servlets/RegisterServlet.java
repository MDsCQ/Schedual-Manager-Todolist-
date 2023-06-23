// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   RegisterServlet.java

package com.chaoticneutral.taskmanager.servlets;

import com.chaoticneutral.taskmanager.dao.RequestionDao;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class RegisterServlet extends HttpServlet
{

    public RegisterServlet()
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
        RequestionDao rd = new RequestionDao();
        List rlist;
        try
        {
            rlist = rd.selectAllRequestion();
        }
        catch(SQLException e)
        {
            throw new RuntimeException(e);
        }
        request.setAttribute("registerlist", rlist);
        request.getRequestDispatcher("RegisterManage.jsp").forward(request, response);
    }
}
