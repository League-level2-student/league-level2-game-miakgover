import java.awt.Color;
import java.awt.Graphics;

public class O {
	int x;
	int y;
	int width;
	int height;
	O (int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawOval(x, y, width, height);
	}
}
