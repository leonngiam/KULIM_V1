package com.wb.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

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
			setTitle("WeighBridge");
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			add(panel);
			
			panel.setLayout(null);

			JLabel brandLabel = new JLabel("Weighbridge System");
			brandLabel.setFont(new Font("Serif", Font.PLAIN, 24));
			brandLabel.setForeground(Color.WHITE);
			brandLabel.setBounds(110, 60, 280, 35);
			panel.add(brandLabel);

			JLabel userLabel = new JLabel("Username");
			userLabel.setFont(new Font("Serif", Font.PLAIN, 14));
			userLabel.setBounds(100, 100, 80, 25);
			panel.add(userLabel);

			JTextField userText = new JTextField(20);
			userText.setBounds(160, 100, 160, 25);
			panel.add(userText);

			JLabel passwordLabel = new JLabel("Password");
			passwordLabel.setFont(new Font("Serif", Font.PLAIN, 14));
			passwordLabel.setBounds(100, 130, 80, 25);
			panel.add(passwordLabel);

			JPasswordField passwordText = new JPasswordField(20);
			passwordText.setBounds(160, 130, 160, 25);
			panel.add(passwordText);

			JButton loginButton = new JButton("Login");
			loginButton.setFont(new Font("Serif", Font.PLAIN, 14));
			loginButton.setBounds(240, 160, 80, 25);
			panel.add(loginButton);			
			
			loginButton.addActionListener(new ActionListener() {
				
				@Override 
	            public void actionPerformed(ActionEvent e)
	            {
					dispose();
					new MainUI();
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
