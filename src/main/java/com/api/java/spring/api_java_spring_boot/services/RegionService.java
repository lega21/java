package com.api.java.spring.api_java_spring_boot.services;

import java.util.List;

import com.api.java.spring.api_java_spring_boot.models.Region;
import com.api.java.spring.api_java_spring_boot.repositories.RegionRepository;

import org.springframework.stereotype.Service;

/**
 * RegionService
 */
@Service
public class RegionService {

    private RegionRepository regionRepository;

    public RegionService(RegionRepository regionRepository) {
        this.regionRepository = regionRepository;
    }

    public Region save(Region region) {
        return regionRepository.save(region);
    }

    public Region update(Region region) {
        return regionRepository.save(region);
    }

    public void delete(Long id) {
        regionRepository.deleteById(id);
    }

    public List<Region> all() {
        return (List<Region>) regionRepository.findAll();
    }
}