package com.mealManage.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TeacherClassMap")
public class TeacherClassMap {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer teacherClassMapId;
	private Integer teacherId;
	private Integer classId;
	public Integer getTeacherClassMapId() {
		return teacherClassMapId;
	}
	public void setTeacherClassMapId(Integer teacherClassMapId) {
		this.teacherClassMapId = teacherClassMapId;
	}
	public Integer getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}
	public Integer getClassId() {
		return classId;
	}
	public void setClassId(Integer classId) {
		this.classId = classId;
	}
	
}
