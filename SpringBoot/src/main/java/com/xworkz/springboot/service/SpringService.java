package com.xworkz.springboot.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.springboot.dto.SpringDto;
import com.xworkz.springboot.repository.SpringRepo;

@Service
public class SpringService {
	
	@Autowired
	private SpringRepo repo;
	
	public String saveData(SpringDto dto) {
		if(dto != null) {
			if(dto.getSubName() != null) {
				if(dto.getTrainerName() != null) {
					if(dto.getNoOfClasses() != null) {
						if(dto.getNoOfStudents() != null) {
							repo.save(dto);
							return "This is My First Code";
						}
					}
				}
			}
		}
		return null;
	}
	
	public Iterable<SpringDto> readAll(){
		return repo.findAll();	
	}
	
	public Optional<SpringDto> findById(Integer id) {
		return repo.findById(id);
	}
	
	public boolean deleteById(Integer id) {
		 repo.deleteById(id);
		 return true;
	}
	
	public int updateNameById(Integer id, String trainerName) {
		return repo.updateNameById(id, trainerName);
	}

}
