import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements KeyListener{
	final int MENU = 0;
	final int GAME = 1;
	final int END = 2;
	int currentState = MENU;
	Font titleFont;
	Font instructionFont;
	GamePanel(){
		titleFont = new Font("Arial", Font.BOLD, 45);
		instructionFont = new Font("Arial", Font.PLAIN, 28);
	}
	@Override
	public void paintComponent(Graphics g) {
		if (currentState == MENU) {
			drawMenuState(g);
		}
		else if (currentState == GAME) {
			drawGameState(g);
		}
		else if (currentState == END) {
			drawEndState(g);
		}
	}
	public void drawMenuState(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, TicTacToe.WIDTH, TicTacToe.HEIGHT);
		g.setFont(titleFont);
		g.setColor(Color.BLACK);
		g.drawString("Tic Tac Toe", 100, 40);
		g.setFont(instructionFont);
		g.drawString("Use arrows to select a square", 40, 200);
		g.drawString("Press enter to pick a square", 50, 250);
		g.drawString("Press space to start", 90, 300);
	}
	public void drawGameState(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, TicTacToe.WIDTH, TicTacToe.HEIGHT);
		g.setColor(Color.BLACK);
		g.drawLine(200, 100, 200, 400);
		g.drawLine(300, 100, 300, 400);
		g.drawLine(100, 200, 400, 200);
		g.drawLine(100, 300, 400, 300);
	}
	public void drawEndState(Graphics g) {
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			currentState++;
			repaint();
		}
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
