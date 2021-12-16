package builder.product;

public abstract class Hamburger implements Oggetto{

	@Override
	public abstract double prezzo();

	@Override
	public Packing packing() {
		return new Container() {
		};
	}
}
