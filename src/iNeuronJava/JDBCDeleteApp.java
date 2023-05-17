package iNeuronJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDeleteApp {

	public static void main(String[] args) throws ClassNotFoundException,
	SQLException {
	
	
	
	
	//JDBC4.X autoloading feature is enabled.
 

	// Step2. Establish the Connection
	String url = "jdbc:mysql:///student";
	String user = "smita";
	String password = "root123";
	Connection connection = DriverManager.getConnection(url, user,

	password);

	System.out.println("CONNECTION object created...");
	// Step3. Create statement Object and send the Query
	Statement statement = connection.createStatement();
	System.out.println("STATEMENT object created...");
	
	// Step4. Execute the Query and Process the resultSet
	String sqlSelectQuery = "delete  from studentInfo where id=1";
int rowAffected=statement.executeUpdate(sqlSelectQuery);
	 
	
	System.out.println("rows affected" +rowAffected);;
	
String sqlInsertQuery = "insert into studentInfo(`fname`,`lname`, age)values('hardhik','p', 23)";
	int rowAffected1=statement.executeUpdate(sqlInsertQuery);
	 
	
	System.out.println("rows affected" +rowAffected1);
	
	 String sqlUpdate= " update studentInfo set lname='perth' where id=2";
		int rowAffected2=statement.executeUpdate(sqlUpdate);
		System.out.println("rows affected" +rowAffected2);;
	// Step6. Close the resources
	//resultSet.close();
	statement.close();
	connection.close();
	System.out.println("Closing the resources...");
	
		
	}

}
