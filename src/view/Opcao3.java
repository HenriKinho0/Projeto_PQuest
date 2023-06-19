package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Opcao3 extends JFrame {


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Opcao3 window = new Opcao3();
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
	public Opcao3() {
		setUndecorated(true);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Opcao3.class.getResource("/images/respostaOpcao3.png")));
		lblNewLabel.setBounds(0, 0, 80, 25);
		getContentPane().add(lblNewLabel);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		setBounds(905, 475, 80, 25);
		
	}

}
