package singleton;

public class Main {
	
	public static void main(String[] args) {
		Square square = Square.getInstance();
		Rectangle rectangle = Rectangle.getInstance();
		Square square2 = Square.getInstance();
	}
}
