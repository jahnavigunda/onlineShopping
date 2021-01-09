package com.onlineshopping.product.service;

import com.onlineshopping.product.ProductRepository;
import com.onlineshopping.product.dto.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public String addProduct(Product product) {
        productRepository.save(product);
        return "success";
    }

    public List<Product> listAllProducts() {
        return productRepository.findAll();
    }

    public List<Product> productCategoryList(String category) {
        return productRepository.findByCategory(category);
    }

    public Product productById(Integer id) {
        return productRepository.findById(id).get();
    }

    public String updateProduct(Product product) {
        productRepository.save(product);
        return "Product updated successfully";

    }

    public String deleteProductById(Integer id) {
        productRepository.deleteById(id);
        return "Product deleted successfully";
    }
}
