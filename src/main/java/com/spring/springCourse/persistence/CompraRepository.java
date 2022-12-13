package com.spring.springCourse.persistence;

import com.spring.springCourse.domain.Purchase;
import com.spring.springCourse.domain.repository.PurchaseRepository;
import com.spring.springCourse.persistence.crud.CompraCrudRepository;
import com.spring.springCourse.persistence.entity.Compra;
import com.spring.springCourse.persistence.mapper.PurchaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository // Se comunica directamente con la BD
public class CompraRepository implements PurchaseRepository {
    @Autowired
    private CompraCrudRepository compraCrudRepository;
    @Autowired
    private PurchaseMapper purchaseMapper;

    @Override
    public List<Purchase> getAll() {
        return purchaseMapper.toPurchases((List<Compra>) compraCrudRepository.findAll());
    }

    @Override
    public Optional<List<Purchase>> getByClient(String clientId) {
        return compraCrudRepository.findByClient(clientId)
                .map(compras -> purchaseMapper.toPurchases(compras));
    }

    @Override
    public Purchase save(Purchase purchase) {
       Compra compra = purchaseMapper.toCompra(purchase);
       compra.getComprasProductos().forEach(comprasProducto -> comprasProducto.setCompra(compra));

        return purchaseMapper.toPurchase(compraCrudRepository.save(compra));
    }
}
