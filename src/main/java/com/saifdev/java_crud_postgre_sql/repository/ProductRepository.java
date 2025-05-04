package com.saifdev.java_crud_postgre_sql.repository;

import com.saifdev.java_crud_postgre_sql.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
