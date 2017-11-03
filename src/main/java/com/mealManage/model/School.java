package com.mealManage.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "School")
public class School {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer schoolId;
	@Column(name="CTDS")
	private String ctds;
	private String schoolName;
	private String schoolAddress;
	private String cityStateZip;
	private String telephone;
	private String fax;
	private String county;
	private Integer schoolDistrictId;
	private String schoolSubDomain;
	private String type;
	
	@OneToOne(mappedBy = "school")
    private Users users;
	
	public School() {
		
	}
	
	public School(String schoolSubDomain) {
		this.schoolSubDomain = schoolSubDomain;
	}
	
	public Integer getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(Integer schoolId) {
		this.schoolId = schoolId;
	}
	public String getCtds() {
		return ctds;
	}
	public void setCtds(String ctds) {
		this.ctds = ctds;
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
	public String getCityStateZip() {
		return cityStateZip;
	}
	public void setCityStateZip(String cityStateZip) {
		this.cityStateZip = cityStateZip;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users = users;
	}
	
}
