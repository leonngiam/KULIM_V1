package com.wb.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class MainUI extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MainUI(){
		
		try {
			this.getContentPane().setBackground( Color.WHITE );
			setTitle("WeighBridge");
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			setLayout(new BorderLayout());
			JMenuBar menuBar = new JMenuBar();
			JMenu fileMenu = new JMenu("File");
			fileMenu.add(new JMenuItem("Change Password"));
			fileMenu.add(new JMenuItem("Log Out"));
			menuBar.add(fileMenu);
			
			JMenu estateMenu = new JMenu("Estate");
			estateMenu.add(new JMenuItem("Weighbridge FFB"));
			estateMenu.add(new JMenuItem("Weighbridge Miscellaneous"));
			menuBar.add(estateMenu);
			
			JMenu millMenu = new JMenu("Mill");
			millMenu.add(new JMenuItem("Weighbridge FFB"));
			millMenu.add(new JMenuItem("Weighbridge Miscellaneous"));
			menuBar.add(millMenu);
			
			JMenu confMenu = new JMenu("Configuration");
			confMenu.add(new JMenuItem("Estate Master"));
			confMenu.add(new JMenuItem("Field Master"));
			confMenu.add(new JMenuItem("Mill Master"));
			confMenu.add(new JMenuItem("Truck Master"));
			menuBar.add(confMenu);
			
			JMenu adminMenu = new JMenu("Admin");
			adminMenu.add(new JMenuItem("User Account"));
			menuBar.add(adminMenu);
			
			add(menuBar, BorderLayout.PAGE_START);
			
			JPanel centerPane = new JPanel();
			centerPane.setLayout(new FlowLayout());
			centerPane.setBackground(Color.WHITE);
			add(centerPane, BorderLayout.CENTER);
			
			this.setSize(800, 600);
			this.setLocationRelativeTo(null);
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
		}
	}
}
