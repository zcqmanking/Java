/**
 * 使用数据库连接池实现对数据库的管理
 */
package com.weshare.jdbc.dbconn;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

/**
 * <p>Title: 数据库池连接</p>
 *
 * <p>Description: 数据库访问时调用该层获取数据库连接</p>
 *
 * <p>Copyright: Copyright (c) 2011</p>
 *
 * <p>Company: WeShare</p>
 *
 * @author Zhaocq
 * 
 * @version 1.0
 */

public class DBPoolManager {
	private Context ctx = null;
	private Connection conn = null;
	private Statement stmt = null;
	private ResultSet rs = null;
	
	public DBPoolManager(){
		getConn();
		getStatement();		
	}
	
	/**
	 * 获取连接
	 */
    private void getConn(){
    	try{
    		ctx = new InitialContext();
    		if (ctx == null){
    		    throw new Exception("没有匹配的环境");
    		}
    		DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/weshareDB");
    		if (ds == null){
    			throw new Exception("没有匹配数据库");
    		}
    		conn = ds.getConnection();
    	}
    	catch(Exception e){
    		System.out.println("无法获取数据库连接:"+e.toString());
    	}
    }
    
    /**
     * 创建Statement
     */
    private void getStatement(){
    	try{
    		stmt = conn.createStatement();
    	}
    	catch(Exception e){
    		System.out.println("无法创建Statement");
    	}
    }
    /**
     * 关闭连接
     */
    public void close(){
    	try{
    		if(conn!=null){
    			conn.close();
    		}
    		if(ctx!=null){
    			ctx.close();
    		}
    		if(!conn.isClosed()){
    			System.out.println("dbconn连接没关闭.....");
    		}
    	}
    	catch(Exception e){
    		System.out.println("关闭连接或Context异常："+e.toString());
    	}
    }
    
    /**
     * 查询数据库
     * @param sql 查询语句
     * @return 查询结果
     */
    public ResultSet doQuery(String sql){
    	try {
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			System.out.println("查询异常："+e.toString());
		}
    	return rs;
    }
    
    /**
     * 插入数据
     * @param sql 插入语句
     * @return 插入条数
     */
    public int doInsert(String sql){
    	return doUpdate(sql);
    }
    
    /**
     * 删除数据
     * @param sql 删除语句
     * @return 删除条数
     */
    public int doDelete(String sql){
    	return doUpdate(sql);
    }
    
    /**
     * 更新数据
     * @param sql 更新语句
     * @return 更新条数
     */
    public int doUpdate(String sql){
    	int count = 0;
    	try {
			count = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println("更新异常："+e.toString());
		}
    	return count;
    }
}
