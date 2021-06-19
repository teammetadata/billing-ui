package metaDataBillPay;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class DatabaseConnection {
	// Initialize variables for DB connection
	String username = "metadata";
	String password = "Meta2021";
	String dbURL = "jdbc:sqlserver://metadatabill.database.windows.net;databaseName=MetaDataDB";
	Connection connection = null;

//	// Main method to test functionalities
//		public static void main(String[] args)
//		{
//			DBConnection();
//		}

	public Boolean DBConnection() {
		try {
			// Valid that the connection to the SQL DB is valid
			connection = DriverManager.getConnection(dbURL, username, password);
			if (connection.isValid(0)) // Path if connection is valid
			{
				return true;
			} else // Path if connection is invalid
			{
				return false;
			}

		} catch (Exception e) // Exception catching path
		{
			JOptionPane.showMessageDialog(null, "Error# 1: Unexpected error occured. Please contact your system"
					+ " adminstration for addtional help at 1-800-123-4567.");
			return false;
		}
	}

}
