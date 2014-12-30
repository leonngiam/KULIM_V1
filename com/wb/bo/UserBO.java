package com.wb.bo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserBO extends CommonBusinessObject{
	
	public static int FILTER_USER_LOGIN = 0;
	public static int FILTER_USER_NAME = 1;
	public static int FILTER_PASSWORD = 2;
	
	private String user_login;
	private String user_name;
	private String password;
	
	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

	public String getUser_login() {
		return user_login;
	}

	public void setUser_login(String user_login) {
		this.user_login = user_login;
	}

	public UserBO locateByUserName(String userName) throws SQLException{
		Connection con = null;
    	UserBO bo = null;
		PreparedStatement statement = null;
        try
        {                
            con = new ConnectionManager().getConnection();
            statement = con.prepareStatement("SELECT id, user_name, password, user_login FROM "+getDAO().tableName+" WHERE user_login = ? ");
            statement.setString(1, userName);
            
            ResultSet rs = statement.executeQuery();
            while (rs.next())
            {
            	bo = new UserBO();
            	bo.setId(rs.getString(1));
            	bo.setUser_name(rs.getString(2));
            	bo.setPassword(rs.getString(3));
            	bo.setUser_login(rs.getString(4));
            }

            statement.close();

        } 
        catch (SQLException ex)
        {
            ex.printStackTrace();
        } 
        finally{
        	if(con != null){
        		con.close();
        	}
        	if(statement != null){
        		statement.close();
        	}        	        	
        }
        
        return bo;
    }

}
