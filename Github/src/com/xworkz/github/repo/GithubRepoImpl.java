package com.xworkz.github.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.github.dto.GithubDto;
@Component
public class GithubRepoImpl implements GithubRepo {
	
	@Autowired
	private List<GithubDto> list;

	@Override
	public boolean save(GithubDto dto) {
		list.add(dto);
		System.out.println("Data saving");
		return true;
	}

	@Override
	public List<GithubDto> readAll() {
		System.out.println("read all data");
		return list;
	}

	@Override
	public boolean update(String userName, String password) {
		for (GithubDto dtos : list) {
			if(dtos.getUserName().equals(userName)) {
				dtos.setPassword(password);
				System.out.println("password updated");
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean delete(Integer id, String email) {
		for (GithubDto githubDto : list) {
			if(githubDto.getId().equals(id)) {
				if(githubDto.getEmail().equals(email)) {
					list.remove(githubDto);
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean updateByList(Integer id, List<String> repositories) {
		for(GithubDto dto : list) {
			if(dto.getId().equals(id)) {
				dto.setRepositories(repositories);
				return true;
			}
		}
		return false;
	}

}
