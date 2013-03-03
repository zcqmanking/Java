package com.jhe.struts.bean;

public class PaiJian {
	private int id;
	private String danhao;
	private Employee e;
	private String updateTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDanhao() {
		return danhao;
	}

	public void setDanhao(String danhao) {
		this.danhao = danhao;
	}

	public Employee getE() {
		return e;
	}

	public void setE(Employee e) {
		this.e = e;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

}
