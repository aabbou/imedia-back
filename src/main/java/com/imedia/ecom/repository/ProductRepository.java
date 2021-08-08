package com.imedia.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.imedia.ecom.domain.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
