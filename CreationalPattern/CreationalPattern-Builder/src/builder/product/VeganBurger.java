package builder.product;

public class VeganBurger extends Hamburger{

	@Override
	public String nome() {
		return "Hamburger Vegano";
	}

	@Override
	public double prezzo() {
		return 7.00;
	}

}
