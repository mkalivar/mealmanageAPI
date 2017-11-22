package com.mealManage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mealManage.model.SchoolClasses;
import com.mealManage.service.SchoolClassesService;

@RestController
@RequestMapping("mealManage")
public class SchoolClassesController {
	
	@Autowired
	SchoolClassesService schoolClassesService;
	
	@PostMapping("schoolClassesList")
	public List<SchoolClasses> addClasses(@RequestBody List<SchoolClasses> classes){
		schoolClassesService.addClasses(classes);
		return classes;
	}
}
