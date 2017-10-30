package com.mealManage.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mealManage.model.MealSelect;

@RepositoryRestResource(collectionResourceRel = "mealSelect", path = "mealSelect")
public interface MealSelectRepository extends PagingAndSortingRepository<MealSelect, Date>{
	List<MealSelect> findByMealDate(@Param("mealDate") Date mealDate);
}
