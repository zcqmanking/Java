/**
 * ʹ�����ݿ�JDBC����ʵ�ֶ����ݿ�Ĺ���
 */
package com.bwspider.jdbc.dbconn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * <p>Title: ���ݿ�����</p>
 *
 * <p>Description: ���ݿ����ʱ���øò��ȡ���ݿ�����</p>
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
	private String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver"; //����JDBC���� 
	private String dbURL = "jdbc:sqlserver://localhost:1433;DatabaseName=jdBook"; //���ӷ����������ݿ� 
	private String userName = "sa"; //Ĭ���û��� 
	private String userPwd = "123456"; //���� 
	private Connection conn = null;
	private Statement stmt = null;
	private ResultSet rs = null;
	
	public DBManager(){
		getConn();
		getStatement();		
	}
	
	/**
	 * ��ȡ����
	 */
    private void getConn(){
    	try{
            Class.forName(driverName); 
            conn = DriverManager.getConnection(dbURL, userName, userPwd); 
    	}
    	catch(Exception e){
    		System.out.println("�޷���ȡ���ݿ�����:"+e.toString());
    	}
    }
    
    /**
     * ����Statement
     */
    private void getStatement(){
    	try{
    		stmt = conn.createStatement();
    	}
    	catch(Exception e){
    		System.out.println("�޷�����Statement");
    	}
    }
    /**
     * �ر�����
     */
    public void close(){
    	try{
    		if(conn!=null){
    			conn.close();
    		}
    		if(!conn.isClosed()){
    			System.out.println("dbconn����û�ر�.....");
    		}
    	}
    	catch(Exception e){
    		System.out.println("�ر����ӻ�Context�쳣��"+e.toString());
    	}
    }
    
    /**
     * ��ѯ���ݿ�
     * @param sql ��ѯ���
     * @return ��ѯ���
     */
    public ResultSet doQuery(String sql){
    	try {
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			System.out.println("��ѯ�쳣��"+e.toString());
		}
    	return rs;
    }
    
    /**
     * ��������
     * @param sql �������
     * @return ��������
     */
    public int doInsert(String sql){
    	return doUpdate(sql);
    }
    
    /**
     * ɾ������
     * @param sql ɾ�����
     * @return ɾ������
     */
    public int doDelete(String sql){
    	return doUpdate(sql);
    }
    
    /**
     * ��������
     * @param sql �������
     * @return ��������
     */
    public int doUpdate(String sql){
    	int count = 0;
    	try {
			count = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println("�����쳣��"+e.toString());
		}
    	return count;
    }
}
