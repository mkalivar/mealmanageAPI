package com.mealManage.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mealManage.model.MealMaster;
import com.mealManage.model.MealSelect;

@RepositoryRestResource(collectionResourceRel = "mealSelect", path = "mealSelect")
public interface MealSelectRepository extends PagingAndSortingRepository<MealSelect, Integer>{
	List<MealSelect> findByMealDateAndClassId(@Param("mealDate") String mealDate,
											 @Param("classId") Integer classId);
	
	List<MealSelect> findByMealDateAndPupilId(@Param("mealDate") String mealDate,
			 								 @Param("pupilId") Integer pupilId);
	
	@Query("SELECT m FROM MealSelect m WHERE m.pupilId = :pupilId AND m.mealDate BETWEEN :fromDate AND :toDate")
	List<MealSelect> findByDates(@Param("fromDate") String fromDate, @Param("toDate") String toDate, @Param("pupilId") Integer pupilId);
}
