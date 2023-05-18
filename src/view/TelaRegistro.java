package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class TelaRegistro extends JFrame {
	private JTextField textCriarUsuario;
	private JPasswordField passwordCriarSenha;
	private JTextField textField;
	private JLabel lblNewLabel;

	

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
		
		textCriarUsuario = new JTextField();
		textCriarUsuario.setBounds(64, 51, 205, 23);
		getContentPane().add(textCriarUsuario);
		textCriarUsuario.setColumns(10);
		
		passwordCriarSenha = new JPasswordField();
		passwordCriarSenha.setBounds(64, 211, 205, 23);
		getContentPane().add(passwordCriarSenha);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFocusable(false);
		btnNewButton.setBounds(355, 286, 160, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnVoltar = new JButton("");
		btnVoltar.setContentAreaFilled(false);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaLogin teladelogin = new TelaLogin();
				teladelogin.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setFocusable(false);
		btnVoltar.setBorderPainted(false);
		btnVoltar.setBounds(66, 286, 124, 23);
		getContentPane().add(btnVoltar);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(64, 132, 205, 23);
		getContentPane().add(textField);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaRegistro.class.getResource("/images/TelaCadastro2.png")));
		lblNewLabel.setBounds(0, 0, 584, 361);
		getContentPane().add(lblNewLabel);
	}
}
