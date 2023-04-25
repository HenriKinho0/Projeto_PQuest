package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaSelecName extends JFrame {
	private JTextField textField;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaSelecName window = new TelaSelecName();
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
	public TelaSelecName() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setTitle("PQuest");	
		setSize(350, 150);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(85, 45, 153, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnCriar = new JButton("Criar");
		btnCriar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCenario cenario = new TelaCenario();
				cenario.setVisible(true);
				dispose();
			}
		});
		btnCriar.setFocusable(false);
		btnCriar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCriar.setBorderPainted(false);
		btnCriar.setBounds(195, 76, 89, 23);
		getContentPane().add(btnCriar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnVoltar.setBorderPainted(false);
		btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVoltar.setFocusable(false);
		btnVoltar.setBounds(40, 76, 89, 23);
		getContentPane().add(btnVoltar);
	}
}
