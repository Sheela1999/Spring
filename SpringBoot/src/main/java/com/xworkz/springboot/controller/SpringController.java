package com.xworkz.springboot.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xworkz.springboot.dto.SpringDto;
import com.xworkz.springboot.service.SpringService;

@RestController
public class SpringController {
	
	@Autowired
	private SpringService service;
	
	public SpringController() {
		System.out.println("Bean is Created...");
	}
	
	@GetMapping("/get")
	public String getSession() {
		return "Hii";
	}
	
	@PostMapping("/addData")
	public String save(@RequestBody SpringDto dto) {
		String saved = service.saveData(dto);
		System.out.println(saved);
		if(saved != null) {
		return "The data saved Successfully";
		}else {
			return "not saved";
		}
		
	}
	
	@GetMapping("/find")
	public Iterable<SpringDto> read() {
		Iterable<SpringDto> readData = service.readAll();
		return readData;
	}
	
	@GetMapping("/find/{id}") 
	public Optional<SpringDto> findById(@PathVariable int id){
		Optional<SpringDto> found = service.findById(id);
		return found;
	}
	
	@DeleteMapping("/remove/{id}")
	public String delete(@PathVariable int id) {
		boolean deleted = service.deleteById(id);
		if(deleted) {
			return"deleted successfully";
		}else {
			return"not deleted";
		}
	}
	
	@PostMapping("/fetch")
	public String findBySubName(@RequestParam String subName) {
		return "Hi"+subName;
	}
	
	@PutMapping("/edit/{id}")
	public String updateName(@RequestParam String trainerName, @PathVariable Integer id) {
		int updated = service.updateNameById(id, trainerName);
		if(updated == 1) {
			return "updated successfully";
		}else {
			return "Not Updated";
		}
	}

}
