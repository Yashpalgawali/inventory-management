package com.example.demo.eepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ProductStock;

@Repository("prodstockrepo")
public interface ProductStockRepository extends JpaRepository<ProductStock, Long> {


}
