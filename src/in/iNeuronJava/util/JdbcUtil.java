package in.iNeuronJava.util;


import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


public class JdbcUtil {
	
	
	private JdbcUtil() {		//private constructor so that nobody can create object of this
	}
	
	static {
		//step 1 : load an dregister the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loades and registered..");
			
		}catch(ClassNotFoundException ce) {
			ce.printStackTrace();
		}
	}
	public static Connection getJdbcConnection() throws SQLException, IOException
	{
		//Establish a connection
		String url="JDBC:mysql:///student";
		String user="smita";
	 String password="root123";
		
		Connection connection=DriverManager.getConnection(url, user, password);
		// Take the data from properties file
//		FileInputStream fis = new FileInputStream("C:\\Users\\Patil\\eclipse-workspace\\iNeuronJava\\src\\iNeuronJava\\Application.properties");
//				Properties properties = new Properties();
//		properties.load(fis);
//
//				// Step2. Establish the Connection
//				Connection connection = DriverManager.getConnection(properties.getProperty("url"),
//					properties.getProperty("username"), properties.getProperty("password"));
	System.out.println("Connection Object Created...");
		
		return connection;
		
	}
	public static void cleanUp(Connection connection, Statement statement,ResultSet resultSet) throws SQLException
	{
		
		// Closing resources
		if(connection!=null) {
			connection.close();
		}
		if(statement!=null)
		{
			statement.close();
		}
		if(resultSet!=null)
		{
			resultSet.close();
		}
	}
	


}
