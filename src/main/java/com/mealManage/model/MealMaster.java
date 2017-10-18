package com.mealManage.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MealMaster")
public class MealMaster {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer mealId;
	private String mealName;
	private Double mealPrice;
	private String mealLongDesc;
	private Integer mealType;
	private String mealClass;
	private Integer schoolId;
	private String mealImage;
	private String mealShortDesc;
	
	public Integer getMealId() {
		return mealId;
	}
	public void setMealId(Integer mealId) {
		this.mealId = mealId;
	}
	public String getMealName() {
		return mealName;
	}
	public void setMealName(String mealName) {
		this.mealName = mealName;
	}
	public Double getMealPrice() {
		return mealPrice;
	}
	public void setMealPrice(Double mealPrice) {
		this.mealPrice = mealPrice;
	}
	public String getMealLongDesc() {
		return mealLongDesc;
	}
	public void setMealLongDesc(String mealLongDesc) {
		this.mealLongDesc = mealLongDesc;
	}
	public Integer getMealType() {
		return mealType;
	}
	public void setMealType(Integer mealType) {
		this.mealType = mealType;
	}
	public String getMealClass() {
		return mealClass;
	}
	public void setMealClass(String mealClass) {
		this.mealClass = mealClass;
	}
	public Integer getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(Integer schoolId) {
		this.schoolId = schoolId;
	}
	public String getMealImage() {
		return mealImage;
	}
	public void setMealImage(String mealImage) {
		this.mealImage = mealImage;
	}
	public String getMealShortDesc() {
		return mealShortDesc;
	}
	public void setMealShortDesc(String mealShortDesc) {
		this.mealShortDesc = mealShortDesc;
	}
	
	
}
