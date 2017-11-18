package com.mealManage.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mealManage.model.MealSelectView;

@RepositoryRestResource(collectionResourceRel = "mealSelectView", path = "mealSelectView")
public interface MealSelectViewRepository extends PagingAndSortingRepository<MealSelectView, Integer>{

}
