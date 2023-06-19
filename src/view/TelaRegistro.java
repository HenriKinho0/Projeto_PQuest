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
		textCriarUsuario.setBounds(71, 73, 211, 23);
		getContentPane().add(textCriarUsuario);
		textCriarUsuario.setColumns(10);
		
		passwordCriarSenha = new JPasswordField();
		passwordCriarSenha.setBounds(73, 219, 211, 23);
		getContentPane().add(passwordCriarSenha);
		
		JButton btnConfirmar = new JButton("");
		btnConfirmar.setIcon(new ImageIcon(TelaRegistro.class.getResource("/images/btnConfirmar.png")));
		btnConfirmar.setContentAreaFilled(false);
		btnConfirmar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnConfirmar.setBorderPainted(false);
		btnConfirmar.setFocusable(false);
		btnConfirmar.setBounds(388, 289, 160, 23);
		getContentPane().add(btnConfirmar);
		
		JButton btnVoltar = new JButton("");
		btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVoltar.setIcon(new ImageIcon(TelaRegistro.class.getResource("/images/btnVoltarCadastro.png")));
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
		textField.setBounds(71, 147, 211, 23);
		getContentPane().add(textField);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaRegistro.class.getResource("/images/TelaCadastro3.png")));
		lblNewLabel.setBounds(0, 0, 584, 361);
		getContentPane().add(lblNewLabel);
	}
}
