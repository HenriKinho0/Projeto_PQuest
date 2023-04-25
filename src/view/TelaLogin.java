package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLogin extends JFrame {
	private JTextField textField;
	private JPasswordField passwordField;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin window = new TelaLogin();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setTitle("PQuest");
		setSize(600, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(183, 102, 195, 26);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(183, 188, 195, 26);
		getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaMenu menu = new TelaMenu();
				menu.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFocusable(false);
		btnNewButton.setBounds(183, 262, 89, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Registrar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaRegistro teladeregistro = new TelaRegistro();
				teladeregistro.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setBounds(289, 262, 89, 23);
		getContentPane().add(btnNewButton_1);
	}
}
