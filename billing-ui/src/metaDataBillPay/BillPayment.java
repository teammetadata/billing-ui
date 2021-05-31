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
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

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
		btnNewButton_1.setBounds(486, 185, 124, 35);
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
		textField.setBounds(97, 129, 145, 20);
		frmMetabillpaylogin.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(100, 159, 142, 20);
		frmMetabillpaylogin.getContentPane().add(passwordField);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(6, 86, 315, 20);
		frmMetabillpaylogin.getContentPane().add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("    Utility Payment System");
		lblNewLabel_2.setBorder(new CompoundBorder());
		lblNewLabel_2.setBackground(new Color(128, 128, 128));
		lblNewLabel_2.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(146, 18, 262, 35);
		frmMetabillpaylogin.getContentPane().add(lblNewLabel_2);
		
		Panel panel = new Panel();
		panel.setEnabled(false);
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(16, 96, 454, 172);
		frmMetabillpaylogin.getContentPane().add(panel);
		
		JLabel lblNewLabel_2_1 = new JLabel("Billing Details");
		lblNewLabel_2_1.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 13));
		lblNewLabel_2_1.setBounds(232, 47, 103, 20);
		frmMetabillpaylogin.getContentPane().add(lblNewLabel_2_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(6, 288, 315, 20);
		frmMetabillpaylogin.getContentPane().add(separator_1);
		
		JLabel lblNewLabel_3 = new JLabel("logo label");
		lblNewLabel_3.setIcon(new ImageIcon(BillPayment.class.getResource("/images/logo.png")));
		lblNewLabel_3.setBounds(167, 299, 281, 94);
		frmMetabillpaylogin.getContentPane().add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(97, 188, 130, 26);
		frmMetabillpaylogin.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(99, 226, 80, 16);
		frmMetabillpaylogin.getContentPane().add(textPane);
		
		JLabel lblNewLabel_1_1 = new JLabel("Acct #");
		lblNewLabel_1_1.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(38, 193, 50, 15);
		frmMetabillpaylogin.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Acct #");
		lblNewLabel_1_2.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(38, 227, 50, 15);
		frmMetabillpaylogin.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Acct #");
		lblNewLabel_1_3.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 12));
		lblNewLabel_1_3.setBounds(271, 130, 50, 15);
		frmMetabillpaylogin.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Acct #");
		lblNewLabel_1_4.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 12));
		lblNewLabel_1_4.setBounds(271, 157, 50, 15);
		frmMetabillpaylogin.getContentPane().add(lblNewLabel_1_4);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(320, 128, 145, 20);
		frmMetabillpaylogin.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(320, 152, 145, 20);
		frmMetabillpaylogin.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(476, 96, 145, 20);
		frmMetabillpaylogin.getContentPane().add(textField_4);
		
		
	}
}
