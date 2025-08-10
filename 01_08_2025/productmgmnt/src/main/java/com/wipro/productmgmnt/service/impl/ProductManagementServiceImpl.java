package com.wipro.productmgmnt.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.wipro.productmgmnt.entity.ProductManagement;
import com.wipro.productmgmnt.repo.ProductManagementRepo;
import com.wipro.productmgmnt.service.ProductManagementService;

@Service
public class ProductManagementServiceImpl implements ProductManagementService {
	
	@Autowired
	ProductManagementRepo productManagementRepo;

	@Override
	public void save(ProductManagement productManagement) {
		productManagementRepo.save(productManagement);

	}

	@Override
	public List<ProductManagement> findAll() {
		
		return productManagementRepo.findAll();
	}
	
	

	@Override
	public ProductManagement findById(int id) {
		Optional<ProductManagement> product = productManagementRepo.findById(id);
		if(!product.isEmpty()) {
			return product.get();
		} 
		return null;
	}

	@Override
	public void deleteById(int id) {
		productManagementRepo.deleteById(id);

	}

	@Override
	public List<ProductManagement> findByProductName(String productName) {
		
		return productManagementRepo.findByProductName(productName);
	}

	@Override
	public List<ProductManagement> findByProductNameAndProductMakeOrderByProductNameDesc(String productName,
			String productMake) {
		
		return productManagementRepo.findByProductNameAndProductMakeOrderByProductNameDesc(productName, productMake);
	}

	@Override
	public Page<ProductManagement> findAll(Pageable p) {
		
		return productManagementRepo.findAll(p);
	}

}
