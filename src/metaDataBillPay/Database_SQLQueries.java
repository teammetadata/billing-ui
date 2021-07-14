package metaDataBillPay;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Database_SQLQueries {

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
			} else // DB connection issues path
			{
				JOptionPane.showMessageDialog(null, "ERROR# 2.2: Unexpected error occured. Please contact your "
						+ "system adminstration for addtional help at 1-800-123-4567.");
				return "";
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "ERROR# 2.1: Unexpected error occured. Please contact your "
					+ "system adminstration for addtional help at 1-800-123-4567.");
			return "";
		}
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
				// Get a result set containing card information
				String query = "Select cardType, cardNumber, cardCVV, zipCode, expirationDate FROM customersInformation Where cardType='"
						+ type + "' and AccountNumber='" + LoginWindowForm.actNumber + "' and cardNumber='" + number
						+ "' and cardCVV='" + code + "' and zipCode='" + zip + "' and expirationDate='" + date + "'";
				PreparedStatement preparedStatement = connection.prepareStatement(query);
				ResultSet results = preparedStatement.executeQuery();
				if (results.next()) {
					return true; // Returns true is the card info matches
				} else {
					return false; // Cursor positioned after the last row
				}
			} else { // DB connection issues path
				JOptionPane.showMessageDialog(null, "ERROR# 2.2b: Unexpected error occured. Please contact your "
						+ "system adminstration for addtional help at 1-800-123-4567.");
				return false;
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "ERROR# 2.1b: Unexpected error occured. Please contact your "
					+ "system adminstration for addtional help at 1-800-123-4567.");
			return false;
		}
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
				// Get a result set containing card information
				String query = "UPDATE customersInformation SET Balance= Balance-'" + paymentAmount
						+ "' WHERE AccountNumber='" + LoginWindowForm.actNumber + "'";

				PreparedStatement preparedStatement = connection.prepareStatement(query);
				preparedStatement.executeUpdate();
				return true;
			} else // DB connection issues path
			{
				JOptionPane.showMessageDialog(null, "ERROR# 2.2c: Unexpected error occured. Please contact your "
						+ "system adminstration for addtional help at 1-800-123-4567.");
				return false;
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "ERROR# 2.1c: Unexpected error occured. Please contact your "
					+ "system adminstration for addtional help at 1-800-123-4567.");
			return false;
		}
	}

	public static String userConfInfo(String Number, int display) {
		// Retrieving data from the database for the confirmation page (full name,
		// remaining balance)
		DatabaseConnection testConnection = new DatabaseConnection();
		Connection connection = null;
		try {
			if (testConnection.DBConnection().booleanValue() == true) // Validate Connection to DB
			{
				connection = DriverManager.getConnection(testConnection.dbURL, testConnection.username,
						testConnection.password);

				String query = "SELECT FullName,Balance FROM customersInformation WHERE AccountNumber='" + Number + "'";
				Statement stmt = connection.createStatement();
				ResultSet rs = stmt.executeQuery(query);
				if (rs.next()) {
					if (display == 1) {
						String FullName = new String(rs.getString(1));
						return FullName;
					} else if (display == 3) {
						String Balance = new String(rs.getString(2));
						return Balance;
					}
				} else {
					return "";
				}
			} else // DB connection issues path
			{
				JOptionPane.showMessageDialog(null, "ERROR# 2.2d: Unexpected error occured. Please contact your "
						+ "system adminstration for addtional help at 1-800-123-4567.");
				return "";
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "ERROR# 2.1d: Unexpected error occured. Please contact your "
					+ "system adminstration for addtional help at 1-800-123-4567.");
			return "";
		}
		return "";
	}

	/*
	 * information for bill payment // anytime the customer log into the log in
	 * screen. Information should // auto-populate on the bill payment screen
	 */

	public static String billPayment(String Number, int display) {
		// Retrieving data from the database for the bill payment (full name,
		// balance due, account number and payment due date)
//		String UserInformation[] = new String[4];
		DatabaseConnection testConnection = new DatabaseConnection();
		Connection connection = null;
		try {
			if (testConnection.DBConnection().booleanValue() == true) // Validate Connection to DB
			{
				connection = DriverManager.getConnection(testConnection.dbURL, testConnection.username,
						testConnection.password);

				// Get a result set containing user name and password from test_table
				String query = "SELECT FullName, Balance, AccountNumber, PaymentDueDate FROM customersInformation WHERE AccountNumber='"
						+ Number + "'";
				Statement stmt = connection.createStatement();
				ResultSet rs = stmt.executeQuery(query);
				if (rs.next()) {
					if (display == 1) {
						String FullName = new String(rs.getString(1));
						return FullName;
					} else if (display == 3) {
						String BalanceDue = new String(rs.getString(2));
						return BalanceDue;
					} else if (display == 2) {
						String AccountNumber = new String(rs.getString(3));
						return AccountNumber;
					} else if (display == 4) {
						String PaymentDueDate = new String(rs.getString(4));
						return PaymentDueDate;
					}
				} else {
					return "";
				}
			} else // DB connection issues path
			{
				JOptionPane.showMessageDialog(null, "ERROR# 2.2e: Unexpected error occured. Please contact your "
						+ "system adminstration for addtional help at 1-800-123-4567.");
				return "";
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "ERROR# 2.1e: Unexpected error occured. Please contact your "
					+ "system adminstration for addtional help at 1-800-123-4567.");
			return "";
		}
		return "";
	}
}
