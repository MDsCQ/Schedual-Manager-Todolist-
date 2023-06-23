// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AddScheServlet.java

package com.chaoticneutral.taskmanager.servlets;

import com.chaoticneutral.taskmanager.dao.ScheDao;
import com.chaoticneutral.taskmanager.model.Schedual;
import com.chaoticneutral.taskmanager.model.User;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class AddScheServlet extends HttpServlet
{

    public AddScheServlet()
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
        Schedual schedual = new Schedual();
        String date = request.getParameter("deadline");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        schedual.setTital(request.getParameter("tital"));
        try
        {
            schedual.setDeadline(dateFormat.parse(date));
        }
        catch(ParseException e)
        {
            throw new RuntimeException(e);
        }
        ScheDao sd = new ScheDao();
        try
        {
            sd.addSche(schedual, (User)request.getSession().getAttribute("User"));
        }
        catch(SQLException e)
        {
            throw new RuntimeException(e);
        }
        request.getRequestDispatcher("/UserServlet").forward(request, response);
    }
}
