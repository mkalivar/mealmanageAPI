package com.mealManage.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mealManage.model.MealMaster;

@RepositoryRestResource(collectionResourceRel = "mealMaster", path = "mealMaster")
public interface MealMasterRepository extends PagingAndSortingRepository<MealMaster, Integer>{
	List<MealMaster> findByMealName(@Param("mealName") String mealName);
	@Query("SELECT m FROM MealMaster m WHERE m.mealAssignedDays LIKE CONCAT('%',:mealAssignedDays,'%')")
	List<MealMaster> findByMealAssignedDaysLike(@Param("mealAssignedDays") String mealAssignedDays);
}
