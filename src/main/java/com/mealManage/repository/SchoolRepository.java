package com.mealManage.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mealManage.model.School;

@RepositoryRestResource(collectionResourceRel = "school", path = "school")
public interface SchoolRepository extends PagingAndSortingRepository<School, Integer>{
	List<School> findBySchoolDistrictId(@Param("schoolDistrictId") Integer schoolDistrictId);
	List<School> findBySchoolSubDomain(@Param("schoolSubDomain") String schoolSubDomain);
	
	@Query("SELECT m FROM School m WHERE m.schoolSubDomain IS NOT NULL")
	List<School> findOnboardedSchools();
}
