package metaDataBillPay;

import javax.swing.JOptionPane;

public class Business_Layer {

//		// Main method to test functionality 
//		public static void main(String[] args) {
//			
//			CardInfoVerification();
//		}

	public Boolean GetLoginInfo(String user, String pwd) {
		// Get login info
		String username = user;
		String password = pwd;

		Database_SQLQueries db = new Database_SQLQueries();
		try 
		{
			// Use DB login confirmation method to see if login was successful or not
			Boolean result = db.LoginConfirmation(username, password);
			if (result == true) 
			{
				return true;
			} 
			else 
			{
				return false;
			}
		} 
		catch (Exception e) // Exception catching path
		{
			JOptionPane.showMessageDialog(null, "ERROR# 3: Unexpected error occured. Please contact your system "
					+ "adminstration for addtional help at 1-800-123-4567.");
		}

		return false;

	}
	public Boolean CardInfoVerification(String type, String number, String code, String zip, String date) {
		// Get card info from GUI
		String cardType = type;
		String cardNumber = number;
		String cardCVV = code;
		String zipCode = zip;
		String expirationDate = date;

		Database_SQLQueries db = new Database_SQLQueries();
		try 
		{
			// Use DB card verification method to see if card info is valid or not
			Boolean result = db.CardVerification(cardType, cardNumber, cardCVV, zipCode, expirationDate);
			if (result == true) 
			{
				return true;
			} 
			else 
			{
				return false;
			}
		} 
		catch (Exception e) // Exception catching path
		{
			JOptionPane.showMessageDialog(null, "ERROR# 3b: Unexpected error occured. Please contact your system "
					+ "adminstration for addtional help at 1-800-123-4567.");
		}

		return false;
	}

}
