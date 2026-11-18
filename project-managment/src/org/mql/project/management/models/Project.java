package org.mql.project.management.models;

import java.util.List;
import java.util.Vector;

public class Project {
	private int id;
	private String title;
	private String description;
	private List<Collaborator> collaborators;

	public Project(){
		this.collaborators = new Vector<>();
	}

	public Project(int id, String title, String description) {
		this();
		this.id = id;
		this.title = title;
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Collaborator> getCollaborators() {
		return collaborators;
	}
	public void setCollaborators(List<Collaborator> collaborators) {
		this.collaborators = collaborators;
	}

	public void addCollaborator(Collaborator c){
		this.collaborators.add(c);
	}


}

