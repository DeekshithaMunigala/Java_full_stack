package com.wipro.productms.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.wipro.productms.dto.OrderEvent;
import com.wipro.productms.dto.ProductDTO;
import com.wipro.productms.entity.Product;
import com.wipro.productms.repo.ProductRepo;
import com.wipro.productms.service.ProductService;
import com.wipro.productms.exception.ResourceNotFoundException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
    
    @Autowired
    private ProductRepo productRepo;
    
    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    
    @Value("${upload.path}")
    private String uploadPath;
    
    @Override
    public Product createProduct(ProductDTO productDTO) {
        Product product = new Product();
        product.setName(productDTO.getName());
        product.setDescription(productDTO.getDescription());
        product.setPrice(productDTO.getPrice());
        product.setQuantity(productDTO.getQuantity());
               
        if (productDTO.getImage() != null && !productDTO.getImage().isEmpty()) {
            try {
                String fileName = saveImage(productDTO.getImage());
                product.setImageUrl(fileName);
            } catch (IOException e) {
                throw new RuntimeException("Failed to save image", e);
            }
        }
        
        return productRepo.save(product);
    }
    
    @Override
    public Product updateProduct(Long id, ProductDTO productDTO) {
        Product existingProduct = productRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found with id: " + id));
        
        existingProduct.setName(productDTO.getName());
        existingProduct.setDescription(productDTO.getDescription());
        existingProduct.setPrice(productDTO.getPrice());
        existingProduct.setQuantity(productDTO.getQuantity());        
        
        if (productDTO.getImage() != null && !productDTO.getImage().isEmpty()) {
            try {
               
                if (existingProduct.getImageUrl() != null) {
                    deleteImage(existingProduct.getImageUrl());
                }
                
                String fileName = saveImage(productDTO.getImage());
                existingProduct.setImageUrl(fileName);
            } catch (IOException e) {
                throw new RuntimeException("Failed to save image", e);
            }
        }
        
        return productRepo.save(existingProduct);
    }
    
    @Override
    public void deleteProduct(Long id) {
        Product product = productRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found with id: " + id));        
        
        if (product.getImageUrl() != null) {
            deleteImage(product.getImageUrl());
        }
        
        productRepo.delete(product);
    }
    
    @Override
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }
    
    @Override
    public Product getProductById(Long id) {
        return productRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found with id: " + id));
    }
    
    @Override
    @Transactional
    public void updateProductQuantity(Long productId, Integer quantityChange) {
        try {
            Product product = getProductById(productId);
            
            int newQuantity = product.getQuantity() + quantityChange;
            if (newQuantity < 0) {
                throw new RuntimeException("Insufficient inventory for product: " + productId);
            }
            
            product.setQuantity(newQuantity);
            productRepo.save(product);
            
            System.out.println("Updated product: " + productId + 
                              ", quantity change: " + quantityChange + 
                              ", new quantity: " + newQuantity);
        } catch (Exception e) {
            System.err.println("Error updating product quantity: " + e.getMessage());
            throw e;  // fixed the space issue
        }
    }


    
    private String saveImage(MultipartFile image) throws IOException {
        
        Path uploadDir = Paths.get(uploadPath);
        if (!Files.exists(uploadDir)) {
            Files.createDirectories(uploadDir);
        }
                
        String fileName = UUID.randomUUID().toString() + "_" + image.getOriginalFilename();
        Path filePath = uploadDir.resolve(fileName);        
        
        Files.copy(image.getInputStream(), filePath);
        
        return fileName;
    }
    
    private void deleteImage(String fileName) {
        try {
            Path filePath = Paths.get(uploadPath).resolve(fileName);
            Files.deleteIfExists(filePath);
        } catch (IOException e) {
            throw new RuntimeException("Failed to delete image", e);
        }
    }


	
}