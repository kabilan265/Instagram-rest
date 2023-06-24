package com.spring.instagram.repository;

import com.spring.instagram.entity.Photos;
import org.springframework.data.repository.CrudRepository;

public interface PhotosRepository extends CrudRepository<Photos,Long> {
}
