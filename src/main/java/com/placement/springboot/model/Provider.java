package com.placement.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "provider")
public class Provider {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "Provider_Name")
	private String providerName;
	@Column(name = "Provider_Email")
	private String providerEmail;
	@Column(name = "Provider_Number")
	private String providerNumber;
	@Column(name = "Vacancy")
	private String vacancy;
	@Column(name = "Dead_Line")
	private long deadLine;
	
	public Provider() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Provider(long id, String providerName, String providerEmail, String providerNumber, String vacancy,
			long deadLine) {
		super();
		this.id = id;
		this.providerName = providerName;
		this.providerEmail = providerEmail;
		this.providerNumber = providerNumber;
		this.vacancy = vacancy;
		this.deadLine = deadLine;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public String getProviderEmail() {
		return providerEmail;
	}

	public void setProviderEmail(String providerEmail) {
		this.providerEmail = providerEmail;
	}

	public String getProviderNumber() {
		return providerNumber;
	}

	public void setProviderNumber(String providerNumber) {
		this.providerNumber = providerNumber;
	}

	public String getVacancy() {
		return vacancy;
	}

	public void setVacancy(String vacancy) {
		this.vacancy = vacancy;
	}

	public long getDeadLine() {
		return deadLine;
	}

	public void setDeadLine(long deadLine) {
		this.deadLine = deadLine;
	}

	@Override
	public String toString() {
		return "Provider [id=" + id + ", providerName=" + providerName + ", providerEmail=" + providerEmail
				+ ", providerNumber=" + providerNumber + ", vacancy=" + vacancy + ", deadLine=" + deadLine + "]";
	}


}
