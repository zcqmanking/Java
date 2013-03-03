package com.weshare.beans;

public class Share {
	private int id;
	private Users users;
	private ShareType shareType;
	private String startDate;
	private String endDate;
	private String location;
	private String detail;
	private String updateTime;
	private double longitude;
	private double latitude;
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

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	/**
	 * ��ǰ�û�����ڻ�Ĳμ�״̬<br />
	 * 0:û�вμ�<br />
	 * 1:�Ѿ��μ�<br />
	 * 2:�޷��μӣ���ǰ�û����Ƿ����û���
	 */
	public int getJoinStatus() {
		return joinStatus;
	}

	/**
	 * ��ǰ�û�����ڻ�Ĳμ�״̬<br />
	 * 0:û�вμ�<br />
	 * 1:�Ѿ��μ�<br />
	 * 2:�޷��μӣ���ǰ�û����Ƿ����û���
	 */
	public void setJoinStatus(int joinStatus) {
		this.joinStatus = joinStatus;
	}

	/**
	 * ��ǰ�û�����ڻ��Χ��״̬<br />
	 * 0:û��Χ��<br />
	 * 1:�Ѿ�Χ��<br />
	 * 2:�޷�Χ�ۣ���ǰ�û����Ƿ����û���
	 */
	public int getViewStatus() {
		return viewStatus;
	}

	/**
	 * ��ǰ�û�����ڻ��Χ��״̬<br />
	 * 0:û��Χ��<br />
	 * 1:�Ѿ�Χ��<br />
	 * 2:�޷�Χ�ۣ���ǰ�û����Ƿ����û���
	 */
	public void setViewStatus(int viewStatus) {
		this.viewStatus = viewStatus;
	}
	
}
