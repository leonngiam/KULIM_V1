package com.wb.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.ResourceBundle;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.wb.bo.ConnectionManager;
import com.wb.bo.Criteria;
import com.wb.bo.LoginInfo;
import com.wb.bo.UserBO;

public class LoginUI extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String args[]) {
		new LoginUI();
	}
	
	public LoginUI(){
		
		try {
	        
			setUndecorated(true);
			ImagePanel panel = new ImagePanel(LoginUI.class.getResource("/resources/background.jpg"));
			this.getContentPane().setBackground( Color.WHITE );
			setTitle("Plantation Management System");
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			add(panel);
			
			panel.setLayout(null);

			JLabel brandLabel = new JLabel("Plantation Management System");
			brandLabel.setFont(new Font("Serif", Font.PLAIN, 20));
			brandLabel.setForeground(Color.WHITE);
			brandLabel.setBounds(85, 60, 280, 35);
			panel.add(brandLabel);

			JLabel userLabel = new JLabel("Username");
			userLabel.setFont(new Font("Serif", Font.PLAIN, 14));
			userLabel.setBounds(100, 100, 80, 25);
			panel.add(userLabel);

			final JTextField userText = new JTextField(20);
			userText.setBounds(160, 100, 160, 25);
			panel.add(userText);
			userText.addKeyListener(new KeyListener() {
				
				@Override
				public void keyTyped(KeyEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void keyReleased(KeyEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void keyPressed(KeyEvent e) {
					// TODO Auto-generated method stub


                    if(e.getKeyCode() == (KeyEvent.VK_F3) && e.isControlDown()){
                    	final JDialog connDialog = new JDialog(LoginUI.this, "DB Connection");
                    	connDialog.setSize(new Dimension(400,200));
                    	connDialog.setBackground(Color.WHITE);
                    	connDialog.setModal(true);
                    	connDialog.setLayout(new GridLayout(5,2));
                    	
                        String driver = null;
                        String url = null;
                        String userName = null;
                        String password= null;
                    	
                    	String[] connInfo = ConnectionManager.getConnectionFile();
                    	
                    	if(connInfo != null){
                    		driver = connInfo[0];
	                        url = connInfo[1];
	                        userName = connInfo[2];
	                        password= connInfo[3];               		
                    	}
                    	else{
                        	
                        	ResourceBundle rb = ResourceBundle.getBundle("jconfig");
                        	
                            driver = rb.getString("wb.driver");
                            url = rb.getString("wb.url");
                            userName = rb.getString("wb.username");
                            password= rb.getString("wb.password");                    		
                    	}
                    	
                    	connDialog.setBackground(Color.WHITE);
                    	connDialog.add(new JLabel("Driver"));
                    	final JTextField driverTxt = new JTextField(driver);
                    	connDialog.add(driverTxt);
                    	connDialog.add(new JLabel("URL"));
                    	final JTextField urlTxt = new JTextField(url);
                    	urlTxt.setColumns(10);
                    	connDialog.add(urlTxt);
                    	connDialog.add(new JLabel("Username"));
                    	final JTextField userNameTxt = new JTextField(userName);
                    	connDialog.add(userNameTxt);
                    	connDialog.add(new JLabel("Password"));
                    	final JPasswordField passwordTxt = new JPasswordField(password);
                    	connDialog.add(passwordTxt);
                    	connDialog.add(new JLabel(""));
                    	JButton submitBtn = new JButton("Submit");
                    	connDialog.add(submitBtn);
                    	submitBtn.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								ConnectionManager.createConnectionFile(driverTxt.getText(), urlTxt.getText(), userNameTxt.getText(), passwordTxt.getText());
								connDialog.setVisible(false);
								connDialog.dispose();
							}
						});
                    	
                    	connDialog.setResizable(false);
                    	connDialog.pack();
                    	connDialog.setVisible(true);
                    	connDialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
                    }  					
				}
			});

			JLabel passwordLabel = new JLabel("Password");
			passwordLabel.setFont(new Font("Serif", Font.PLAIN, 14));
			passwordLabel.setBounds(100, 130, 80, 25);
			panel.add(passwordLabel);

			final JPasswordField passwordText = new JPasswordField(20);
			passwordText.setBounds(160, 130, 160, 25);
			panel.add(passwordText);
			
			final JButton loginButton = new JButton("Login");
			passwordText.addKeyListener(
		            new KeyListener() {
						
						@Override
						public void keyTyped(KeyEvent e) {
							// TODO Auto-generated method stub
						}
						
						@Override
						public void keyReleased(KeyEvent e) {
							// TODO Auto-generated method stub
						}
						
						@Override
						public void keyPressed(KeyEvent e) {
							// TODO Auto-generated method stub


		                    if(e.getKeyCode() == KeyEvent.VK_ENTER){
		                        loginButton.doClick();
		                    }  
						}
					}		            
		    );
			loginButton.setFont(new Font("Serif", Font.PLAIN, 14));
			loginButton.setBounds(240, 160, 80, 25);
			panel.add(loginButton);			
			
			loginButton.addActionListener(new ActionListener() {
				
				@Override 
	            public void actionPerformed(ActionEvent e)
	            {
					if(!userText.getText().equals("") && !passwordText.getText().equals("")){
						try {
							int activeUser = new UserBO().count(new Criteria[]{
									new Criteria(UserBO.FILTER_USER_LOGIN, "=", userText.getText()),
									new Criteria(UserBO.FILTER_PASSWORD, "=", passwordText.getText())
							});
							if(activeUser > 0){
								UserBO activeBO = new UserBO().locateByUserName(userText.getText());
								LoginInfo.createLogin(activeBO.getId());
								dispose();
								new MainUI();								
							}	
							else{
								JOptionPane.showMessageDialog(LoginUI.this, "Username or Password incorrect", null, JOptionPane.ERROR_MESSAGE);
							}
						} 
						catch (Exception e1) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(LoginUI.this, "Connection Failed", null, JOptionPane.ERROR_MESSAGE);
							e1.printStackTrace();
						}				
					}
					else{
						dispose();
						new MainUI();									
					}
	            }
	        });	
			
			JLabel copyrightLabel = new JLabel("Copyright 2014 | All rights reserved");
			copyrightLabel.setFont(new Font("Serif", Font.PLAIN, 10));
			copyrightLabel.setBounds(140, 220, 180, 25);
			panel.add(copyrightLabel);						
			
			this.setSize(430, 250);
			this.setLocationRelativeTo(null);
			setResizable(false);
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
