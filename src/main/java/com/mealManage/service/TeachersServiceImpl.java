package com.mealManage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mealManage.dao.TeachersDao;
import com.mealManage.model.Teachers;

@Service
public class TeachersServiceImpl implements TeachersService{
	
	@Autowired
	private TeachersDao teachersDao;
	
	
	@Override
	public synchronized boolean addTeachers(List<Teachers> teachers) {
		teachersDao.addTeachers(teachers);
		return true;
	}

}
