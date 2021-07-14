package metaDataBillPay;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import java.awt.event.ActionEvent;

public class PaymentConfirmationForm {

	JFrame PaymentConfirmation;
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
			@Override
			public void run() {
				try {
					PaymentConfirmationForm frame = new PaymentConfirmationForm();
					frame.PaymentConfirmation.setVisible(true);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "ERROR# 4.1e: Unexpected error occured. Please contact your "
							+ "system adminstration for addtional help at 1-800-123-4567.");
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
		Image smallIcon = null;
		try {
			URL url = new URL(
					"https://1.bp.blogspot.com/-1wQfEcfaoXM/YOjTGljPplI/AAAAAAAAFGk/4YGPpSXXCxIzJO6MIw9hu1Q0QP4NPz1DgCLcBGAsYHQ/s0/icon.png");
			smallIcon = ImageIO.read(url);
		} catch (IOException e) {
		}
		PaymentConfirmation = new JFrame();
		PaymentConfirmation.getContentPane().setEnabled(false);
		PaymentConfirmation.getContentPane().setFont(new Font("Kohinoor Bangla", Font.PLAIN, 12));
		PaymentConfirmation.setTitle("MetaData Electric Inc. Payment Receipt");
		PaymentConfirmation.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		PaymentConfirmation.setBounds(100, 100, 537, 325);
		PaymentConfirmation.getContentPane().setBackground(Color.LIGHT_GRAY);
		PaymentConfirmation.getContentPane().setForeground(Color.BLACK);
		PaymentConfirmation.setIconImage(smallIcon);

		JLabel lblNewLabel = new JLabel("Account Number");
		lblNewLabel.setBounds(58, 55, 121, 14);
		lblNewLabel.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 12));

		accountNumberLabel = new JTextField();
		accountNumberLabel.setBounds(204, 53, 101, 20);
		accountNumberLabel.setBackground(Color.WHITE);
		accountNumberLabel.setEditable(false);
		accountNumberLabel.setHorizontalAlignment(SwingConstants.LEFT);
		accountNumberLabel.setText(LoginWindowForm.actNumber);
		accountNumberLabel.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Remaining Acct. Balance");
		lblNewLabel_1.setBounds(58, 80, 136, 14);
		lblNewLabel_1.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 12));

		remainingBalLabel = new JTextField();
		remainingBalLabel.setBounds(204, 78, 55, 20);
		remainingBalLabel.setBackground(Color.WHITE);
		remainingBalLabel.setEditable(false);
		remainingBalLabel.setHorizontalAlignment(SwingConstants.LEFT);
		remainingBalLabel.setText(logic.confirmationDisplayLabels(3));
		remainingBalLabel.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Customer Name");
		lblNewLabel_2.setBounds(58, 30, 104, 14);
		lblNewLabel_2.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 12));

		fullNameLabel = new JTextField();
		fullNameLabel.setBounds(204, 28, 157, 20);
		fullNameLabel.setHorizontalAlignment(SwingConstants.LEFT);
		fullNameLabel.setEditable(false);
		fullNameLabel.setBackground(Color.WHITE);
		fullNameLabel.setText(logic.confirmationDisplayLabels(1));
		lblNewLabel_2.setBackground(new Color(0, 0, 0));

		JLabel lblNewLabel_3 = new JLabel("Payment Confirmation Number");
		lblNewLabel_3.setBounds(58, 106, 147, 14);
		lblNewLabel_3.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 12));

		paymentAmountLabel = new JTextField();
		paymentAmountLabel.setBounds(204, 132, 104, 20);
		paymentAmountLabel.setBackground(Color.WHITE);
		paymentAmountLabel.setEditable(false);
		paymentAmountLabel.setText(logic.confirmationDisplayLabels(5));
		paymentAmountLabel.setHorizontalAlignment(SwingConstants.LEFT);
		paymentAmountLabel.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Payment Amount");
		lblNewLabel_4.setBounds(58, 131, 121, 14);
		lblNewLabel_4.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 12));

		paymentDateLabel = new JTextField();
		paymentDateLabel.setBounds(204, 157, 86, 20);
		paymentDateLabel.setBackground(Color.WHITE);
		paymentDateLabel.setEditable(false);
		paymentDateLabel.setText(logic.confirmationDisplayLabels(6));
		paymentDateLabel.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("Payment Date");
		lblNewLabel_5.setBounds(58, 156, 82, 14);
		lblNewLabel_5.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 12));

		confirmationNumberLabel = new JTextField();
		confirmationNumberLabel.setBounds(204, 104, 147, 20);
		confirmationNumberLabel.setBackground(Color.WHITE);
		confirmationNumberLabel.setEditable(false);
		confirmationNumberLabel.setHorizontalAlignment(SwingConstants.LEFT);
		confirmationNumberLabel.setText(logic.confirmationDisplayLabels(4));
		confirmationNumberLabel.setColumns(10);

		lblNewLabel_6 = new JLabel("Thank you for your payment.");
		lblNewLabel_6.setBounds(122, 198, 302, 49);
		lblNewLabel_6.setFont(new Font("Dialog", Font.BOLD, 20));

		// Added action to Sign Off button
		JButton btnNewButton = new JButton("Sign Out");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PaymentConfirmation.setVisible(false);
				LoginWindowForm window = new LoginWindowForm();
				window.frmMetabillpaylogin.setVisible(true);
			}
		});

		btnNewButton.setBounds(398, 11, 89, 23);
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
