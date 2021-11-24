package com.citiesapi.dio.countries.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.citiesapi.dio.countries.entity.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long>{

}
