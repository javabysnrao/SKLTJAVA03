package com.skilllogic.springmvc_xml.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.skilllogic.springmvc_xml.dao.IProductDao;
import com.skilllogic.springmvc_xml.model.Product;
import com.skilllogic.springmvc_xml.queries.QueryConstants;
import com.skilllogic.springmvc_xml.rowmappers.ProductRowMapper;

public class ProductDaoImpl implements IProductDao {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public boolean savePorduct(Product product) {
		boolean flag = false;
		int i = jdbcTemplate.update(QueryConstants.PRODUCT_INSERT, product.getName(), product.getQty(),
				product.getPrice(), product.getDesc());
		if (i > 0) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}

	@Override
	public List<Product> getAllProducts() {
		return jdbcTemplate.query(QueryConstants.PRODUCT_ALL, new ProductRowMapper());
	}

}
