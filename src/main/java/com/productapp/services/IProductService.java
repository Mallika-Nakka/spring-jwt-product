package com.productapp.services;


import com.productapp.models.CAtegoryView;
import com.productapp.models.Product;
import com.productapp.models.TypeView;

import java.util.List;

public interface IProductService {
    Product addProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(int productId);
    Product getById(int productId);
    List<Product> getAll();
    List<Product> getByBrand(String brand);
    List<Product> getByCategory(String category);
    List<Product> getByType(String type);
    List<TypeView> findDistinctTypeByCategory(String category);

    List<String> getDistinctByCategory();
}
