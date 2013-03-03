package com.weshare.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public final class Tools {
	
	/**
	 * ���������ڵ�ʱ���Ϊ���ݣ�����ʽ��������
	 * @param startDate ��Ҫ���õ�ʱ��
	 * @param endDate ��ǰʱ��
	 * @return ������ɵ�����
	 */
	public static final String getDate(String startDate, String endDate){
		String rtnDate = "";
	    Date s,e;
	    long diff = 0;
	    SimpleDateFormat secF=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    SimpleDateFormat hourF=new SimpleDateFormat("HH:mm");
	    SimpleDateFormat monthF=new SimpleDateFormat("MM-dd HH:mm");
	    SimpleDateFormat yearF=new SimpleDateFormat("yyyy-MM-dd HH:mm");
	    
	    try {
		    s = secF.parse(startDate);
		    e =secF.parse(endDate);
		    Calendar cs=Calendar.getInstance();
		    cs.setTime(s);
		    Calendar ce=Calendar.getInstance();
		    ce.setTime(e);

			diff = ce.get(Calendar.YEAR) - cs.get(Calendar.YEAR);		
			if(diff < 1){													//ͬһ��
				diff = ce.get(Calendar.DATE) - cs.get(Calendar.DATE);
				if(diff < 1){												//ͬһ�죬����HH:mm
					rtnDate = hourF.format(s);		    	
				}else{														//���죬����MM-dd HH:mm
				    rtnDate = monthF.format(s);
				}				
			}else{															//���꣬����yyyy-MM-dd HH:mm
				rtnDate = yearF.format(s);
			}
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
	    return rtnDate;
	}
	
	/**
	 * ͨ�÷�ҳ����
	 * @param condition ��ѯ��������ʼ��ѯȫ�����ݵ�sql���ȥ��select�ؼ��ֺ����order by��������Ĳ��֡�
	 * @param order ������򡣸�ʽ��"order by id asc"��
	 * @param pageSize �û��Զ���ĵ�ҳ��ʾ���������������Ϊ0����ʹ��ϵͳ�������ݡ�
	 * @return �����ĵ�ǰҳ��Ĳ�ѯsql��䡣
	 */
	public static final String getPageSql(String condition,String order,int pageSize){
		String sql = "";
		order = order.trim();
		condition = condition.trim();
		
		//row_numer()���������������ݲ��ϱ仯�ĳ��ϣ������ڴ�
//		sql += "select * from (select top ";
//		sql += ((Integer)(currentPage * Config.PAGESIZE)).toString();
//		sql += " row_number()over(";
//		sql += order;
//		sql += ")tempRn,";
//		sql += condition;
//		sql += ")t where tempRn > ";
//		sql += ((Integer)((currentPage-1) * Config.PAGESIZE)).toString();

		return sql;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
