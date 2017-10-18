package com.mealManage.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mealManage.model.MealType;

@RepositoryRestResource(collectionResourceRel = "mealType", path = "mealType")
public interface MealTypeRepository extends PagingAndSortingRepository<MealType, Long>{
	List<MealType> findBymealTypeName(@Param("mealTypeName") String mealTypeName);
}
