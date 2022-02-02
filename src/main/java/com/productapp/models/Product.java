package com.productapp.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Product {
    @Column(name="productid")
    @Id
    @GeneratedValue(generator = "product_seq",strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "product_seq",sequenceName = "product_seq",initialValue = 1,allocationSize = 1)
    private Integer productId;
    private String name;
    private double price;
    private String category;
    private String brand;
    private String productImg;
    private double rating;
    private String description;
    private String type;


}
