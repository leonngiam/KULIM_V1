package com.wb.bo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.wb.dao.CommonDAO;

public class CommonBusinessObject {
	
	public static int FILTER_ID = 1001;
	public static int FILTER_LAST_UPDATE_ON = 1004;
	public static int FILTER_LAST_UPDATE_BY = 1005;
	public static int FILTER_CREATED_ON = 1006;
	public static int FILTER_CREATED_BY = 1007;
	
	public String id;
	public Timestamp lastUpdateOn;
	public String lastUpdateBy;
	public Timestamp createdOn;
	public String createdBy;

	public Timestamp getLastUpdateOn() {
		return lastUpdateOn;
	}

	public void setLastUpdateOn(Timestamp lastUpdateOn) {
		this.lastUpdateOn = lastUpdateOn;
	}

	public String getLastUpdateBy() {
		return lastUpdateBy;
	}

	public void setLastUpdateBy(String lastUpdateBy) {
		this.lastUpdateBy = lastUpdateBy;
	}

	public Timestamp getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void insert() throws SQLException{
		Connection con = null;
		PreparedStatement statement = null;
		String sql = null;
        try
        {   
        	CommonDAO dao = getDAO();
            con = new ConnectionManager().getConnection();
            sql = dao.prepareInsertStatement();
            statement = con.prepareStatement(sql);
            dao.setInsertParameter(statement, this);
            
            statement.executeUpdate();

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
    }
	
	public void update() throws SQLException{
		Connection con = null;
		PreparedStatement statement = null;
		String sql = null;
        try
        {   
        	CommonDAO dao = getDAO();
            con = new ConnectionManager().getConnection();
            sql = dao.prepareUpdateStatement();
            statement = con.prepareStatement(sql);
            dao.setUpdateParameter(statement, this);
            
            statement.executeUpdate();

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
    }
	
	public void delete() throws SQLException{
		Connection con = null;
		PreparedStatement statement = null;
		String sql = null;
        try
        {   
            con = new ConnectionManager().getConnection();
            sql = getDAO().prepareDeleteStatement();
            statement = con.prepareStatement(sql);
            statement.setString(1, id);
            
            statement.executeUpdate();

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
    }
	
	public int count() throws SQLException{
		return count(null);	
	}
	
	public int count(Criteria[] criteriaList) throws SQLException{
		Connection con = null;
		PreparedStatement statement = null;
		String sql = null;
		int count = 0;
        try
        {   
        	CommonDAO dao = getDAO();
            con = new ConnectionManager().getConnection();
            sql = dao.prepareCountStatement(criteriaList);
            statement = con.prepareStatement(sql);
            dao.setCountParameter(statement, criteriaList);
            
            ResultSet rs = statement.executeQuery();
            
            while (rs.next())
            {
            	count = rs.getInt(1);
            }

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
		
		return count;		
	}
	
	public CommonBusinessObject locate(String id) throws SQLException{
		Connection con = null;
		PreparedStatement statement = null;
		String sql = null;
		CommonBusinessObject bo = null;
        try
        {   
        	CommonDAO dao = getDAO();
            con = new ConnectionManager().getConnection();
            sql = dao.prepareLocateStatement(id);
            
            statement = con.prepareStatement(sql);
            
            ResultSet rs = statement.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();

        	
            while (rs.next())
            {
            	bo = dao.createBusinessObject();
            	
            	dao.setAttributes(rs, rsmd, bo);
            	
            }

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
	
	public CommonBusinessObject locateByCode(String code) throws SQLException{
		Connection con = null;
		PreparedStatement statement = null;
		String sql = null;
		CommonBusinessObject bo = null;
        try
        {   
        	CommonDAO dao = getDAO();
            con = new ConnectionManager().getConnection();
            sql = dao.prepareLocateByCodeStatement(code);
            
            statement = con.prepareStatement(sql);
            
            ResultSet rs = statement.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();

        	
            while (rs.next())
            {
            	bo = dao.createBusinessObject();
            	
            	dao.setAttributes(rs, rsmd, bo);
            	
            }

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
	
	public List<CommonBusinessObject> list() throws SQLException{
		return list(null);	
	}
	
	public List<CommonBusinessObject> list(Criteria[] criteriaList) throws SQLException{
		
		return list(criteriaList, null);		
	}
	
	public List<CommonBusinessObject> list(Criteria[] criteriaList, OrderBy[] orderByList) throws SQLException{
		Connection con = null;
		PreparedStatement statement = null;
		String sql = null;
		List<CommonBusinessObject> boList = new ArrayList<CommonBusinessObject>();
        try
        {   
        	CommonDAO dao = getDAO();
            con = new ConnectionManager().getConnection();
            sql = dao.prepareListStatement(criteriaList, orderByList);
            //System.out.println("sql="+sql);
            
            statement = con.prepareStatement(sql);
            dao.setListParameter(statement, criteriaList);
            
            ResultSet rs = statement.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            
            while (rs.next())
            {
            	CommonBusinessObject bo = dao.createBusinessObject();
            	
            	dao.setAttributes(rs, rsmd, bo);
            	
            	boList.add(bo);
            }

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
		
		return boList;		
	}
	
	public CommonDAO getDAO(){
		CommonDAO dao = null;
		
		String className = this.getClass().getName();

        int i = className.lastIndexOf(".bo.");
        String daoClassName = className.substring(0,i) + ".dao." + className.substring(i + 4, className.length() - 2) + "DAO";
        
        try {
			dao = (CommonDAO) Class.forName(daoClassName).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
        
		return dao;
	}
}
