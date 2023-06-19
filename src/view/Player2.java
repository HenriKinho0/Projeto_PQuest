package view;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Player2 {
	
	private int x,y;
	private int dx, dy;
	private Image imagem;
	private int altura, largura;
	
	public Player2() {
		this.x = 150;
		this.y = 250;
	}
	
	public void load() {
		ImageIcon referencia = new ImageIcon("res\\projetopersonagemfem.png");
		imagem = referencia.getImage();
		altura = imagem.getHeight(null);
		largura = imagem.getWidth(null);
	}
	
	public void update() {
		x += dx;
		y += dy;
	}
	
	
	public void keyPressed(KeyEvent tecla) {
		int codigo = tecla.getKeyCode();
		
		if (codigo == KeyEvent.VK_UP) {
			dy = -3;
		}
		if (codigo == KeyEvent.VK_DOWN) {
			dy = 3;
		}
		if (codigo == KeyEvent.VK_LEFT) {
			dx = -3;
		}
		if (codigo == KeyEvent.VK_RIGHT) {
			dx = 3;
		}
	}
	
	public void keyReleased(KeyEvent tecla) {
		int codigo = tecla.getKeyCode();
		
		if (codigo == KeyEvent.VK_UP) {
			dy = 0;
		}
		if (codigo == KeyEvent.VK_DOWN) {
			dy = 0;
		}
		if (codigo == KeyEvent.VK_LEFT) {
			dx = 0;
		}
		if (codigo == KeyEvent.VK_RIGHT) {
			dx = 0;
		}
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Image getImagem() {
		return imagem;
	}
	
}
