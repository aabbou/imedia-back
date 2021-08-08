package com.imedia.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.imedia.ecom.domain.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
