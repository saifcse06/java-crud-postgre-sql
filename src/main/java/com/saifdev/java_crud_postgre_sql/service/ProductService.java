package com.saifdev.java_crud_postgre_sql.service;

import com.saifdev.java_crud_postgre_sql.model.Product;
import com.saifdev.java_crud_postgre_sql.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public List<Product> getAll(){
        return productRepository.findAll();
    }

    public Product save(Product product){
        return productRepository.save(product);
    }

    public Optional<Product> getById(Long id){
        return productRepository.findById(id);
    }

    public Product update(Long id, Product updateProduct){
        return productRepository.findById(id).map(product -> {
            product.setName(updateProduct.getName());
            product.setPrice(updateProduct.getPrice());
            return productRepository.save(product);
        }).orElseThrow(()-> new RuntimeException("Product not found"));
    }

    public void deleteById(Long id){
        productRepository.deleteById(id);
    }
}
