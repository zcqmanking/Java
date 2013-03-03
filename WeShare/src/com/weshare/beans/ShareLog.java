package com.weshare.beans;

public class ShareLog {
	private int slId;
	private Share share;
	private Users user;
	private String title;
	private String content;
	private int commentCount;
	private String updateTime;

	public ShareLog(){
		commentCount = 0;
	}
	public int getSlId() {
		return slId;
	}

	public void setSlId(int slId) {
		this.slId = slId;
	}

	public Share getShare() {
		return share;
	}

	public void setShare(Share share) {
		this.share = share;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

}
