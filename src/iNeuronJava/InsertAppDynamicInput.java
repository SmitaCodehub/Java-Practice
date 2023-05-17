package iNeuronJava;
import java.io.IOException;
import in.iNeuronJava.util.*;
import java.sql.*;
import java.util.Scanner;

import in.iNeuronJava.util.JdbcUtil;

public class InsertAppDynamicInput {

	public static void main(String[] args) throws Exception {
		

		Connection connection=null;
		PreparedStatement pstmt=null;
		Scanner scan=null;
		
		try {
			connection=JdbcUtil.getJdbcConnection();
		
			String sqlInsertQuery= "insert into studentInfo(id,`fname`,`lname`, age) values(?,?,?,?)";
					
		if(connection!=null)
			pstmt= connection.prepareStatement(sqlInsertQuery);
		
		if(pstmt!=null)
		{
			 scan=new Scanner(System.in);
				
			 System.out.println("Enter the ID of studetn: ");
				int id=scan.nextInt();
				
				System.out.println("Enter the first name of studetn: ");
				String fname=scan.next();
				
				System.out.println("Enter the last name of studetn: ");
				String lname=scan.next();
				
				System.out.println("Enter the age of studetn: ");
				int age=scan.nextInt();
				
				// use precompiled query to set the values
				pstmt.setInt(1, id);
				pstmt.setString(2, fname);
				pstmt.setString(3, lname);
				pstmt.setInt(4, age);
				
				System.out.println(sqlInsertQuery);
				//execute query
				int rowCount= pstmt.executeUpdate(sqlInsertQuery);
				System.out.println("No of rows updated is :: " + rowCount);			
				
			
		}
		}catch(IOException ie) {ie.printStackTrace();}
		catch(SQLException se) {se.printStackTrace();}
		catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				JdbcUtil.cleanUp(connection, pstmt, null);
				scan.close();
				System.out.println("Closing the resource...");
				}catch(SQLException se) {se.printStackTrace();}
				}
		
		
		
	}

}
