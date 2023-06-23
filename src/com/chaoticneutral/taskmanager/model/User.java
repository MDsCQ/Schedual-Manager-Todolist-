// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   User.java

package com.chaoticneutral.taskmanager.model;


public class User
{

    public User()
    {
    }

    public int getUid()
    {
        return uid;
    }

    public void setUid(int uid)
    {
        this.uid = uid;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getUserpassword()
    {
        return userpassword;
    }

    public void setUserpassword(String userpassword)
    {
        this.userpassword = userpassword;
    }

    public int getPermissionid()
    {
        return permissionid;
    }

    public void setPermissionid(int permissionid)
    {
        this.permissionid = permissionid;
    }

    private int uid;
    private String username;
    private String userpassword;
    private int permissionid;
}
