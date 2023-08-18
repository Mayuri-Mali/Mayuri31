package com.digit.model;

public class DataSource {

	private String driver;
	private String url;
	private String uname;
	private String pwd;
	public DataSource(String driver, String url, String uname, String pwd) {
		super();
		this.driver = driver;
		this.url = url;
		this.uname = uname;
		this.pwd = pwd;
	}
	public DataSource() {
		super();
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "MyDataSource [driver=" + driver + ", url=" + url + ", uname=" + uname + ", pwd=" + pwd + "]";
	}
	
}
