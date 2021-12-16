package factoryAbstract.shapes;

public class RoundedSquare implements Shape{

	@Override
	public void draw() {
		System.out.println();
		System.out.println();
		System.out.println("Rounded Square:");
		System.out.println(" * * * * *");
		System.out.println("*    	  *");
		System.out.println("*    	  *");
		System.out.println("*    	  *");
		System.out.println(" * * * * *");
	}

}
