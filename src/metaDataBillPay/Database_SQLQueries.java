package metaDataBillPay;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Database_SQLQueries {

	// Main method to test functionality
//	public static void main(String args[]) {
//		String s[]=UserConfInfo("15629222");
//		System.out.println(s[0]+" "+s[1]);
//	}

	public String loginConfirmation(String username, String password) {

		// Create an command procedure to insert SQL statement into
		// Get a result set containing all data from test_table
		DatabaseConnection testConnection = new DatabaseConnection();
		Connection connection = null;
		try {
			if (testConnection.DBConnection().booleanValue() == true) // Validate Connection to DB
			{
				connection = DriverManager.getConnection(testConnection.dbURL, testConnection.username,
						testConnection.password);

				try {
					// Get a result set containing user name and password from test_table
					String query = "Select AccountNumber FROM customersCredentials Where Username='" + username
							+ "' and Password='" + password + "'";
					PreparedStatement preparedStatement = connection.prepareStatement(query);
					ResultSet results = preparedStatement.executeQuery();
					if (results.next()) {
						String accountNumber = new String(results.getString(1));
						return accountNumber; // Returns true is the credentials were found
					} else {
						return ""; // Cursor positioned after the last row
					}
				} catch (Exception e) // Exception catching path for any SQL Exceptions or ResultSets Retrieval
				{
					JOptionPane.showMessageDialog(null, "ERROR# 2.2: Unexpected error occurred. Please contact your"
							+ " system administration for additional help at 1-800-123-4567.");
				}
			} else // DB connection issues path
			{
				JOptionPane.showMessageDialog(null, "ERROR# 2.1: Unexpected error occured. Please contact your "
						+ "system adminstration for addtional help at 1-800-123-4567.");
				return "";
			}
		} catch (Exception e) // Exception catching path for DB Connection Error
		{
			JOptionPane.showMessageDialog(null, "ERROR# 2.0: Unexpected error occured. Please contact your system "
					+ "adminstration for addtional help at 1-800-123-4567.");
			return "";
		}
		return "";
	}

	public Boolean cardVerification(String type, String number, String code, String zip, String date) {
		// Create an command procedure to insert SQL statement into
		// Get a result set containing all data from test_table
		DatabaseConnection testConnection = new DatabaseConnection();
		Connection connection = null;
		try {
			if (testConnection.DBConnection().booleanValue() == true) // Validate Connection to DB
			{
				connection = DriverManager.getConnection(testConnection.dbURL, testConnection.username,
						testConnection.password);
				try {
					// Get a result set containing card information
					String query = "Select cardType, cardNumber, cardCVV, zipCode, expirationDate FROM customersInformation Where cardType='"
							+ type + "' and AccountNumber='" + LoginWindowForm.actNumber + "' and cardNumber='" + number
							+ "' and cardCVV='" + code + "' and zipCode='" + zip + "' and expirationDate='" + date
							+ "'";
					PreparedStatement preparedStatement = connection.prepareStatement(query);
					ResultSet results = preparedStatement.executeQuery();
					if (results.next()) {
						return true; // Returns true is the card info matches
					} else {
						return false; // Cursor positioned after the last row
					}
				} catch (Exception e) // Exception catching path for any SQL Exceptions or ResultSets Retrieval
				{
					JOptionPane.showMessageDialog(null, "ERROR# 2.2b: Unexpected error occurred. Please contact your"
							+ " system administration for additional help at 1-800-123-4567.");
				}
			} else // DB connection issues path
			{
				JOptionPane.showMessageDialog(null, "ERROR# 2.1b: Unexpected error occured. Please contact your "
						+ "system adminstration for addtional help at 1-800-123-4567.");
				return false;
			}
		} catch (Exception e) // Exception catching path for DB Connection Error
		{
			JOptionPane.showMessageDialog(null, "ERROR# 2.0b: Unexpected error occured. Please contact your system "
					+ "adminstration for addtional help at 1-800-123-4567.");
			return false;
		}
		return false;
	}

	public Boolean paymentUpdate(double paymentAmount) {
		// Create an command procedure to insert SQL statement into
		// Get a result set containing all data from test_table
		DatabaseConnection testConnection = new DatabaseConnection();
		Connection connection = null;
		try {
			if (testConnection.DBConnection().booleanValue() == true) // Validate Connection to DB
			{
				connection = DriverManager.getConnection(testConnection.dbURL, testConnection.username,
						testConnection.password);
				try {
					// Get a result set containing card information
					String query = "UPDATE customersInformation SET Balance= Balance-'" + paymentAmount
							+ "' WHERE AccountNumber='" + LoginWindowForm.actNumber + "'";

					PreparedStatement preparedStatement = connection.prepareStatement(query);
					preparedStatement.executeUpdate();
					return true;
				} catch (Exception e) // Exception catching path for any SQL Exceptions or ResultSets Retrieval
				{
					JOptionPane.showMessageDialog(null, e);
				}
			} else // DB connection issues path
			{
				JOptionPane.showMessageDialog(null, "ERROR# 2.1c: Unexpected error occured. Please contact your "
						+ "system adminstration for addtional help at 1-800-123-4567.");
				return false;
			}
		} catch (Exception e) // Exception catching path for DB Connection Error
		{
			JOptionPane.showMessageDialog(null, e);
			return false;
		}
		return false;
	}

	public static String[] userConfInfo(String Number) {
		// retreiving data from the database for the confirmation page (full name,
		// remaining balance)
		String AccountNumber = Number;
		String UserInformation[] = new String[2];
		DatabaseConnection testConnection = new DatabaseConnection();
		Connection connection = null;
		try {
			if (testConnection.DBConnection().booleanValue() == true) // Validate Connection to DB
			{
				connection = DriverManager.getConnection(testConnection.dbURL, testConnection.username,
						testConnection.password);

				String query = "SELECT FullName,Balance FROM customersInformation WHERE AccountNumber='" + AccountNumber
						+ "'";

				try (Statement stmt = connection.createStatement()) {
					ResultSet rs = stmt.executeQuery(query);
					if (rs.next()) {
						String FullName = new String(rs.getString(1));
						UserInformation[0] = FullName;
						String Balance = new String(rs.getString(2));
						UserInformation[1] = Balance;
					} else {
						UserInformation[0] = "";
						UserInformation[1] = "";
					}
				} catch (Exception e) // Exception catching path for any SQL Exceptions or ResultSets Retrieval
				{
					System.out.println(e);
					JOptionPane.showMessageDialog(null, "ERROR# 2.1d: Unexpected error occurred. Please contact your"
							+ " system administration for additional help at 1-800-123-4567.");
				}
			}
		} catch (Exception e) // Exception catching path for DB Connection Error
		{
			JOptionPane.showMessageDialog(null, "ERROR# 2.0d: Unexpected error occured. Please contact your system "
					+ "adminstration for addtional help at 1-800-123-4567.");

		}
		return UserInformation;
	}

	/*
	 * information for bill payment // anytime the customer log into the log in
	 * screen. Information should // auto-populate on the bill payment screen
	 */

	public static String[] billPayment(String Number) {
		// retreiving data from the database for the bill payment (full name,
		// balance due, account number and payment due date)
		String AccountNumber = Number;
		String UserInformation[] = new String[4];
		DatabaseConnection testConnection = new DatabaseConnection();
		Connection connection = null;
		try {
			if (testConnection.DBConnection().booleanValue() == true) // Validate Connection to DB
			{
				connection = DriverManager.getConnection(testConnection.dbURL, testConnection.username,
						testConnection.password);

				// Get a result set containing user name and password from test_table
				String query = "SELECT FullName, Balance, AccountNumber, PaymentDueDate FROM customersInformation WHERE AccountNumber='"
						+ AccountNumber + "'";

				try (Statement stmt = connection.createStatement()) {
					ResultSet rs = stmt.executeQuery(query);
					if (rs.next()) {
						String FullName = new String(rs.getString(1));
						UserInformation[0] = FullName;
						String BalanceDue = new String(rs.getString(2));
						UserInformation[1] = BalanceDue;
						String AccountNumber1 = new String(rs.getString(3));
						UserInformation[2] = AccountNumber1;
						String PaymentDueDate = new String(rs.getString(4));
						UserInformation[3] = PaymentDueDate;
					} else {
						UserInformation[0] = "";
						UserInformation[1] = "";
					}
				} catch (Exception e) // Exception catching path for any SQL Exceptions or ResultSets Retrieval
				{
					System.out.println(e);
					JOptionPane.showMessageDialog(null, "ERROR# 2.2e: Unexpected error occurred. Please contact your"
							+ " system administration for additional help at 1-800-123-4567.");
				}
			}
		} catch (Exception e) // Exception catching path for DB Connection Error
		{
			JOptionPane.showMessageDialog(null, "ERROR# 2.0e: Unexpected error occured. Please contact your system "
					+ "adminstration for addtional help at 1-800-123-4567.");

		}
		return UserInformation;
	}
}
