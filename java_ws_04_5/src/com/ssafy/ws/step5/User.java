package com.ssafy.ws.step5;

import java.util.Arrays;

public class User {
	int userSeq;
	String userId;
	String password;
	String userName;
	String nickName;
	String email;
	
	public User(int userSeq, String userId, String password, String userName, String nickName, String email) {
		super();
		this.userSeq = userSeq;
		this.userId = userId;
		this.password = password;
		this.userName = userName;
		this.nickName = nickName;
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [userSeq=" + userSeq + ", userId=" + userId + ", password=" + password + ", userName=" + userName
				+ ", nickName=" + nickName + ", email=" + email + "]";
	}
}
