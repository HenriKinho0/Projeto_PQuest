package view;

import java.awt.EventQueue;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Rectangle;
import javax.swing.JPanel;

public class Pergunta1 extends JFrame {
	private final JButton btnNewButton = new JButton("");
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pergunta1 window = new Pergunta1();
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
	public Pergunta1() {
		
		setUndecorated(true);
		setResizable(false);
		getContentPane().setLayout(null);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFocusable(false);
		btnNewButton.setIcon(new ImageIcon(Pergunta1.class.getResource("/images/botaoX1.png")));
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBounds(519, 0, 31, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pergunta2 pergunta2 = new Pergunta2();
				pergunta2.setVisible(true);
				dispose();
				
				Opcao1 opcao1 = new Opcao1();
				opcao1.setVisible(true);
				
				Opcao2 opcao2 = new Opcao2();
				opcao2.setVisible(true);
				
				Opcao3 opcao3 = new Opcao3();
				opcao3.setVisible(true);
			}
		});
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setBounds(451, 116, 39, 23);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pergunta pergunta = new Pergunta();
				pergunta.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBounds(53, 116, 51, 23);
		getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Pergunta1.class.getResource("/images/caixinhaPergunta6.png")));
		lblNewLabel.setBounds(0, 0, 550, 150);
		getContentPane().add(lblNewLabel);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setBounds(435, 320, 550, 150);
	}
}
