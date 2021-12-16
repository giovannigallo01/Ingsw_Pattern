package flyweight;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		int size = 8;
		int pause = 100;
		if(args.length > 0) {
			size = Integer.parseInt(args[0]);
		}
		if(args.length > 1) {
			pause = Integer.parseInt(args[1]);
		}
		JFrame frame = new JFrame("ColorBoxes - 1 thread per ColorBox");
		frame.setLayout(new GridLayout(size,size));
		for(int i=0; i<size*size; i++) {
			frame.add(new ColorBox(pause));
		}
		frame.setSize(500,400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
