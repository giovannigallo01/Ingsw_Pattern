package bridge;


public class RedCircle implements DisegnaAPI{

	@Override
	public void disegnaCerchio(int raggio, int x, int y) {
		System.out.println("[CERCHIOROSSO]: Cerchio disegnato! ");
		System.out.println("[CERCHIOROSSO]: Colore: ROSSO, Raggio: " + raggio +
				", x: " + x + " y: " + y + "]");
	}

}
