package com.wb.ui;

import java.util.Vector;

import javax.swing.table.AbstractTableModel;

public class Admn0001Form extends AbstractTableModel {

	private static final long serialVersionUID = 1L;

	private final String[] columnNames = { 
			"ID",
			"User Login", 
			"User Name",
			"Password", 
			"Admin Flag" 
	};

	Vector<String[]> data = new Vector<String[]>();

	public void setValueAt(Object value, int row, int col) {
		String newValue = (String) value;
		String[] rowData = (String[]) data.elementAt(row);
		rowData[col] = newValue;
		fireTableCellUpdated(row, col);
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public String getColumnName(int column) {
		return columnNames[column];
	}

	public int getRowCount() {
		return data.size();
	}

	public Object getValueAt(int row, int column) {
		String[] rowData = (String[]) data.elementAt(row);
		return rowData[column];
	}

	public void addRow(String[] value, int startRow, int endRow) {
		data.addElement(value);
		fireTableRowsInserted(startRow, endRow);
	}

	public void deleteRows(int startRow, int endRow) {
		data.removeAllElements();
		fireTableRowsDeleted(startRow, endRow);
	}

	public void deleteRow(int startRow, int endRow) {
		data.removeElementAt(startRow);
		fireTableRowsDeleted(startRow, endRow);
	}

}
