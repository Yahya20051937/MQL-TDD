package org.mql.project.management.exceptions;

public class ProjectNotFoundException extends Exception {

	public ProjectNotFoundException() {
		super("Project Not Found");
	}

	private static final long serialVersionUID = 1L;
	
}
