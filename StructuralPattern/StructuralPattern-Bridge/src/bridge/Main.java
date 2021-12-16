package bridge;

public class Main {
	
	public static void main(String[] args) {
		Shape cerchioRosso = new Circle(100, 100, 10, new RedCircle());
		Shape cerchioVerde = new Circle(100, 100, 10, new GreenCircle());

		cerchioRosso.disegna();
		cerchioVerde.disegna();
	}
}
