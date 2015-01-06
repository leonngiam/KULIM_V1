package com.wb.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import com.wb.bo.UserBO;

public class Admn0001UI extends JPanel{

	private static final long serialVersionUID = 1L;

	public Admn0001UI(){
        setLayout(new BorderLayout(5,5));
        Admn0001Form admn0001Form = new Admn0001Form();
		JTable userList = new JTable(admn0001Form);
		JScrollPane userListPane = new JScrollPane(userList);
		userList.setFillsViewportHeight(true);
		userListPane.setPreferredSize(new Dimension(getWidth(), 250));
		hideColumn(userList);
		userList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		userList.setShowGrid(true);
        add(userListPane, BorderLayout.PAGE_START);		
        
        try {
			List boList = new UserBO().list();
			
			if(boList != null && boList.size() > 0){
				for(int i = 0; i < boList.size(); i++){
					UserBO bo = (UserBO) boList.get(i);
					String[] value = new String[admn0001Form.getColumnCount()];
					copyBusinessObjectToForm(bo, value);
					
					admn0001Form.addRow(value, i, i);
				}				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
        
        JPanel userFormPane = new JPanel(new BorderLayout());
        userFormPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "User Form"));
        JPanel userForm = new JPanel();
        userForm.setPreferredSize(new Dimension(400,250));
        userForm.setBackground(Color.WHITE);
        
        userForm.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;

        JLabel userLoginLbl = new JLabel("User Login");
        c.weightx = 0.5;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        userForm.add(userLoginLbl, c);

        final JTextField userLoginTxt = new JTextField();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 0;
        userForm.add(userLoginTxt, c);

        JLabel userNameLbl = new JLabel("User Name");
        c.weightx = 0.5;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 1;
        c.weightx = 0;   
        c.anchor = GridBagConstraints.CENTER; 
        userForm.add(userNameLbl, c);

        final JTextField userNameTxt = new JTextField();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 1;
        userForm.add(userNameTxt, c);

        JLabel passwordLbl = new JLabel("Password");
        c.weightx = 0.5;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 2;
        userForm.add(passwordLbl, c);

        final JPasswordField passwordTxt = new JPasswordField();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 2;
        userForm.add(passwordTxt, c);

        JLabel adminFlgLbl = new JLabel("Admin Flag");
        c.weightx = 0.5;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 3;
        userForm.add(adminFlgLbl, c);

        String[] cbValue = { "", "Yes", "No" };
        final JComboBox<String> adminFlgCb = new JComboBox<String>(cbValue);   
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 3;
        userForm.add(adminFlgCb, c);

        JButton submitBtn = new JButton("Submit");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 4;
        userForm.add(submitBtn, c);
        
        submitBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(!userLoginTxt.getText().equals("") 
						&& !userNameTxt.getText().equals("")
						&& !passwordTxt.getText().equals("")
						&& !adminFlgCb.getSelectedItem().equals("")){
					
					try {
						
						UserBO bo = new UserBO();
						bo.setUser_login(userLoginTxt.getText().trim());
						bo.setUser_name(userNameTxt.getText().trim());
						bo.setPassword(passwordTxt.getText());
						
						bo.insert();
						
						resetForm(userLoginTxt, userNameTxt, passwordTxt, adminFlgCb);
						JOptionPane.showMessageDialog(Admn0001UI.this, "Record successfully inserted.");
					} 
					catch (Exception e) {
						// TODO Auto-generated catch block
						JOptionPane.showMessageDialog(Admn0001UI.this, e.getStackTrace()[0], "System Information", JOptionPane.ERROR_MESSAGE);
						e.printStackTrace();					
					}	
				}
			}
		});

        JLabel whiteSpace = new JLabel("");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 0;       
        c.weighty = 1.0;   
        c.anchor = GridBagConstraints.PAGE_END; 
        c.insets = new Insets(10,0,0,0);  
        c.gridx = 1;       
        c.gridy = 5;       
        userForm.add(whiteSpace, c);
        userFormPane.add(userForm, BorderLayout.CENTER);
        add(userFormPane, BorderLayout.WEST);
		
	}
	
	private void hideColumn(JTable userList){
		userList.getColumn("Password").setWidth(0);
		userList.getColumn("Password").setMinWidth(0);
		userList.getColumn("Password").setMaxWidth(0);
		userList.getColumn("ID").setWidth(0);
		userList.getColumn("ID").setMinWidth(0);
		userList.getColumn("ID").setMaxWidth(0);		
	}	
	
	private void copyBusinessObjectToForm(UserBO bo, String[] value){		
		int c=0;
		value[c++] = bo.getId();
		value[c++] = bo.getUser_login();
		value[c++] = bo.getUser_name();
		value[c++] = bo.getPassword();
		value[c++] = "No";		
	}
	
	private void resetForm(JTextField userLoginTxt, JTextField userNameTxt, JPasswordField passwordTxt, JComboBox<String> adminFlgCb){
		userLoginTxt.setText("");
		userNameTxt.setText("");
		passwordTxt.setText("");
		adminFlgCb.setSelectedIndex(0);
	}
}
