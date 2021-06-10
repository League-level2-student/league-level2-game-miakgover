import javax.swing.JFrame;

public class TicTacToe {
	JFrame frame;
	GamePanel game_panel;
	public static final int WIDTH = 500;
	public static final int HEIGHT = 500;
	TicTacToe(){
		frame = new JFrame();
		game_panel = new GamePanel();
	}
	public static void main(String[] args) {
		new TicTacToe().setup();
	}
	public void setup() {
		frame.add(game_panel);
		frame.addKeyListener(game_panel);
		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
