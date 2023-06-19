package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class TelaConfig extends JFrame {

	JSlider slider;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaConfig window = new TelaConfig();
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
	public TelaConfig() {
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		setTitle("PQuest");
		setSize(300, 350);
		setLocationRelativeTo(null);
		
		JButton btnVoltar = new JButton("");
		btnVoltar.setIcon(new ImageIcon(TelaConfig.class.getResource("/images/btnVoltarCadastro.png")));
		btnVoltar.setFocusable(false);
		btnVoltar.setBorderPainted(false);
		btnVoltar.setContentAreaFilled(false);
		btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVoltar.setBounds(88, 261, 113, 26);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		getContentPane().setLayout(null);
		getContentPane().add(btnVoltar);
		
		JSlider slider_1 = new JSlider();
		slider_1.setBounds(45, 60, 200, 26);
		getContentPane().add(slider_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaConfig.class.getResource("/images/TelaConfigura4.png")));
		lblNewLabel.setBounds(0, 0, 284, 311);
		getContentPane().add(lblNewLabel);
		
		
		
	}
}