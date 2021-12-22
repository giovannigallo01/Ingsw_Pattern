package decorator;

import java.awt.Color;
import java.awt.Graphics;

public class BlackShape implements Shape {

Shape shape;
	
	public BlackShape(Shape shape) {
		this.shape = shape;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		shape.draw(g);
	}
}
