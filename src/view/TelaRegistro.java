package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaRegistro extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaRegistro window = new TelaRegistro();
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
	public TelaRegistro() {
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
		textField.setBounds(183, 80, 195, 26);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(183, 145, 195, 26);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(183, 210, 195, 26);
		getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Registrar");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFocusable(false);
		btnNewButton.setBounds(289, 281, 89, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaLogin teladelogin = new TelaLogin();
				teladelogin.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setFocusable(false);
		btnVoltar.setBorderPainted(false);
		btnVoltar.setBounds(183, 281, 89, 23);
		getContentPane().add(btnVoltar);
	}

}
