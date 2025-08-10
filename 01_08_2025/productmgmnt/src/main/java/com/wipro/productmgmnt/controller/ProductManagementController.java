package com.wipro.productmgmnt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.productmgmnt.entity.ProductManagement;
import com.wipro.productmgmnt.service.ProductManagementService;

import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/product")
@Tag(name = "Product Management", description = "Product management APIs")
public class ProductManagementController {
	
	@Autowired
	ProductManagementService productManagementService;
	
	@PostMapping
	@Operation(summary = "Save a product", description = "Creates a new product entry")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Saved successfully"),
        @ApiResponse(responseCode = "400", description = "Invalid input")
    })
	void save(@RequestBody ProductManagement productManagement) {
		productManagementService.save(productManagement);
	}
	
	@GetMapping
	List<ProductManagement> findAll() {
		return productManagementService.findAll()
;	}
	
	@GetMapping("/{id}")
	ProductManagement findById(@PathVariable int id)
	{
		return productManagementService.findById(id);
		
	}
	
	@PutMapping 
	void update(@RequestBody ProductManagement  productManagement)
	{
		productManagementService.save(productManagement);
		
	}
	
	@DeleteMapping("/{id}")
	void deleteById(@PathVariable int id)
	{
		productManagementService.deleteById(id);
		
	}
	
//	@GetMapping("/type")
//	List<ProductManagement> findByProductName(@RequestParam String productName)
//	{
//		return productManagementService.findByProductName(productName);
//		
//	}
	
	@GetMapping("/typepath/{name}")
	List<ProductManagement> findByProductName(@PathVariable String name)
	{
		return productManagementService.findByProductName(name);
		
	}
	
	
	@GetMapping("/{productName}/{productMake}")
	List<ProductManagement> findByProductNameAndProductMakeOrderByProductNameDesc(@PathVariable String productName,
			@PathVariable String productMake) {
		
		return productManagementService.findByProductNameAndProductMakeOrderByProductNameDesc(productName, productMake);
	}
	
	
	@GetMapping("/page/{pageNum}/{pageSize}/{sortOrder}")
	Page<ProductManagement> findAllPages(@PathVariable int pageNum, @PathVariable int pageSize, @PathVariable int sortOrder) {
		Pageable p = null;
		
		if(sortOrder == 0) {
			p = PageRequest.of(pageNum, pageSize, Sort.by("productPrice").descending());
		} else {
			p = PageRequest.of(pageNum, pageSize, Sort.by("productPrice").ascending());
		}
		
		return productManagementService.findAll(p);
	}
}
