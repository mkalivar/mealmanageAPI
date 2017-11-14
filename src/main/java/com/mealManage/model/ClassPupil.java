package com.mealManage.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ClassPupil")
public class ClassPupil {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer pupilId;
	private String pupilFirstName;
	private String pupilLastName;
	private Integer classId;
	private String className;
	private Integer parentId;
	
	public Integer getPupilId() {
		return pupilId;
	}
	public void setPupilId(Integer pupilId) {
		this.pupilId = pupilId;
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
	public Integer getClassId() {
		return classId;
	}
	public void setClassId(Integer classId) {
		this.classId = classId;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
}
