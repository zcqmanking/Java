package com.weshare.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public final class Tools {
	
	/**
	 * 以两个日期的时间差为依据，按格式返回日期
	 * @param startDate 需要设置的时间
	 * @param endDate 当前时间
	 * @return 设置完成的日期
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
		    e = secF.parse(endDate);
		    Calendar cs = Calendar.getInstance();
		    cs.setTime(s);
		    Calendar ce = Calendar.getInstance();
		    ce.setTime(e);

			diff = ce.get(Calendar.YEAR) - cs.get(Calendar.YEAR);		
			if(diff < 1){													//同一年
				diff = ce.get(Calendar.MONTH) - cs.get(Calendar.MONTH);
				if(diff < 1){												//同一月
					diff = ce.get(Calendar.DATE) - cs.get(Calendar.DATE);
					if(diff < 1){											//同一天，返回HH:mm
						rtnDate = hourF.format(s);		    	
					}else{													//跨天，返回MM-dd HH:mm
					    rtnDate = monthF.format(s);
					}									
				}else{														//不同月，返回MM-dd HH:mm
					rtnDate = monthF.format(s);
				}
			}else{															//跨年，返回yyyy-MM-dd HH:mm
				rtnDate = yearF.format(s);
			}
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
	    return rtnDate;
	}
	
	/**
	 * 通用分页方案
	 * @param condition 查询条件。初始查询全部数据的sql语句去掉select关键字和最后order by排序语句后的部分。
	 * @param currentPage 当前页。就是要查询的页数。
	 * @param order 排序规则。格式："order by id asc"，不能为空。
	 * @param pageSize 用户自定义的单页显示条数。如果该数据为0，则使用系统内置数据。
	 * @return 完整的当前页面的查询sql语句。
	 */
	public static final String getPageSql(String condition,int currentPage,String order,int pageSize){
		String sql = "";
		order = order.trim();
		condition = condition.trim();
		
		//row_numer()方案，不适用数据不断变化的场合，备份在此
		sql += "select * from (select top ";
		sql += ((Integer)(currentPage * pageSize)).toString();
		sql += " row_number()over(";
		sql += order;
		sql += ")tempRn,";
		sql += condition;
		sql += ")t where tempRn > ";
		sql += ((Integer)((currentPage-1) * pageSize)).toString();

		return sql;
	}
	
	/**
	 * 比较两个日期大小，日期格式：yyyy-MM-dd HH:mm:ss<br />
	 * 如果日期date大于当前日期now，则返回true，否则返回false
	 * @param date 要比较的日期
	 * @param now 当前日期
	 * @return 如果当前日期now大于日期date，则返回true，否则返回false
	 */
	public static final boolean outOfDate(String date, String now){
		boolean ret = false;
	    Date s,e;
	    SimpleDateFormat secF=new SimpleDateFormat("yyyy-MM-dd");
	    
	    try {
		    s = secF.parse(date);
		    e = secF.parse(now);
		    Calendar cs = Calendar.getInstance();
		    cs.setTime(s);
		    Calendar ce = Calendar.getInstance();
		    ce.setTime(e);
		    
		    ret = ce.after(cs);
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		
		return ret;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
