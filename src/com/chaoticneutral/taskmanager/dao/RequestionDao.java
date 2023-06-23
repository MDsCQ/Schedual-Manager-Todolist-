// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   RequestionDao.java

package com.chaoticneutral.taskmanager.dao;

import com.chaoticneutral.taskmanager.model.Requestion;
import com.chaoticneutral.taskmanager.utils.DataSourceUtil;
import java.sql.SQLException;
import java.util.List;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

public class RequestionDao
{

    public RequestionDao()
    {
    }

    public void addRequestion(Requestion requestion)
        throws SQLException
    {
        QueryRunner r = new QueryRunner(DataSourceUtil.getDataSource());
        String sql = "insert into s_request(username,userpassword) values(?,?)";
        r.update(sql, new Object[] {
            requestion.getUsername(), requestion.getUserpassword()
        });
    }

    public List selectAllRequestion()
        throws SQLException
    {
        QueryRunner r = new QueryRunner(DataSourceUtil.getDataSource());
        String sql = "select * from s_request";
        return (List)r.query(sql, new BeanListHandler(com/chaoticneutral/taskmanager/model/Requestion));
    }

    public Requestion selectRequestion(int uid)
        throws SQLException
    {
        QueryRunner r = new QueryRunner(DataSourceUtil.getDataSource());
        String sql = "select * from s_request where uid=?";
        return (Requestion)r.query(sql, new BeanHandler(com/chaoticneutral/taskmanager/model/Requestion), new Object[] {
            Integer.valueOf(uid)
        });
    }

    public void deleteRequestion(int uid)
        throws SQLException
    {
        QueryRunner r = new QueryRunner(DataSourceUtil.getDataSource());
        String sql = "delete from s_request where uid = ?";
        r.update(sql, Integer.valueOf(uid));
    }
}
