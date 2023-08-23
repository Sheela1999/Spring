package com.xworkz.github.service;

import java.util.List;

import com.xworkz.github.dto.GithubDto;

public interface GithubService {
	
	public boolean save(GithubDto dto);
	
	public List<GithubDto> readAll();
	
	public boolean update(String userName, String password);
	
	public boolean delete(Integer id, String email);
	
	public boolean updateByList(Integer id, List<String> repositories);

}
