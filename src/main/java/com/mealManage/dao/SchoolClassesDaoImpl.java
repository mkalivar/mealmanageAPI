package com.mealManage.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.mealManage.model.SchoolClasses;

@Transactional
@Repository
public class SchoolClassesDaoImpl implements SchoolClassesDao{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void addClasses(List<SchoolClasses> classes) {
		for (SchoolClasses oneClass : classes) {
			oneClass.setClassId(null);
			entityManager.persist(oneClass);
		}
		
	}

}
