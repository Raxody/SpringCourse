package com.spring.springCourse.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name = "productos")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_producto")
    private Integer productId;
    @Column(name = "nombre")
    private String name;
    @Column(name = "id_categoria")
    private Integer categoryId;
    @Column(name = "codigo_barras")
    private String barCode;
    @Column(name = "precio_venta")
    private Double priceSale;
    @Column(name = "cantidad_stock")
    private Integer quantityStock;
    @Column(name = "estado")
    private boolean estate;

}
