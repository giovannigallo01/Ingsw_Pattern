package factoryMethod;

import factoryMethod.shapes.Rectangle;
import factoryMethod.shapes.Shape;
import factoryMethod.shapes.Square;
import factoryMethod.shapes.Triangle;

public class ShapeFactory {

	public ShapeFactory() {}
	
	public Shape getShape(int type) {
		Shape shape = null;
		switch (type) {
			case 1:
				shape = new Square();
				break;
			case 2:
				shape = new Rectangle();
				break;
			case 3:
				shape = new Triangle();
				break;
			default:
				System.out.println("Valore non valido!");
				break;
		}
		return shape;
	}
}
