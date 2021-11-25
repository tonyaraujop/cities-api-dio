package com.citiesapi.dio.states.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.citiesapi.dio.states.entity.State;

@Repository
public interface StateRepository extends JpaRepository<State, Long>{

}
