package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pergunta extends JFrame {

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pergunta window = new Pergunta();
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
	public Pergunta() {
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
				dispose();
			}
		});
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setIcon(new ImageIcon(Pergunta.class.getResource("/images/botaoX1.png")));
		btnNewButton.setFocusable(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBounds(516, 0, 34, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pergunta1 pergunta1 = new Pergunta1();
				pergunta1.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBounds(452, 116, 43, 23);
		getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Pergunta.class.getResource("/images/caixinhaPergunta5.png")));
		lblNewLabel.setBounds(0, 0, 550, 150);
		getContentPane().add(lblNewLabel);
	}

}
