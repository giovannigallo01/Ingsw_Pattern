package bridge;

public abstract class Shape {

	protected DisegnaAPI disegnaAPI;
	
	protected Shape(DisegnaAPI disegnaApi) {
		this.disegnaAPI = disegnaApi;
	}
	
	public abstract void disegna();
}
