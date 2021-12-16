package builder;

import java.util.ArrayList;
import java.util.List;

import builder.product.Oggetto;

public class Meal {

	private List objectList = new ArrayList();
	
	public void aggiungi(Oggetto object) {
		objectList.add(object);
	}
	
	public double getCosto() {
		double costo = 0.0;
		for(Object l : objectList) {
			costo += ((Oggetto) l).prezzo();
		}
		return costo;
	}
	
	public void visualizzaOggetti() {
		System.out.println("PASTO:");
		for(Object ob : objectList) {
			System.out.println("Oggetto -> " + ((Oggetto) ob).nome());
			System.out.println("Imballaggio -> " + ((Oggetto) ob).packing().wrap());
			System.out.println("Prezzo -> " + ((Oggetto) ob).prezzo());
		}
	}
}
