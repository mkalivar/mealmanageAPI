package com.mealManage.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "v_MealSelect")
public class MealSelectView {
	
	@Id
	private Integer mealSelectedId;
	private Integer pupilId;
	private String mealDate;
	private Integer mealID;
	private Integer classId;
	private String mealName;
	private BigDecimal mealPrice;
	private Integer mealType;
	private String mealClass;
	private String mealLongDesc;
	private String mealShortDesc;
	private String mealAssignedDays;
	private String mealImage;
	private String className;
	private String pupilFirstName;
	private String pupilLastName;
	private Integer parentId;
	private Integer schoolId;
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
	public Integer getClassId() {
		return classId;
	}
	public void setClassId(Integer classId) {
		this.classId = classId;
	}
	public String getMealName() {
		return mealName;
	}
	public void setMealName(String mealName) {
		this.mealName = mealName;
	}
	public BigDecimal getMealPrice() {
		return mealPrice;
	}
	public void setMealPrice(BigDecimal mealPrice) {
		this.mealPrice = mealPrice;
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
	public String getMealLongDesc() {
		return mealLongDesc;
	}
	public void setMealLongDesc(String mealLongDesc) {
		this.mealLongDesc = mealLongDesc;
	}
	public String getMealShortDesc() {
		return mealShortDesc;
	}
	public void setMealShortDesc(String mealShortDesc) {
		this.mealShortDesc = mealShortDesc;
	}
	public String getMealAssignedDays() {
		return mealAssignedDays;
	}
	public void setMealAssignedDays(String mealAssignedDays) {
		this.mealAssignedDays = mealAssignedDays;
	}
	public String getMealImage() {
		return mealImage;
	}
	public void setMealImage(String mealImage) {
		this.mealImage = mealImage;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getPupilFirstName() {
		return pupilFirstName;
	}
	public void setPupilFirstName(String pupilFirstName) {
		this.pupilFirstName = pupilFirstName;
	}
	public String getPupilLastName() {
		return pupilLastName;
	}
	public void setPupilLastName(String pupilLastName) {
		this.pupilLastName = pupilLastName;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public Integer getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(Integer schoolId) {
		this.schoolId = schoolId;
	}
}
