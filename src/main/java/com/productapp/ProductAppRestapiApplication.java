package com.productapp;


import com.productapp.models.Product;
import com.productapp.models.TypeView;
import com.productapp.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ProductAppRestapiApplication implements CommandLineRunner {

	IProductService productService;

	@Autowired
	public void setProductService(IProductService productService) {
		this.productService = productService;
	}

	public static void main(String[] args) {
		SpringApplication.run(ProductAppRestapiApplication.class, args);
	}


	@Override

	public void run(String... args) throws Exception {
		Product product=new Product();
		product.setName("sparx men");
		product.setPrice(15000);
		product.setBrand("Myntra");
		product.setProductImg("assets/sports/shoes/shoe1.jpg");
		product.setDescription("well runnable shoes");
		product.setRating(4.5);
		product.setCategory("Sprots");
		product.setType("Shoes");
		productService.addProduct(product);
		List<String> categories=productService.getDistinctByCategory();
		categories.forEach(t-> System.out.println(t));




//		productService.addProduct(product);
	}
}
