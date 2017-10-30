package com.mealManage.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mealManage.model.MealMaster;

@RepositoryRestResource(collectionResourceRel = "mealMaster", path = "mealMaster")
public interface MealMasterRepository extends PagingAndSortingRepository<MealMaster, String>{
	List<MealMaster> findByMealName(@Param("mealName") String mealName);
}
