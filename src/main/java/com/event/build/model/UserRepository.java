package com.event.build.model;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
	
	
	private static ArrayList<User> userList = new ArrayList<User>();
	private static int i=0;
	
	public static ArrayList<User> getUserList() {
		return userList;
	}


	public static void setUserList(ArrayList<User> userList) {
		UserRepository.userList = userList;
	}


	static{
		
		userList.add(new User(i++,"Akash", "akashpatel234@cm.com"));
		userList.add(new User(i++,"Akash2", "akashpatel234@cm.com"));
		userList.add(new User(i++,"Akash3", "akashpatel234@cm.com"));
	}


	public void add(User user) {
		
		userList.add(i++,user);
		
	}
	
	
}
