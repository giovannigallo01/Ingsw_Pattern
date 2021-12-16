package builder.product;

public abstract class ColdDrink implements Oggetto{

	@Override
	public Packing packing() {
		return new Bottle();
	}
	
	@Override
	public abstract double prezzo();
}
