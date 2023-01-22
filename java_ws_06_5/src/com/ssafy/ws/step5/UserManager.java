package com.ssafy.ws.step5;

public class UserManager {
	final int MAX_USER_SIZE = 100;
	private User loginUser = null;
	private User[] users = new User[MAX_USER_SIZE];
	private int userSize = 0;
	
	
	public void signup(User user) {
		if (userSize < MAX_USER_SIZE) {
			users[userSize++] = user;
		}else System.out.println("최대 회원 수에 도달했습니다.");
	}
	
	public User login(String id, String password) {
		for (int i = 0; i < userSize; i++) {
			if (users[i].getUserId().equals(id)&& users[i].getPassword().equals(password)) {
				loginUser = users[i];
				return users[i];
			}
		}return null;
	}
	
	public void logout() {
		loginUser = null;
	}

	public User getLoginUser() {
		return loginUser;
	}
	
	public User getUser(int userSeq) {
		for (int i = 0; i < userSize; i++) {
			if (users[i].getUserSeq() == userSeq) return users[i];
		}return null;
	}
	
	
}
