package com.wb.dao;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.sql.Types;

import com.wb.bo.CommonBusinessObject;
import com.wb.bo.Criteria;
import com.wb.bo.GenUUIDUtil;
import com.wb.bo.OrderBy;

public class CommonDAO{
	public String tableName = null;
	public String[] tableColumn = null;
	
	public String prepareInsertStatement(){
		StringBuffer sql = new StringBuffer();
		
		sql.append("INSERT INTO " + tableName + " (id,cid,sid,");
		for (int i = 0; i < tableColumn.length; i++) {
			if(i == 0){
				sql.append(tableColumn[i]);
			}
			else{
				sql.append(","+tableColumn[i]);
			}
		}
		sql.append(",last_update_by, last_update_on, created_by, created_on) VALUES(");
		int len = tableColumn.length + 7;
		for (int i = 0; i < len; i++) {
			if(i == 0){
				sql.append("?");
			}
			else{
				sql.append(",?");
			}
		}
		sql.append(" );");
		
		return sql.toString();
	}
	
	public void setInsertParameter(PreparedStatement stmt, CommonBusinessObject bo) throws SQLException{
		int c = 0;
		
		String id = GenUUIDUtil.generateUUID();
		
		bo.setId(id);
		stmt.setString(++c, id);
		stmt.setString(++c, "*");
		stmt.setString(++c, "*");
		for (int i = 0; i < tableColumn.length; i++) {
			String key = tableColumn[i];
			String methodName = "get" + key.substring(0,1).toUpperCase() + key.substring(1, key.length());
			
			Method method = null;
			try {
				method = bo.getClass().getDeclaredMethod(methodName, null);
				if(method.getReturnType().toString().contains(Integer.class.toString())){
					Integer value = (Integer) method.invoke(bo, null);
					if(value != null){
						stmt.setInt(++c, value.intValue());
					}
					else{
						stmt.setNull(++c, Types.INTEGER);
					}
				}
				else if(method.getReturnType().toString().contains(String.class.toString())){
					String value = (String) method.invoke(bo, null);
					if(value != null){
						stmt.setString(++c, value);
					}
					else{
						stmt.setNull(++c, Types.VARCHAR);
					}
				}
				else if(method.getReturnType().toString().contains(Timestamp.class.toString())){
					Timestamp value = (Timestamp) method.invoke(bo, null);
					if(value != null){
						stmt.setTimestamp(++c, value);
					}
					else{
						stmt.setNull(++c, Types.TIMESTAMP);
					}										
				}
				else if(method.getReturnType().toString().contains(Date.class.toString())){
					Date value = (Date) method.invoke(bo, null);
					if(value != null){
						stmt.setDate(++c, value);
					}
					else{
						stmt.setNull(++c, Types.DATE);
					}											
				}
				else if(method.getReturnType().toString().contains(Boolean.class.toString())){
					Boolean value = (Boolean) method.invoke(bo, null);
					if(value != null){
						stmt.setBoolean(++c, value.booleanValue());
					}
					else{
						stmt.setNull(++c, Types.SMALLINT);
					}										
				}
				else if(method.getReturnType().toString().contains(BigDecimal.class.toString())){
					BigDecimal value = (BigDecimal) method.invoke(bo, null);
					if(value != null){
						stmt.setDouble(++c, value.doubleValue());
					}
					else{
						stmt.setNull(++c, Types.DECIMAL);
					}												
				}
			} 
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}		
	    stmt.setNull(++c, Types.INTEGER);
	    stmt.setNull(++c, Types.TIMESTAMP);
	    stmt.setString(++c, "leon");
	    stmt.setTimestamp(++c, new java.sql.Timestamp(System.currentTimeMillis()));
	}
	
	public String prepareUpdateStatement(){
		StringBuffer sql = new StringBuffer();
		
		sql.append("UPDATE " + tableName + " SET ");
		for (int i = 0; i < tableColumn.length; i++) {
			if(i == 0){
				sql.append(tableColumn[i] + " = ? ");
			}
			else{
				sql.append(","+tableColumn[i] + " = ? ");
			}
		}
		sql.append(", last_update_by = ? , ");
		sql.append(" last_update_on = ? ");
		sql.append(" WHERE id = ? ");
		
		return sql.toString();
	}
	
	public void setUpdateParameter(PreparedStatement stmt, CommonBusinessObject bo) throws SQLException{
		int c = 0;
		
		for (int i = 0; i < tableColumn.length; i++) {
			String key = tableColumn[i];
			String methodName = "get" + key.substring(0,1).toUpperCase() + key.substring(1, key.length());
			
			Method method = null;
			try {
				method = bo.getClass().getDeclaredMethod(methodName, null);
				if(method.getReturnType().toString().contains(Integer.class.toString())){
					Integer value = (Integer) method.invoke(bo, null);
					if(value != null){
						stmt.setInt(++c, value.intValue());
					}
					else{
						stmt.setNull(++c, Types.INTEGER);
					}
				}
				else if(method.getReturnType().toString().contains(String.class.toString())){
					String value = (String) method.invoke(bo, null);
					if(value != null){
						stmt.setString(++c, value);
					}
					else{
						stmt.setNull(++c, Types.VARCHAR);
					}
				}
				else if(method.getReturnType().toString().contains(Timestamp.class.toString())){
					Timestamp value = (Timestamp) method.invoke(bo, null);
					if(value != null){
						stmt.setTimestamp(++c, value);
					}
					else{
						stmt.setNull(++c, Types.TIMESTAMP);
					}										
				}
				else if(method.getReturnType().toString().contains(Date.class.toString())){
					Date value = (Date) method.invoke(bo, null);
					if(value != null){
						stmt.setDate(++c, value);
					}
					else{
						stmt.setNull(++c, Types.DATE);
					}											
				}
				else if(method.getReturnType().toString().contains(Boolean.class.toString())){
					Boolean value = (Boolean) method.invoke(bo, null);
					if(value != null){
						stmt.setBoolean(++c, value.booleanValue());
					}
					else{
						stmt.setNull(++c, Types.SMALLINT);
					}										
				}
				else if(method.getReturnType().toString().contains(BigDecimal.class.toString())){
					BigDecimal value = (BigDecimal) method.invoke(bo, null);
					if(value != null){
						stmt.setDouble(++c, value.doubleValue());
					}
					else{
						stmt.setNull(++c, Types.DECIMAL);
					}												
				}
			} 
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}		
	    stmt.setString(++c, "leon");
	    stmt.setTimestamp(++c, new java.sql.Timestamp(System.currentTimeMillis()));
	    stmt.setString(++c, bo.getId());
	}
	
	public String prepareDeleteStatement(){
		String sql = "DELETE FROM "+ tableName + " WHERE id = ? ";
		
		return sql;
	}
	
	public void setAttributes(ResultSet rs, ResultSetMetaData rsmd, CommonBusinessObject bo) throws SQLException{
		for(int i = 1; i <= rsmd.getColumnCount(); i++){
			String key = rsmd.getColumnName(i);
			String methodName = "set" + key.substring(0,1).toUpperCase() + key.substring(1, key.length());
			
			try {
				if(rsmd.getColumnName(i).equals("id")){
					bo.setId(rs.getString("id"));
				}
				else if(rsmd.getColumnName(i).equals("last_update_on")){
					bo.setLastUpdateOn(rs.getTimestamp("last_update_on"));
				}
				else if(rsmd.getColumnName(i).equals("last_update_by")){
					bo.setLastUpdateBy(rs.getString("last_update_by"));
				}
				else if(rsmd.getColumnName(i).equals("created_on")){
					bo.setCreatedOn(rs.getTimestamp("created_on"));
				}
				else if(rsmd.getColumnName(i).equals("created_by")){
					bo.setCreatedBy(rs.getString("created_by"));
				}
				else{
					if(rsmd.getColumnType(i) == Types.INTEGER){
						Class[] param = new Class[1];	
						param[0] = Integer.class;
						Method method = bo.getClass().getDeclaredMethod(methodName, param);
						method.invoke(bo, rs.getInt(i));
					}	
					else if(rsmd.getColumnType(i) == Types.VARCHAR){
						Class[] param = new Class[1];	
						param[0] = String.class;
						Method method = bo.getClass().getDeclaredMethod(methodName, param);
						method.invoke(bo, rs.getString(i));					
					}	
					else if(rsmd.getColumnType(i) == Types.DECIMAL){
						Class[] param = new Class[1];	
						param[0] = BigDecimal.class;
						Method method = bo.getClass().getDeclaredMethod(methodName, param);
						method.invoke(bo, rs.getBigDecimal(i));						
					}	
					else if(rsmd.getColumnType(i) == Types.DATE){
						Class[] param = new Class[1];	
						param[0] = Date.class;
						Method method = bo.getClass().getDeclaredMethod(methodName, param);
						method.invoke(bo, rs.getDate(i));						
					}
					else if(rsmd.getColumnType(i) == Types.TIMESTAMP){
						Class[] param = new Class[1];	
						param[0] = Timestamp.class;
						Method method = bo.getClass().getDeclaredMethod(methodName, param);
						method.invoke(bo, rs.getTimestamp(i));									
					}
					else if(rsmd.getColumnType(i) == Types.BOOLEAN || rsmd.getColumnType(i) == Types.SMALLINT){
						Class[] param = new Class[1];	
						param[0] = Boolean.class;
						Method method = bo.getClass().getDeclaredMethod(methodName, param);
						method.invoke(bo, rs.getBoolean(i));							
					}
					else{
						System.out.println("column name datatype not supported="+rsmd.getColumnName(i));
					}
				}
			} 
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}

	public String prepareListStatement(Criteria[] criteriaList, OrderBy[] orderByList) {
		// TODO Auto-generated method stub

		StringBuffer sql = new StringBuffer();
		
		sql.append("SELECT * FROM "+ tableName);
		
		if(criteriaList != null && criteriaList.length > 0){
			sql.append(" WHERE ");
			for (int i = 0; i < criteriaList.length; i++) {
				Criteria criteria = (Criteria) criteriaList[i];
				
				if(i > 0){
					sql.append(" AND ");
				}
				
				String defaultColumn = getDefaultColumn(criteria.getColumnIndex());
				
				if(defaultColumn != null){
					sql.append(defaultColumn + " " + criteria.getComparator() + " ? ");					
				}
				else{
					sql.append(tableColumn[criteria.getColumnIndex()] + " " + criteria.getComparator() + " ? ");						
				}
			}
			
		}
		
		if(orderByList != null && orderByList.length > 0){
			sql.append(" ORDER BY ");
			for (int i = 0; i < orderByList.length; i++) {
				OrderBy sorting = (OrderBy) orderByList[i];
				
				if(i > 0){
					sql.append(" , ");
				}
				
				String defaultColumn = getDefaultColumn(sorting.getColumnIndex());
				
				if(defaultColumn != null){
					sql.append(defaultColumn + " " + (sorting.isAscFlag() ? "ASC" : "DESC"));					
				}
				else{
					sql.append(tableColumn[sorting.getColumnIndex()] + " " + (sorting.isAscFlag() ? "ASC" : "DESC"));						
				}				
				
			}
			
		}
		
		return sql.toString();
	}

	public void setListParameter(PreparedStatement statement, Criteria[] criteriaList) throws SQLException {
		if(criteriaList != null && criteriaList.length > 0){
			for(int i = 0; i < criteriaList.length; i++){
				Criteria criteria = criteriaList[i];
				if(criteria.getValue() instanceof Integer){
					statement.setInt((i + 1), (Integer)criteria.getValue());
				}
				else if(criteria.getValue() instanceof String){
					statement.setString((i + 1), (String)criteria.getValue());
				}
				else if(criteria.getValue() instanceof Timestamp){
					statement.setTimestamp((i + 1), (Timestamp)criteria.getValue());								
				}
				else if(criteria.getValue() instanceof Date){
					statement.setDate((i + 1), (Date)criteria.getValue());	
				}
				else if(criteria.getValue() instanceof Boolean){
					statement.setBoolean((i + 1), (Boolean)criteria.getValue());							
				}
				else if(criteria.getValue() instanceof BigDecimal){
					statement.setBigDecimal((i + 1), (BigDecimal)criteria.getValue());											
				}
				else{
					System.out.println("Data Type Invalid");
				}
			}
		}
		
	}
	
	public CommonBusinessObject createBusinessObject(){
		return new CommonBusinessObject();		
	}

	public String prepareCountStatement(Criteria[] criteriaList) {
		// TODO Auto-generated method stub
		StringBuffer sql = new StringBuffer();
		
		sql.append("SELECT count(*) FROM "+ tableName);
		
		if(criteriaList != null && criteriaList.length > 0){
			for (int i = 0; i < criteriaList.length; i++) {
				Criteria criteria = (Criteria) criteriaList[i];
				
				if(i == 0){
					sql.append(" WHERE ");
				}
				else{
					sql.append(" AND ");
				}
				
				String defaultColumn = getDefaultColumn(criteria.getColumnIndex());
				
				if(defaultColumn != null){
					sql.append(defaultColumn + " " + criteria.getComparator() + " ? ");					
				}
				else{
					sql.append(tableColumn[criteria.getColumnIndex()] + " " + criteria.getComparator() + " ? ");						
				}
			}
			
		}
		
		return sql.toString();
	}

	public void setCountParameter(PreparedStatement statement, Criteria[] criteriaList) throws SQLException {
		// TODO Auto-generated method stub
		if(criteriaList != null && criteriaList.length > 0){
			for(int i = 0; i < criteriaList.length; i++){
				Criteria criteria = criteriaList[i];
				if(criteria.getValue() instanceof Integer){
					statement.setInt((i + 1), (Integer)criteria.getValue());
				}
				else if(criteria.getValue() instanceof String){
					statement.setString((i + 1), (String)criteria.getValue());
				}
				else if(criteria.getValue() instanceof Timestamp){
					statement.setTimestamp((i + 1), (Timestamp)criteria.getValue());								
				}
				else if(criteria.getValue() instanceof Date){
					statement.setDate((i + 1), (Date)criteria.getValue());	
				}
				else if(criteria.getValue() instanceof Boolean){
					statement.setBoolean((i + 1), (Boolean)criteria.getValue());							
				}
				else if(criteria.getValue() instanceof BigDecimal){
					statement.setBigDecimal((i + 1), (BigDecimal)criteria.getValue());											
				}
			}
		}
	}
	
	private String getDefaultColumn(int columnIndex){
		
		String defaultColumn = null;
		if(columnIndex == CommonBusinessObject.FILTER_ID){
			defaultColumn = "id";
		}
		else if(columnIndex == CommonBusinessObject.FILTER_LAST_UPDATE_BY){
			defaultColumn = "last_update_by";
		}
		else if(columnIndex == CommonBusinessObject.FILTER_LAST_UPDATE_ON){
			defaultColumn = "last_update_on";
		}
		else if(columnIndex == CommonBusinessObject.FILTER_CREATED_BY){
			defaultColumn = "created_by";
		}
		else if(columnIndex == CommonBusinessObject.FILTER_CREATED_ON){
			defaultColumn = "created_on";
		}
		
		return defaultColumn;
	}

	public String prepareLocateStatement(String id) {
		// TODO Auto-generated method stub

		StringBuffer sql = new StringBuffer();
		
		sql.append("SELECT * FROM "+ tableName + " WHERE id = '" + id + "'");
		
		return sql.toString();
	}

	public String prepareLocateByCodeStatement(String code) {
		// TODO Auto-generated method stub

		StringBuffer sql = new StringBuffer();
		
		sql.append("SELECT * FROM "+ tableName + " WHERE code = '" + code + "'");
		
		return sql.toString();
	}

}
