package com.wipro.productms.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.wipro.productms.dto.ProductDTO;
import com.wipro.productms.entity.Product;
import com.wipro.productms.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/products")
@Tag(name = "Product Management", description = "APIs for managing products")
public class ProductController {
	
	@Autowired
    private ProductService productService;
    
    @PostMapping
    @Operation(summary = "Create a new product")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Product created successfully"),
        @ApiResponse(responseCode = "400", description = "Invalid input")
    })
    public ResponseEntity<Product> createProduct(@Valid @ModelAttribute ProductDTO productDTO) {
        Product product = productService.createProduct(productDTO);
        return ResponseEntity.ok(product);
    }
    
    @PutMapping("/{id}")
    @Operation(summary = "Update a product")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Product updated successfully"),
        @ApiResponse(responseCode = "404", description = "Product not found")
    })
    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @Valid @ModelAttribute ProductDTO productDTO) {
        Product product = productService.updateProduct(id, productDTO);
        return ResponseEntity.ok(product);
    }
    
    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a product")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Product deleted successfully"),
        @ApiResponse(responseCode = "404", description = "Product not found")
    })
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return ResponseEntity.ok().build();
    }
    
    @GetMapping
    @Operation(summary = "Get all products")
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = productService.getAllProducts();
        return ResponseEntity.ok(products);
    }
    
    @GetMapping("/{id}")
    @Operation(summary = "Get product by ID")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Product found"),
        @ApiResponse(responseCode = "404", description = "Product not found")
    })
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        Product product = productService.getProductById(id);
        return ResponseEntity.ok(product);
    }  
    
    @GetMapping("/{id}/quantity")
    @Operation(summary = "Get product quantity")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Product quantity found"),
        @ApiResponse(responseCode = "404", description = "Product not found")
    })
    public ResponseEntity<Integer> getProductQuantity(@PathVariable Long id) {
        Product product = productService.getProductById(id);
        return ResponseEntity.ok(product.getQuantity());
    }

}
