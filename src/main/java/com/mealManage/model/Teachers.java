package com.mealManage.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Teachers")
public class Teachers implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer teacherId;
	private String teacherName;
	private String teacherEmail;
	private String teacherToken;
	private String teacherClasses;
	private Integer schoolId;
	
	public Teachers() {
		
	}
	public Teachers(String teacherName, String teacherEmail, String teacherToken, String teacherClasses,
			Integer schoolId) {
		this.teacherName = teacherName;
		this.teacherEmail = teacherEmail;
		this.teacherToken = teacherToken;
		this.teacherClasses = teacherClasses;
		this.schoolId = schoolId;
	}
	
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
