package com.citiesapi.dio.cities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.citiesapi.dio.cities.entity.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {

}
