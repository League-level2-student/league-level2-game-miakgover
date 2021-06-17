import java.awt.Color;
import java.awt.Graphics;

public class SelectedSquare {
	int x;
	int y;
	int width;
	int height;
	int current_square = 0;
	SelectedSquare(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	public void draw(Graphics g) {
		g.setColor(Color.CYAN);
		g.drawRect(x, y, width, height);
	}
	public void up() {
		if (y>100) {
			y-=100;
		}
	}
	public void down() {
		if (y<300) {
			y+=100;
		}
	}
	public void left() {
		if (x>100) {
			x-=100;
		}
	}
	public void right() {
		if (x<300) {
			x+=100;
		}
	}
}
