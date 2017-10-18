package com.mealManage.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MealType")
public class MealType {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer mealTypeId;
	private String mealTypeName;
	private String mealTypeDesc;
	
	public Integer getMealTypeId() {
		return mealTypeId;
	}
	public void setMealTypeId(Integer mealTypeId) {
		this.mealTypeId = mealTypeId;
	}
	public String getMealTypeName() {
		return mealTypeName;
	}
	public void setMealTypeName(String mealTypeName) {
		this.mealTypeName = mealTypeName;
	}
	public String getMealTypeDesc() {
		return mealTypeDesc;
	}
	public void setMealTypeDesc(String mealTypeDesc) {
		this.mealTypeDesc = mealTypeDesc;
	}
	
	
}
