package com.wipro.relationdemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.relationdemo.entity.Movie;

@Repository
public interface MovieRepo extends JpaRepository<Movie, Integer> {

}
