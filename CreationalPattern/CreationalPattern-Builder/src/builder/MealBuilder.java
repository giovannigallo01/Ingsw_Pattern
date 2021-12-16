package builder;

import builder.product.ChickenBurger;
import builder.product.CocaCola;
import builder.product.PepsiCola;
import builder.product.VeganBurger;

public class MealBuilder {

	public Meal preparaPastoVegano() {
		System.out.println("[PASTOBUILDER]");
		Meal meal = new Meal();
		meal.aggiungi(new VeganBurger());
		meal.aggiungi(new CocaCola());
		return meal;
	}
	
	public Meal preparaPastoNonVegano() {
		System.out.println("[PASTOBUILDER]");
		Meal meal = new Meal();
		meal.aggiungi(new ChickenBurger());
		meal.aggiungi(new PepsiCola());
		return meal;
	}
}
