package bridge;

public class GreenCircle implements DisegnaAPI{

	@Override
	public void disegnaCerchio(int raggio, int x, int y) {
		System.out.println("[CERCHIOVERDE]: Cerchio disegnato! ");
		System.out.println("[CERCHIOROSSO]: Colore: VERDE, Raggio: " + raggio +
				", x: " + x + " y: " + y + "]");
	}
}
