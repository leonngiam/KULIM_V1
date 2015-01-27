package com.wb.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.text.SimpleDateFormat;

import javax.swing.BorderFactory;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import org.freixas.jcalendar.JCalendarCombo;

public class Esta0001UI extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Esta0001UI(final JDesktopPane dtp, JInternalFrame iFrame){
		setLayout(new BorderLayout());
		iFrame.setSize(800,600);
		iFrame.setVisible(true);
		JPanel upperPane = new JPanel();
		upperPane.setBackground(Color.WHITE);
		upperPane.setPreferredSize(new Dimension(getWidth(), 250));
		
		JPanel masterPane = new JPanel(new GridBagLayout());
		masterPane.setBackground(Color.WHITE);
		masterPane.setPreferredSize(new Dimension(500, 250));		
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;

        JLabel estateLbl = new JLabel("Estate");
        c.weightx = 0.5;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        masterPane.add(estateLbl, c);

        JLabel estateValueLbl = new JLabel("Estate ABC");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 0;
        masterPane.add(estateValueLbl, c);

        JLabel transporterLbl = new JLabel("Transporter");
        c.weightx = 0.5;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 1;
        masterPane.add(transporterLbl, c);

        JComboBox<String> transporterCb = new JComboBox<String>();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 1;
        masterPane.add(transporterCb, c);

        JLabel vehicleLbl = new JLabel("Vehicle");
        c.weightx = 0.5;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 2;
        masterPane.add(vehicleLbl, c);

        JComboBox<String> vehicleCb = new JComboBox<String>();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 2;
        masterPane.add(vehicleCb, c);

        JLabel driverLbl = new JLabel("Driver");
        c.weightx = 0.5;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 3;
        masterPane.add(driverLbl, c);

        JTextField driverTxt = new JTextField();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 3;
        masterPane.add(driverTxt, c);

        JLabel remarkLbl = new JLabel("Remarks");
        c.weightx = 0.5;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 4;
        masterPane.add(remarkLbl, c);

        JTextArea remarkArea = new JTextArea(5,20);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 4;
        masterPane.add(remarkArea, c);
		
		upperPane.add(masterPane, BorderLayout.WEST);
		
		JPanel weighPane = new JPanel(new BorderLayout(5,5));
		weighPane.setBackground(Color.WHITE);
		
		JPanel weighInPane = new JPanel(new GridBagLayout());
		weighInPane.setPreferredSize(new Dimension(250, 100));
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
		weighOutPane.setPreferredSize(new Dimension(250, 100));
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
		upperPane.add(weighPane, BorderLayout.CENTER);
		
		add(upperPane, BorderLayout.PAGE_START);
		
		JPanel bottomPane = new JPanel(new BorderLayout());
		bottomPane.setBackground(Color.WHITE);
		bottomPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Details"));
		
		JTabbedPane bottomTab = new JTabbedPane();
		Object[][] value = new Object[20][];
		for(int i = 0; i < 20; i++){
			value[i] = new Object[]{"","","","","", new Boolean(false),""};
		}
        	Esta0001Form esta0001Form = new Esta0001Form(value);
		JTable fieldList = new JTable(esta0001Form);
		JScrollPane fieldPane = new JScrollPane(fieldList);
		fieldList.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(new JCheckBox()));
		fieldList.setFillsViewportHeight(true);		
		fieldList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		fieldList.setShowGrid(true);
		
		bottomTab.addTab("Fields", fieldPane);
		bottomTab.addTab("Seal", new JPanel());
		bottomPane.add(bottomTab, BorderLayout.CENTER);		
		
		add(bottomPane, BorderLayout.CENTER);
		
		JPanel buttonPane = new JPanel(new BorderLayout());
		buttonPane.setBackground(Color.WHITE);	
		buttonPane.add(new JButton("Submit"), BorderLayout.EAST);
		
		add(buttonPane, BorderLayout.PAGE_END);
		
	}	
	
}
