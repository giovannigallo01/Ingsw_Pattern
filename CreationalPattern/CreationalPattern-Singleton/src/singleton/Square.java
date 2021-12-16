package singleton;

public class Square {

	private static Square instance = null;
	
	private Square() {}
	
	public static Square getInstance() {
		if(instance == null) {
			instance = new Square();
		}
		stampa();
		return instance;
	}
	
	private static void stampa() {
		System.out.println();
		System.out.println();
		System.out.println("Square:");
		System.out.println("* * * * * *");
		System.out.println("*    	  *");
		System.out.println("*    	  *");
		System.out.println("*    	  *");
		System.out.println("* * * * * *");
	}
}
