package com.citiesapi.dio.countries.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

	@GetMapping("/pesquisa")
	public List<Country> countries(){
		return repository.findAll();
	}
}
