package com.suaymack.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suaymack.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
