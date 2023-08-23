package com.xworkz.github.dto;

import java.util.List;

public class GithubDto {

	private Integer id;
	private String userName;
	private String password;
	private String email;
	private List<Integer> contributions;
	private List<String> repositories;

	public GithubDto() {
		super();
	}

	public GithubDto(Integer id, String userName, String password, String email, List<Integer> contributions,
			List<String> repositories) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.contributions = contributions;
		this.repositories = repositories;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Integer> getContributions() {
		return contributions;
	}

	public void setContributions(List<Integer> contributions) {
		this.contributions = contributions;
	}

	public List<String> getRepositories() {
		return repositories;
	}

	public void setRepositories(List<String> repositories) {
		this.repositories = repositories;
	}

	@Override
	public String toString() {
		return "GithubDto [id=" + id + ", userName=" + userName + ", password=" + password + ", email=" + email
				+ ", contributions=" + contributions + ", repositories=" + repositories + "]";
	}

}
