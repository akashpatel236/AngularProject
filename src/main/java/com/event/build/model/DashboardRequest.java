package com.event.build.model;

import java.util.ArrayList;


public class DashboardRequest {

	
	private String id;
	
	private String question;
	
	private String userName;
	
	private ArrayList<Answer> answerList=new ArrayList<Answer>();
	
	private String date;
	
	private String[] tags;

	
	
	public DashboardRequest() {
		super();
	}

	public DashboardRequest(String id,String question, String userName, ArrayList<Answer> answerList, String date,
			String[] tags) {
		super();
		this.id=id;
		this.question = question;
		this.userName = userName;
		this.answerList = answerList;
		this.date = date;
		this.tags = tags;
	}

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public ArrayList<Answer> getAnswerList() {
		return answerList;
	}

	public void setAnswerList(ArrayList<Answer> answerList) {
		this.answerList = answerList;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String[] getTags() {
		return tags;
	}

	public void setTags(String[] tags) {
		this.tags = tags;
	}
	
	
	
	
}
