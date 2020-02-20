package com.fss.sample1;

public class Project {
	
	int projectId;
	String projectName;
	String clientName;
	double budget;
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Project(int projectId, String projectName, String clientName,
			double budget) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.clientName = clientName;
		this.budget = budget;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName="
				+ projectName + ", clientName=" + clientName + ", budget="
				+ budget + "]";
	}
	

}
