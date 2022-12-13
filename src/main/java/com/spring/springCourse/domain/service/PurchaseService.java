package com.spring.springCourse.domain.service;

import com.spring.springCourse.domain.Purchase;
import com.spring.springCourse.domain.repository.PurchaseRepository;
import com.spring.springCourse.persistence.entity.Compra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PurchaseService {
    @Autowired
    PurchaseRepository purchaseRepository;
    public List<Purchase> getAll() {
        return purchaseRepository.getAll();
    }
    public Optional<List<Purchase>> getByClient(String clientId) {
        return purchaseRepository.getByClient(clientId);
    }
    public Purchase save(Purchase purchase) {
        return purchaseRepository.save(purchase);
    }
}
