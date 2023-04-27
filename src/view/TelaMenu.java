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
		
		Button buttonSair = new Button("");
		buttonSair.setBounds(377, 566, 251, 30);
		buttonSair.setVisible(false);
		buttonSair.setFocusable(false);
		buttonSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaLogin login = new TelaLogin();
				login.setVisible(true);
				dispose();
			}
		});
		getContentPane().setLayout(null);
		getContentPane().add(buttonSair);
		
		Button buttonConfig = new Button("");
		buttonConfig.setBounds(377, 457, 251, 30);
		buttonConfig.setVisible(false);
		buttonConfig.setFocusable(false);
		buttonConfig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				TelaConfig config = new TelaConfig();
				config.setVisible(true);
			}
		});
		buttonConfig.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		getContentPane().add(buttonConfig);
		
		Button buttonNovoJogo = new Button("");
		buttonNovoJogo.setVisible(false);
		buttonNovoJogo.setBounds(311, 238, 380, 36);
		buttonNovoJogo.setFocusable(false);
		buttonNovoJogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaSelecPerso telaselecperso = new TelaSelecPerso();
				telaselecperso.setVisible(true);
				dispose();
			}
		});
		buttonNovoJogo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		getContentPane().add(buttonNovoJogo);
		
		Button buttonCarregar = new Button("");
		buttonCarregar.setBounds(336, 347, 334, 30);
		buttonCarregar.setVisible(false);
		buttonCarregar.setFocusable(false);
		buttonCarregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		getContentPane().add(buttonCarregar);
		
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