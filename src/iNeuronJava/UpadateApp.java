package iNeuronJava;
import java.io.IOException;

import java.sql.*;
import java.util.Scanner;

import in.iNeuronJava.util.*;
import in.iNeuronJava.util.JdbcUtil;

public class UpadateApp {

	public static void main(String[] args) throws Exception {
		

		Connection connection = null;
		PreparedStatement pstmt = null;
		Scanner scanner = null;

		try {
			connection = JdbcUtil.getJdbcConnection();
			
			String sqlUpdateQuery = "update studentInfo set fname = ? where id = ?";
			if (connection != null)
				pstmt = connection.prepareStatement(sqlUpdateQuery);

			if (pstmt != null) {
				scanner = new Scanner(System.in);

				System.out.print("Enter the id of the student :: ");
				int sid = scanner.nextInt();

				System.out.print("Enter the saddress of the student :: ");
				String sname = scanner.next();

				// use precompiled query to set the values
				pstmt.setString(1, sname);
				pstmt.setInt(2, sid);

				// execute the query
				int rowCount = pstmt.executeUpdate();
				System.out.println("No of rows updated is :: " + rowCount);
			}
		} catch (IOException ie) {
			ie.printStackTrace();
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				JdbcUtil.cleanUp(connection, pstmt, null);
				scanner.close();
				System.out.println("Closing the resource...");
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

}
