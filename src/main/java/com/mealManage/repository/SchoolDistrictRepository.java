package com.mealManage.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mealManage.model.SchoolDistricts;

// This will be AUTO IMPLEMENTED by Spring into a Bean called SchoolDistrictRepository
// CRUD refers Create, Read, Update, Delete

@RepositoryRestResource(collectionResourceRel = "schoolDistricts", path = "schoolDistricts")
public interface SchoolDistrictRepository extends PagingAndSortingRepository<SchoolDistricts, Integer> {
	List<SchoolDistricts> findByCounty(@Param("county") String county);
}