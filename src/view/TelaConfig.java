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

public class TelaConfig extends JFrame {

	private static final long serialVersionUID = 1L;
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
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setFocusable(false);
		btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVoltar.setBounds(103, 264, 89, 23);
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
		
		
		
	}
}