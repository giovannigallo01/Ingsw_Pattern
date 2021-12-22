package prototype;

import java.util.Hashtable;

public class ShapeCache {

	private static Hashtable<String, Shape> map = new Hashtable<String, Shape>();
	
	public static Shape getFigura(String id) {
		Shape shape = map.get(id);
		return (Shape) shape.clone();
	}
	
	public static void caricaCache() {
		Circle circle = new Circle();
		circle.setId("1");
		map.put(circle.getId(), circle);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setId("2");
		map.put(rectangle.getId(), rectangle);
	}
}
