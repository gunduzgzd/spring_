package com.example.spring13dataqueries.repository;

import com.example.spring13dataqueries.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegionRepository extends JpaRepository<Region,Integer>{

    //Display all regions in Canada

    List<Region> findByCountry(String country);

    List<Region> getByCountry(String country);

    //display all regions with country name include 'united'

    List<Region> findByCountryContains(String country);

    //display all regions with country name include 'United' in order(region)

    List<Region> findByCountryContainsOrderByRegion(String country);

    //display top 2 regions in United States

    List<Region> findTopByCountry(String country);

    List<Region> findTop2ByCountry(String country);

    List<Region> findTopByCountryContainsOrderByRegion(String country);

}
