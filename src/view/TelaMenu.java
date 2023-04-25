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
		getContentPane().setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		getContentPane().setEnabled(false);
		getContentPane().setLayout(null);
		
		Button buttonSair = new Button("Voltar");
		buttonSair.setFocusable(false);
		buttonSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaLogin login = new TelaLogin();
				login.setVisible(true);
				dispose();
			}
		});
		buttonSair.setBounds(472, 411, 100, 30);
		getContentPane().add(buttonSair);
		
		Button buttonConfig = new Button("Configurações");
		buttonConfig.setFocusable(false);
		buttonConfig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				TelaConfig config = new TelaConfig();
				config.setVisible(true);
			}
		});
		buttonConfig.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		buttonConfig.setBounds(472, 370, 100, 30);
		getContentPane().add(buttonConfig);
		
		Button buttonNovoJogo = new Button("Novo Jogo");
		buttonNovoJogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaSelecPerso telaselecperso = new TelaSelecPerso();
				telaselecperso.setVisible(true);
				dispose();
			}
		});
		buttonNovoJogo.setFocusable(false);
		buttonNovoJogo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		buttonNovoJogo.setBounds(472, 280, 100, 30);
		getContentPane().add(buttonNovoJogo);
		
		Button buttonCarregar = new Button("Carregar");
		buttonCarregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonCarregar.setFocusable(false);
		buttonCarregar.setBounds(472, 325, 100, 30);
		getContentPane().add(buttonCarregar);
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