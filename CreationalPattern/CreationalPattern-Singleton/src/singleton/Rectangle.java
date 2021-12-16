package singleton;

public class Rectangle {

	private static Rectangle instance = null;
	
	private Rectangle() {}
	
	public static Rectangle getInstance() {
		if(instance == null) {
			instance = new Rectangle();
		}
		stampa();
		return instance;
	}
	
	private static void stampa() {
		System.out.println();
		System.out.println();
		System.out.println("Rectangle:");
		System.out.println("* * * * * *");
		System.out.println("*    	  *");
		System.out.println("*    	  *");
		System.out.println("* * * * * *");
	}
}
