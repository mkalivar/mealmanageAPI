package com.mealManage.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.rest.core.annotation.RestResource;

@Entity
@Table(name = "MealSelect")
public class MealSelect {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer mealSelectedId;
	private Integer pupilId;
	private String mealDate;
	private Integer mealID;
	private Integer classId;
	
	
	public Integer getClassId() {
		return classId;
	}
	public void setClassId(Integer classId) {
		this.classId = classId;
	}
	public Integer getMealSelectedId() {
		return mealSelectedId;
	}
	public void setMealSelectedId(Integer mealSelectedId) {
		this.mealSelectedId = mealSelectedId;
	}
	public Integer getPupilId() {
		return pupilId;
	}
	public void setPupilId(Integer pupilId) {
		this.pupilId = pupilId;
	}
	public String getMealDate() {
		return mealDate;
	}
	public void setMealDate(String mealDate) {
		this.mealDate = mealDate;
	}
	public Integer getMealID() {
		return mealID;
	}
	public void setMealID(Integer mealID) {
		this.mealID = mealID;
	}
	
}
