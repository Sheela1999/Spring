package com.xworkz.taxi.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Table(name = "Taxi_info")
@NamedQuery(name = "readAll", query = "select dto from TaxiDto dto")
@NamedQuery(name = "updateTaxiEarningsById", query = "update TaxiDto dto set dto.earnings=:er where dto.id=:id")
@NamedQuery(name = "updateTaxiAvailableById", query = "update TaxiDto dto set dto.isAvailable=:ia where dto.id=:td")
@NamedQuery(name = "findTaxiByLocation", query = "select dto from TaxiDto dto where dto.location=:ln")
@NamedQuery(name = "findAll", query = "select dto from TaxiDto dto where dto.isAvailable=:ab")
@Entity
public class TaxiDto implements Serializable {

	@Id
	private int id;
	private String taxiNo;
	private int earnings;
	private boolean isAvailable;
	private String location;
	private int noOfTrips;

	public TaxiDto() {
		super();
	}

	public TaxiDto(int id, String taxiNo, int earnings, boolean isAvailable, String location, int noOfTrips) {
		super();
		this.id = id;
		this.taxiNo = taxiNo;
		this.earnings = earnings;
		this.isAvailable = isAvailable;
		this.location = location;
		this.noOfTrips = noOfTrips;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTaxiNo() {
		return taxiNo;
	}

	public void setTaxiNo(String taxiNo) {
		this.taxiNo = taxiNo;
	}

	public int getEarnings() {
		return earnings;
	}

	public void setEarnings(int earnings) {
		this.earnings = earnings;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNoOfTrips() {
		return noOfTrips;
	}

	public void setTrips(int noOfTrips) {
		this.noOfTrips = noOfTrips;
	}

	@Override
	public String toString() {
		return "TaxiDto [id=" + id + ", taxiNo=" + taxiNo + ", earnings=" + earnings + ", isAvailable=" + isAvailable
				+ ", location=" + location + ", noOfTrips=" + noOfTrips + "]";
	}

}
