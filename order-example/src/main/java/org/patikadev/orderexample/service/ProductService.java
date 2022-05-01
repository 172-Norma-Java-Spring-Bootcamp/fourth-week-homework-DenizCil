package org.patikadev.orderexample.service;

import org.patikadev.orderexample.model.Product;

import java.util.List;

public interface ProductService {

    //void create(CustomerDTO customerDTO);

    void saveProduct(Product product);

    Product getProductById(int id);

    List<Product> getAllProduct();

    void deleteProductById(int id);



}

