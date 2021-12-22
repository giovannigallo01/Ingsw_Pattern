package decorator;

import java.awt.Graphics;

public class Circle implements Shape {

	@Override
	public void draw(Graphics g) {
		g.fillOval(350, 250, 100, 100);
	}

}
