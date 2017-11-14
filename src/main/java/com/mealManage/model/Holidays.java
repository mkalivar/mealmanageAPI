package com.mealManage.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Holidays")
public class Holidays {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer holidayId;
	private String holidayName;
	private String holidayFromDt;
	private String holidayToDt;
	private Integer schoolId;
	
	public Integer getHolidayId() {
		return holidayId;
	}
	public void setHolidayId(Integer holidayId) {
		this.holidayId = holidayId;
	}
	public String getHolidayName() {
		return holidayName;
	}
	public void setHolidayName(String holidayName) {
		this.holidayName = holidayName;
	}
	public String getHolidayFromDt() {
		return holidayFromDt;
	}
	public void setHolidayFromDt(String holidayFromDt) {
		this.holidayFromDt = holidayFromDt;
	}
	public String getHolidayToDt() {
		return holidayToDt;
	}
	public void setHolidayToDt(String holidayToDt) {
		this.holidayToDt = holidayToDt;
	}
	public Integer getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(Integer schoolId) {
		this.schoolId = schoolId;
	}
}
