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
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class TelaLogin extends JFrame {
	private JTextField textUsuario;
	private JPasswordField passwordSenha;


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
		
		textUsuario = new JTextField();
		textUsuario.setBounds(69, 122, 213, 20);
		getContentPane().add(textUsuario);
		textUsuario.setColumns(10);
		
		passwordSenha = new JPasswordField();
		passwordSenha.setBounds(69, 197, 213, 20);
		getContentPane().add(passwordSenha);
		
		JButton btnEntrar = new JButton("");
		btnEntrar.setIcon(new ImageIcon(TelaLogin.class.getResource("/images/btnEntrar.png")));
		btnEntrar.setContentAreaFilled(false);
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaMenu menu = new TelaMenu();
				menu.setVisible(true);
				dispose();
			}
		});
		btnEntrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEntrar.setBorderPainted(false);
		btnEntrar.setFocusable(false);
		btnEntrar.setBounds(69, 280, 124, 34);
		getContentPane().add(btnEntrar);
		
		JButton btnCadastrar = new JButton("");
		btnCadastrar.setIcon(new ImageIcon(TelaLogin.class.getResource("/images/btnCadastrar.png")));
		btnCadastrar.setContentAreaFilled(false);
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaRegistro teladeregistro = new TelaRegistro();
				teladeregistro.setVisible(true);
				dispose();
			}
		});
		btnCadastrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCadastrar.setBorderPainted(false);
		btnCadastrar.setFocusable(false);
		btnCadastrar.setBounds(379, 285, 180, 29);
		getContentPane().add(btnCadastrar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaLogin.class.getResource("/images/TelaLogin3.png")));
		lblNewLabel.setBounds(0, 0, 584, 361);
		getContentPane().add(lblNewLabel);
	}
}
