package com.wb.bo;

public class VehicleBO extends CommonBusinessObject{
	
	public static int FILTER_CODE = 0;
	public static int FILTER_DESC = 1;
	
	private String code;
	private String description;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
