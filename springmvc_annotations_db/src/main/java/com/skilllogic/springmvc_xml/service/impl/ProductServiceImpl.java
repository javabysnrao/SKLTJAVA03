package com.skilllogic.springmvc_xml.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skilllogic.springmvc_xml.dao.IProductDao;
import com.skilllogic.springmvc_xml.model.Product;
import com.skilllogic.springmvc_xml.service.IProductService;

@Service
public class ProductServiceImpl implements IProductService {
	
	@Autowired
	private IProductDao iProductDao;

	

	@Override
	public boolean savePorduct(Product product) {
		boolean flag = iProductDao.savePorduct(product);//calling dao method
		return flag;
	}

	@Override
	public List<Product> getAllProducts() {
		return iProductDao.getAllProducts();
	}

}
