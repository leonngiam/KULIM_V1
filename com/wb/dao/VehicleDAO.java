package com.wb.dao;

import com.wb.bo.VehicleBO;

public class VehicleDAO extends CommonDAO{

	public VehicleDAO(){
		tableName = "vehicle";
		
		tableColumn = new String[]{
				"code",
				"description",
		};
	}
	
	public VehicleBO createBusinessObject(){
		return new VehicleBO();		
	}
}
