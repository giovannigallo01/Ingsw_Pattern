package decorator;

import java.awt.Color;
import java.awt.Graphics;

public class BlueShape implements Shape {

	Shape shape;
	
	public BlueShape(Shape shape) {
		this.shape = shape;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.BLUE);
		shape.draw(g);
	}
}
