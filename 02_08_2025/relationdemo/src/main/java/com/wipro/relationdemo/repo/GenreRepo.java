package com.wipro.relationdemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.relationdemo.entity.Genre;


@Repository
public interface GenreRepo extends JpaRepository<Genre, Integer>{

}
