package LogIn;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.UIManager;

public class LogIn1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	/**
	 * @wbp.nonvisual location=209,474
	 */
	private final JButton button = new JButton("New button");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn1 frame = new LogIn1();
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
	public LogIn1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 592, 411);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Şifre");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(128, 0, 255));
		lblNewLabel.setBackground(new Color(255, 128, 64));
		lblNewLabel.setBounds(84, 165, 132, 30);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(276, 119, 113, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(276, 165, 113, 30);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_1 = new JLabel("Kullanıcı Adı");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setForeground(new Color(128, 0, 255));
		lblNewLabel_1.setBounds(84, 122, 132, 33);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Giriş");
		btnNewButton.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			String pass=new String (passwordField.getPassword());
			
			if(lblNewLabel_1.equals(lblNewLabel_1.getText())&& lblNewLabel_1.equals (pass)){
				System.out.println("Giris Yapildi");
				
			}
			else
			
				System.out.println("Hatali adi && şifre");
			
			
		}
		
		
	} );
		
		btnNewButton.setBounds(276, 229, 113, 33);
		contentPane.add(btnNewButton);
		}	
		
		/*
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setForeground(new Color(128, 0, 64));
		*/
	
	
}
