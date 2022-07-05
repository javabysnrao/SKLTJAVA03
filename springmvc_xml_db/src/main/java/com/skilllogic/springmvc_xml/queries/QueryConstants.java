package com.skilllogic.springmvc_xml.queries;

public interface QueryConstants {
     String PRODUCT_INSERT="insert into products(prod_id,prod_name,prod_qty,prod_price,prod_desc) values(prod_sequence.nextVal,?,?,?,?)";
     String PRODUCT_ALL="select * from products";
}
