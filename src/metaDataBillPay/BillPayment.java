package metaDataBillPay;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Panel;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

public class BillPayment {

	JFrame frmMetabillpaylogin;
	private JTextField cardNumberField;
	private JPasswordField cardCVVField;
	private JTextField cardExpirationField;
	private JTextField zipCodeField;
	private JTextField paymentAmountField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					BillPayment window = new BillPayment();
					window.frmMetabillpaylogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BillPayment() {
		initialize();
		LoginWindowForm window = new LoginWindowForm();
		window.frmMetabillpaylogin.setVisible(false);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void initialize() {
		Image smallIcon = null;
		try {
			URL url = new URL(
					"https://1.bp.blogspot.com/-1wQfEcfaoXM/YOjTGljPplI/AAAAAAAAFGk/4YGPpSXXCxIzJO6MIw9hu1Q0QP4NPz1DgCLcBGAsYHQ/s0/icon.png");
			smallIcon = ImageIO.read(url);
		} catch (IOException e) {
		}
		Business_Layer logic = new Business_Layer();
		Image bigIcon = null;
		try {
			URL url = new URL(
					"https://1.bp.blogspot.com/-U6iSATW2Iac/YOjS-kBJ5AI/AAAAAAAAFGg/CelYw0QfHUwMN-WF3Z3tCmrAgm7s-kCcACLcBGAsYHQ/s0/metadatalogo.png");
			bigIcon = ImageIO.read(url);
		} catch (IOException e) {
		}
		frmMetabillpaylogin = new JFrame();
		frmMetabillpaylogin.getContentPane().setBackground(new Color(192, 192, 192));
		frmMetabillpaylogin.getContentPane().setForeground(Color.LIGHT_GRAY);
		frmMetabillpaylogin.setForeground(SystemColor.desktop);
		frmMetabillpaylogin.setTitle("MetaBillPayLogin");
		frmMetabillpaylogin.setIconImage(smallIcon);
		frmMetabillpaylogin.setAutoRequestFocus(false);
		frmMetabillpaylogin.setResizable(false);
		frmMetabillpaylogin.setBounds(100, 100, 639, 454);
		frmMetabillpaylogin.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frmMetabillpaylogin.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Full Name");
		lblNewLabel.setBounds(16, 100, 62, 15);
		lblNewLabel.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 12));
		frmMetabillpaylogin.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_2 = new JLabel("    Utility Payment System");
		lblNewLabel_2.setBorder(new CompoundBorder());
		lblNewLabel_2.setBackground(new Color(128, 128, 128));
		lblNewLabel_2.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(167, 6, 262, 35);
		frmMetabillpaylogin.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("Billing Details");
		lblNewLabel_2_1.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 13));
		lblNewLabel_2_1.setBounds(248, 36, 103, 20);
		frmMetabillpaylogin.getContentPane().add(lblNewLabel_2_1);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 270, 627, 20);
		frmMetabillpaylogin.getContentPane().add(separator_1);

		JLabel lblNewLabel_3 = new JLabel("logo label");
		lblNewLabel_3.setIcon(new ImageIcon(bigIcon));
		lblNewLabel_3.setBounds(167, 287, 281, 94);
		frmMetabillpaylogin.getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_1_1 = new JLabel("Balance Due");
		lblNewLabel_1_1.setFont(new Font("Kohinoor Bangla", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(402, 100, 109, 15);
		frmMetabillpaylogin.getContentPane().add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("Account #");
		lblNewLabel_1_2.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(16, 69, 69, 15);
		frmMetabillpaylogin.getContentPane().add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_3 = new JLabel("Payment Due Date");
		lblNewLabel_1_3.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 12));
		lblNewLabel_1_3.setBounds(402, 69, 109, 15);
		frmMetabillpaylogin.getContentPane().add(lblNewLabel_1_3);

		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setBounds(0, 53, 627, 9);
		frmMetabillpaylogin.getContentPane().add(separator);

		JTextField accountNumberLabel = new JTextField();
		accountNumberLabel.setEditable(false);
		accountNumberLabel.setBackground(new Color(224, 255, 255));
		accountNumberLabel.setBounds(81, 67, 142, 16);
		accountNumberLabel.setText(logic.billPaymentDisplayClientInfo(2));
		frmMetabillpaylogin.getContentPane().add(accountNumberLabel);

		JTextField paymentDueDateLabel = new JTextField();
		paymentDueDateLabel.setEditable(false);
		paymentDueDateLabel.setBackground(new Color(224, 255, 255));
		paymentDueDateLabel.setBounds(512, 67, 97, 16);
		paymentDueDateLabel.setText(logic.billPaymentDisplayClientInfo(4));
		frmMetabillpaylogin.getContentPane().add(paymentDueDateLabel);

		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(Color.BLACK);
		separator_2.setBounds(0, 257, 627, 30);
		frmMetabillpaylogin.getContentPane().add(separator_2);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(Color.GRAY));
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(4, 126, 471, 131);
		frmMetabillpaylogin.getContentPane().add(panel_2);
		panel_2.setLayout(null);

		Panel panel = new Panel();
		panel.setBounds(6, 18, 459, 107);
		panel_2.add(panel);
		panel.setFocusTraversalKeysEnabled(false);

		cardCVVField = new JPasswordField();
		cardCVVField.setColumns(3);

		JLabel lblNewLabel_1_8_1 = new JLabel("Payment Amount");
		lblNewLabel_1_8_1.setFont(new Font("Dialog", Font.PLAIN, 12));

		paymentAmountField = new JTextField();

		JLabel lblNewLabel_1_8 = new JLabel("Expiration Date");
		lblNewLabel_1_8.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 12));

		JLabel lblNewLabel_1_9 = new JLabel("Zip Code");
		lblNewLabel_1_9.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 12));

		zipCodeField = new JTextField();

		cardExpirationField = new JTextField();

		cardNumberField = new JTextField();

		JComboBox cardTypeField = new JComboBox();
		cardTypeField.setModel(new DefaultComboBoxModel(new String[] { "Credit", "Debit" }));
		cardTypeField.setMaximumRowCount(4);

		JLabel lblNewLabel_1_7 = new JLabel("CVV Code");
		lblNewLabel_1_7.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 12));

		JLabel lblNewLabel_1 = new JLabel("Card Type");
		lblNewLabel_1.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 12));

		JLabel lblNewLabel_1_6 = new JLabel("Card Card #");
		lblNewLabel_1_6.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 12));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.TRAILING).addGroup(gl_panel
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup().addGap(7).addComponent(lblNewLabel_1_7,
										GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_1_6, GroupLayout.PREFERRED_SIZE, 69,
										GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(cardCVVField, GroupLayout.PREFERRED_SIZE, 43,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(cardNumberField, GroupLayout.PREFERRED_SIZE, 139,
												GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
								.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblNewLabel_1_8_1, GroupLayout.PREFERRED_SIZE, 96,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_1_8, GroupLayout.PREFERRED_SIZE, 97,
												GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel.createSequentialGroup()
								.addComponent(cardTypeField, GroupLayout.PREFERRED_SIZE, 100,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, 82, Short.MAX_VALUE).addComponent(
										lblNewLabel_1_9, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(paymentAmountField, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
						.addComponent(zipCodeField, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
						.addComponent(cardExpirationField, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))
				.addContainerGap()));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.TRAILING).addGroup(Alignment.LEADING, gl_panel
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1_9, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(zipCodeField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(cardTypeField, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1_8, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(cardExpirationField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(cardNumberField, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1_6, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(paymentAmountField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1_8_1, GroupLayout.PREFERRED_SIZE, 15,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(cardCVVField, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_7, GroupLayout.PREFERRED_SIZE, 15,
										GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(23, Short.MAX_VALUE)));
		panel.setLayout(gl_panel);

		JTextField fullNameLabel = new JTextField();
		fullNameLabel.setEditable(false);
		fullNameLabel.setBackground(new Color(224, 255, 255));
		fullNameLabel.setBounds(81, 98, 142, 16);
		fullNameLabel.setText(logic.billPaymentDisplayClientInfo(1));
		frmMetabillpaylogin.getContentPane().add(fullNameLabel);

		JTextField balanceDueLabel = new JTextField();
		balanceDueLabel.setEditable(false);
		balanceDueLabel.setBackground(new Color(224, 255, 255));
		balanceDueLabel.setBounds(512, 98, 69, 16);
		balanceDueLabel.setText(logic.billPaymentDisplayClientInfo(3));
		frmMetabillpaylogin.getContentPane().add(balanceDueLabel);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.ORANGE);
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1.setBounds(481, 169, 128, 40);
		frmMetabillpaylogin.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JButton submitPaymentButton = new JButton("Submit Payment");
		submitPaymentButton.setHorizontalTextPosition(SwingConstants.CENTER);
		submitPaymentButton.setBounds(6, 6, 116, 29);
		panel_1.add(submitPaymentButton);
		submitPaymentButton.setBackground(new Color(169, 169, 169));
		submitPaymentButton.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 12));

		// Added action to Sign Off button
		JButton signOffButton = new JButton("Sign Off");
		signOffButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frmMetabillpaylogin.setVisible(false);
				LoginWindowForm window = new LoginWindowForm();
				window.frmMetabillpaylogin.setVisible(true);
			}
		});
		signOffButton.setBackground(Color.ORANGE);
		signOffButton.setBounds(512, 16, 89, 23);
		frmMetabillpaylogin.getContentPane().add(signOffButton);

		// ************************************************************************************************************
		// Submit Payment Button Functionality
		// ************************************************************************************************************
		submitPaymentButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				{
					// Initialize CVV code field to be converted
					String cardCVV = new String(cardCVVField.getPassword());

					// If statement to verify that card info is not null
					if (!cardNumberField.getText().isEmpty() && !cardCVV.isEmpty()
							&& !cardExpirationField.getText().isEmpty() && !zipCodeField.getText().isEmpty()
							&& !paymentAmountField.getText().isEmpty()) {
						try {
							if (Double.parseDouble(paymentAmountField.getText()) > 0
									&& Double.parseDouble(paymentAmountField.getText()) <= Double
											.parseDouble(balanceDueLabel.getText().substring(1))) {
								// Initialize business layer and send over user card info
								Business_Layer logic = new Business_Layer();
								Boolean result = logic.cardInfoVerification(cardTypeField.getSelectedItem().toString(),
										cardNumberField.getText(), cardCVV, zipCodeField.getText(),
										cardExpirationField.getText());

								Boolean paymentCompleted = logic
										.paymentSubmissionAndUpdate(Double.parseDouble(paymentAmountField.getText()));
								// If statement with verification paths for card information
								if (result == true && paymentCompleted == true) {
									JOptionPane.showMessageDialog(null, "Payment successful.");
									frmMetabillpaylogin.setVisible(false);
									PaymentConfirmationForm receiptForm = new PaymentConfirmationForm();
									receiptForm.PaymentConfirmation.setVisible(true);
								} else // Invalid information provided path
								{
									JOptionPane.showMessageDialog(null,
											"Invalid card information. " + "Please try again.");
								}
							} else {
								JOptionPane.showMessageDialog(null,
										"Please enter a valid payment amount that is less than remaining amount and greater than $0.00");
							}
						} catch (Exception a) {
							JOptionPane.showMessageDialog(null,
									"ERROR# 4: Invalid amount value entered. Please try again.");
						}
					} else // Path if 1 or more fields are left NULL
					{
						JOptionPane.showMessageDialog(null, "Please fill out all empty fields.");
					}

				}
			}
		});

	}
}
