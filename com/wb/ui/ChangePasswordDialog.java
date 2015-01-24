package com.wb.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class ChangePasswordDialog extends JDialog implements FocusListener,ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ChangePasswordDialog(MainUI parent) {
		// TODO Auto-generated constructor stub
		try {
			this.getContentPane().setBackground(Color.WHITE);
			setTitle("Change Password");

		    JPanel pane = new JPanel();
		    java.awt.GridLayout layGridLayout = new java.awt.GridLayout();
		    layGridLayout.setColumns(2);
		    layGridLayout.setHgap(1);
		    layGridLayout.setRows(4); 
		    layGridLayout.setVgap(2);
		    pane.setLayout(layGridLayout);
		    JLabel oldPassLbl = new JLabel("Old Password");
		    oldPassLbl.setPreferredSize(new Dimension(100,20));
		    pane.add(oldPassLbl);
		    pane.add(new JPasswordField());
		    pane.add(new JLabel("New Password"));
		    pane.add(new JPasswordField());
		    pane.add(new JLabel("Confirm Password"));
		    pane.add(new JPasswordField());
		    pane.add(new JLabel(""));
		    pane.add(new JButton("Update"));
		    pane.setBackground(Color.WHITE);
				    
			add(pane);
			setLocationRelativeTo(null);
			setModal(true);
			setSize(new Dimension(500,300));
			pack();
			setVisible(true);		
			setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void focusGained(FocusEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void focusLost(FocusEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
