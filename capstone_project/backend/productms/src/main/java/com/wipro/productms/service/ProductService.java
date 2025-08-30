package com.wipro.productms.service;

import java.util.List;

import com.wipro.productms.dto.ProductDTO;
import com.wipro.productms.entity.Product;

public interface ProductService {
	Product createProduct(ProductDTO productDTO);
    Product updateProduct(Long id, ProductDTO productDTO);
    void deleteProduct(Long id);
    List<Product> getAllProducts();
    Product getProductById(Long id);
    void updateProductQuantity(Long productId, Integer quantity); 
}
