package metaDataBillPay;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PaymentConfirmationForm {

	private JFrame PaymentConfirmation;
	private JTextField accountNumberLabel;
	private JTextField remainingBalLabel;
	private JTextField fullNameLabel;
	private JTextField paymentAmountLabel;
	private JTextField paymentDateLabel;
	private JTextField confirmationNumberLabel;
	private JLabel lblNewLabel_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaymentConfirmationForm frame = new PaymentConfirmationForm();
					frame.PaymentConfirmation.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PaymentConfirmationForm() {
		initialize();
	}

	/**
	 * Create the frame.
	 */
	private void initialize() {
		Business_Layer logic = new Business_Layer();
		PaymentConfirmation = new JFrame();
		PaymentConfirmation.getContentPane().setEnabled(false);
		PaymentConfirmation.getContentPane().setFont(new Font("Kohinoor Bangla", Font.PLAIN, 12));
		PaymentConfirmation.setTitle("MetaData Electric Inc. Payment Receipt");
		PaymentConfirmation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		PaymentConfirmation.setBounds(100, 100, 450, 325);
		PaymentConfirmation.getContentPane().setBackground(Color.LIGHT_GRAY);
		PaymentConfirmation.getContentPane().setForeground(Color.BLACK);

		JLabel lblNewLabel = new JLabel("Account Number");
		lblNewLabel.setBounds(16, 51, 121, 14);
		lblNewLabel.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 12));

		accountNumberLabel = new JTextField();
		accountNumberLabel.setBounds(162, 49, 101, 20);
		accountNumberLabel.setBackground(Color.WHITE);
		accountNumberLabel.setEditable(false);
		accountNumberLabel.setHorizontalAlignment(SwingConstants.LEFT);
		accountNumberLabel.setText(logic.ConfirmationDisplayLabels(2));
		accountNumberLabel.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Remaining Act Balance");
		lblNewLabel_1.setBounds(16, 76, 136, 14);
		lblNewLabel_1.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 12));

		remainingBalLabel = new JTextField();
		remainingBalLabel.setBounds(162, 74, 55, 20);
		remainingBalLabel.setBackground(Color.WHITE);
		remainingBalLabel.setEditable(false);
		remainingBalLabel.setHorizontalAlignment(SwingConstants.LEFT);
		remainingBalLabel.setText(logic.ConfirmationDisplayLabels(3));
		remainingBalLabel.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Customer Name");
		lblNewLabel_2.setBounds(16, 26, 104, 14);
		lblNewLabel_2.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 12));

		fullNameLabel = new JTextField();
		fullNameLabel.setBounds(162, 24, 157, 20);
		fullNameLabel.setHorizontalAlignment(SwingConstants.LEFT);
		fullNameLabel.setEditable(false);
		fullNameLabel.setBackground(Color.WHITE);
		fullNameLabel.setText(logic.ConfirmationDisplayLabels(1));
		lblNewLabel_2.setBackground(new Color(0, 0, 0));

		JLabel lblNewLabel_3 = new JLabel("Payment Confirmation #");
		lblNewLabel_3.setBounds(16, 102, 147, 14);
		lblNewLabel_3.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 12));

		paymentAmountLabel = new JTextField();
		paymentAmountLabel.setBounds(162, 128, 104, 20);
		paymentAmountLabel.setBackground(Color.WHITE);
		paymentAmountLabel.setEditable(false);
		paymentAmountLabel.setText(logic.ConfirmationDisplayLabels(5));
		paymentAmountLabel.setHorizontalAlignment(SwingConstants.LEFT);
		paymentAmountLabel.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Payment Amount");
		lblNewLabel_4.setBounds(16, 127, 121, 14);
		lblNewLabel_4.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 12));

		paymentDateLabel = new JTextField();
		paymentDateLabel.setBounds(162, 153, 86, 20);
		paymentDateLabel.setBackground(Color.WHITE);
		paymentDateLabel.setEditable(false);
		paymentDateLabel.setText(logic.ConfirmationDisplayLabels(6));
		paymentDateLabel.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("Payment Date");
		lblNewLabel_5.setBounds(16, 152, 82, 14);
		lblNewLabel_5.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 12));

		confirmationNumberLabel = new JTextField();
		confirmationNumberLabel.setBounds(162, 100, 147, 20);
		confirmationNumberLabel.setBackground(Color.WHITE);
		confirmationNumberLabel.setEditable(false);
		confirmationNumberLabel.setHorizontalAlignment(SwingConstants.LEFT);
		confirmationNumberLabel.setText(logic.ConfirmationDisplayLabels(4));
		confirmationNumberLabel.setColumns(10);

		lblNewLabel_6 = new JLabel("Thank you for your payment.");
		lblNewLabel_6.setBounds(129, 193, 224, 49);
		lblNewLabel_6.setFont(new Font("Dialog", Font.BOLD, 14));

		JButton btnNewButton = new JButton("Sign Out");
		btnNewButton.setBounds(340, 7, 89, 23);
		btnNewButton.setBackground(Color.ORANGE);
		PaymentConfirmation.getContentPane().setLayout(null);
		PaymentConfirmation.getContentPane().add(lblNewLabel_2);
		PaymentConfirmation.getContentPane().add(fullNameLabel);
		PaymentConfirmation.getContentPane().add(btnNewButton);
		PaymentConfirmation.getContentPane().add(lblNewLabel);
		PaymentConfirmation.getContentPane().add(accountNumberLabel);
		PaymentConfirmation.getContentPane().add(lblNewLabel_1);
		PaymentConfirmation.getContentPane().add(remainingBalLabel);
		PaymentConfirmation.getContentPane().add(confirmationNumberLabel);
		PaymentConfirmation.getContentPane().add(lblNewLabel_3);
		PaymentConfirmation.getContentPane().add(lblNewLabel_4);
		PaymentConfirmation.getContentPane().add(paymentAmountLabel);
		PaymentConfirmation.getContentPane().add(lblNewLabel_5);
		PaymentConfirmation.getContentPane().add(paymentDateLabel);
		PaymentConfirmation.getContentPane().add(lblNewLabel_6);
	}
}
