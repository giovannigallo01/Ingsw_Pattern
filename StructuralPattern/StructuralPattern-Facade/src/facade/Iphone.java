package facade;

public class Iphone implements MobileShop{

	@Override
	public void modello() {
		System.out.println("IPhone 13 Pro");
	}

	@Override
	public void prezzo() {
		System.out.println("€ 1.539,00");
	}

}
