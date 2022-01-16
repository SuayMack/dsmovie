package com.suaymack.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suaymack.dsmovie.entities.Score;
import com.suaymack.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
