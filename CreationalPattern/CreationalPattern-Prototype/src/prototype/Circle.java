package prototype;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shape {

	public Circle() {}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillOval((int) (Math.random()*400), (int) (Math.random()*400), 30, 30);
	}
}
