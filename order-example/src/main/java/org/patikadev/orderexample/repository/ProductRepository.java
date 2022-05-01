package org.patikadev.orderexample.repository;


import org.patikadev.orderexample.model.Customer;
import org.patikadev.orderexample.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
