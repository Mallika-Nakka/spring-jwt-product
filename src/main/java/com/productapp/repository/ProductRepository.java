package com.productapp.repository;

import com.productapp.models.CAtegoryView;
import com.productapp.models.Product;
import com.productapp.models.TypeView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
    List<Product> findByCategory(String category);
    List<Product> findByBrand(String brand);
    Product findById(int productId);
    List<Product> findByType(String type);

   // @Query("select distinct p.type from Product p where p.category=?1")
    List<TypeView> findDistinctTypeByCategory(String category);

    @Query("select distinct category from Product")
    List<String> findDistinctByCategory();

}
