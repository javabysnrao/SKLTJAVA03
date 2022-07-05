package com.skilllogic.springmvc_xml.service;

import java.util.List;

import com.skilllogic.springmvc_xml.model.Product;

public interface IProductService {
   public boolean savePorduct(Product product);
   public List<Product> getAllProducts();
}
