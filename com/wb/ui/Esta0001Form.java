package com.wb.ui;

import javax.swing.table.AbstractTableModel;

public class Esta0001Form extends AbstractTableModel {

	Object[][] data = null;
	
	public Esta0001Form(Object[][] data) {
		// TODO Auto-generated constructor stub
		this.data = data;
	}

	private static final long serialVersionUID = 1L;

	private final String[] columnNames = { 
			"Division",
			"Field", 
			"Block",
			"Harvest Date Time", 
			"Bunch Count",
			"Loose Fruit",
			"Weight"
	};

    public int getRowCount() {
        return data.length;
    }

    public int getColumnCount() {
        return columnNames.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        return data[rowIndex][columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return data[0][columnIndex].getClass();
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return true;
    }

}
