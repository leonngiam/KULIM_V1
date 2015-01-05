package com.wb.bo;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class LoginInfo {
	
	public static void createLogin(String userId){
		FileOutputStream out = null;
		try {
			byte dataToWrite[] = userId.getBytes();
			out = new FileOutputStream("C:\\loginInfo.txt");
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
	
	public static String getLoginInfo(){
 
		BufferedReader br = null;
		String userId = null;
 
		try {
			String sCurrentLine;
 
			br = new BufferedReader(new FileReader("C:\\loginInfo.txt"));
 
			while ((sCurrentLine = br.readLine()) != null) {
				userId = sCurrentLine;
			}
 
		} 
		catch (IOException e) {
			e.printStackTrace();
		} 
		finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}	
		
		return userId;
	}

}
