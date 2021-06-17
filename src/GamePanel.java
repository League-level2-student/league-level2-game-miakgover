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
	int currentPlayer = 1;
	Font titleFont;
	Font instructionFont;
	SelectedSquare selected_square = new SelectedSquare(100,100,100,100);
	ObjectManager object_manager = new ObjectManager();
	Boolean[] squares = {false, false, false, false, false, false, false, false, false};
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
		selected_square.draw(g);
		object_manager.draw(g);
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
		else if(e.getKeyCode() == KeyEvent.VK_UP) {
			selected_square.up();
			repaint();
		}
		else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			selected_square.down();
			repaint();
		}
		else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			selected_square.left();
			repaint();
		}
		else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			selected_square.right();
			repaint();
		}
		else if(e.getKeyCode() == KeyEvent.VK_ENTER) {
			if (currentPlayer == 1) {
				X x = new X(selected_square.x, selected_square.y, selected_square.width, selected_square.height);
				if (squares[selected_square.current_square] == false) {
					object_manager.addX(x);
					squares[selected_square.current_square] = true;
					currentPlayer = 2;
				}
			}
			else if(currentPlayer == 2) {
				O o = new O(selected_square.x, selected_square.y, selected_square.width, selected_square.height);
				object_manager.addO(o);
				squares[selected_square.current_square] = true;
				currentPlayer = 1;
			}
			repaint();
		}
		if (selected_square.y == 100) {
			if (selected_square.x == 100) {
				selected_square.current_square = 0;
			}
			else if (selected_square.x == 200) {
				selected_square.current_square = 1;
			}
			else if (selected_square.x == 300) {
				selected_square.current_square = 2;
			}
		}
		else if (selected_square.y == 200) {
			if (selected_square.x == 100) {
				selected_square.current_square = 3;
			}
			else if (selected_square.x == 200) {
				selected_square.current_square = 4;
			}
			else if (selected_square.x == 300) {
				selected_square.current_square = 5;
			}
		}
		else if (selected_square.y == 300) {
			if (selected_square.x == 100) {
				selected_square.current_square = 6;
			}
			else if (selected_square.x == 200) {
				selected_square.current_square = 7;
			}
			else if (selected_square.x == 300) {
				selected_square.current_square = 8;
			}
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
