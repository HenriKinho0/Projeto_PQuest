package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TelaSelecPerso extends JFrame {
	private Player1 player1;
	private Player2 player2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaSelecPerso window = new TelaSelecPerso();
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
	public TelaSelecPerso() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setTitle("PQuest");
		setSize(1030, 660);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnVoltar = new JButton("");
		btnVoltar.setBorderPainted(false);
		btnVoltar.setContentAreaFilled(false);
		btnVoltar.setBounds(45, 551, 146, 40);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaMenu menu2 = new TelaMenu();
				menu2.setVisible(true);
				dispose();
			}
		});
		getContentPane().setLayout(null);
		btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVoltar.setFocusable(false);
		getContentPane().add(btnVoltar);
		
		JButton btnPersoMasc = new JButton("");
		btnPersoMasc.setContentAreaFilled(false);
		btnPersoMasc.setFocusable(false);
		btnPersoMasc.setIcon(new ImageIcon(TelaSelecPerso.class.getResource("/images/projetopersonagem.png")));
		btnPersoMasc.setBorderPainted(false);
		btnPersoMasc.setBounds(180, 188, 146, 257);
		btnPersoMasc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCenario cenario = new TelaCenario();
				cenario.setVisible(true);
				
				/*String pergunta1 = JOptionPane.showInputDialog("Digite seu nick");
				
				if (pergunta1.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Ops, digite um nick!", "Aviso", JOptionPane.WARNING_MESSAGE);
					JOptionPane.showInputDialog("Digite seu nick");
				} else {
					TelaCenario cenario = new TelaCenario();
					cenario.setVisible(true);
					dispose();
				}*/
				
			}
		});
		btnPersoMasc.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		getContentPane().add(btnPersoMasc);
		
		JButton btnPersoFem = new JButton("");
		btnPersoFem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCenario2 cenario2 = new TelaCenario2();
				cenario2.setVisible(true);
				
				/*String pergunta2 = JOptionPane.showInputDialog("Digite seu nick");
				
				if (pergunta2.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Ops, digite um nick!", "Aviso", JOptionPane.WARNING_MESSAGE);
					JOptionPane.showInputDialog("Digite seu nick");
				} else {
					TelaCenario cenario = new TelaCenario();
					cenario.setVisible(true);
					dispose();
				}*/
			}
		});
		btnPersoFem.setIcon(new ImageIcon(TelaSelecPerso.class.getResource("/images/projetopersonagemfem.png")));
		btnPersoFem.setBorderPainted(false);
		btnPersoFem.setBounds(694, 188, 146, 257);
		btnPersoFem.setContentAreaFilled(false);
		btnPersoFem.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPersoFem.setFocusable(false);
		getContentPane().add(btnPersoFem);
		
		JLabel lblFundoSelec = new JLabel("");
		lblFundoSelec.setIcon(new ImageIcon(TelaSelecPerso.class.getResource("/images/TelaSelecPerso.png")));
		lblFundoSelec.setBounds(0, 0, 1014, 621);
		getContentPane().add(lblFundoSelec);
	}

}