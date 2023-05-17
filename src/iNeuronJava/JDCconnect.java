package iNeuronJava;
import java.sql.*;
import java.io.*;

public class JDCconnect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection=null;
		Statement statement=null;
		ResultSet resultSet=null;
		try {
		// Step 1: Load and register driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded Successfully...");
		
		//Step 2  Estalish connection with database
		String url="JDBC:mysql://localhost:3306/student";
		String username="smita";
		String password="root123";
		
		connection=DriverManager.getConnection(url,username,password);
		System.out.println("Connection Established Successfully...");
		System.out.println("The implemented  class is " +connection.getClass().getName());
		
		
		//Step3 Create Statement Object and send a query
		String sqlSelectQuery = "select id, fname, lname, age from studentInfo";
		statement=connection.createStatement();
		System.out.println("The implemented  class is " + statement.getClass().getName());
		
		resultSet=statement.executeQuery(sqlSelectQuery);
		System.out.println("The implemented  class is " +resultSet.getClass().getName());
		
		System.out.println();
		System.out.println("ID Firstname lastname age ");
		
		//Step 4 Process the result set
		while(resultSet.next())
		{Integer id =resultSet.getInt(1);
		 String firstname= resultSet.getString(2);
		 String lastname = resultSet.getString(3);
		 Integer age =resultSet.getInt(4);
		 
		 System.out.println(id +"\t"+firstname + "\t" +lastname+"\t" +age);
		 
			
		}
		}
		catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}catch(SQLException se)
		{
			se.printStackTrace();
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally {
			//closing resources
			if(connection!=null)
			{
				try {
				connection.close();
				System.out.println();
				}
			
			catch(SQLException se)
				{
				se.printStackTrace();
				}
		}
			}
		
	}

}
