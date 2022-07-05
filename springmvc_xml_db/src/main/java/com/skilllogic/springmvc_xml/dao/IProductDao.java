package com.skilllogic.springmvc_xml.dao;

import java.util.List;

import com.skilllogic.springmvc_xml.model.Product;

public interface IProductDao {
	public boolean savePorduct(Product product);
	   public List<Product> getAllProducts();
}
