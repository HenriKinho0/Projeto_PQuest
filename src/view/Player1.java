package view;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Player1 {
	
	private int x,y;
	private int dx, dy;
	private Image imagem;
	private int altura, largura;
	
	
	public Player1(){
		this.x = 300;
		this.y = 350;
	}
	
	public void load() {
		ImageIcon referencia = new ImageIcon("res\\projetopersonagem.png");
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
	
	
	public Image getImagem() {
		return imagem;
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
	
}
