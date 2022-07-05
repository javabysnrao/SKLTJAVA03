package com.skilllogic.springmvc_xml.service.impl;

import java.util.List;

import com.skilllogic.springmvc_xml.dao.IProductDao;
import com.skilllogic.springmvc_xml.model.Product;
import com.skilllogic.springmvc_xml.service.IProductService;

public class ProductServiceImpl implements IProductService {
	
	private IProductDao iProductDao;

	public void setiProductDao(IProductDao iProductDao) {
		this.iProductDao = iProductDao;
	}

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
