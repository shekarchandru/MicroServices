package com.cts.model;

public class User {

	String userId;
	String userName;
	String userMail;
	
	
	public User() {
		super();
	}


	public User(String userId, String userName, String userMail) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userMail = userMail;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getUserMail() {
		return userMail;
	}


	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}
	
	
}
