package metaDataBillPay;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.swing.JOptionPane;

public class Business_Layer {
	double paymentAmountBill;

//		// Main method to test functionality 
//		public static void main(String[] args) {
//			
//			CardInfoVerification();
//		}
	public String getLoginInfo(String user, String pwd) {
		// Get login info
		String username = user;
		String password = pwd;

		Database_SQLQueries db = new Database_SQLQueries();
		try {
			// Use DB login confirmation method to see if login was successful or not
			String result = db.loginConfirmation(username, password);
			if (result.isEmpty()) {
				return "";
			} else {
				return result;
			}
		} catch (Exception e) // Exception catching path
		{
			JOptionPane.showMessageDialog(null, "ERROR# 3: Unexpected error occured. Please contact your system "
					+ "adminstration for addtional help at 1-800-123-4567.");
		}
		return "";
	}

	public Boolean cardInfoVerification(String type, String number, String code, String zip, String date) {
		// Get card info from GUI
		String cardType = type;
		String cardNumber = number;
		String cardCVV = code;
		String zipCode = zip;
		String expirationDate = date;

		Database_SQLQueries db = new Database_SQLQueries();
		try {
			// Use DB card verification method to see if card info is valid or not
			Boolean result = db.cardVerification(cardType, cardNumber, cardCVV, zipCode, expirationDate);
			if (result == true) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) // Exception catching path
		{
			JOptionPane.showMessageDialog(null, "ERROR# 3b: Unexpected error occured. Please contact your system "
					+ "adminstration for addtional help at 1-800-123-4567.");
		}
		return false;
	}

	public Boolean paymentSubmissionAndUpdate(double payment) {
		// Get payment amount
		double paymentAmount = payment;
		paymentAmountBill = payment;
		Database_SQLQueries db = new Database_SQLQueries();
		try {
			// Use DB payment method to update payment amount into the DB
			Boolean result = db.paymentUpdate(paymentAmount);
			if (result == true) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) // Exception catching path
		{
			JOptionPane.showMessageDialog(null, "ERROR# 3c: Unexpected error occured. Please contact your system "
					+ "adminstration for addtional help at 1-800-123-4567.");
		}
		return false;
	}

	public String billPaymentDisplayClientInfo(int displayField) {
		String info[] = Database_SQLQueries.billPayment(LoginWindowForm.actNumber);
		if (displayField == 1) {
			return info[0]; // Path for client full name label
		} else if (displayField == 2) {
			return info[2];// Path for account number label

		} else if (displayField == 3) {
			return info[1]; // Path for remaning balance label

		} else if (displayField == 4) {
			return info[3]; // Path for payment due label

		}
		return "";

	}

	public String confirmationDisplayLabels(int display) {
		String info[] = Database_SQLQueries.userConfInfo(LoginWindowForm.actNumber);

		if (display == 1) {
			return info[0]; // Path for client full name label
		}

		else if (display == 3) {
			double balance = Double.valueOf(info[1]);
			double remaining = balance - paymentAmountBill;
			return String.valueOf(remaining); // Path remaining balance label

		} else if (display == 4) {
			// Path for confirmation/reference number label
			Random rd = new Random();
			int rdNumb;
			String m[] = new String[8];

			for (int i = 0; i < 8; i++) {
				rdNumb = rd.nextInt(8);

				m[i] = Integer.toString(rdNumb);
			}

			String number = m[0] + m[1] + m[2] + m[3] + m[4] + m[5] + m[6] + m[7];
			return number;
		} else if (display == 5) {
			// Path for payment amount label
			paymentSubmissionAndUpdate(76.20);
			String pay = String.valueOf(paymentAmountBill);
			return pay;
		} else if (display == 6) {
			// Path for payment date
			SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
			Date date = new Date();
			return formatter.format(date);
		} else {
			return null;
		}
	}
}
