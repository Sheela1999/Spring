package com.xworkz.lawyer.dto;

public class ClientDto {

	private String clientName;
	private String age;
	private String occupation;
	private String problem;

	public ClientDto() {
		super();
	}

	public ClientDto(String clientName, String age, String occupation, String problem) {
		super();
		this.clientName = clientName;
		this.age = age;
		this.occupation = occupation;
		this.problem = problem;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	@Override
	public String toString() {
		return "ClientDto [clientName=" + clientName + ", age=" + age + ", occupation=" + occupation + ", problem="
				+ problem + "]";
	}

}
