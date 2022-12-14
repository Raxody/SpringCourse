package com.spring.springCourse.persistence.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "compras")
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra")
    private Integer idCompra;
    @Column(name = "id_cliente")
    private String idCliente;
    private LocalDateTime fecha;
    @Column(name = "medio_pago")
    private String medioPago;
    private String comentario;
    private String estado;
    @ManyToOne
    @JoinColumn(name = "id_cliente",insertable = false,updatable = false)
    private Cliente cliente;
    @OneToMany(mappedBy = "compra", cascade = {CascadeType.ALL})
    private List<ComprasProducto> comprasProductos;

}
