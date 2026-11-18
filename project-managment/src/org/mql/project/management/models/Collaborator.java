package org.mql.project.management.models;

public class Collaborator {

	private int id;
	private String fullName;
	private int yearsOfExperience;
	private String role; // ba, dev, qa
	
	public Collaborator(int id, String fullName, int yearsOfExperience, String role) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.yearsOfExperience = yearsOfExperience;
		this.role = role;
	}
	
	
	public String getFullName() {
		return fullName;
	}
	
	public int getId() {
		return id;
	}
	
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	
	public String getRole() {
		return role;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	
}
