package factoryAbstract;

import factoryAbstract.shapes.Rectangle;
import factoryAbstract.shapes.Shape;
import factoryAbstract.shapes.Square;

public class ShapeFactory extends AbstractFactory{

	@Override
	public Shape getShape(int type) {
		Shape shape = null;
		switch (type) {
			case 1:
				shape = new Square();
				break;
			case 2:
				shape = new Rectangle();
				break;
			default:
				System.out.println("Valore non valido!");
				break;
		}
		return shape;
	}
	
}
