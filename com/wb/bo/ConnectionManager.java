package com.wb.bo;

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
        	/*
            String db_file_name_prefix = "c:\\pos_db\\pos";            

            Class.forName("org.hsqldb.jdbcDriver");

            con = DriverManager.getConnection("jdbc:hsqldb:file:" + db_file_name_prefix, "sa", "");
			*/
        	
        	ResourceBundle rb = ResourceBundle.getBundle(CONNECTION_PROP);
        	
        	
            String url = rb.getString("wb.url");         
            Class.forName(rb.getString("wb.driver"));
            String userName = rb.getString("wb.username");
            String password= rb.getString("wb.password");

            con = DriverManager.getConnection(url, userName, password);
        	
        	
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
}
