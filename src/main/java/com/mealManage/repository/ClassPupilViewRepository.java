package com.mealManage.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mealManage.model.ClassPupilView;

@RepositoryRestResource(collectionResourceRel = "classPupilView", path = "classPupilView")
public interface ClassPupilViewRepository extends PagingAndSortingRepository<ClassPupilView, Integer>{
	List<ClassPupilView> findByParentId(@Param("parentId") Integer parentId);
	List<ClassPupilView> findByClassId(@Param("classId") Integer classId);
	List<ClassPupilView> findBySchoolId(@Param("schoolId") Integer schoolId);
}
