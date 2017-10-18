package com.mealManage.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MealSelect")
public class MealSelect {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer mealSelectedId;
	private Integer pupilId;
	private Date mealDate;
	private Integer mealID;
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
	public Date getMealDate() {
		return mealDate;
	}
	public void setMealDate(Date mealDate) {
		this.mealDate = mealDate;
	}
	public Integer getMealID() {
		return mealID;
	}
	public void setMealID(Integer mealID) {
		this.mealID = mealID;
	}
	
	
}
