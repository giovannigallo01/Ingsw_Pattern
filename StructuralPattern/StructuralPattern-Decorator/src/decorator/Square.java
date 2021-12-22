package decorator;

import java.awt.Graphics;

public class Square implements Shape {

	@Override
	public void draw(Graphics g) {
		g.fillRect(150, 250, 100, 100);
	}

}
