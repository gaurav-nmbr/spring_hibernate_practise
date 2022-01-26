package com.springcore.map;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Question {
	
	@Id
	@Column(name = "question_id") 
	private int questionId;
	private String question;
	
//	@OneToOne
//	@JoinColumn(name="answer_id")
//	private Answer ans;
	@OneToMany(mappedBy = "ques")
	private List<Answer> ans;
	
	
	
	
	public void setAns(List<Answer> ans) {
		this.ans = ans;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
//	public Answer getAns() {
//		return ans;
//	}
//	public void setAns(Answer ans) {
//		this.ans = ans;
//	}
	public Question(int questionId, String question, Answer ans) {
		super();
		this.questionId = questionId;
		this.question = question;
//		this.ans = ans;
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List<Answer> getAns() {
		return ans;
	}
	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", question=" + question + ", ans=" + ans + "]";
	}
	

}
