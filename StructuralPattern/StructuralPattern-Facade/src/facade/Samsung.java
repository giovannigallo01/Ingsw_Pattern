package facade;

public class Samsung implements MobileShop{

	@Override
	public void modello() {
		System.out.println("Samsung galaxy S21+");
	}

	@Override
	public void prezzo() {
		System.out.println("€ 1.459,00");
	}

}
