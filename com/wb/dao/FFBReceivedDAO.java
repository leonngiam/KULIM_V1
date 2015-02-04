package com.wb.dao;

import com.wb.bo.FFBReceivedBO;

public class FFBReceivedDAO extends CommonDAO{

	public FFBReceivedDAO(){
		tableName = "daily_ffb_received";
		
		tableColumn = new String[]{
				"vehicle_no",
				"transporter_code",
				"product_code",
				"driver_code",
				"driver_ic",
				"remarks",
				"weigh_in_dt",
				"weigh_in_tonn",
				"weigh_out_dt",
				"weigh_out_tonn"
		};
	}
	
	public FFBReceivedBO createBusinessObject(){
		return new FFBReceivedBO();		
	}
}
