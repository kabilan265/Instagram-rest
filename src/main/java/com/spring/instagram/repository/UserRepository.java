package com.spring.instagram.repository;


import com.spring.instagram.entity.UserDetails;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserDetails,Long> {
}
