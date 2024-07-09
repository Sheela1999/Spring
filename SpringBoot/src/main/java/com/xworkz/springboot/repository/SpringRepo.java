package com.xworkz.springboot.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xworkz.springboot.dto.SpringDto;

@Repository
public interface SpringRepo extends CrudRepository<SpringDto, Integer> {
	
	@Modifying
	@Transactional
	@Query("update SpringDto dto set dto.trainerName=:tn where dto.id=:id")
	public int updateNameById(@Param("id") Integer id, @Param("tn") String trainerName);


}
