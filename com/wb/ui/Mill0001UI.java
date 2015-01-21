package com.wb.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.text.SimpleDateFormat;

import javax.swing.BorderFactory;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import org.freixas.jcalendar.JCalendarCombo;

public class Mill0001UI extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Mill0001UI(){
		setLayout(new BorderLayout());
		JPanel upperPane = new JPanel();
		upperPane.setBackground(Color.BLACK);
		upperPane.setPreferredSize(new Dimension(getWidth(), 80));
		upperPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		JLabel wbLabel = new JLabel("3000");
		wbLabel.setForeground(Color.GREEN);
		wbLabel.setFont(new Font("Arial", Font.PLAIN, 72));
		upperPane.add(wbLabel);
		
		add(upperPane, BorderLayout.PAGE_START);
		
		JPanel centerPane = new JPanel();
		centerPane.setBackground(Color.WHITE);
		centerPane.setLayout(new GridBagLayout());	
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;

        int cc = 0;
        JLabel vehicleLbl = new JLabel("Vehicle No.");
        c.weightx = 0.5;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = cc;
        c.gridwidth = 1;
        centerPane.add(vehicleLbl, c);

        JComboBox<String> vehicleCb = new JComboBox<String>();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = cc++;
        c.gridwidth = 3;
        centerPane.add(vehicleCb, c);   

        JLabel transporterLbl = new JLabel("Transporter Code");
        c.weightx = 0.5;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = cc;
        c.gridwidth = 1;
        centerPane.add(transporterLbl, c);

        JComboBox<String> transporterCb = new JComboBox<String>();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = cc++;
        c.gridwidth = 3;
        centerPane.add(transporterCb, c);

        JLabel productLbl = new JLabel("Product Code");
        c.weightx = 0.5;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = cc;
        c.gridwidth = 1;
        centerPane.add(productLbl, c);

        JComboBox<String> productCb = new JComboBox<String>();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = cc++;
        c.gridwidth = 3;
        centerPane.add(productCb, c);

        JLabel driverLbl = new JLabel("Driver Code");
        c.weightx = 0.5;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = cc;
        c.gridwidth = 1;
        centerPane.add(driverLbl, c);

        JComboBox<String> driverCb = new JComboBox<String>();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = cc;
        c.gridwidth = 1;
        centerPane.add(driverCb, c);

        JLabel driverICLbl = new JLabel("IC No.");
        c.weightx = 0.5;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 2;
        c.gridy = cc;
        c.gridwidth = 1;
        centerPane.add(driverICLbl, c);

        JTextField driverICTxt = new JTextField();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 3;
        c.gridy = cc++;
        c.gridwidth = 1;
        centerPane.add(driverICTxt, c);
        
        JLabel remarkLbl = new JLabel("Remarks");
        c.weightx = 0.5;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = cc;
        c.gridwidth = 1;
        centerPane.add(remarkLbl, c);

        JTextArea remarkArea = new JTextArea(8,20);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = cc;
        c.gridwidth = 3;
        centerPane.add(remarkArea, c);
		
		add(centerPane, BorderLayout.CENTER);
		
		JPanel weighPane = new JPanel(new BorderLayout(5,5));
		weighPane.setBackground(Color.WHITE);
		
		JPanel weighInPane = new JPanel(new GridBagLayout());
		weighInPane.setPreferredSize(new Dimension(400, 140));
		weighInPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Weigh In"));
		weighInPane.setBackground(Color.WHITE);
        GridBagConstraints weighInConstraint = new GridBagConstraints();
        weighInConstraint.fill = GridBagConstraints.HORIZONTAL;

        JLabel weighInDtLabel = new JLabel("Date");
        weighInConstraint.weightx = 0.5;
        weighInConstraint.fill = GridBagConstraints.HORIZONTAL;
        weighInConstraint.gridx = 0;
        weighInConstraint.gridy = 0;
        weighInPane.add(weighInDtLabel, weighInConstraint);

        JCalendarCombo weighInDtTxt = new JCalendarCombo(JCalendarCombo.DISPLAY_DATE | JCalendarCombo.DISPLAY_TIME, true);
        weighInDtTxt.setDateFormat(new SimpleDateFormat("yyyy/MM/dd HH:mm"));
        weighInDtTxt.setBackground(Color.WHITE);
        weighInDtTxt.setEditable(true);
        
        weighInConstraint.fill = GridBagConstraints.HORIZONTAL;
        weighInConstraint.weightx = 0.5;
        weighInConstraint.gridx = 1;
        weighInConstraint.gridy = 0;
        weighInPane.add(weighInDtTxt, weighInConstraint);

        JLabel weighInKgLabel = new JLabel("Weight (Kg)");
        weighInConstraint.weightx = 0.5;
        weighInConstraint.fill = GridBagConstraints.HORIZONTAL;
        weighInConstraint.gridx = 0;
        weighInConstraint.gridy = 1;
        weighInPane.add(weighInKgLabel, weighInConstraint);

        JTextField weighInKgTxt = new JTextField();
        weighInConstraint.fill = GridBagConstraints.HORIZONTAL;
        weighInConstraint.weightx = 0.5;
        weighInConstraint.gridx = 1;
        weighInConstraint.gridy = 1;
        weighInPane.add(weighInKgTxt, weighInConstraint);
		
		weighPane.add(weighInPane, BorderLayout.PAGE_START);
		
		JPanel weighOutPane = new JPanel(new GridBagLayout());
		weighOutPane.setPreferredSize(new Dimension(250, 150));
		weighOutPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Weigh Out"));
		weighOutPane.setBackground(Color.WHITE);
        GridBagConstraints weighOutConstraint = new GridBagConstraints();
        weighOutConstraint.fill = GridBagConstraints.HORIZONTAL;

        JLabel weighOutDtLabel = new JLabel("Date");
        weighOutConstraint.weightx = 0.5;
        weighOutConstraint.fill = GridBagConstraints.HORIZONTAL;
        weighOutConstraint.gridx = 0;
        weighOutConstraint.gridy = 0;
        weighOutPane.add(weighOutDtLabel, weighOutConstraint);

        JCalendarCombo weighOutDtTxt = new JCalendarCombo(JCalendarCombo.DISPLAY_DATE | JCalendarCombo.DISPLAY_TIME, true);
        weighOutDtTxt.setDateFormat(new SimpleDateFormat("yyyy/MM/dd HH:mm"));
        weighOutDtTxt.setBackground(Color.WHITE);
        weighOutDtTxt.setEditable(true);
        weighOutConstraint.fill = GridBagConstraints.HORIZONTAL;
        weighOutConstraint.weightx = 0.5;
        weighOutConstraint.gridx = 1;
        weighOutConstraint.gridy = 0;
        weighOutPane.add(weighOutDtTxt, weighOutConstraint);

        JLabel weighOutKgLabel = new JLabel("Weight (Kg)");
        weighOutConstraint.weightx = 0.5;
        weighOutConstraint.fill = GridBagConstraints.HORIZONTAL;
        weighOutConstraint.gridx = 0;
        weighOutConstraint.gridy = 1;
        weighOutPane.add(weighOutKgLabel, weighOutConstraint);

        JTextField weighOutKgTxt = new JTextField();
        weighOutConstraint.fill = GridBagConstraints.HORIZONTAL;
        weighOutConstraint.weightx = 0.5;
        weighOutConstraint.gridx = 1;
        weighOutConstraint.gridy = 1;
        weighOutPane.add(weighOutKgTxt, weighOutConstraint);
		
		weighPane.add(weighOutPane, BorderLayout.CENTER);
		add(weighPane, BorderLayout.EAST);
		
		JPanel bottomPane = new JPanel(new BorderLayout());
		bottomPane.setPreferredSize(new Dimension(500,300));
		bottomPane.setBackground(Color.WHITE);
		bottomPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Details"));
		
		JTabbedPane bottomTab = new JTabbedPane();
		Object[][] value = new Object[20][];
		for(int i = 0; i < 20; i++){
			value[i] = new Object[]{"","","","","", new Boolean(false),""};
		}
        Mill0001Form mill0001Form = new Mill0001Form(value);
		JTable fieldList = new JTable(mill0001Form);
		JScrollPane fieldPane = new JScrollPane(fieldList);
		fieldList.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(new JCheckBox()));
		fieldList.setFillsViewportHeight(true);		
		fieldList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		fieldList.setShowGrid(true);
		
		bottomTab.addTab("Fields", fieldPane);
		bottomTab.addTab("Seal", new JPanel());
		bottomPane.add(bottomTab, BorderLayout.CENTER);		
		
		add(bottomPane, BorderLayout.PAGE_END);
		
		
		
		
		
	}	
	
}
