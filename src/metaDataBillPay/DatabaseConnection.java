package metaDataBillPay;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	// Initialize variables for DB connection
	String username = "metadata";
	String password = "fZ&Rtuml3*2Tov^CaA$2slb#9I2&ulgc";
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
			} 
			else // Path if connection is invalid
			{
				return null;
			}
		} 
		catch (Exception e) // Exception catching path
		{
			return false;
		}
	}

}
