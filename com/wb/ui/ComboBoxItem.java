package com.wb.ui;

public class ComboBoxItem {
    private String code;
    private String description;
    private boolean showCodeOnly = false;

    public ComboBoxItem(String code, String description)
    {
        this.code = code;
        this.description = description;
    }

    public ComboBoxItem(String code, String description, boolean showCodeOnly)
    {
        this.code = code;
        this.description = description;
        this.showCodeOnly = showCodeOnly;
    }

    
    public String getCode() {
		return code;
	}


	public String getDescription()
    {
        return description;
    }

    public String toString()
    {
    	if(showCodeOnly){
        	if(!code.equals("")){
                return code;    		
        	}
        	else{
        		return "";
        	}    		
    	}
    	else{
        	if(!description.equals("")){
                return description + " (" + code + ")";    		
        	}
        	else{
        		return "";
        	}    		
    	}
    }

}
