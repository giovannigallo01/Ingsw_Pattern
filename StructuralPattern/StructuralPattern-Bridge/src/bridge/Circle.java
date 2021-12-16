package bridge;

public class Circle extends Shape{

	private int x;
	private int y;
	private int raggio;
	
	public Circle(int x, int y, int radius, DisegnaAPI disegnaApi) {
		super(disegnaApi);
		this.x = x;
		this.y = y;
		this.raggio = radius;
	}

	@Override
	public void disegna() {
		disegnaAPI.disegnaCerchio(raggio, x, y);
	}
}
