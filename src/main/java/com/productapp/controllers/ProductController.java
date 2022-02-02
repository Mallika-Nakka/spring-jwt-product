package com.productapp.controllers;

import com.productapp.models.CAtegoryView;
import com.productapp.models.Product;
import com.productapp.models.TypeView;
import com.productapp.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("product-api")
public class ProductController {
     private IProductService productService;

     @Autowired
    public void setProductService(IProductService productService) {
        this.productService = productService;
    }
    @PostMapping("/products")
    Product addProduct(@RequestBody Product product){
         return productService.addProduct(product);
    }
    @PutMapping("/products")
    void updateProduct(@RequestBody Product product){
         productService.updateProduct(product);
    }
    @DeleteMapping("/products/delete/id/{productid}")
    void deleteProduct(@PathVariable("productid") int productId){
        productService.deleteProduct(productId);
    }
    @GetMapping("/products")
    List<Product> getAll(){
         return productService.getAll();
    }
    @GetMapping("/id/{productid}")
    public Product getById(@PathVariable("productid") int productId) {
        return productService.getById(productId);
    }
    @GetMapping("/products/brand/{brand}")
    List<Product> getByBrand(@PathVariable("brand") String brand){
         return productService.getByBrand(brand);
    }
    @GetMapping("/products/category/{category}")
    List<Product> getByCategory(String category){
        return productService.getByCategory(category);
    }

    @GetMapping("/products/type/{type}")
    List<Product> findByType(@PathVariable("type") String type){
         return productService.getByType(type);
    }
    @GetMapping("/products/categorytype/{category}")
    List<TypeView> findTypeByCategory(@PathVariable("category") String category){
         return  productService.findDistinctTypeByCategory(category);
    }
    @GetMapping("/products/category/distinct")
    List<String> findDistinctCategory(){
        return productService.getDistinctByCategory();
    }
}
