package com.weshare.beans;

public class ShareLogComment {
	private int slcId;
	private ShareLog sl;
	private Users user;
	private String comment;
	private String updateTime;

	public int getSlcId() {
		return slcId;
	}

	public void setSlcId(int slcId) {
		this.slcId = slcId;
	}

	public ShareLog getSl() {
		return sl;
	}

	public void setSl(ShareLog sl) {
		this.sl = sl;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
}
