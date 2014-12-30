package com.wb.bo;

public class OrderBy {
	
	private int columnIndex;
	
	private boolean ascFlag;
	
	public OrderBy(int columnIndex){
		this.columnIndex = columnIndex;
		this.ascFlag = true;		
	}	
	
	public OrderBy(int columnIndex, boolean ascFlag){
		this.columnIndex = columnIndex;
		this.ascFlag = ascFlag;
	}


	public int getColumnIndex() {
		return columnIndex;
	}


	public void setColumnIndex(int columnIndex) {
		this.columnIndex = columnIndex;
	}


	public boolean isAscFlag() {
		return ascFlag;
	}


	public void setAscFlag(boolean ascFlag) {
		this.ascFlag = ascFlag;
	}
	
}
