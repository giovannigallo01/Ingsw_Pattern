package prototype;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Prototype Pattern");
		frame.setSize(700,700);
		JPanel panel = new JPanel();
		JButton buttonClonaRectangle = new JButton("Rectangle Clone");
		JButton buttonClonaCircle = new JButton("Circle Clone");
		panel.setPreferredSize(new Dimension(600,600));
		frame.setContentPane(panel);
		frame.add(buttonClonaRectangle);
		frame.add(buttonClonaCircle);
		ShapeCache.caricaCache();
		buttonClonaRectangle.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Shape rectangle = ShapeCache.getFigura("2");
				rectangle.draw(frame.getGraphics());
			}
		});
		buttonClonaCircle.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Shape circle = ShapeCache.getFigura("1");
				circle.draw(frame.getGraphics());
			}
		});
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
