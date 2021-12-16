package factoryAbstract.shapes;

public class RoundedRectangle implements Shape{

	@Override
	public void draw() {
		System.out.println();
		System.out.println();
		System.out.println("Rounded Rectangle:");
		System.out.println(" * * * * * *");
		System.out.println("*    	    *");
		System.out.println("*    	    *");
		System.out.println(" * * * * * *");
	}

}
