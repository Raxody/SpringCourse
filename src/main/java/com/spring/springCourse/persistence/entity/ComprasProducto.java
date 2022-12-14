package com.spring.springCourse.persistence.entity;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "compras_productos")
public class ComprasProducto {

    @EmbeddedId
    private ComprasProductoPK comprasProductoPK;
    private Integer cantidad;
    private Double total;
    private Boolean estado;
    @ManyToOne
    @MapsId("idCompra") //para que sepa con que id se enlazan las compras
    @JoinColumn(name = "id_compra",insertable = false,updatable = false)
    private Compra compra;
    @ManyToOne
    @JoinColumn(name = "id_producto",insertable = false,updatable = false)
    private Producto producto;



}
