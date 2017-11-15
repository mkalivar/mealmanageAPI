package com.mealManage.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mealManage.model.Teachers;

@RepositoryRestResource(collectionResourceRel = "teachers", path = "teachers")
public interface TeachersRepository extends PagingAndSortingRepository<Teachers, Integer>{
	List<Teachers> findBySchoolId(@Param("schoolId") Integer schoolId);
	List<Teachers> findByTeacherEmail(@Param("teacherEmail") String teacherEmail);
	List<Teachers> findByTeacherToken(@Param("teacherToken") String teacherToken);
}
