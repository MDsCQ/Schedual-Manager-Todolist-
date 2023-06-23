// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ChangeStateServlet.java

package com.chaoticneutral.taskmanager.servlets;

import com.chaoticneutral.taskmanager.dao.ScheDao;
import com.chaoticneutral.taskmanager.model.User;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class ChangeStateServlet extends HttpServlet
{

    public ChangeStateServlet()
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
        int uscheid = Integer.valueOf(request.getParameter("uscheid")).intValue();
        ScheDao sd = new ScheDao();
        try
        {
            sd.updateState(uscheid, u);
        }
        catch(SQLException e)
        {
            throw new RuntimeException(e);
        }
        request.getRequestDispatcher("/UserServlet").forward(request, response);
    }
}
