package com.mealManage.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Teachers")
public class Teachers {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer teacherId;
	private String teacherName;
	private String teacherEmail;
	private String teacherToken;
	private String teacherClasses;
	private Integer schoolId;
	public Integer getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getTeacherEmail() {
		return teacherEmail;
	}
	public void setTeacherEmail(String teacherEmail) {
		this.teacherEmail = teacherEmail;
	}
	public String getTeacherToken() {
		return teacherToken;
	}
	public void setTeacherToken(String teacherToken) {
		this.teacherToken = teacherToken;
	}
	public String getTeacherClasses() {
		return teacherClasses;
	}
	public void setTeacherClasses(String teacherClasses) {
		this.teacherClasses = teacherClasses;
	}
	public Integer getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(Integer schoolId) {
		this.schoolId = schoolId;
	}
	
	
}
