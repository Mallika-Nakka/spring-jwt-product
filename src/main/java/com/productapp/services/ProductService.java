package com.productapp.services;


import com.productapp.models.CAtegoryView;
import com.productapp.models.Product;
import com.productapp.models.TypeView;
import com.productapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService{

    private ProductRepository productRepository;
    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void updateProduct(Product product) {
    productRepository.save(product);
    }

    @Override
    public void deleteProduct(int productId) {
    productRepository.deleteById(productId);
    }

    @Override
    public Product getById(int productId) {
        return productRepository.findById(productId);
    }

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> getByBrand(String brand) {
        return productRepository.findByBrand(brand);
    }

    @Override
    public List<Product> getByCategory(String category) {
        return productRepository.findByCategory(category);
    }

    @Override
    public List<Product> getByType(String type) {
        return productRepository.findByType(type);
    }

    @Override
    public List<TypeView> findDistinctTypeByCategory(String category) {
        return productRepository.findDistinctTypeByCategory(category);
    }

    @Override
    public List<String> getDistinctByCategory() {
        return productRepository.findDistinctByCategory();

    }
}
