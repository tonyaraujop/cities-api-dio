package com.citiesapi.dio.cities.resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.citiesapi.dio.cities.services.DistanceService;

@RestController
@RequestMapping("/distances")
public class DistanceResource {

	private final DistanceService service;
	Logger log = LoggerFactory.getLogger(DistanceResource.class);

	public DistanceResource(DistanceService service) {
		this.service = service;
	}

	@GetMapping("/in-miles")
	public ResponseEntity byPoints(@RequestParam(name = "from") final Long city1, @RequestParam(name = "to") final Long city2) {
		log.info("byPoints");
		return ResponseEntity.ok().body(service.distanceByPointsInMiles(city1, city2));
	}

	@GetMapping("/in-meters")
	public ResponseEntity byCube(@RequestParam(name = "from") final Long city1, @RequestParam(name = "to") final Long city2) {
		log.info("byCube");
		return ResponseEntity.ok().body(service.distanceByCubeInMeters(city1, city2));
	}
}