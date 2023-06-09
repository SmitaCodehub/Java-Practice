package iNeuronJava;
import java.io.IOException;

import java.sql.*;
import java.util.Scanner;

import in.iNeuronJava.util.*;
import in.iNeuronJava.util.JdbcUtil;

public class SelectApp {

	public static void main(String[] args) throws Exception {
		

		Connection connection = null;
		PreparedStatement pstmt = null;
		Scanner scanner = null;
		ResultSet resultSet = null;
		int sid = 0;

		try {
			connection = JdbcUtil.getJdbcConnection();

			String sqlSelectQuery = "select id,fname,lname,age from studentInfo where id =?";
			if (connection != null)
				pstmt = connection.prepareStatement(sqlSelectQuery);

			if (pstmt != null) {

				scanner = new Scanner(System.in);

				System.out.print("Enter the id of the student :: ");
				sid = scanner.nextInt();

				// use precompiled query to set the values
				pstmt.setInt(1, sid);

				// execute the query
				resultSet = pstmt.executeQuery();
			}
			if (resultSet != null) {

				if (resultSet.next()) {
					System.out.println("SID\tSNAME\tSAGE\tSADDRESS\tSGENDER");
					System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t" 
							+ "\t" + resultSet.getString(3) + "\t" + resultSet.getInt(4));
				} else {
					System.out.println("Record not available for the give id :: " + sid);
				}
			}

		} catch (IOException ie) {
			ie.printStackTrace();
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				JdbcUtil.cleanUp(connection, pstmt, resultSet);
				System.out.println("Closing the resource...");
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

}
