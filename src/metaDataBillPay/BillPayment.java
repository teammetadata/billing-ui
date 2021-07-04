package metaDataBillPay;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JTextField;

public class BillPayment {

	JFrame frmMetabillpaylogin;
	private JTextField cardNumberField;
	private JPasswordField cardCVVField;
	private JTextField cardExpirationField;
	private JTextField zipCodeField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
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
	private void initialize() {
		Business_Layer logic = new Business_Layer();
		frmMetabillpaylogin = new JFrame();
		frmMetabillpaylogin.getContentPane().setBackground(new Color(192, 192, 192));
		frmMetabillpaylogin.getContentPane().setForeground(Color.LIGHT_GRAY);
		frmMetabillpaylogin.setForeground(SystemColor.desktop);
		frmMetabillpaylogin.setTitle("MetaBillPayLogin");
		frmMetabillpaylogin.setIconImage(Toolkit.getDefaultToolkit().getImage(".//artifacts//icon.png"));
		frmMetabillpaylogin.setAutoRequestFocus(false);
		frmMetabillpaylogin.setResizable(false);
		frmMetabillpaylogin.setBounds(100, 100, 639, 454);
		frmMetabillpaylogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMetabillpaylogin.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Full Name");
		lblNewLabel.setBounds(16, 100, 62, 15);
		lblNewLabel.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 12));
		frmMetabillpaylogin.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Card Type");
		lblNewLabel_1.setBounds(16, 159, 69, 15);
		lblNewLabel_1.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 12));
		frmMetabillpaylogin.getContentPane().add(lblNewLabel_1);

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
		lblNewLabel_3.setIcon(new ImageIcon(".//artifacts//logo.png"));
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

		JComboBox cardTypeField = new JComboBox();
		cardTypeField.setModel(new DefaultComboBoxModel(new String[] { "Credit", "Debit" }));
		cardTypeField.setMaximumRowCount(4);
		cardTypeField.setBounds(84, 153, 100, 21);
		frmMetabillpaylogin.getContentPane().add(cardTypeField);

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

		JLabel lblNewLabel_1_6 = new JLabel("Card Card #");
		lblNewLabel_1_6.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 12));
		lblNewLabel_1_6.setBounds(16, 186, 69, 15);
		frmMetabillpaylogin.getContentPane().add(lblNewLabel_1_6);

		JLabel lblNewLabel_1_7 = new JLabel("CVV Code");
		lblNewLabel_1_7.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 12));
		lblNewLabel_1_7.setBounds(16, 213, 62, 15);
		frmMetabillpaylogin.getContentPane().add(lblNewLabel_1_7);

		JLabel lblNewLabel_1_8 = new JLabel("Expiration Date");
		lblNewLabel_1_8.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 12));
		lblNewLabel_1_8.setBounds(271, 207, 97, 15);
		frmMetabillpaylogin.getContentPane().add(lblNewLabel_1_8);

		JLabel lblNewLabel_1_9 = new JLabel("Zip Code");
		lblNewLabel_1_9.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 12));
		lblNewLabel_1_9.setBounds(271, 180, 97, 15);
		frmMetabillpaylogin.getContentPane().add(lblNewLabel_1_9);

		cardNumberField = new JTextField();
		cardNumberField.setBounds(84, 176, 160, 25);
		frmMetabillpaylogin.getContentPane().add(cardNumberField);

		cardExpirationField = new JTextField();
		cardExpirationField.setBounds(364, 203, 97, 20);
		frmMetabillpaylogin.getContentPane().add(cardExpirationField);

		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(Color.BLACK);
		separator_2.setBounds(0, 257, 627, 30);
		frmMetabillpaylogin.getContentPane().add(separator_2);

		zipCodeField = new JTextField();
		zipCodeField.setBounds(364, 176, 84, 20);
		frmMetabillpaylogin.getContentPane().add(zipCodeField);

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
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addGap(74)
						.addComponent(cardCVVField, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(337, Short.MAX_VALUE)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.TRAILING).addGroup(Alignment.LEADING,
				gl_panel.createSequentialGroup().addGap(62)
						.addComponent(cardCVVField, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(20, Short.MAX_VALUE)));
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
		panel_1.setBackground(new Color(255, 218, 185));
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

		// ************************************************************************************************************
		// Submit Payment Button Functionality
		// ************************************************************************************************************
		submitPaymentButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				{
					// Initialize CVV code field to be converted
					String cardCVV = new String(cardCVVField.getPassword());

					// If statement to verify that card info is not null
					if (!cardNumberField.getText().isEmpty() && !cardCVV.isEmpty()
							&& !cardExpirationField.getText().isEmpty() && !zipCodeField.getText().isEmpty()) {
						// Initialize business layer and send over user card info
						Business_Layer logic = new Business_Layer();
						Boolean result = logic.cardInfoVerification(cardTypeField.getSelectedItem().toString(),
								cardNumberField.getText(), cardCVV, zipCodeField.getText(),
								cardExpirationField.getText());

						// If statement with verification paths for card information
						if (result == true) {
							JOptionPane.showMessageDialog(null, "Payment successful.");
							frmMetabillpaylogin.setVisible(false);
							PaymentConfirmationForm receiptForm = new PaymentConfirmationForm();
							receiptForm.PaymentConfirmation.setVisible(true);
						} else // Invalid information provided path
						{
							JOptionPane.showMessageDialog(null, "Invalid card information. " + "Please try again.");
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
