package metaDataBillPay;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import java.awt.Panel;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BillPayment {

	private JFrame frmMetabillpaylogin;
	private JPasswordField passwordField;
	private JPasswordField passwordField_2;
	private JPasswordField passwordField_3;
	private JPasswordField passwordField_5;

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
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMetabillpaylogin = new JFrame();
		frmMetabillpaylogin.getContentPane().setBackground(new Color(192, 192, 192));
		frmMetabillpaylogin.getContentPane().setForeground(Color.LIGHT_GRAY);
		frmMetabillpaylogin.setForeground(SystemColor.desktop);
		frmMetabillpaylogin.setTitle("MetaBillPayLogin");
		frmMetabillpaylogin.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Canal\\OneDrive\\Pictures\\icon.png"));
		frmMetabillpaylogin.setAutoRequestFocus(false);
		frmMetabillpaylogin.setResizable(false);
		frmMetabillpaylogin.setBounds(100, 100, 627, 427);
		frmMetabillpaylogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMetabillpaylogin.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Submit Payment");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
			@Override
			public void mousePressed(MouseEvent e) {
			}
		});
		btnNewButton.setToolTipText("Click to pay!");
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton.setBounds(485, 159, 124, 57);
		btnNewButton.setFont(new Font("Kohinoor Bangla", Font.BOLD, 13));
		frmMetabillpaylogin.getContentPane().add(btnNewButton);
		
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
		lblNewLabel_3.setIcon(new ImageIcon(BillPayment.class.getResource("/images/logo.png")));
		lblNewLabel_3.setBounds(167, 287, 281, 94);
		frmMetabillpaylogin.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("Balance Due               $");
		lblNewLabel_1_1.setFont(new Font("Kohinoor Bangla", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(402, 100, 125, 15);
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
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"AMEX", "VISA", "MASTERCARD", "DISCOVER"}));
		comboBox.setMaximumRowCount(4);
		comboBox.setBounds(78, 153, 103, 27);
		frmMetabillpaylogin.getContentPane().add(comboBox);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(224, 255, 255));
		textArea.setBounds(81, 67, 142, 16);
		frmMetabillpaylogin.getContentPane().add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBackground(new Color(224, 255, 255));
		textArea_1.setBounds(528, 67, 81, 16);
		frmMetabillpaylogin.getContentPane().add(textArea_1);
		
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
		
		JLabel lblNewLabel_1_9 = new JLabel("Billing ZipCode");
		lblNewLabel_1_9.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 12));
		lblNewLabel_1_9.setBounds(271, 180, 81, 15);
		frmMetabillpaylogin.getContentPane().add(lblNewLabel_1_9);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(82, 176, 158, 25);
		frmMetabillpaylogin.getContentPane().add(passwordField);
		
		passwordField_3 = new JPasswordField();
		passwordField_3.setBounds(364, 203, 97, 20);
		frmMetabillpaylogin.getContentPane().add(passwordField_3);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(Color.BLACK);
		separator_2.setBounds(0, 257, 627, 30);
		frmMetabillpaylogin.getContentPane().add(separator_2);
		
		passwordField_5 = new JPasswordField();
		passwordField_5.setBounds(364, 176, 97, 20);
		frmMetabillpaylogin.getContentPane().add(passwordField_5);
		
		Panel panel = new Panel();
		panel.setFocusTraversalKeysEnabled(false);
		panel.setBounds(10, 144, 459, 107);
		frmMetabillpaylogin.getContentPane().add(panel);
		
		passwordField_2 = new JPasswordField();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(73)
					.addComponent(passwordField_2, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(337, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(62, Short.MAX_VALUE)
					.addComponent(passwordField_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(20))
		);
		panel.setLayout(gl_panel);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBackground(new Color(224, 255, 255));
		textArea_2.setBounds(81, 98, 142, 16);
		frmMetabillpaylogin.getContentPane().add(textArea_2);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBackground(new Color(224, 255, 255));
		textArea_3.setBounds(528, 98, 81, 16);
		frmMetabillpaylogin.getContentPane().add(textArea_3);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(501, 336, 117, 29);
		frmMetabillpaylogin.getContentPane().add(btnNewButton_1);
		
		
	}
}
