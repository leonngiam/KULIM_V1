package com.wb.dao;

import com.wb.bo.UserBO;

public class UserDAO extends CommonDAO{

	public UserDAO(){
		tableName = "accounts";
		
		tableColumn = new String[]{
				"user_login",
				"user_name",
				"password",
		};
	}
	
	public UserBO createBusinessObject(){
		return new UserBO();		
	}
}
