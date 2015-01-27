package com.wb.ui;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.wb.bo.MenuProperties;

public class MainUI extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private static final String MENU_XML = "menu.xml";

    final JDesktopPane editors = new JDesktopPane();
	
	public MainUI(){
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    screenSize.width -= 42;
	    screenSize.height -= 42;
	    setSize(screenSize);
	    setLocation(0, 0);

		JMenuBar menuBar = new JMenuBar();
	    setJMenuBar(menuBar);
		JMenu fileMenu = new JMenu("File");
		
		JMenuItem cp = new JMenuItem("Change Password");
		fileMenu.add(cp);
		
		cp.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
			    
				new ChangePasswordDialog(MainUI.this);
			}
		});
		fileMenu.add(cp);
		JMenuItem logOutMenuItem = new JMenuItem("Log Out");
		fileMenu.add(logOutMenuItem);        	
		logOutMenuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				setVisible(false);
				dispose();
			}
		});
		menuBar.add(fileMenu);

        HashMap<String, List<String>> module = new HashMap<String, List<String>>();
        String[] viewSet = generateProgram(module);
        
        for (final String view : viewSet) {
        	
        	List<String> programList = module.get(view);

        	if(programList != null && programList.size() > 0){
        		JMenu component = new JMenu(view);
                for (Iterator<String> iterator = programList.iterator(); iterator.hasNext();) {
                	
                	String programId = iterator.next();
                	
                	JMenuItem menuItem = new JMenuItem(MenuProperties.getProgramName(programId));
                	menuItem.setActionCommand(programId);
                	
                	menuItem.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent evt) {
							// TODO Auto-generated method stub
							createEditorInstance(evt.getActionCommand());
					    	  
						}
					});
                	component.add(menuItem);
                }
                menuBar.add(component);
        	}	        	
        }
	    
	    setContentPane(editors);

	    setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
    
    private String[] generateProgram(HashMap<String, List<String>> module){
        String[] viewSet = null;
		try {
	        DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
	        InputStream in = this.getClass().getResourceAsStream(MENU_XML);
	        Document document = docBuilder.parse(in);

	        NodeList nodeList = document.getDocumentElement().getChildNodes();
	        List<String> componentList = new ArrayList<String>();
	        for (int i = 0; i < nodeList.getLength(); i++) {
	        	if (nodeList.item(i).getNodeType() == Node.ELEMENT_NODE) {
		        	Element el = (Element) nodeList.item(i);
		            
		            if(el.getNodeName().contains("main-component")){
	
			            String component = MenuProperties.getProgramName(el.getAttribute("code"));
			            
			            NodeList childList = el.getElementsByTagName("program");
			            
			            List<String> programList = new ArrayList<String>();
			            for(int j =0; j < childList.getLength(); j++){
			            	String programId = childList.item(j).getTextContent();
			            	
			            	//if(accessRight.contains(programId)){
				            	programList.add(programId);
			            	//}
			            }
			            
			            if(programList != null && programList.size() > 0){
				            module.put(component, programList);
				            componentList.add(component);			            	
			            }
		            }
	        	}
	        }
	        viewSet = new String[componentList.size()];
	        
	        for(int i = 0; i < componentList.size(); i++){
	        	viewSet[i] = componentList.get(i);
	        }
	        
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
    	return viewSet;
    	
    }

    public void createEditorInstance(String programId) {    	
    	JInternalFrame pane = new JInternalFrame(MenuProperties.getProgramName(programId), true, true, true, true);
        String className = "com.wb.ui." + programId.substring(0, 1).toUpperCase() + programId.substring(1,8) + "UI";
        JPanel view = null;
        try {
        	Constructor con = Class.forName(className).getConstructor(new Class[]{JDesktopPane.class, JInternalFrame.class});
        	
        	Object[] insta = new Object[]{editors, pane};
        	view = (JPanel) con.newInstance(insta);
	        
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
        
        if(view == null){
          view = new JPanel();    
          pane.setSize(200,200);
          pane.setLocation(0, 0);
          pane.setVisible(true);    	
        }
		
        pane.setContentPane(view);
//        pane.setSize(800,600);
//        pane.setLocation(0, 0);
//        pane.setVisible(true);
        editors.add(pane);
        pane.moveToFront();
    }
}
