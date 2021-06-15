package metaDataBillPay;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class PaymentConfirmationForm {

	private JFrame PaymentConfirmation;
	private JTextField txtXxxxxxxx;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
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
		
		txtXxxxxxxx = new JTextField();
		txtXxxxxxxx.setBounds(162, 49, 101, 20);
		txtXxxxxxxx.setBackground(Color.WHITE);
		txtXxxxxxxx.setEditable(false);
		txtXxxxxxxx.setHorizontalAlignment(SwingConstants.LEFT);
		txtXxxxxxxx.setText("XXXX-XXXX-0101");
		txtXxxxxxxx.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Remaining Act Balance");
		lblNewLabel_1.setBounds(16, 76, 136, 14);
		lblNewLabel_1.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 12));
		
		textField_1 = new JTextField();
		textField_1.setBounds(162, 74, 55, 20);
		textField_1.setBackground(Color.WHITE);
		textField_1.setEditable(false);
		textField_1.setHorizontalAlignment(SwingConstants.LEFT);
		textField_1.setText("$0.00");
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Customer Name");
		lblNewLabel_2.setBounds(16, 26, 104, 14);
		lblNewLabel_2.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 12));
		
		textField_2 = new JTextField();
		textField_2.setBounds(162, 24, 157, 20);
		textField_2.setHorizontalAlignment(SwingConstants.LEFT);
		textField_2.setEditable(false);
		textField_2.setBackground(Color.WHITE);
		textField_2.setText("Jorge Luis Canales Jr.");
		lblNewLabel_2.setBackground(new Color(0, 0, 0));
		
		JLabel lblNewLabel_3 = new JLabel("Payment Confirmation #");
		lblNewLabel_3.setBounds(16, 102, 147, 14);
		lblNewLabel_3.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 12));
		
		textField_3 = new JTextField();
		textField_3.setBounds(162, 128, 104, 20);
		textField_3.setBackground(Color.WHITE);
		textField_3.setEditable(false);
		textField_3.setText("$67.83");
		textField_3.setHorizontalAlignment(SwingConstants.LEFT);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Payment Amount");
		lblNewLabel_4.setBounds(16, 127, 121, 14);
		lblNewLabel_4.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 12));
		
		textField_4 = new JTextField();
		textField_4.setBounds(162, 153, 86, 20);
		textField_4.setBackground(Color.WHITE);
		textField_4.setEditable(false);
		textField_4.setText("01/01/2021");
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Payment Date");
		lblNewLabel_5.setBounds(16, 152, 82, 14);
		lblNewLabel_5.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 12));
		
		textField_5 = new JTextField();
		textField_5.setBounds(162, 100, 147, 20);
		textField_5.setBackground(Color.WHITE);
		textField_5.setEditable(false);
		textField_5.setHorizontalAlignment(SwingConstants.LEFT);
		textField_5.setText("12345678");
		textField_5.setColumns(10);
		
		lblNewLabel_6 = new JLabel("Thank you for your payment.");
		lblNewLabel_6.setBounds(129, 193, 224, 49);
		lblNewLabel_6.setFont(new Font("Dialog", Font.BOLD, 14));
		
		JButton btnNewButton = new JButton("Sign Out");
		btnNewButton.setBounds(340, 7, 89, 23);
		btnNewButton.setBackground(Color.ORANGE);
		PaymentConfirmation.getContentPane().setLayout(null);
		PaymentConfirmation.getContentPane().add(lblNewLabel_2);
		PaymentConfirmation.getContentPane().add(textField_2);
		PaymentConfirmation.getContentPane().add(btnNewButton);
		PaymentConfirmation.getContentPane().add(lblNewLabel);
		PaymentConfirmation.getContentPane().add(txtXxxxxxxx);
		PaymentConfirmation.getContentPane().add(lblNewLabel_1);
		PaymentConfirmation.getContentPane().add(textField_1);
		PaymentConfirmation.getContentPane().add(textField_5);
		PaymentConfirmation.getContentPane().add(lblNewLabel_3);
		PaymentConfirmation.getContentPane().add(lblNewLabel_4);
		PaymentConfirmation.getContentPane().add(textField_3);
		PaymentConfirmation.getContentPane().add(lblNewLabel_5);
		PaymentConfirmation.getContentPane().add(textField_4);
		PaymentConfirmation.getContentPane().add(lblNewLabel_6);
	}
}

