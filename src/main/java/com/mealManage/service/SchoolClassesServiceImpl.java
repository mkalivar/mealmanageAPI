package com.mealManage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mealManage.dao.SchoolClassesDao;
import com.mealManage.model.SchoolClasses;

@Service
public class SchoolClassesServiceImpl implements SchoolClassesService{
	
	@Autowired
	SchoolClassesDao schoolClassesDao;
	
	@Override
	public synchronized boolean addClasses(List<SchoolClasses> classes) {
		schoolClassesDao.addClasses(classes);
		return true;
	}

}
