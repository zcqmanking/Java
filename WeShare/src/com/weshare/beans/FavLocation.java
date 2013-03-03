package com.weshare.beans;

public class FavLocation {
	private int flId;
	private String favLocation;
	private int userId;
	private String longitude;
	private String latitude;
	private String updateTime;
	private int status;

	public int getFlId() {
		return flId;
	}

	public void setFlId(int flId) {
		this.flId = flId;
	}

	public String getFavLocation() {
		return favLocation;
	}

	public void setFavLocation(String favLocation) {
		this.favLocation = favLocation;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
