package com.desk.learning.model;

public class TicketModel {
	
	private String primaryId;
	private Integer id;
	private String name;
	private String priority;
	private String medium;
	private String email;
	private String phone;
	
	public TicketModel(Integer id, String name, String priority, String medium, String email, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.priority = priority;
		this.medium = medium;
		this.email = email;
		this.phone = phone;
	}

	public TicketModel(String primaryId, Integer id, String name, String priority, String medium, String email,
			String phone) {
		super();
		this.primaryId = primaryId;
		this.id = id;
		this.name = name;
		this.priority = priority;
		this.medium = medium;
		this.email = email;
		this.phone = phone;
	}

	public TicketModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getMedium() {
		return medium;
	}

	public void setMedium(String medium) {
		this.medium = medium;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPrimaryId() {
		return primaryId;
	}

	public void setPrimaryId(String primaryId) {
		this.primaryId = primaryId;
	}
	
}
