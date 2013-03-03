package com.weshare.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import com.weshare.beans.School;
import com.weshare.beans.Share;
import com.weshare.beans.ShareType;
import com.weshare.beans.Users;
import com.weshare.jdbc.dbconn.DBManager;

public final class Common {
	
	/**
	 * 获取活动信息
	 * 
	 * @param request 请求实例
	 * @param userId
	 *            指定用户ID
	 * @param type
	 *            获取活动的类别。<br />
	 *            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;0：我的地盘的活动；<br />
	 *            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;1：所有地盘的活动；<br />
	 *            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2：我的晒友的活动；<br />
	 *            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;3：我参与的活动；<br />
	 *            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;4：我围观的活动。<br />
	 * @param startID 从该ID开始获取下一个分页的数据。
	 * @param pageSize 单页条数
	 * @return 获取活动信息的结果。true：正确读取；false：读取失败。
	 */
	public static boolean getShareList(HttpServletRequest request, int userId, int type, int startID, int pageSize) {
		boolean bRet = true;
		List<Share> shareList = new ArrayList<Share>();
		int ps = (pageSize != 0) ? pageSize : Config.PAGESIZE;
		String sql = "";
		
		sql += "select top ";
		sql += ps;
		sql += " School.SchoolID,School.SchoolName,Users.UserID,Users.UserName,Users.Photo,"
				+ "Share.ShareID,Share.StartDate,Share.EndDate,Share.Location,"
				+ "Share.Detail,Share.Longitude,Share.Latitude,Share.JoinCount,"
				+ "Share.ViewCount,Share.ForwardCount,Share.CommentCount,"
				+ "Share.SubmitFrom,Share.AddTime,Share.Status,ShareType.STID,ShareType.TypeName "
				+ "from School right join Users on (School.SchoolID = Users.SchoolID) "
				+ "right join Share on(Users.UserID = Share.UserID) "
				+ "left join ShareType on (Share.TypeID = ShareType.STID) ";
		ResultSet rsShareList;
		DBManager dbMgr = new DBManager();
		ResultSet rsChk;
		DBManager dbChk = new DBManager();
		String sqlChk = "";
		switch (type) {
		case 0:
			sql += "where (Share.SchoolID = (select SchoolID from Users where UserID = "
					+ userId + ") or Share.SchoolID = 1)";
			break;
		case 1:
			break;
		case 2:
			sql += "where Users.UserID in "
					+ "(select Friends.UserID from Friends where UserID = "
					+ userId
					+ " union select Friends.FriendID from Friends where FrinedID = "
					+ userId + ")";
			break;
		case 3:
			sql += "where ShareID in (select Join.ShareID from Join where Join.UserID = "
					+ userId + ")";
			break;
		case 4:
			sql += "where ShareID in (select View.ShareID from View where View.UserID = "
					+ userId + ")";
			break;
		default:
			bRet = false;
			break;
		}

		if (bRet) {
			try {
				if(startID > 1){
					sql += " and ShareID < ";
					sql += startID;
				}
				sql +=" order by Share.AddTime desc";
//				String orderBy = "order by Share.AddTime desc";
//				sql = Tools.getPageSql(sql, orderBy, pageSize);
				rsShareList = dbMgr.doQuery(sql);
				Timestamp timeTmp;
				SimpleDateFormat dateFormat = new SimpleDateFormat(
						"yyyy-MM-dd", new Locale("zh", "cn"));
				SimpleDateFormat fullDateFormat = new SimpleDateFormat(
						"yyyy-MM-dd HH:mm:ss", new Locale("zh", "cn"));
				String nowTime;
				Timestamp now = new Timestamp(System.currentTimeMillis());
				nowTime = fullDateFormat.format(now);
				int firstID = 0, lastID = 0;
				int i = 1;
				while (rsShareList.next()) {
					Share s = new Share();
					Users user = new Users();
					School school = new School();
					school.setId(rsShareList.getInt("SchoolID"));
					school.setSchoolName(rsShareList.getString("SchoolName"));
					user.setSchool(school);
					user.setUserId(rsShareList.getInt("UserID"));
					user.setUserName(rsShareList.getString("UserName"));
					user.setPhoto(rsShareList.getString("Photo"));
					s.setUsers(user);
					s.setId(rsShareList.getInt("ShareID"));
					
					if(i == 1){
						firstID = s.getId();
					}
					lastID = s.getId();

					timeTmp = rsShareList.getTimestamp("StartDate");
					String startDate = dateFormat.format(timeTmp);
					s.setStartDate(startDate);

					timeTmp = rsShareList.getTimestamp("EndDate");
					String endDate = dateFormat.format(timeTmp);
					s.setEndDate(endDate);

					s.setLocation(rsShareList.getString("Location"));
					s.setDetail(rsShareList.getString("Detail"));
					s.setLongitude(rsShareList.getDouble("Longitude"));
					s.setLatitude(rsShareList.getDouble("Latitude"));
					s.setJoinCount(rsShareList.getInt("JoinCount"));
					s.setViewCount(rsShareList.getInt("ViewCount"));
					s.setForwardCount(rsShareList.getInt("ForwardCount"));
					s.setCommentCount(rsShareList.getInt("CommentCount"));
					s.setSubmitFrom(rsShareList.getString("SubmitFrom"));

					String addTime;
					timeTmp = rsShareList.getTimestamp("AddTime");
					addTime = fullDateFormat.format(timeTmp);
					addTime = Tools.getDate(addTime, nowTime);
					s.setAddTime(addTime);

					s.setStatus(rsShareList.getInt("Status"));

					ShareType st = new ShareType();
					st.setId(rsShareList.getInt("STID"));
					st.setTypeName(rsShareList.getString("TypeName"));
					s.setShareType(st);
					
					if(user.getUserId() == userId){
						s.setJoinStatus(2);			//不可参与
						s.setViewStatus(2);			//不可围观
					}else{							//当前用户不是活动的发表用户
						sqlChk = "select JoinID from [Join] where ShareID=";
						sqlChk += s.getId();
						sqlChk += " and UserID=";
						sqlChk += userId;
						rsChk = dbChk.doQuery(sqlChk);
						if(rsChk.next()){			//已经参与
							s.setJoinStatus(1);
							s.setViewStatus(2);		//不可围观
						}else{						//没有参与
							s.setJoinStatus(0);
							sqlChk = "select ViewID from [View] where ShareID=";
							sqlChk += s.getId();
							sqlChk += " and UserID=";
							sqlChk += userId;
							rsChk = dbChk.doQuery(sqlChk);
							if(rsChk.next()){		//已经围观
								s.setViewStatus(1);
							}else{					//没有围观
								s.setViewStatus(0);
							}
						}
						rsChk.close();
					}
					shareList.add(s);
					i++;
				}
				if (!shareList.isEmpty()) {
					request.setAttribute("shareList", shareList);
					request.setAttribute("firstShareId", firstID);
					request.setAttribute("lastShareId", lastID);
					int noMore = 0;			//没有更多新鲜事flag,0:还有新鲜事; 1:没有更多新鲜事
					if(shareList.size() < ps){
						noMore = 1;
					}
					request.setAttribute("noMore", noMore);
				}
				rsShareList.close();
				rsShareList = null;
				rsChk = null;
			} catch (SQLException e) {
				bRet = false;
			}
		}
		return bRet;
	}
}
