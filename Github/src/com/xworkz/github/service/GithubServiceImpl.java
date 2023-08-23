package com.xworkz.github.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.github.dto.GithubDto;
import com.xworkz.github.repo.GithubRepo;

@Component
public class GithubServiceImpl implements GithubService{

	@Autowired
	private GithubRepo repo;
	
	@Override
	public boolean save(GithubDto dto) {
		if(dto != null) {
			if(dto.getId() > 0) {
				if(dto.getUserName() != null && dto.getUserName().length() >3) {
					if(dto.getPassword() != null && dto.getPassword().length() <=8) {
						if(dto.getEmail() != null) {
							System.out.println("Validated........");
							repo.save(dto);
							return true;
						}
						System.out.println("email is not valid");
						return false;
					}
					System.out.println("password is not valid");
					return false;
				}
				System.out.println("user name is not valid");
				return false;
			}
			System.out.println("id is not valid");
			return false;
		}
		System.out.println("dto is null");
		return false;
	}

	@Override
	public List<GithubDto> readAll() {
		return repo.readAll();
	}

	@Override
	public boolean update(String userName, String password) {
		if(userName != null) {
			if(password != null && password.length() <=8) {
				repo.update(userName, password);
				System.out.println("Data Updated");
				return true;
			}
			System.out.println("password not valid");
			return false;
		}
		System.out.println("user name not valid");
		return false;
	}
	
	@Override
	public boolean delete(Integer id, String email) {
		if(id > 0) {
			if(email != null) {
				repo.delete(id, email);
				return true;
			}
			System.out.println("email is not valid");
			return false;
		}
		System.out.println("id is not valid");
		return false;
	}

	@Override
	public boolean updateByList(Integer id, List<String> repositories) {
		if(id> 0) {
			if(repositories != null) {
				repo.updateByList(id, repositories);
				return true;
			}
		}
		return false;
	}
	

}
