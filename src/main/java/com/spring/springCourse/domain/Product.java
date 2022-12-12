package com.spring.springCourse.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {

    private int productId;
    private String name;
    private int categoryId;
    private double priceSale;
    private int quantityStock;
    private boolean active;
    private Category category;

}
