package com.mealManage.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Holidays")
public class Holidays {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer holidayId;
	private String holidayName;
	private Date holidayFromDt;
	private Date holidayToDt;
	
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
	public Date getHolidayFromDt() {
		return holidayFromDt;
	}
	public void setHolidayFromDt(Date holidayFromDt) {
		this.holidayFromDt = holidayFromDt;
	}
	public Date getHolidayToDt() {
		return holidayToDt;
	}
	public void setHolidayToDt(Date holidayToDt) {
		this.holidayToDt = holidayToDt;
	}
	
	
}
