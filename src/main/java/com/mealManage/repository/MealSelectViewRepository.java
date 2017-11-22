package com.mealManage.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mealManage.model.MealSelectView;

@RepositoryRestResource(collectionResourceRel = "mealSelectView", path = "mealSelectView")
public interface MealSelectViewRepository extends PagingAndSortingRepository<MealSelectView, Integer>{
	List<MealSelectView> findBySchoolId(@Param("schoolId") Integer schoolId);
}
