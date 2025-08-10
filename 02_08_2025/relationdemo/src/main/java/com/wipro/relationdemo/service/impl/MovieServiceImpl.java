package com.wipro.relationdemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wipro.relationdemo.entity.Movie;
import com.wipro.relationdemo.repo.GenreRepo;
import com.wipro.relationdemo.repo.MovieRepo;
import com.wipro.relationdemo.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService {
	
	@Autowired
	MovieRepo movieRepo;
	
	@Autowired
	GenreRepo genreRepo;

	@Override
	@Transactional
	public void save(Movie movie) {
		
		movieRepo.save(movie);
	}

	@Override
	public List<Movie> findAll() {
		
		return movieRepo.findAll();
	}

}
