package com.placement.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "seeker")
public class Seeker {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "User_Name")
	private String userName;
	@Column(name = "Email_Id")
	private String emailId;
	@Column(name = "Phone_No")
	private long phoneNo;
	@Column(name = "Qualification")
	private String qualification;
	@Column(name = "Skills")
	private String skill;
	
	public Seeker() {
		// TODO Auto-generated constructor stub
	}

	public Seeker(long id, String userName, String emailId, long phoneNo, String qualification, String skill) {
		super();
		this.id = id;
		this.userName = userName;
		this.emailId = emailId;
		this.phoneNo = phoneNo;
		this.qualification = qualification;
		this.skill = skill;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	@Override
	public String toString() {
		return "Seeker [id=" + id + ", userName=" + userName + ", emailId=" + emailId + ", phoneNo=" + phoneNo
				+ ", qualification=" + qualification + ", skill=" + skill + "]";
	}
	
	


}
