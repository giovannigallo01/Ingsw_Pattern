package decorator;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Decorator Pattern");
		frame.setSize(600,600);
		JPanel panel = new JPanel();
		JButton buttonSquareBlack = new JButton("Black Square");
		JButton buttonSquareBlue = new JButton("Blue Square");
		JButton buttonCircleBlack = new JButton("Black Circle");
		JButton buttonCircleBlue = new JButton("Blue Circle");
		panel.setPreferredSize(new Dimension(600,300));
		frame.setContentPane(panel);
		frame.add(buttonSquareBlack);
		frame.add(buttonSquareBlue);
		frame.add(buttonCircleBlack);
		frame.add(buttonCircleBlue);
		buttonSquareBlack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Shape shape = new BlackShape(new Square());
				shape.draw(frame.getGraphics());
			}
		});
		buttonSquareBlue.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Shape shape = new BlueShape(new Square());
				shape.draw(frame.getGraphics());
			}
		});
		buttonCircleBlack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Shape shape = new BlackShape(new Circle());
				shape.draw(frame.getGraphics());
			}
		});
		buttonCircleBlue.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Shape shape = new BlueShape(new Circle());
				shape.draw(frame.getGraphics());
			}
		});
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
