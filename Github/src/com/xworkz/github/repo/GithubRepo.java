package com.xworkz.github.repo;

import java.util.List;

import com.xworkz.github.dto.GithubDto;

public interface GithubRepo {
	
	public boolean save(GithubDto dto);
	
	public List<GithubDto> readAll();
	
	public boolean update(String userName, String password);
	
	public boolean delete(Integer id, String email);
	
	public boolean updateByList(Integer id, List<String> repositories);
	
	

}
