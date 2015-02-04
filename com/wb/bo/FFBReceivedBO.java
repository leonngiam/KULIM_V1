package com.wb.bo;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class FFBReceivedBO extends CommonBusinessObject{
	
	public static int FILTER_VEHICLE_NO = 0;
	public static int FILTER_TRANSPORTER_CODE = 1;
	public static int FILTER_PRODUCT_CODE = 2;
	public static int FILTER_DRIVER_CODE = 3;
	public static int FILTER_DRIVER_IC = 4;
	public static int FILTER_REMARKS = 5;
	public static int FILTER_WEIGH_IN_DT = 6;
	public static int FILTER_WEIGH_IN_TONN = 7;
	public static int FILTER_WEIGH_OUT_DT = 8;
	public static int FILTER_WEIGH_OUT_TONN = 9;
	
	private String vehicle_no;
	private String transporter_code;
	private String product_code;
	private String driver_code;
	private String driver_ic;
	private String remarks;
	private Timestamp weigh_in_dt;
	private BigDecimal weigh_in_tonn;
	private Timestamp weigh_out_dt;
	private BigDecimal weigh_out_tonn;
	public String getVehicle_no() {
		return vehicle_no;
	}
	public void setVehicle_no(String vehicle_no) {
		this.vehicle_no = vehicle_no;
	}
	public String getTransporter_code() {
		return transporter_code;
	}
	public void setTransporter_code(String transporter_code) {
		this.transporter_code = transporter_code;
	}
	public String getProduct_code() {
		return product_code;
	}
	public void setProduct_code(String product_code) {
		this.product_code = product_code;
	}
	public String getDriver_code() {
		return driver_code;
	}
	public void setDriver_code(String driver_code) {
		this.driver_code = driver_code;
	}
	public String getDriver_ic() {
		return driver_ic;
	}
	public void setDriver_ic(String driver_ic) {
		this.driver_ic = driver_ic;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Timestamp getWeigh_in_dt() {
		return weigh_in_dt;
	}
	public void setWeigh_in_dt(Timestamp weigh_in_dt) {
		this.weigh_in_dt = weigh_in_dt;
	}
	public BigDecimal getWeigh_in_tonn() {
		return weigh_in_tonn;
	}
	public void setWeigh_in_tonn(BigDecimal weigh_in_tonn) {
		this.weigh_in_tonn = weigh_in_tonn;
	}
	public Timestamp getWeigh_out_dt() {
		return weigh_out_dt;
	}
	public void setWeigh_out_dt(Timestamp weigh_out_dt) {
		this.weigh_out_dt = weigh_out_dt;
	}
	public BigDecimal getWeigh_out_tonn() {
		return weigh_out_tonn;
	}
	public void setWeigh_out_tonn(BigDecimal weigh_out_tonn) {
		this.weigh_out_tonn = weigh_out_tonn;
	}
	
	
}
