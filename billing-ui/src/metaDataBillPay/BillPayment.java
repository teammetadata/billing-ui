package metaDataBillPay;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
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
import javax.swing.JTextPane;

public class BillPayment {

	private JFrame frmMetabillpaylogin;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;
	private JPasswordField passwordField_3;
	private JPasswordField passwordField_4;

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
		
		JButton btnNewButton_1 = new JButton("Pay Bill");
		btnNewButton_1.setBackground(new Color(238, 232, 170));
		btnNewButton_1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton_1.setBounds(486, 185, 124, 57);
		btnNewButton_1.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 14));
		frmMetabillpaylogin.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(38, 132, 62, 15);
		lblNewLabel.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 12));
		frmMetabillpaylogin.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Address");
		lblNewLabel_1.setBounds(38, 159, 50, 15);
		lblNewLabel_1.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 12));
		frmMetabillpaylogin.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(76, 128, 153, 20);
		frmMetabillpaylogin.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(86, 155, 141, 20);
		frmMetabillpaylogin.getContentPane().add(passwordField);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(6, 86, 621, 20);
		frmMetabillpaylogin.getContentPane().add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("    Utility Payment System");
		lblNewLabel_2.setBorder(new CompoundBorder());
		lblNewLabel_2.setBackground(new Color(128, 128, 128));
		lblNewLabel_2.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(161, 18, 262, 35);
		frmMetabillpaylogin.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Billing Details");
		lblNewLabel_2_1.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 13));
		lblNewLabel_2_1.setBounds(249, 46, 103, 20);
		frmMetabillpaylogin.getContentPane().add(lblNewLabel_2_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(6, 288, 621, 20);
		frmMetabillpaylogin.getContentPane().add(separator_1);
		
		JLabel lblNewLabel_3 = new JLabel("logo label");
		lblNewLabel_3.setIcon(new ImageIcon(BillPayment.class.getResource("/images/logo.png")));
		lblNewLabel_3.setBounds(167, 299, 281, 94);
		frmMetabillpaylogin.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("Electric Usage:");
		lblNewLabel_1_1.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(38, 185, 90, 15);
		frmMetabillpaylogin.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Acct #");
		lblNewLabel_1_2.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(27, 72, 50, 15);
		frmMetabillpaylogin.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Amount Due:");
		lblNewLabel_1_3.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 12));
		lblNewLabel_1_3.setBounds(271, 130, 81, 15);
		frmMetabillpaylogin.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Payment Date");
		lblNewLabel_1_4.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 12));
		lblNewLabel_1_4.setBounds(271, 157, 81, 15);
		frmMetabillpaylogin.getContentPane().add(lblNewLabel_1_4);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(127, 181, 102, 20);
		frmMetabillpaylogin.getContentPane().add(passwordField_1);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setBounds(76, 68, 90, 20);
		frmMetabillpaylogin.getContentPane().add(passwordField_2);
		
		passwordField_3 = new JPasswordField();
		passwordField_3.setBounds(351, 125, 97, 20);
		frmMetabillpaylogin.getContentPane().add(passwordField_3);
		
		passwordField_4 = new JPasswordField();
		passwordField_4.setBounds(351, 154, 97, 20);
		frmMetabillpaylogin.getContentPane().add(passwordField_4);
		
		Panel panel = new Panel();
		panel.setEnabled(false);
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(16, 96, 445, 186);
		frmMetabillpaylogin.getContentPane().add(panel);
		
		
	}
}
