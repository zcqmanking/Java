package com.weshare.beans;

public class Share {
	private int id;
	private Users users;
	private ShareType shareType;
	private String startDate;
	private String endDate;
	private String location;
	private String title;
	private String detail;
	private String updateTime;
	private String longitude;
	private String latitude;
	private int joinCount;
	private int viewCount;
	private int forwardCount;
	private int commentCount;
	private String submitFrom;
	private String addTime;
	private School school;
	private int status;
	private int joinStatus;
	private int viewStatus;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public ShareType getShareType() {
		return shareType;
	}

	public void setShareType(ShareType shareType) {
		this.shareType = shareType;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public int getJoinCount() {
		return joinCount;
	}

	public void setJoinCount(int joinCount) {
		this.joinCount = joinCount;
	}

	public int getViewCount() {
		return viewCount;
	}

	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}

	public int getForwardCount() {
		return forwardCount;
	}

	public void setForwardCount(int forwardCount) {
		this.forwardCount = forwardCount;
	}

	public int getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}

	public String getSubmitFrom() {
		return submitFrom;
	}

	public void setSubmitFrom(String submitFrom) {
		this.submitFrom = submitFrom;
	}

	public String getAddTime() {
		return addTime;
	}

	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	/**
	 * 当前用户相对于活动的参加状态<br />
	 * 0:没有参加<br />
	 * 1:已经参加<br />
	 * 2:无法参加（当前用户即是发表用户）<br />
	 * 3:没有参加但活动已过期无法再参加<br />
	 * 4:已经参加但活动已过期无法再取消<br />
	 */
	public int getJoinStatus() {
		return joinStatus;
	}

	/**
	 * 当前用户相对于活动的参加状态<br />
	 * 0:没有参加<br />
	 * 1:已经参加<br />
	 * 2:无法参加（当前用户即是发表用户）<br />
	 * 3:没有参加但活动已过期无法再参加<br />
	 * 4:已经参加但活动已过期无法再取消<br />
	 */
	public void setJoinStatus(int joinStatus) {
		this.joinStatus = joinStatus;
	}

	/**
	 * 当前用户相对于活动的围观状态<br />
	 * 0:没有围观<br />
	 * 1:已经围观<br />
	 * 2:无法围观（当前用户即是发表用户）
	 */
	public int getViewStatus() {
		return viewStatus;
	}

	/**
	 * 当前用户相对于活动的围观状态<br />
	 * 0:没有围观<br />
	 * 1:已经围观<br />
	 * 2:无法围观（当前用户即是发表用户）
	 */
	public void setViewStatus(int viewStatus) {
		this.viewStatus = viewStatus;
	}

}
