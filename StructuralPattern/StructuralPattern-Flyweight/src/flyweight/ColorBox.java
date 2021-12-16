package flyweight;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class ColorBox extends Canvas implements Runnable{

	private static final long serialVersionUID = 1187432386126515033L;

	private int pause;
	private Color curColor = getColor();
	private static Color[] colors = {Color.black, Color.blue, Color.cyan, Color.darkGray, 
			Color.gray, Color.green, Color.lightGray, Color.red, Color.magenta, Color.orange, 
			Color.pink, Color.white, Color.yellow};
	
	public ColorBox(int p) {
		pause = p;
		new Thread(this).start();
	}

	private static Color getColor() {
		return colors[(int)(Math.random()*1000) % colors.length];
	}
	
	@Override
	public void run() {
		while(true) {
			curColor = getColor();
			repaint();
			try {
				Thread.sleep(pause);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void paint (Graphics g) {
		g.setColor(curColor);
		g.fillRect(0, 0, getWidth(), getHeight());
	}
}
