/**
 * 使用数据库JDBC驱动实现对数据库的管理
 */
package com.weshare.jdbc.dbconn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * <p>Title: 数据库连接</p>
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

public class DBManager {
	private String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver"; //加载JDBC驱动 
	private String dbURL = "jdbc:sqlserver://localhost:1433;DatabaseName=weshare"; //连接服务器和数据库 
	private String userName = "sa"; //默认用户名 
	private String userPwd = "123456"; //密码 
	private Connection conn = null;
	private Statement stmt = null;
	private ResultSet rs = null;
	
	public DBManager(){
		getConn();
		getStatement();		
	}
	
	/**
	 * 获取连接
	 */
    private void getConn(){
    	try{
            Class.forName(driverName); 
            conn = DriverManager.getConnection(dbURL, userName, userPwd); 
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
