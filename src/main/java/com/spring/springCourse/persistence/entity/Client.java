package com.spring.springCourse.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "clientes")
@Getter
@Setter
public class Client {
    @Id
    @Column(name = "id")
    private String categoryId;
    @Column(name = "nombre")
    private String name;
    @Column(name = "apellidos")
    private String lastName;
    @Column(name = "celular")
    private Integer cellphone;
    @Column(name = "direccion")
    private String adress;
    @Column(name = "correo_electronico")
    private String email;

}
