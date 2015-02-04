package com.wb.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.ListSelectionModel;
import javax.swing.Timer;

import org.freixas.jcalendar.JCalendarCombo;

import com.wb.bo.DriverBO;
import com.wb.bo.FFBReceivedBO;
import com.wb.bo.OrderBy;
import com.wb.bo.ProductBO;
import com.wb.bo.TransporterBO;
import com.wb.bo.VehicleBO;

public class Mill0001UI extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Mill0001UI(final JDesktopPane dtp, JInternalFrame iFrame){
		
		setLayout(new BorderLayout());
		iFrame.setSize(900,670);
		iFrame.setVisible(true);
		
		JPanel upperPane = new JPanel();
		upperPane.setLayout(new BorderLayout());
		
		JToolBar upperPaneToolbar = new JToolBar();
		upperPaneToolbar.setFloatable(false);
		JButton submitBtn = new JButton("Submit");
		JButton weighBtn = new JButton("Weigh");
		upperPaneToolbar.add(submitBtn);
		upperPaneToolbar.add(weighBtn);
		upperPane.add(upperPaneToolbar, BorderLayout.PAGE_START);		
		
		JPanel upperPaneWB = new JPanel();
		upperPaneWB.setBackground(Color.BLACK);
		upperPaneWB.setPreferredSize(new Dimension(getWidth(), 80));
		upperPaneWB.setLayout(new FlowLayout(FlowLayout.RIGHT));
		final JLabel wbLabel = new JLabel("3000");
		wbLabel.setForeground(Color.GREEN);
		wbLabel.setFont(new Font("Arial", Font.PLAIN, 72));
		upperPaneWB.add(wbLabel);
		
		Timer t1 = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
		    	int rand = (int) (Math.random() * 15);	                	
            	wbLabel.setText((rand + 3000) + "");
            }
        });
        t1.start();
        upperPane.add(upperPaneWB, BorderLayout.CENTER);
		
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

        final JComboBox vehicleCb = new JComboBox(setupVehicleList());
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

        final JComboBox transporterCb = new JComboBox(setupTransporterList());
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

        final JComboBox productCb = new JComboBox(setupProductList());
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

        final JComboBox driverCb = new JComboBox(setupDriverList());
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

        final JTextField driverICTxt = new JTextField();
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

        final JTextField remarkArea = new JTextField();
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
		weighInPane.setPreferredSize(new Dimension(400, 120));
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

        final JCalendarCombo weighInDtTxt = new JCalendarCombo(JCalendarCombo.DISPLAY_DATE | JCalendarCombo.DISPLAY_TIME, true);
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

        final JTextField weighInKgTxt = new JTextField();
        weighInKgTxt.setEditable(false);
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
		
		weighBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				weighInKgTxt.setText(wbLabel.getText());
			}
		});
		
		submitBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				try {
					FFBReceivedBO ffbReceived = new FFBReceivedBO();
					
					ComboBoxItem vehicleItem = (ComboBoxItem) vehicleCb.getSelectedItem();
					ComboBoxItem transporterItem = (ComboBoxItem) transporterCb.getSelectedItem();
					ComboBoxItem productItem = (ComboBoxItem) productCb.getSelectedItem();
					ComboBoxItem driverItem = (ComboBoxItem) driverCb.getSelectedItem();
					String driverIC = driverICTxt.getText();
					String remarks = remarkArea.getText();
					String weighIn = weighInKgTxt.getText();
					
					if(!vehicleItem.getCode().equals("") &&
					   !transporterItem.getCode().equals("") &&
					   !productItem.getCode().equals("") &&
					   !driverItem.getCode().equals("") &&
					   !driverICTxt.getText().equals("") &&
					   !remarkArea.getText().equals("") &&
					   !weighInKgTxt.getText().equals("")){
						ffbReceived.setVehicle_no(vehicleItem.getCode());
						ffbReceived.setTransporter_code(transporterItem.getCode());
						ffbReceived.setProduct_code(productItem.getCode());
						ffbReceived.setDriver_code(driverItem.getCode());
						ffbReceived.setDriver_ic(driverIC);
						ffbReceived.setRemarks(remarks);
						ffbReceived.setWeigh_in_dt(new Timestamp(weighInDtTxt.getDate().getTime()));
						ffbReceived.setWeigh_in_tonn(new BigDecimal(weighIn));
						
						ffbReceived.insert();					
						
						JOptionPane.showMessageDialog(Mill0001UI.this, "Record successfully inserted.");	
					}
					
					vehicleCb.setSelectedIndex(0);		
					transporterCb.setSelectedIndex(0);		
					productCb.setSelectedIndex(0);			
					driverCb.setSelectedIndex(0);			
					driverICTxt.setText("");			
					remarkArea.setText("");				
					weighInKgTxt.setText("");			
					weighInDtTxt.setDate(new Date(System.currentTimeMillis()));
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
	}	
	
	private Vector setupTransporterList(){
		Vector data = new Vector();
		data.addElement(new ComboBoxItem("", ""));
		try {
			List boList = new TransporterBO().list(null, new OrderBy[]{new OrderBy(TransporterBO.FILTER_DESC)});
			if(boList != null && boList.size() > 0){
				for(int i = 0; i < boList.size(); i++){
					TransporterBO bo = (TransporterBO) boList.get(i);
					
					data.addElement(new ComboBoxItem(bo.getCode(), bo.getDescription()));
				}				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		return data;	
	}
	
	private Vector setupVehicleList(){
		Vector data = new Vector();
		data.addElement(new ComboBoxItem("", ""));
		try {
			List boList = new VehicleBO().list(null, new OrderBy[]{new OrderBy(TransporterBO.FILTER_CODE)});
			if(boList != null && boList.size() > 0){
				for(int i = 0; i < boList.size(); i++){
					VehicleBO bo = (VehicleBO) boList.get(i);
					
					data.addElement(new ComboBoxItem(bo.getCode(), bo.getDescription(), true));
				}				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		return data;	
	}
	
	private Vector setupProductList(){
		Vector data = new Vector();
		data.addElement(new ComboBoxItem("", ""));
		try {
			List boList = new ProductBO().list(null, new OrderBy[]{new OrderBy(TransporterBO.FILTER_DESC)});
			if(boList != null && boList.size() > 0){
				for(int i = 0; i < boList.size(); i++){
					ProductBO bo = (ProductBO) boList.get(i);
					
					data.addElement(new ComboBoxItem(bo.getCode(), bo.getDescription()));
				}				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		return data;	
	}
	
	private Vector setupDriverList(){
		Vector data = new Vector();
		data.addElement(new ComboBoxItem("", ""));
		try {
			List boList = new DriverBO().list(null, new OrderBy[]{new OrderBy(TransporterBO.FILTER_DESC)});
			if(boList != null && boList.size() > 0){
				for(int i = 0; i < boList.size(); i++){
					DriverBO bo = (DriverBO) boList.get(i);
					
					data.addElement(new ComboBoxItem(bo.getCode(), bo.getDescription()));
				}				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		return data;	
	}
	
}
