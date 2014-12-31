package com.wb.bo;

import java.util.ResourceBundle;

public class MenuProperties {
    private static final String MENU_PROP = "menu";
    
    public static String getProperty(String key){
    	ResourceBundle rb = ResourceBundle.getBundle(MENU_PROP);
    	
    	return rb.getString(key);
    }
    
    public static String getProgramName(String programId){
    	ResourceBundle rb = ResourceBundle.getBundle(MENU_PROP);
    	
    	return rb.getString(programId + ".name");
    }
}
