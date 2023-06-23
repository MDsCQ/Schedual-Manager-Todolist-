// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   UserLoginServlet.java

package com.chaoticneutral.taskmanager.servlets;

import com.chaoticneutral.taskmanager.dao.UserDao;
import com.chaoticneutral.taskmanager.model.User;
import com.chaoticneutral.taskmanager.utils.EncryptionMD5;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class UserLoginServlet extends HttpServlet
{

    public UserLoginServlet()
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
        User user = new User();
        user.setUsername(request.getParameter("username"));
        user.setUserpassword(request.getParameter("userpassword"));
        UserDao ud = new UserDao();
        try
        {
            if(ud.isUsernameExist(user.getUsername()))
                user = ud.selectByUsernamePassword(request.getParameter("username"), EncryptionMD5.md5(request.getParameter("userpassword")));
            else
                request.getRequestDispatcher("404.jsp").forward(request, response);
        }
        catch(SQLException e)
        {
            throw new RuntimeException(e);
        }
        if(user == null)
        {
            request.getRequestDispatcher("404.jsp").forward(request, response);
        } else
        {
            request.getSession().setAttribute("User", user);
            request.getRequestDispatcher("/UserServlet").forward(request, response);
        }
    }
}
