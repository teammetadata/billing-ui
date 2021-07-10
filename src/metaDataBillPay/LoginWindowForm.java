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
import java.util.prefs.Preferences;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.SoftBevelBorder;

public class LoginWindowForm {

	public JFrame frmMetabillpaylogin;
	public JTextField usernameField;
	public JPasswordField passwordField;
	public JCheckBox remember;
	public static String actNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					LoginWindowForm window = new LoginWindowForm();
					window.frmMetabillpaylogin.setVisible(true);

				} catch (Exception e) // Exception catching path
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginWindowForm() {
		initialize();
		rememberMe();
	}

	// Initialize variables for remember me function
	Preferences preference;
	boolean rememberPreference;

	public void rememberMe() {

		// Get the preference of the rememberMe preference
		preference = Preferences.userNodeForPackage(this.getClass());
		// Check if the check box was selected/clicked
		rememberPreference = preference.getBoolean("Remember me", Boolean.valueOf(""));
		if (rememberPreference) {
			// If statement to replace the username & pwd fields with last login credentials
			usernameField.setText(preference.get("Username", ""));
			passwordField.setText(preference.get("Password", ""));
			remember.setSelected(rememberPreference);
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Image smallIcon = null;
		try {
			URL url = new URL(
					"https://1.bp.blogspot.com/-1wQfEcfaoXM/YOjTGljPplI/AAAAAAAAFGk/4YGPpSXXCxIzJO6MIw9hu1Q0QP4NPz1DgCLcBGAsYHQ/s0/icon.png");
			smallIcon = ImageIO.read(url);
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
		frmMetabillpaylogin.setBounds(100, 100, 327, 427);
		frmMetabillpaylogin.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frmMetabillpaylogin.getContentPane().setLayout(null);

		// ************************************************************************************************************
		// Login Button Functionality
		// ************************************************************************************************************
		JButton loginButton = new JButton("Login");
		loginButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				{
					String pwd = new String(passwordField.getPassword()); // Password field needs to be converted

					// Make sure that inputs are not NULL
					if (!usernameField.getText().isEmpty() && !pwd.isEmpty()) {
						Business_Layer logic = new Business_Layer();
						actNumber = logic.getLoginInfo(usernameField.getText(), pwd);

						// Path if login was successful and rememeberMe method is checked
						if (!actNumber.isEmpty()) {
							if (remember.isSelected() && !rememberPreference) {
								// Insert into the preference the user name
								preference.put("Username", usernameField.getText());
								preference.put("Password", pwd);
								preference.putBoolean("Remember me", true);
							}
							// RemeberMe method is not selected
							else if (!remember.isSelected() && rememberPreference) {
								// Insert into the preference the user name
								preference.put("Username", "");
								preference.put("Password", "");
								preference.putBoolean("Remember me", false);
							}
							frmMetabillpaylogin.setVisible(false);
							BillPayment billForm = new BillPayment();
							billForm.frmMetabillpaylogin.setVisible(true);

						} else // Invalid user name & password combination path
						{
							JOptionPane.showMessageDialog(null,
									"Invalid username and password combination. " + "Please try again.");
						}
					} else // Path if 1 or more fields are left NULL
					{
						JOptionPane.showMessageDialog(null, "Please fill out all empty fields.");
					}

				}
			}
		});
		loginButton.setBackground(new Color(238, 232, 170));
		loginButton.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		loginButton.setBounds(97, 241, 128, 35);
		loginButton.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 14));
		frmMetabillpaylogin.getContentPane().add(loginButton);

		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(38, 132, 62, 15);
		lblNewLabel.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 12));
		frmMetabillpaylogin.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(38, 159, 62, 15);
		lblNewLabel_1.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 12));
		frmMetabillpaylogin.getContentPane().add(lblNewLabel_1);

		usernameField = new JTextField();
		usernameField.setBounds(97, 129, 145, 20);
		frmMetabillpaylogin.getContentPane().add(usernameField);
		usernameField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(97, 156, 145, 20);
		frmMetabillpaylogin.getContentPane().add(passwordField);

		JSeparator separator = new JSeparator();
		separator.setBounds(6, 86, 315, 20);
		frmMetabillpaylogin.getContentPane().add(separator);

		JLabel lblNewLabel_2 = new JLabel("    Utility Payment System");
		lblNewLabel_2.setBorder(new CompoundBorder());
		lblNewLabel_2.setBackground(new Color(128, 128, 128));
		lblNewLabel_2.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(29, 23, 262, 35);
		frmMetabillpaylogin.getContentPane().add(lblNewLabel_2);

		Panel panel = new Panel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(29, 112, 239, 79);
		frmMetabillpaylogin.getContentPane().add(panel);

		JLabel lblNewLabel_2_1 = new JLabel("         Please login to view your bill");
		lblNewLabel_2_1.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 10));
		lblNewLabel_2_1.setBounds(66, 54, 172, 20);
		frmMetabillpaylogin.getContentPane().add(lblNewLabel_2_1);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(6, 288, 315, 20);
		frmMetabillpaylogin.getContentPane().add(separator_1);

		remember = new JCheckBox("Remember me");
		remember.setBounds(81, 195, 128, 23);
		frmMetabillpaylogin.getContentPane().add(remember);

		Image bigIcon = null;
		try {
			URL url = new URL(
					"https://1.bp.blogspot.com/-U6iSATW2Iac/YOjS-kBJ5AI/AAAAAAAAFGg/CelYw0QfHUwMN-WF3Z3tCmrAgm7s-kCcACLcBGAsYHQ/s0/metadatalogo.png");
			bigIcon = ImageIO.read(url);
		} catch (IOException e) {
		}
		JLabel lblNewLabel_3 = new JLabel();
		lblNewLabel_3.setIcon(new ImageIcon(bigIcon));
		lblNewLabel_3.setBounds(29, 288, 281, 94);
		frmMetabillpaylogin.getContentPane().add(lblNewLabel_3);

	}
}
