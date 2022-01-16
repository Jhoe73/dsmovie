package com.coffeeweb.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coffeeweb.dsmovie.entities.Score;
import com.coffeeweb.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
	
}
