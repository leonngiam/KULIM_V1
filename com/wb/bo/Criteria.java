package com.wb.bo;

public class Criteria {
	
	private int columnIndex;
	
	private String comparator;
	
	private Object value;
	
	
	public Criteria(int columnIndex, String comparator, Object value){
		this.columnIndex = columnIndex;
		this.comparator = comparator;
		this.value = value;
	}


	public int getColumnIndex() {
		return columnIndex;
	}


	public void setColumnIndex(int columnIndex) {
		this.columnIndex = columnIndex;
	}


	public String getComparator() {
		return comparator;
	}


	public void setComparator(String comparator) {
		this.comparator = comparator;
	}


	public Object getValue() {
		return value;
	}


	public void setValue(Object value) {
		this.value = value;
	}
	
	
}
