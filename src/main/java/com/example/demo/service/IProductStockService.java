package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.ProductStock;

public interface IProductStockService {

	public void createProductStock(ProductStock productStock);
	
	public ProductStock getProductStockById(Long prodStockId);
	
	public List<ProductStock> getAllProductStocks();
	
	public List<ProductStock> getAllProductStocksByMonth();
	
	public List<ProductStock> getAllProductStocksByYear();
	
	public void updateProductStock(ProductStock productStock);
}
