package com.mealManage.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mealManage.model.Holidays;

@RepositoryRestResource(collectionResourceRel = "holidays", path = "holidays")
public interface HolidaysRepository extends PagingAndSortingRepository<Holidays, Long>{
	List<Holidays> findByHolidayFromDt(@Param("holidayFromDt") Date HolidayFromDt);
}
