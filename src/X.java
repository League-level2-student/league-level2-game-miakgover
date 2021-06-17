import java.awt.Color;
import java.awt.Graphics;

public class X {
	int x;
	int y;
	int width;
	int height;
	X (int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawLine(x, y, x+width, y+height);
		g.drawLine(x+width, y, x, y+height);
	}
}
