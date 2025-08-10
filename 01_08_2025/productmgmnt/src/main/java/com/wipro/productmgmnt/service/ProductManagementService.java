package com.wipro.productmgmnt.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wipro.productmgmnt.entity.ProductManagement;

public interface ProductManagementService {
	void save(ProductManagement productManagement);
	List<ProductManagement> findAll();
	ProductManagement findById(int id);
	void deleteById(int id);
	List<ProductManagement> findByProductName (String productName);
	List<ProductManagement> findByProductNameAndProductMakeOrderByProductNameDesc(String productName, String productMake);
	Page<ProductManagement> findAll(Pageable p);
	
}
