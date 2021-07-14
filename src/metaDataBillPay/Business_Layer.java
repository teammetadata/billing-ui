package metaDataBillPay;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.IllegalFormatException;
import java.util.Random;

import javax.swing.JOptionPane;

public class Business_Layer {
	private static String paymentAmountBill;

	public String getLoginInfo(String user, String pwd) {
		// Get login info and pass values
		String username = user;
		String password = pwd;

		Database_SQLQueries db = new Database_SQLQueries();

		String result = db.loginConfirmation(username, password);
		if (result.isEmpty()) {
			return ""; // Returns nothing if no connection or if incorrect credentials
		} else {
			return result; // Returns account number back to front end GUI
		}
	}

	public Boolean cardInfoVerification(String type, String number, String code, String zip, String date) {
		// Get card info from GUI
		String cardType = type;
		String cardNumber = number;
		String cardCVV = code;
		String zipCode = zip;
		String expirationDate = date;

		Database_SQLQueries db = new Database_SQLQueries();
		// Use DB card verification method to see if card info is valid or not
		Boolean result = db.cardVerification(cardType, cardNumber, cardCVV, zipCode, expirationDate);
		if (result == true) {
			return true;
		} else {
			return false;
		}

	}

	public Boolean paymentSubmissionAndUpdate(double payment) {

		// Get payment amount
		try {
			paymentAmountBill = (String.format("%.2f", payment));
		} catch (IllegalFormatException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "ERROR# 3.1: Unexpected error occured. Please contact your system "
					+ "adminstration for addtional help at 1-800-123-4567.");
			return false;
		}
		Database_SQLQueries db = new Database_SQLQueries();
		// Use DB payment method to update payment amount into the DB
		Boolean result = db.paymentUpdate(payment);
		if (result == true) {
			return true;
		} else {
			return false;
		}

	}

	public String billPaymentDisplayClientInfo(int displayField) {
		if (displayField == 1) {
			return Database_SQLQueries.billPayment(LoginWindowForm.actNumber, displayField); // Path for client full
																								// name label
		} else if (displayField == 2) {
			return Database_SQLQueries.billPayment(LoginWindowForm.actNumber, displayField);// Path for account number
																							// label

		} else if (displayField == 3) {
			return "$" + Database_SQLQueries.billPayment(LoginWindowForm.actNumber, displayField); // Path for remaning
																									// balance label

		} else if (displayField == 4) {
			return Database_SQLQueries.billPayment(LoginWindowForm.actNumber, displayField); // Path for payment due
																								// label

		}
		return "";
	}

	public String confirmationDisplayLabels(int display) {
		if (display == 1) {
			return Database_SQLQueries.userConfInfo(LoginWindowForm.actNumber, display); // Path for client full
																							// name label
		}

		else if (display == 3) {
			return "$" + Database_SQLQueries.userConfInfo(LoginWindowForm.actNumber, display); // Path remaining
																								// balance label

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
			return "$" + paymentAmountBill;

		} else if (display == 6) {
			// Path for payment date
			SimpleDateFormat formatter;
			try {
				formatter = new SimpleDateFormat("MM/dd/yyyy");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "ERROR# 3.1b: Unexpected error occured. Please contact your system "
						+ "adminstration for addtional help at 1-800-123-4567.");
				return null;
			}
			Date date = new Date();
			return formatter.format(date);
		}
		return "";
	}
}
