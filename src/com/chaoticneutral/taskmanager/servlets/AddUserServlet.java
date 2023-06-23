// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AddUserServlet.java

package com.chaoticneutral.taskmanager.servlets;

import com.chaoticneutral.taskmanager.dao.RequestionDao;
import com.chaoticneutral.taskmanager.dao.UserDao;
import com.chaoticneutral.taskmanager.model.*;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class AddUserServlet extends HttpServlet
{

    public AddUserServlet()
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
        int urid = Integer.valueOf(request.getParameter("urid")).intValue();
        Admin admin = (Admin)request.getSession().getAttribute("Admin");
        RequestionDao rd = new RequestionDao();
        Requestion requestion;
        try
        {
            requestion = rd.selectRequestion(urid);
            rd.deleteRequestion(urid);
        }
        catch(SQLException e)
        {
            throw new RuntimeException(e);
        }
        User user = new User();
        user.setUsername(requestion.getUsername());
        user.setUserpassword(requestion.getUserpassword());
        user.setPermissionid(admin.getUaid());
        UserDao ud = new UserDao();
        try
        {
            ud.addUser(user);
        }
        catch(SQLException e)
        {
            throw new RuntimeException(e);
        }
        request.getRequestDispatcher("/AdminServlet").forward(request, response);
    }
}
