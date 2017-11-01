package com.mealManage.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mealManage.model.TeacherClassMap;

@RepositoryRestResource(collectionResourceRel = "teacherClassMap", path = "teacherClassMap")
public interface TeacherClassMapRepository extends PagingAndSortingRepository<TeacherClassMap, Integer>{
	List<TeacherClassMap> findByTeacherId(@Param("teacherId") Integer teacherId);
}
