package iNeuronJava;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCApp1 {

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
	String sqlSelectQuery = "select id,fname,lname,age from studentInfo";
	ResultSet resultSet = statement.executeQuery(sqlSelectQuery);
	System.out.println("RESULTSET object created...");
	System.out.println("SID\tSNAME\tSAGE\tSADDRESS");
	while (resultSet.next()) {
	int sid = resultSet.getInt("id");
	String sname = resultSet.getString("fname");
	String lastname = resultSet.getString("lname");
	int sage = resultSet.getInt("age");

	System.out.println(sid + "\t" + sname + "\t" + lastname + "\t" +sage);
	}
	// Step6. Close the resources
	resultSet.close();
	statement.close();
	connection.close();
	System.out.println("Closing the resources...");
	}
}
