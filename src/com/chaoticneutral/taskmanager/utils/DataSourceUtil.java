// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DataSourceUtil.java

package com.chaoticneutral.taskmanager.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;

public class DataSourceUtil
{

    public DataSourceUtil()
    {
    }

    public static DataSource getDataSource()
    {
        return ds;
    }

    public static Connection getConnection()
        throws SQLException
    {
        return ds.getConnection();
    }

    private static DataSource ds = new ComboPooledDataSource();

}
