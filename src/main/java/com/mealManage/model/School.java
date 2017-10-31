package com.mealManage.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "School")
public class School {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer schoolId;
	private String schoolName;
	private String schoolAddress;
	private Integer schoolDistrictId;
	private String schoolSubDomain;
	
	public Integer getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(Integer schoolId) {
		this.schoolId = schoolId;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getSchoolAddress() {
		return schoolAddress;
	}
	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
	}
	public Integer getSchoolDistrictId() {
		return schoolDistrictId;
	}
	public void setSchoolDistrictId(Integer schoolDistrictId) {
		this.schoolDistrictId = schoolDistrictId;
	}
	public String getSchoolSubDomain() {
		return schoolSubDomain;
	}
	public void setSchoolSubDomain(String schoolSubDomain) {
		this.schoolSubDomain = schoolSubDomain;
	}
	
	
	
}
