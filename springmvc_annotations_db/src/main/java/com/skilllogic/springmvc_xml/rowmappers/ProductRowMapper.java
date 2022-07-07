package com.skilllogic.springmvc_xml.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.skilllogic.springmvc_xml.model.Product;

public class ProductRowMapper implements RowMapper<Product> {

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		Product product = new Product();
		product.setId(rs.getInt("prod_id"));
		product.setName(rs.getString("prod_name"));
		product.setQty(rs.getInt("prod_qty"));
		product.setPrice(rs.getDouble("prod_price"));
		product.setDesc(rs.getString("prod_desc"));
		return product;
	}

}
