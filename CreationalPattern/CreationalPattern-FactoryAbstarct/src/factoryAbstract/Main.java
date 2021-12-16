package factoryAbstract;

import factoryAbstract.shapes.Shape;

public class Main {

	public static void main(String[] args) {
		
		AbstractFactory shapeFactory1 = FactoryProducer.getFactory(false);
		
		int type1 = 1;
		int type2 = 2;
		int type3 = 1;
		
		Shape shape1 = shapeFactory1.getShape(type1);
		shape1.draw();
		Shape shape2 = shapeFactory1.getShape(type2);
		shape2.draw();
		Shape shape3 = shapeFactory1.getShape(type3);
		shape3.draw();
		
		AbstractFactory shapeFactory2 = FactoryProducer.getFactory(true);
		
		int type4 = 2;
		int type5 = 1;
		int type6 = 2;
		
		Shape shape4 = shapeFactory2.getShape(type4);
		shape4.draw();
		Shape shape5 = shapeFactory2.getShape(type5);
		shape5.draw();
		Shape shape6 = shapeFactory2.getShape(type6);
		shape6.draw();
	}
}
