package com.mealManage.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mealManage.model.Teachers;
import com.mealManage.service.TeachersService;

@RestController
@RequestMapping("mealManage")
public class TeachersController {
	
	@Autowired
	private TeachersService teachersService;
	
	@PostMapping("teachersList")
	public List<Teachers> addTeachers(@RequestBody List<Teachers> teachers){
		teachersService.addTeachers(teachers);
		return teachers;
	}
}
