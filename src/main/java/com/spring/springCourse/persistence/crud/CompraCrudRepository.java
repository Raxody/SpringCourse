package com.spring.springCourse.persistence.crud;

import com.spring.springCourse.persistence.entity.Compra;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CompraCrudRepository extends CrudRepository<Compra, Integer> {

    @Query(value = "SELECT * FROM compras WHERE id_cliente = ?",nativeQuery = true)
    Optional<List<Compra>> findByClient(String idCliente);



}
