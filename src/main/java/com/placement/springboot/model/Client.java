package com.placement.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "client")
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "Client_Name")
	private String clientName;
	@Column(name = "Client_Email")
	private String clientEmail;
	@Column(name = "Client_Number")
	private String clientNumber;
	@Column(name = "RequiredQualification")
	private String requiredQualification;
	@Column(name = "Required_Skills")
	private String requiredSkills;
	
	public Client() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientEmail() {
		return clientEmail;
	}

	public void setClientEmail(String clientEmail) {
		this.clientEmail = clientEmail;
	}

	public String getClientNumber() {
		return clientNumber;
	}

	public void setClientNumber(String clientNumber) {
		this.clientNumber = clientNumber;
	}

	public String getRequiredQualification() {
		return requiredQualification;
	}

	public void setRequiredQualification(String requiredQulification) {
		this.requiredQualification = requiredQulification;
	}

	public String getRequiredSkills() {
		return requiredSkills;
	}

	public void setRequiredSkills(String requiredSkills) {
		this.requiredSkills = requiredSkills;
	}

	public Client(long id, String clientName, String clientEmail, String clientNumber, String requiredQualification,
			String requiredSkills) {
		super();
		this.id = id;
		this.clientName = clientName;
		this.clientEmail = clientEmail;
		this.clientNumber = clientNumber;
		this.requiredQualification = requiredQualification;
		this.requiredSkills = requiredSkills;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", clientName=" + clientName + ", clientEmail=" + clientEmail + ", clientNumber="
				+ clientNumber + ", requiredQualification=" + requiredQualification + ", requiredSkills=" + requiredSkills
				+ "]";
	}
	
	


}
