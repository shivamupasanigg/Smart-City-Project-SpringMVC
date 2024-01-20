package com.jpa;

import com.AdminCustomValidator.UserComments;
import com.AdminCustomValidator.UserFullName;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="USER_FEEDBACKFORM")
public class UserfeedbackForm {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="full_name")
	@UserFullName
	private String feedbackfullname;
	@Column(name="comments")
	@UserComments
	private String feedbackcomments;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFeedbackfullname() {
		return feedbackfullname;
	}
	public void setFeedbackfullname(String feedbackfullname) {
		this.feedbackfullname = feedbackfullname;
	}
	public String getFeedbackcomments() {
		return feedbackcomments;
	}
	public void setFeedbackcomments(String feedbackcomments) {
		this.feedbackcomments = feedbackcomments;
	}
	
	@Override
	public String toString() {
		return "UserfeedbackForm [id=" + id + ", feedbackfullname=" + feedbackfullname + ", feedbackcomments="
				+ feedbackcomments + "]";
	}
	public UserfeedbackForm(int id, String feedbackfullname, String feedbackcomments) {
		super();
		this.id = id;
		this.feedbackfullname = feedbackfullname;
		this.feedbackcomments = feedbackcomments;
	}
	public UserfeedbackForm() {
		super();
	}
	
	
	
	

}
