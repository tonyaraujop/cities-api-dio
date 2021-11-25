package com.citiesapi.dio.cities.resources;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.citiesapi.dio.cities.entity.City;
import com.citiesapi.dio.cities.repositories.CityRepository;

@RestController
@RequestMapping("/cities")
public class CityResource {

  private final CityRepository repository;

  public CityResource(final CityRepository repository) {
    this.repository = repository;
  }

  // 1st
//  @GetMapping
//  public List<City> cities() {
//      return repository.findAll();
//  }

	@GetMapping
	public Page<City> cities(final Pageable page) {
		return (Page<City>) repository.findAll(page);
	}
}
