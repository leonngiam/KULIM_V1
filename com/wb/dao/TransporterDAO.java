package com.wb.dao;

import com.wb.bo.TransporterBO;

public class TransporterDAO extends CommonDAO{

	public TransporterDAO(){
		tableName = "transporter";
		
		tableColumn = new String[]{
				"code",
				"description",
		};
	}
	
	public TransporterBO createBusinessObject(){
		return new TransporterBO();		
	}
}
