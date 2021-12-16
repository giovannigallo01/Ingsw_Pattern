package composite;

public class Main {

	public static void main(String[] args) {
		Employee emp1 = new Developer("persona1", "ImpiegatoVendite", 15000);
		Employee emp2 = new Developer("persona2", "ImpiegatoVendite" ,10000);
		Employee manager1 = new Manager("persona3", "ResponsabileVendite", 25000);
		manager1.add(emp1);
		manager1.add(emp2);
		Employee emp3 = new Developer("persona4", "ImpiegatoMarketing", 20000);
		Manager generalManager = new Manager("persona5", "CEO", 50000);
		generalManager.add(emp3);
		generalManager.add(manager1);
		generalManager.print();
	}
}
