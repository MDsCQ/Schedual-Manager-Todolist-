// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Schedual.java

package com.chaoticneutral.taskmanager.model;

import java.util.Date;

public class Schedual
{

    public Schedual()
    {
    }

    public int getUscheid()
    {
        return uscheid;
    }

    public void setUscheid(int uscheid)
    {
        this.uscheid = uscheid;
    }

    public String getTital()
    {
        return tital;
    }

    public void setTital(String tital)
    {
        this.tital = tital;
    }

    public Date getAddtime()
    {
        return addtime;
    }

    public void setAddtime(Date addtime)
    {
        this.addtime = addtime;
    }

    public Date getDeadline()
    {
        return deadline;
    }

    public void setDeadline(Date deadline)
    {
        this.deadline = deadline;
    }

    public String getState()
    {
        return state;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    private int uscheid;
    private String tital;
    private Date addtime;
    private Date deadline;
    private String state;
}
