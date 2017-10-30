package com.mealManage.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mealManage.model.ClassPupil;


@RepositoryRestResource(collectionResourceRel = "classPupil", path = "classPupil")
public interface ClassPupilRepository extends PagingAndSortingRepository<ClassPupil, Integer>{
	List<ClassPupil> findByParentId(@Param("parentId") Integer parentId);
}
