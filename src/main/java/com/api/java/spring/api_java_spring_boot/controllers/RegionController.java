package com.api.java.spring.api_java_spring_boot.controllers;

import java.util.List;

import com.api.java.spring.api_java_spring_boot.models.Region;
import com.api.java.spring.api_java_spring_boot.services.RegionService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("region")
public class RegionController {

    private RegionService regionService;

    public RegionController(RegionService regionService) {
        this.regionService = regionService;
    }

    @GetMapping
    public List<Region> all() {
        return regionService.all();
    }

    @PostMapping
    public Region save(@RequestBody Region region) {
        return regionService.save(region);
    }

    @PutMapping("/{id}")
    public Region update(@PathVariable("id") Long id, @RequestBody Region region) {
        region.setIdregion(id);
        return regionService.update(region);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        regionService.delete(id);
    }
}