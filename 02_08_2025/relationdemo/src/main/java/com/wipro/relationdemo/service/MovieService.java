package com.wipro.relationdemo.service;

import java.util.List;

import com.wipro.relationdemo.entity.Movie;

public interface MovieService {
	void save(Movie movie);
	List<Movie> findAll();
}
