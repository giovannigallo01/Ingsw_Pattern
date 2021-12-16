package factoryAbstract;

import factoryAbstract.shapes.RoundedRectangle;
import factoryAbstract.shapes.RoundedSquare;
import factoryAbstract.shapes.Shape;

public class RoundedShapeFactory extends AbstractFactory{

	@Override
	public Shape getShape(int type) {
		Shape roundedShape = null;
		switch (type) {
			case 1:
				roundedShape = new RoundedSquare();
				break;
			case 2:
				roundedShape = new RoundedRectangle();
				break;
			default:
				System.out.println("Valore non valido!");
				break;
		}
		return roundedShape;
	}

}
