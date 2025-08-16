package com.wipro.employeemngnt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.employeemngnt.model.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address, Long> {

}
