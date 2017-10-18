package com.mealManage.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mealManage.model.SchoolClasses;

@RepositoryRestResource(collectionResourceRel = "schoolClasses", path = "schoolClasses")
public interface SchoolClassesRepository extends PagingAndSortingRepository<SchoolClasses, Long>{
	List<SchoolClasses> findBySchoolId(@Param("schoolId") String schoolId);
}
