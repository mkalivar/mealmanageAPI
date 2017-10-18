package com.mealManage.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SchoolDistricts")
public class SchoolDistricts {
    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer schoolDistrictId;
    private String schoolDistrictName;
    private String city;
    private String county;
    private String state;

	public Integer getSchoolDistrictId() {
		return schoolDistrictId;
	}

	public void setSchoolDistrictId(Integer schoolDistrictId) {
		this.schoolDistrictId = schoolDistrictId;
	}

	public String getSchoolDistrictName() {
		return schoolDistrictName;
	}

	public void setSchoolDistrictName(String schoolDistrictName) {
		this.schoolDistrictName = schoolDistrictName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
    
	
    
    
}

