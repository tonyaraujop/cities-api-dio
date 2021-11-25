package com.citiesapi.dio.countries.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.citiesapi.dio.countries.entity.Country;
import com.citiesapi.dio.countries.repositories.CountryRepository;

@RestController
@RequestMapping("/countries")
public class CountryResource {
	
	@Autowired
	private CountryRepository repository;

	@GetMapping
	public Page<Country> countries(final Pageable page){
		return repository.findAll(page);
	}
}