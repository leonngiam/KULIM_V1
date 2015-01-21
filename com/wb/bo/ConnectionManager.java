package com.wb.bo;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectionManager {

    private static final String CONNECTION_PROP = "jconfig";
	
	public Connection getConnection()
    {
		Connection con = null;
        try
        {   
        	String[] connInfo = getConnectionFile();
        	
        	if(connInfo != null){       
                Class.forName(connInfo[0]);         	
                String url = connInfo[1];     
                String userName = connInfo[2];
                String password= connInfo[3];

                con = DriverManager.getConnection(url, userName, password);
        	}
        	else{
            	
            	ResourceBundle rb = ResourceBundle.getBundle(CONNECTION_PROP);
            	
                Class.forName(rb.getString("wb.driver"));
                String url = rb.getString("wb.url");
                String userName = rb.getString("wb.username");
                String password= rb.getString("wb.password");

                con = DriverManager.getConnection(url, userName, password);        		
        	}
        	
        	
        } 
        catch (SQLException ex)
        {
            ex.printStackTrace();
        } 
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
        
        return con;
    }
	
	public static String[] getConnectionFile(){
 
		BufferedReader br = null;
		String[] connInfo = null;
 
		try {
			String sCurrentLine;
 
			br = new BufferedReader(new FileReader("D:\\jconfig.properties"));

			connInfo = new String[4];
			int count = 0;
			while ((sCurrentLine = br.readLine()) != null) {
				//userId = sCurrentLine;
				connInfo[count] = sCurrentLine;
				count++;
			}
 
		} 
		catch (Exception e) {
			e.printStackTrace();
		} 
		finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}	
		
		return connInfo;
	}
	
	public static void createConnectionFile(String driver, String url, String username, String password){
		FileOutputStream out = null;
		try {
			StringBuffer connInfo = new StringBuffer();
			connInfo.append(driver + "\n");
			connInfo.append(url + "\n");
			connInfo.append(username + "\n");
			connInfo.append(password + "\n");
			
			byte dataToWrite[] = connInfo.toString().getBytes();
			out = new FileOutputStream("D:\\jconfig.properties");
			out.write(dataToWrite);
			out.close();
		}  
		catch (Exception e) {
			e.printStackTrace();
		} 
		finally {
			try {
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}				
	}
}
