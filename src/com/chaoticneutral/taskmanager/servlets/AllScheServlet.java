// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AllScheServlet.java

package com.chaoticneutral.taskmanager.servlets;

import com.chaoticneutral.taskmanager.dao.ScheDao;
import com.chaoticneutral.taskmanager.model.User;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class AllScheServlet extends HttpServlet
{

    public AllScheServlet()
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
        User u = (User)request.getSession().getAttribute("User");
        if(u == null)
            request.getRequestDispatcher("404.jsp").forward(request, response);
        ScheDao sd = new ScheDao();
        List list;
        try
        {
            list = sd.selectAllSchedual(u);
        }
        catch(SQLException e)
        {
            throw new RuntimeException(e);
        }
        request.setAttribute("allschelist", list);
        request.getRequestDispatcher("AllSchedual.jsp").forward(request, response);
    }
}
