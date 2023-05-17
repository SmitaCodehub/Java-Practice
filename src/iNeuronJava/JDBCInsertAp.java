package iNeuronJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.io.*;


public class JDBCInsertAp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//JDBC4.X autoloading feature is enabled.
	 

		// Step2. Establish the Connection
		String url = "jdbc:mysql:///student";
		String user = "smita";
		String password = "root123";
		Connection connection = DriverManager.getConnection(url, user,password);

		System.out.println("CONNECTION object created...");
		// Step3. Create statement Object and send the Query
		Statement statement = connection.createStatement();
		System.out.println("STATEMENT object created...");
		
		// Step4. Execute the Query and Process the resultSet
		
	
		
	//String sqlInsertQuery = "insert into studentInfo(`fname`,`lname`, age)values('hardhik','p', 23)";
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the ID of studetn: ");
		int id=scan.nextInt();
		System.out.println("Enter the first name of studetn: ");
		String fname=scan.next();
		System.out.println("Enter the last name of studetn: ");
		String lname=scan.next();
		System.out.println("Enter the age of studetn: ");
		int age=scan.nextInt();
		String sqlInsertQuery = String.format("insert into studentInfo(id,`fname`,`lname`, age)values (%d,'%s','%s',%d)",id, fname, lname,age);

System.out.println(sqlInsertQuery);

int rowAffected = statement.executeUpdate(sqlInsertQuery);

System.out.println("No of rows affected is :: " + rowAffected);
		
		// String sqlUpdate= " update studentInfo set lname='perth' where id=2";
		//	int rowAffected2=statement.executeUpdate(sqlUpdate);
		//	System.out.println("rows affected" +rowAffected2);;
		
		
		// Step6. Close the resources
		//resultSet.close();
		statement.close();
		connection.close();
		System.out.println("Closing the resources...");
		

	}

}

