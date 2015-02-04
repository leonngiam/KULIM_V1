package com.wb.dao;

import com.wb.bo.DriverBO;

public class DriverDAO extends CommonDAO{

	public DriverDAO(){
		tableName = "driver";
		
		tableColumn = new String[]{
				"code",
				"description",
		};
	}
	
	public DriverBO createBusinessObject(){
		return new DriverBO();		
	}
}
