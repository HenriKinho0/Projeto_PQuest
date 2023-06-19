package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pergunta2 extends JFrame {


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pergunta2 window = new Pergunta2();
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
	public Pergunta2() {
		setUndecorated(true);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		setBounds(435, 320, 550, 150);
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pergunta1 pergunta1 = new Pergunta1();
				pergunta1.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setFocusable(false);
		btnNewButton.setBounds(54, 116, 44, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(Pergunta2.class.getResource("/images/botaoX1.png")));
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setBounds(515, 0, 35, 23);
		getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Pergunta2.class.getResource("/images/caixinhaPergunta4.png")));
		lblNewLabel.setBounds(0, 0, 550, 150);
		getContentPane().add(lblNewLabel);
	}
}
