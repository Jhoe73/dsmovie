package com.coffeeweb.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coffeeweb.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
	
}
