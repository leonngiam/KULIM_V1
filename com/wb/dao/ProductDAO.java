package com.wb.dao;

import com.wb.bo.ProductBO;

public class ProductDAO extends CommonDAO{

	public ProductDAO(){
		tableName = "product";
		
		tableColumn = new String[]{
				"code",
				"description",
		};
	}
	
	public ProductBO createBusinessObject(){
		return new ProductBO();		
	}
}
