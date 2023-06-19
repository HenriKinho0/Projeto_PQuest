package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.ActionEvent;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import org.w3c.dom.events.MouseEvent;
import java.awt.Cursor;

public class TelaCenario extends JFrame implements ActionListener {
	private Player1 player1;
	private Timer timer;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCenario window = new TelaCenario();
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
	public TelaCenario() {
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
		setSize(1030, 660);
		setLocationRelativeTo(null);
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
		btnNpcPergunta.setIcon(new ImageIcon(TelaCenario.class.getResource("/images/npc1.png")));
		btnNpcPergunta.setBounds(92, 339, 87, 129);
		getContentPane().add(btnNpcPergunta);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaGamerOver telagamerover = new TelaGamerOver();
				telagamerover.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton.setIcon(new ImageIcon(TelaCenario.class.getResource("/images/portal3.png")));
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFocusable(false);
		btnNewButton.setBounds(245, 375, 74, 93);
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
		btnNewButton_1.setIcon(new ImageIcon(TelaCenario.class.getResource("/images/portal3.png")));
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBounds(463, 375, 74, 93);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaGamerOver telagamerover = new TelaGamerOver();
				telagamerover.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1.setIcon(new ImageIcon(TelaCenario.class.getResource("/images/portal3.png")));
		btnNewButton_1_1.setFocusable(false);
		btnNewButton_1_1.setContentAreaFilled(false);
		btnNewButton_1_1.setBorderPainted(false);
		btnNewButton_1_1.setBounds(700, 375, 74, 93);
		getContentPane().add(btnNewButton_1_1);
		
		JLabel lblFundoCenario = new JLabel("");
		lblFundoCenario.setIcon(new ImageIcon(TelaCenario.class.getResource("/images/Cenario2XY.png")));
		lblFundoCenario.setBounds(0, 0, 1014, 631);
		getContentPane().add(lblFundoCenario);
		
		player1 = new Player1();
		player1.load();
		
		addKeyListener(new TecladoAdapter());
		
		timer = new Timer(4, this);
		timer.start();
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D graficos = (Graphics2D) g;
		graficos.drawImage(player1.getImagem(), player1.getX(), player1.getY(), this);
	}
	
	public void actionPerformed(ActionEvent e) {
		player1.update();
		repaint();
	}

	
	private class TecladoAdapter extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			player1.keyPressed(e);
		}
		public void keyReleased(KeyEvent e) {
			player1.keyReleased(e);
		}
	}
}
