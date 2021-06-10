import java.awt.Graphics;
import java.util.ArrayList;

public class ObjectManager {
	ArrayList<X> xs = new ArrayList<X>();
	ArrayList<O> os = new ArrayList<O>();
	ObjectManager(){
		
	}
	public void addX(X x) {
		xs.add(x);
	}
	public void addO(O o) {
		os.add(o);
	}
	public void draw(Graphics g) {
		for (int i=0;i<xs.size();i++) {
			xs.get(i).draw(g);
		}
		for (int i=0;i<xs.size();i++) {
			os.get(i).draw(g);
		}
	}
}
