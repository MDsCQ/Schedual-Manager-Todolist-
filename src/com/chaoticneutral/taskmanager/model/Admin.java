// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Admin.java

package com.chaoticneutral.taskmanager.model;


public class Admin
{

    public Admin()
    {
    }

    public int getUaid()
    {
        return uaid;
    }

    public void setUaid(int uaid)
    {
        this.uaid = uaid;
    }

    public String getAdminname()
    {
        return adminname;
    }

    public void setAdminname(String adminname)
    {
        this.adminname = adminname;
    }

    public String getAdminpassword()
    {
        return adminpassword;
    }

    public void setAdminpassword(String adminpassword)
    {
        this.adminpassword = adminpassword;
    }

    private int uaid;
    private String adminname;
    private String adminpassword;
}
