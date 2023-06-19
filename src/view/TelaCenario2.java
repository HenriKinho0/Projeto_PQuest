package view;

import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.Timer;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class TelaCenario2 extends JFrame implements ActionListener {
	private Player2 player2;
	private Timer timer;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCenario2 window = new TelaCenario2();
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
	public TelaCenario2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent tecla) {
				
				char codigo = tecla.getKeyChar();
				
				if (codigo == KeyEvent.VK_ESCAPE) {
					TelaEsc telaesc = new TelaEsc();
					telaesc.setVisible(true);
				}
			}
		});
		
		setTitle("PQuest");
		setBounds(200, 100, 1030, 660);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JButton btnNpcPergunta = new JButton("");
		btnNpcPergunta.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNpcPergunta.setHorizontalTextPosition(SwingConstants.LEADING);
		btnNpcPergunta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pergunta pergunta = new Pergunta();
				pergunta.setVisible(true);
			}
		});
		
		btnNpcPergunta.setBorderPainted(false);
		btnNpcPergunta.setContentAreaFilled(false);
		btnNpcPergunta.setFocusable(false);
		btnNpcPergunta.setIcon(new ImageIcon(TelaCenario2.class.getResource("/images/npc1.png")));
		btnNpcPergunta.setBounds(92, 333, 87, 132);
		getContentPane().add(btnNpcPergunta);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaGamerOver telagamerover = new TelaGamerOver();
				telagamerover.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setIcon(new ImageIcon(TelaCenario2.class.getResource("/images/portal3.png")));
		btnNewButton.setFocusable(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBounds(245, 372, 74, 93);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaGameWon telagamewon = new TelaGameWon();
				telagamewon.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(TelaCenario2.class.getResource("/images/portal3.png")));
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBounds(463, 372, 74, 93);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaGamerOver telagamerover = new TelaGamerOver();
				telagamerover.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(TelaCenario2.class.getResource("/images/portal3.png")));
		btnNewButton_2.setFocusable(false);
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBounds(700, 372, 74, 93);
		getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaCenario2.class.getResource("/images/Cenario2XY.png")));
		lblNewLabel.setBounds(0, 0, 1014, 621);
		getContentPane().add(lblNewLabel);
		
		player2 = new Player2();
		player2.load();
		
		addKeyListener(new TecladoAdapter());
		
		timer = new Timer(4, this);
		timer.start();
		
	}
	
	public void paint (Graphics g) {
		super.paint(g);
		Graphics2D graficos = (Graphics2D) g;
		graficos.drawImage(player2.getImagem(), player2.getX(), player2.getY(), this);
	}
	
	public void actionPerformed(ActionEvent e) {
		player2.update();
		repaint();
	}
	
	private class TecladoAdapter extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			player2.keyPressed(e);
		}
		public void keyReleased(KeyEvent e) {
			player2.keyReleased(e);
		}
	}

}
