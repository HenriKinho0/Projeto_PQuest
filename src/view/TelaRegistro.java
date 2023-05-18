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
	private static final long serialVersionUID = 1L;
	private JTextField textCriarUsuario;
	private JPasswordField passwordCriarSenha;

	

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
		textCriarUsuario.setBounds(183, 102, 195, 26);
		getContentPane().add(textCriarUsuario);
		textCriarUsuario.setColumns(10);
		
		passwordCriarSenha = new JPasswordField();
		passwordCriarSenha.setBounds(183, 188, 195, 26);
		getContentPane().add(passwordCriarSenha);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFocusable(false);
		btnNewButton.setBounds(317, 262, 124, 23);
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
		btnVoltar.setBounds(121, 262, 124, 23);
		getContentPane().add(btnVoltar);
	}

}
