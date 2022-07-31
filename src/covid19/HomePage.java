package covid19;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;

public class HomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 565, 422);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.RED);
		panel.setBounds(5, 5, 541, 66);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Welcome To Vaccination Drive");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(74, 22, 366, 34);
		panel.add(lblNewLabel);

		JButton btnNewButton = new JButton("Registration page");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(156, 126, 236, 43);
		contentPane.add(btnNewButton);

		JButton btnLoginPage = new JButton("Login page");
		btnLoginPage.setBackground(new Color(255, 255, 0));
		btnLoginPage.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLoginPage.setBounds(156, 207, 236, 43);
		contentPane.add(btnLoginPage);
	}
}
