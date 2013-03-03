package com.weshare.beans;

public class SharePhotoComment {
	private int spcId;
	private SharePhoto sp;
	private Users user;
	private String comment;
	private String updateTime;

	public int getSpcId() {
		return spcId;
	}

	public void setSpcId(int spcId) {
		this.spcId = spcId;
	}

	public SharePhoto getSp() {
		return sp;
	}

	public void setSp(SharePhoto sp) {
		this.sp = sp;
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
