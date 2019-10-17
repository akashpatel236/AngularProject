package com.event.build.model;

public class Answer {
	
	
	private int votes;
	
	private String date;
	
	private String answerBy;
	
	private String answer;
	
	

	public Answer() {
		super();
	}


	public Answer(int votes, String date, String answerBy, String answer) {
		super();
		this.votes = votes;
		this.date = date;
		this.answerBy = answerBy;
		this.answer = answer;
	}
	

	public int getVotes() {
		return votes;
	}

	public void setVotes(int votes) {
		this.votes = votes;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getAnswerBy() {
		return answerBy;
	}

	public void setAnswerBy(String answerBy) {
		this.answerBy = answerBy;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	

}
