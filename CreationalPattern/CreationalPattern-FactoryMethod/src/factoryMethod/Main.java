package factoryMethod;

public class Main {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		int type1 = 1;
		int type2 = 2;
		int type3 = 3;
		int type4 = 2;
		int type5 = 3;
		shapeFactory.getShape(type1).draw();
		shapeFactory.getShape(type2).draw();
		shapeFactory.getShape(type3).draw();
		shapeFactory.getShape(type4).draw();
		shapeFactory.getShape(type5).draw();
	}
}
