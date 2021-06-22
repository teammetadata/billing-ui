package metaDataBillPay;

import java.util.Random;

import javax.swing.JOptionPane;

public class Business_Layer {

//		// Main method to test functionality 
//		public static void main(String[] args) {
//			
//			CardInfoVerification();
//		}

	public String GetLoginInfo(String user, String pwd) {
		// Get login info
		String username = user;
		String password = pwd;

		Database_SQLQueries db = new Database_SQLQueries();
		try 
		{
			// Use DB login confirmation method to see if login was successful or not
			String result = db.LoginConfirmation(username, password);
			if (result.isEmpty()) 
			{
				return "";
			} 
			else 
			{
				return result;
			}
		} 
		catch (Exception e) // Exception catching path
		{
			JOptionPane.showMessageDialog(null, "ERROR# 3: Unexpected error occured. Please contact your system "
					+ "adminstration for addtional help at 1-800-123-4567.");
		}
		return "";
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

//	public Boolean PaymentSubmissionAndUpdate(float payment) {
//		// Get payment amount
//		float paymentAmount = payment;
//
//		Database_SQLQueries db = new Database_SQLQueries();
//		try 
//		{
//			// Use DB payment method to update payment amount into the DB 
//			Boolean result = db.PaymentUpdate(float paymentAmount);
//			if (result == true) 
//			{
//				return true;
//			} 
//			else 
//			{
//				return false;
//			}
//		} 
//		catch (Exception e) // Exception catching path
//		{
//			JOptionPane.showMessageDialog(null, "ERROR# 3c: Unexpected error occured. Please contact your system "
//					+ "adminstration for addtional help at 1-800-123-4567.");
//		}
//		return false;
//	}
	
	public String ConfirmationDisplayLabels(int display)
	{
		if (display == 1) // Path for client full name label
		{
			return "Jorge Luis Canales Jr";
		}
		else if (display == 2) // Path for account number label
		{
			return "XXXX-XXXX-1234";
		}
		else if (display == 3) // Path remaining balance label
		{
			return "$0.00";
		}
		else if (display == 4) // Path for confirmation/reference number label
		{
			Random rd = new Random(); 
			
			int rdNumb;
			
			String m[] = new String[8];
			
			for(int i=0; i<8; i++) 
			{
				rdNumb = rd.nextInt(8);
				
				m[i] = Integer.toString(rdNumb);
			}
			
			String number = m[0]+m[1]+m[2]+m[3]+m[4]+m[5]+m[6]+m[7];
			return number;
		}
		else if (display == 5) // Path for payment amount label
		{
			return "$65.75";
		}
		else if (display == 6) // Path for payment date
		{
			return "06/30/2021";
		}
		else
		{
			return null;
		}
	}
}
