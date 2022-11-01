package View;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;

public class Login extends JFrame {
	

	private JPanel contentPane;
	private JTextField txtUserName;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setTitle("Login From");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/Image/java.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 651, 527);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel_1 = new JLabel("UserName");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(71, 177, 103, 27);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1.setIcon(new ImageIcon(Login.class.getResource("/Image/man.png")));
		
		txtUserName = new JTextField();
		txtUserName.setBounds(178, 186, 355, 34);
		txtUserName.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setBounds(69, 230, 105, 27);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1_1.setIcon(new ImageIcon(Login.class.getResource("/Image/padlock.png")));
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtUserName.getText().equals("thuanddgch200729") && txtPassword.getText().equals("123456")){
					// đóng trang login
					dispose();
					// Hiển thị đến trang home
				Home h= new Home(); 
					h.setVisible(true);
				}else {
					JOptionPane.showConfirmDialog(null,"UserName or Password is INVALID","Warning",JOptionPane.PLAIN_MESSAGE);
				}
				
			} 
		});
		
		btnLogin.setBounds(87, 294, 175, 33);
		btnLogin.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnLogin.setIcon(new ImageIcon(Login.class.getResource("/Image/login (1).png")));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(284, 75, 92, 64);
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/Image/login.png")));
		
		JButton btngoogle = new JButton("Google");
		btngoogle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btngoogle.setBounds(394, 380, 137, 31);
		btngoogle.setIcon(new ImageIcon(Login.class.getResource("/Image/google.png")));
		
		JLabel lblNewLabel_2 = new JLabel(" @2022| Design by Dang Duc Thuan");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(236, 450, 249, 13);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		contentPane.setLayout(null);
		contentPane.add(btngoogle);
		contentPane.add(btnLogin);
		contentPane.add(lblNewLabel_1);
		contentPane.add(lblNewLabel_1_1);
		contentPane.add(txtUserName);
		contentPane.add(lblNewLabel_2);
		contentPane.add(lblNewLabel);
		
		JButton btnForgotPassword = new JButton("Forgot Password");
		btnForgotPassword.setIcon(new ImageIcon(Login.class.getResource("/Image/forgot-password.png")));
		btnForgotPassword.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnForgotPassword.setBounds(360, 294, 175, 33);
		contentPane.add(btnForgotPassword);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(178, 227, 355, 33);
		contentPane.add(txtPassword);
		
		JButton btnfacebook = new JButton("Facebook");
		btnfacebook.setIcon(new ImageIcon(Login.class.getResource("/Image/facebook.png")));
		btnfacebook.setBounds(112, 380, 137, 31);
		contentPane.add(btnfacebook);
		
		JCheckBox chckbxPassword = new JCheckBox("Show password");
		chckbxPassword.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(txtPassword.echoCharIsSet()){
					txtPassword.setEchoChar('\0');
				}else {
					txtPassword.setEchoChar('●');
				}
				
			}
		});
		chckbxPassword.setBackground(Color.LIGHT_GRAY);
		chckbxPassword.setBounds(133, 263, 129, 21);
		contentPane.add(chckbxPassword);
	}
}
