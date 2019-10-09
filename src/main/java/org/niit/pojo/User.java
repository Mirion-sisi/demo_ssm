package org.niit.pojo;

public class User {

	private int id;
	private String username;
	private String pw;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", pw=" + pw + "]";
	}
	
}
