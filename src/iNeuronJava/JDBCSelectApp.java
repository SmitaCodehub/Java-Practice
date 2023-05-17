package iNeuronJava;

import java.sql.Connection;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.IOException;


import in.iNeuronJava.util.*;

public class JDBCSelectApp {

	public static void main(String[] args) throws IOException  {
		
		Connection connection=null;
		Statement statement=null;
		ResultSet resultSet=null;
		
	  try 
	  { 
		  connection= JdbcUtil.getJdbcConnection();
		  if(connection!=null)
			 statement=connection.createStatement();
		  
		  if(statement!=null)
			  resultSet=statement.executeQuery("select id, fname,lname, age fron studentInfo");
		  
		  if(resultSet!=null) {
			  System.out.printf("%2d%14s%12s%15d", "ID","Name","LNAme","Age");
		  System.out.println();
		  while(resultSet.next())
		  {
			  System.out.printf("%2d %15s%15S%15d", resultSet.getInt(1), resultSet.getString(2),resultSet.getString(3),resultSet.getInt(4));
		  }
		 }
	}catch (SQLException se) {
		se.printStackTrace();
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		try {
			JdbcUtil.cleanUp(connection, statement, resultSet);
			
			System.out.println("closing the resources...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	  }
		  
	  
	}

}
