package com.spring.springCourse.persistence.crud;

import com.spring.springCourse.persistence.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto,Integer> {

    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    @Query(value = "SELECT * FROM productos WHERE id_categoria = ?",nativeQuery = true)
    List<Producto> findCategoryId(int categoryId);

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);

}
