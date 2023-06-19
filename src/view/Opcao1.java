package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Opcao1 extends JFrame {
	private final JLabel lblNewLabel = new JLabel("");


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Opcao1 window = new Opcao1();
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
	public Opcao1() {
		setUndecorated(true);
		getContentPane().setLayout(null);
		lblNewLabel.setIcon(new ImageIcon(Opcao1.class.getResource("/images/respostaOpcao1.png")));
		lblNewLabel.setBounds(0, 0, 80, 25);
		getContentPane().add(lblNewLabel);
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		dispose();
		setBounds(450, 475, 80, 25);
	}

}
