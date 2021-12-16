package builder;

public class Main {

	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();
		Meal veganMeal = mealBuilder.preparaPastoVegano();
		System.out.println("PASTO VEGANO");
		veganMeal.visualizzaOggetti();
		System.out.println("Costo totale: " + veganMeal.getCosto());
		
		Meal notVeganMeal = mealBuilder.preparaPastoNonVegano();
		System.out.println("PASTO NON VEGANO");
		notVeganMeal.visualizzaOggetti();
		System.out.println("Costo totale: " + notVeganMeal.getCosto());
	}
}
