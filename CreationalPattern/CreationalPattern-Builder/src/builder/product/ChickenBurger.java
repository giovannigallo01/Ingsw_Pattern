package builder.product;

public class ChickenBurger extends Hamburger{

	@Override
	public String nome() {
		return "ChickenBurger";
	}

	@Override
	public double prezzo() {
		return 5.50;
	}
}
