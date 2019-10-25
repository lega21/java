package com.api.java.spring.api_java_spring_boot.repositories;

import com.api.java.spring.api_java_spring_boot.models.Region;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * RegionRepository
 */
@Repository
public interface RegionRepository extends CrudRepository<Region, Long> {

}