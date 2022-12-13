package com.spring.springCourse.web.controller;

import com.spring.springCourse.domain.Purchase;
import com.spring.springCourse.domain.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.EntityResponse;

import java.net.http.HttpResponse;
import java.util.List;

@RestController
@RequestMapping("/purchases")
public class PurchaseController {
    @Autowired
    PurchaseService purchaseService;

    @GetMapping("")
    ResponseEntity<List<Purchase>> getAll() {
        return purchaseService.getAll().size() != 0 ?
                new ResponseEntity<>(purchaseService.getAll(), HttpStatus.OK) :
                new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @GetMapping("/client/{clientId}")
    ResponseEntity<List<Purchase>> getByClient(@PathVariable("clientId") String clientId){
        List<Purchase> purchases =  purchaseService.getByClient(clientId).orElse(null);
        return !purchases.isEmpty() && purchases != null ?
                new ResponseEntity<>(purchases, HttpStatus.OK) :
                new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @PostMapping("/save")
    ResponseEntity<Purchase> save(@RequestBody Purchase purchase){
        return new ResponseEntity<>(purchaseService.save(purchase),HttpStatus.CREATED);
    }
}
