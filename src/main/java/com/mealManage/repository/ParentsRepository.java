package com.mealManage.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mealManage.model.Parents;

@RepositoryRestResource(collectionResourceRel = "parents", path = "parents")
public interface ParentsRepository extends PagingAndSortingRepository<Parents, Long>{
	List<Parents> findByLastName(@Param("lastName") String lastName);
}
