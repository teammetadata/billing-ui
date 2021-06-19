package metaDataBillPay;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class Database_SQLQueries {

//	// Main method to test functionality 
//	public static void main(String[] args)
	public Boolean LoginConfirmation(String username, String password) {

		// Create an command procedure to insert SQL statement into
		// Get a result set containing all data from test_table
		DatabaseConnection testConnection = new DatabaseConnection();
		Connection connection = null;
		try 
		{
			if (testConnection.DBConnection().booleanValue() == true) // Validate Connection to DB
			{
				connection = DriverManager.getConnection(testConnection.dbURL, testConnection.username,
						testConnection.password);

				try 
				{
					// Get a result set containing user name and password from test_table
					String query = "Select Username, Password FROM customersCredentials Where Username='" + username
							+ "' and Password='" + password + "'";
					PreparedStatement preparedStatement = connection.prepareStatement(query);
					ResultSet results = preparedStatement.executeQuery();
					if (results.next()) 
					{
						return true; // Returns true is the credentials were found
					} 
					else 
					{
						return false; // Cursor positioned after the last row
					}
				} 
				catch (Exception e) // Exception catching path for any SQL Exceptions or ResultSets Retrieval
				{
					JOptionPane.showMessageDialog(null, "ERROR# 2.2: Unexpected error occurred. Please contact your"
							+ " system administration for additional help at 1-800-123-4567.");
				}
			} 
			else // DB connection issues path
			{
				JOptionPane.showMessageDialog(null, "ERROR# 2.1: Unexpected error occured. Please contact your "
						+ "system adminstration for addtional help at 1-800-123-4567.");
				return false;
			}
		} 
		catch (Exception e) // Exception catching path for DB Connection Error
		{
			JOptionPane.showMessageDialog(null, "ERROR# 2.0: Unexpected error occured. Please contact your system "
					+ "adminstration for addtional help at 1-800-123-4567.");
			return false;
		}
		return false;
	}

	public Boolean CardVerification(String type, String number, String code, String zip, String date) {
		// Create an command procedure to insert SQL statement into
		// Get a result set containing all data from test_table
		DatabaseConnection testConnection = new DatabaseConnection();
		Connection connection = null;
		
		try 
		{
			if (testConnection.DBConnection().booleanValue() == true) // Validate Connection to DB
			{
				connection = DriverManager.getConnection(testConnection.dbURL, testConnection.username,
						testConnection.password);
				try 
				{
					// Get a result set containing card information
					String query = "Select cardType, cardNumber, cardCVV, zipCode, expirationDate FROM customersCredentials Where cardType='"
							+ type + "' and cardNumber='" + number + "' and cardCVV='" + code + "' and zipCode='" + zip
							+ "' and expirationDate='" + date + "'";
					PreparedStatement preparedStatement = connection.prepareStatement(query);
					ResultSet results = preparedStatement.executeQuery();
					if (results.next()) 
					{
						return true; // Returns true is the card info matches
					} 
					else 
					{
						return false; // Cursor positioned after the last row
					}
				} 
				catch (Exception e) // Exception catching path for any SQL Exceptions or ResultSets Retrieval
				{
					JOptionPane.showMessageDialog(null, "ERROR# 2.2b: Unexpected error occurred. Please contact your"
							+ " system administration for additional help at 1-800-123-4567.");
				}
			} 
			else // DB connection issues path
			{
				JOptionPane.showMessageDialog(null, "ERROR# 2.1b: Unexpected error occured. Please contact your "
						+ "system adminstration for addtional help at 1-800-123-4567.");
				return false;
			}
		} 
		catch (Exception e) // Exception catching path for DB Connection Error
		{
			JOptionPane.showMessageDialog(null, "ERROR# 2.0b: Unexpected error occured. Please contact your system "
					+ "adminstration for addtional help at 1-800-123-4567.");
			return false;
		}
		return false;
	}

}
