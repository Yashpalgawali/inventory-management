package com.example.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name="tbl_product_stock")
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductStock {

	@Id
	@SequenceGenerator(name = "product_stock_seq", allocationSize = 1, initialValue = 1)
	@GeneratedValue(generator = "product_stock_seq", strategy = GenerationType.IDENTITY)
	Long productStockId;
	
	String productName;
	
	String productModel;
	
	String productColor;
	
	Long productReturn;
	
	Long productIssued;
	
	Long openingStock;
	
	Long closingStock;
	
	String remarks;
	
	String comments;
	
	Float purchaseRate;
	
	Float amount;	
	
	LocalDate dateAdded;
}
