package com.wipro.productmgmnt.repo;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.productmgmnt.entity.ProductManagement;

@Repository
public interface ProductManagementRepo extends JpaRepository<ProductManagement, Integer> {
	
	List<ProductManagement> findByProductName (String productName);
	
	List<ProductManagement> findByProductNameAndProductMakeOrderByProductNameDesc(String productName, String productMake);
	
	Page<ProductManagement> findAll(Pageable p);
}
