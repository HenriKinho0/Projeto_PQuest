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
import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;
import javax.swing.JToggleButton;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;

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
		getContentPane().setLayout(null);
		
		JButton btnNovoJogo = new JButton("");
		btnNovoJogo.setBorderPainted(false);
		btnNovoJogo.setContentAreaFilled(false);
		btnNovoJogo.setIcon(new ImageIcon(TelaMenu.class.getResource("/images/botaoTeste.png")));
		btnNovoJogo.addMouseMotionListener(new MouseMotionAdapter() {
		});
		btnNovoJogo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNovoJogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaSelecPerso telaselecperso = new TelaSelecPerso();
				telaselecperso.setVisible(true);
				dispose();
			}
		});
		btnNovoJogo.setBounds(317, 227, 392, 44);
		getContentPane().add(btnNovoJogo);
		
		JButton btnCarregar = new JButton("");
		btnCarregar.setIcon(new ImageIcon(TelaMenu.class.getResource("/images/btnCarregar2.png")));
		btnCarregar.setFocusable(false);
		btnCarregar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCarregar.setContentAreaFilled(false);
		btnCarregar.setBorderPainted(false);
		btnCarregar.setBounds(337, 303, 354, 44);
		getContentPane().add(btnCarregar);
		
		JButton btnConfig = new JButton("");
		btnConfig.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnConfig.setIcon(new ImageIcon(TelaMenu.class.getResource("/images/btnConfig2.png")));
		btnConfig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaConfig config = new TelaConfig();
				config.setVisible(true);
			}
		});
		btnConfig.setFocusable(false);
		btnConfig.setContentAreaFilled(false);
		btnConfig.setBorderPainted(false);
		btnConfig.setBounds(365, 380, 292, 44);
		getContentPane().add(btnConfig);
		
		JButton btnVoltar = new JButton("");
		btnVoltar.setContentAreaFilled(false);
		btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVoltar.setIcon(new ImageIcon(TelaMenu.class.getResource("/images/btnVoltar.png")));
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaLogin login = new TelaLogin();
				login.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setFocusable(false);
		btnVoltar.setBorderPainted(false);
		btnVoltar.setBounds(386, 457, 263, 44);
		getContentPane().add(btnVoltar);
		
		JLabel lblFundoTela = new JLabel("");
		lblFundoTela.setIcon(new ImageIcon(TelaMenu.class.getResource("/images/FundoTela.png")));
		lblFundoTela.setBounds(0, 0, 1014, 621);
		getContentPane().add(lblFundoTela);
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