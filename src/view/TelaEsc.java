package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class TelaEsc extends JFrame {
	private final JButton btnNewButton = new JButton("Sair");

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaEsc window = new TelaEsc();
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
	public TelaEsc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setLocationRelativeTo(null);
		setBounds(595, 300, 250, 300);
		getContentPane().setLayout(null);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setIcon(new ImageIcon(TelaEsc.class.getResource("/images/btnVoltarCadastro.png")));
		btnNewButton.setFocusable(false);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaMenu telamenu = new TelaMenu();
				telamenu.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(71, 220, 121, 30);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaEsc.class.getResource("/images/TelaSair3.png")));
		lblNewLabel.setBounds(0, 0, 234, 261);
		getContentPane().add(lblNewLabel);
	}

}
