package com.mealManage.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.mealManage.model.Teachers;

@Transactional
@Repository
public class TeachersDaoImpl implements TeachersDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void addTeachers(List<Teachers> teachers) {
		for (Teachers teacher : teachers) {
			teacher.setTeacherId(null);
			entityManager.persist(teacher);
		}
	}
}
