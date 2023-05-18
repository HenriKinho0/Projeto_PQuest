package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;
import java.awt.Panel;
import java.awt.ScrollPane;
import javax.swing.JPanel;
import java.awt.Cursor;
import javax.swing.JLabel;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class TelaMenu extends JFrame {

	

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaMenu window = new TelaMenu();
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
	public TelaMenu() {
		getContentPane().setFocusable(false);
		setResizable(false);
		getContentPane().setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		getContentPane().setEnabled(false);
		getContentPane().setLayout(null);
		
		JButton btnNovoJogo = new JButton("");
		btnNovoJogo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNovoJogo.setContentAreaFilled(false);
		btnNovoJogo.setBorderPainted(false);
		btnNovoJogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaSelecPerso telaselecperso = new TelaSelecPerso();
				telaselecperso.setVisible(true);
				dispose();
			}
		});
		btnNovoJogo.setBounds(311, 238, 380, 36);
		getContentPane().add(btnNovoJogo);
		
		JButton btnCarregar = new JButton("");
		btnCarregar.setFocusable(false);
		btnCarregar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCarregar.setContentAreaFilled(false);
		btnCarregar.setBorderPainted(false);
		btnCarregar.setBounds(330, 347, 343, 36);
		getContentPane().add(btnCarregar);
		
		JButton btnConfig = new JButton("");
		btnConfig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaConfig config = new TelaConfig();
				config.setVisible(true);
			}
		});
		btnConfig.setFocusable(false);
		btnConfig.setContentAreaFilled(false);
		btnConfig.setBorderPainted(false);
		btnConfig.setBounds(376, 454, 258, 36);
		getContentPane().add(btnConfig);
		
		JButton btnVoltar = new JButton("");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaLogin login = new TelaLogin();
				login.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setFocusable(false);
		btnVoltar.setContentAreaFilled(false);
		btnVoltar.setBorderPainted(false);
		btnVoltar.setBounds(376, 561, 258, 36);
		getContentPane().add(btnVoltar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 1014, 621);
		lblNewLabel.setIcon(new ImageIcon(TelaMenu.class.getResource("/images/FundoTelaMenu1.png")));
		getContentPane().add(lblNewLabel);
		initialize();
	}

	/**
	 * Inicializando a tela / definindo tamanho
	 */
	private void initialize() {
		setTitle("PQuest");
		setSize(1030, 660);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}