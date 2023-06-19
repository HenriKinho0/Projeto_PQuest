package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Opcao2 extends JFrame {
	private final JLabel lblNewLabel = new JLabel("");



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Opcao2 window = new Opcao2();
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
	public Opcao2() {
		setUndecorated(true);
		getContentPane().setLayout(null);
		lblNewLabel.setIcon(new ImageIcon(Opcao2.class.getResource("/images/respostaOpcao2.png")));
		lblNewLabel.setBounds(0, 0, 80, 25);
		getContentPane().add(lblNewLabel);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		setBounds(670, 475, 80, 25);
		
	}

}
