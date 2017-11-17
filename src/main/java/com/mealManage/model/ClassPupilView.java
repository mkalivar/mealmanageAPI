package com.mealManage.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "v_ClassPupil")
public class ClassPupilView {
	@Id
	private Integer pupilId;
	private String pupilFirstName;
	private String pupilLastName;
	private Integer classId;
	private Integer parentId;
	private Integer schoolId;
	private String className;
	
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
	public Integer getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(Integer schoolId) {
		this.schoolId = schoolId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	
	
}
