package com.mealManage.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mealManage.model.Users;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UsersRepository extends PagingAndSortingRepository<Users, Integer>{
	List<Users> findByLastName(@Param("lastName") String lastName);
	List<Users> findByRole(@Param("role") String role);
}
