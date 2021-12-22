package prototype;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Shape {

	public Rectangle() {}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect((int) (Math.random()*400), (int) (Math.random()*400), 30, 30);
	}
}
