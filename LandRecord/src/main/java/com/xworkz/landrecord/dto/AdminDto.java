package com.xworkz.landrecord.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Table
@Entity
@NamedQuery(name = "FindNameAndEmail", query = "select dto from AdminDto dto where dto.adminName=:an and dto.email=:em")
public class AdminDto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String adminName;
	private String email;
	private Long otp;

	public AdminDto() {
		super();
	}

	public AdminDto(Integer id, String adminName, String email, Long otp) {
		super();
		this.id = id;
		this.adminName = adminName;
		this.email = email;
		this.otp = otp;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getOtp() {
		return otp;
	}

	public void setOtp(Long otp) {
		this.otp = otp;
	}

	@Override
	public String toString() {
		return "AdminDto [id=" + id + ", adminName=" + adminName + ", email=" + email + ", otp=" + otp + "]";
	}

}
