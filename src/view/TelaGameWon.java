package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class TelaGameWon extends JFrame {


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaGameWon window = new TelaGameWon();
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
	public TelaGameWon() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setTitle("PQuest");
		setBounds(200, 100, 1030, 660);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaGameWon.class.getResource("/images/TelaGameWon2.png")));
		lblNewLabel.setBounds(0, 0, 1014, 621);
		getContentPane().add(lblNewLabel);
	}

}
