/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.weshare.struts.action;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.weshare.beans.Share;
import com.weshare.beans.ShareLog;
import com.weshare.beans.ShareLogComment;
import com.weshare.beans.Users;
import com.weshare.jdbc.dbconn.DBManager;
import com.weshare.struts.form.ShowLogForm;

/** 
 * MyEclipse Struts
 * Creation date: 10-07-2011
 * 
 * XDoclet definition:
 * @struts.action path="/showLog" name="showLogForm" input="/logPicList.do" scope="request" validate="true"
 * @struts.action-forward name="success" path="/logDetail.jsp"
 */
public class ShowLogAction extends Action {
	/*
	 * Generated Methods
	 */

	/** 
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		ShowLogForm showLogForm = (ShowLogForm) form;
		Timestamp timeTmp;
		SimpleDateFormat dateFormat = new SimpleDateFormat(
				"yyyy-MM-dd", new Locale("zh", "cn"));
		SimpleDateFormat fullDateFormat = new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss", new Locale("zh", "cn"));
		
		//读取日志所属人的个人信息，ID、头像、名字
		//日志所属活动的ID、开始时间、标题
		//日志的ID、标题、正文、发表时间
		//日志的评论，包括评论人ID、头像、评论内容、评论时间
		String sql = "";
		sql += "select logUser.Photo,logUser.UserName as logUserName,Share.UserID as shareUserID," +
				"Share.StartDate,Share.Title," +
				"ShareLog.SLID,ShareLog.ShareID,ShareLog.UserID as logUserID,ShareLog.Title as slTitle," +
				"ShareLog.[Content],ShareLog.CommentCount,ShareLog.UpdateTime," +
				"shareUser.UserName shareUserName ";
		sql += "from Share right join ShareLog on (Share.ShareID = ShareLog.ShareID) ";
		sql += "left join Users logUser on (ShareLog.UserID = logUser.UserID) ";
		sql += "left join Users shareUser on (Share.UserID = shareUser.UserID)";
		sql += "where ShareLog.SLID=";
		sql += showLogForm.getId();
		DBManager db = new DBManager();
		ResultSet rs = db.doQuery(sql);
		
		int owner = 0;	//登录用户是否是当前页面的用户
		ShareLog sl = new ShareLog();
		try {
			if(rs.next()){
				Share s = new Share();
				Users u = new Users();
				u.setPhoto(rs.getString("Photo"));
				u.setUserName(rs.getString("logUserName"));
				u.setUserId(rs.getInt("logUserID"));

				HttpSession session = request.getSession();
				int curId = (Integer)session.getAttribute("curUserId");
				if(curId == u.getUserId()){
					owner = 1;
				}
				
				sl.setUser(u);
				
				Users shareUser = new Users();
				shareUser.setUserName(rs.getString("shareUserName"));
				shareUser.setUserId(rs.getInt("shareUserID"));
				s.setUsers(shareUser);
				
				s.setTitle(rs.getString("Title"));
				s.setId(rs.getInt("ShareID"));
				
				timeTmp = rs.getTimestamp("StartDate");
				s.setStartDate(dateFormat.format(timeTmp));
				
				sl.setShare(s);
				
				sl.setSlId(rs.getInt("SLID"));
				sl.setTitle(rs.getString("slTitle"));
				sl.setContent(rs.getString("Content"));
				sl.setCommentCount(rs.getInt("CommentCount"));
				
				timeTmp = rs.getTimestamp("UpdateTime");
				sl.setUpdateTime(fullDateFormat.format(timeTmp));
			}
			if(sl.getCommentCount() > 0){
				sql = "select ShareLogComment.SLCID,ShareLogComment.ShareLogID," +
						"ShareLogComment.Comment,ShareLogComment.UpdateTime," +
						"Users.UserID,Users.Photo,Users.UserName ";
				sql += "from ShareLogComment left join Users " +
						"on(ShareLogComment.UserID=Users.UserID) ";
				sql += "where ShareLogComment.ShareLogID=";
				sql += sl.getSlId();
				sql += " order by ShareLogComment.UpdateTime asc";
				
				List<ShareLogComment> slcList = new ArrayList<ShareLogComment>();
				rs = db.doQuery(sql);
				while(rs.next()){
					ShareLogComment slc = new ShareLogComment();
					Users u =new Users();
					u.setUserId(rs.getInt("UserID"));
					u.setPhoto(rs.getString("Photo"));
					u.setUserName(rs.getString("UserName"));
					
					slc.setUser(u);
					
					slc.setSlcId(rs.getInt("SLCID"));
					slc.setComment(rs.getString("Comment"));
					
					ShareLog log = new ShareLog();
					log.setSlId(rs.getInt("ShareLogID"));
					
					slc.setSl(log);
					
					slc.setUpdateTime(fullDateFormat.format(rs.getTimestamp("UpdateTime")));
					
					slcList.add(slc);
				}
				request.setAttribute("commentList", slcList);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("log", sl);
		request.setAttribute("owner", owner);
		
		return mapping.findForward("success");
	}
}