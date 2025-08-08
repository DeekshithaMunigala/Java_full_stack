package com.wipro.letsgoms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.letsgoms.entity.LetsGo;

@Repository
public interface LetsGoRepo extends JpaRepository<LetsGo, Long> {

}
