package com.mealManage.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.rest.core.annotation.RestResource;

@Entity
@Table(name = "Users")
public class Users {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String firstName;
	private String lastName;
	private String mobileNo;
	private String username;
	private String password;
	private String role;
	
	@OneToOne
    @JoinColumn(name = "schoolId")
    @RestResource(path = "school", rel="school")
    private School school;
	
	public Users() {
		
	}
	
	public Users(String firstName, String lastName, 
			     String mobileNo, String username, 
			     String password, String role, 
			     School school) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.mobileNo=mobileNo;
		this.username=username;
		this.password=password;
		this.role=role;
		this.school=school;
		
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	
	
}
