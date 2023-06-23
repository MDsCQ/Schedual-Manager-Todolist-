// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AddRegister.java

package com.chaoticneutral.taskmanager.servlets;

import com.chaoticneutral.taskmanager.dao.RequestionDao;
import com.chaoticneutral.taskmanager.model.Requestion;
import com.chaoticneutral.taskmanager.utils.EncryptionMD5;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class AddRegister extends HttpServlet
{

    public AddRegister()
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
        String username = request.getParameter("username");
        String userpassword = request.getParameter("userpassword");
        Requestion requestion = new Requestion();
        requestion.setUsername(username);
        requestion.setUserpassword(EncryptionMD5.md5(userpassword));
        RequestionDao rd = new RequestionDao();
        try
        {
            rd.addRequestion(requestion);
        }
        catch(SQLException e)
        {
            throw new RuntimeException(e);
        }
        response.sendRedirect("index.jsp");
    }
}
