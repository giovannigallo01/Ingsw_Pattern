package composite;

public class Developer implements Employee{

	private String name;
	private String department;
	private double salary;
	
	public Developer(String name, String department, double salary) {
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	@Override
	public void add(Employee employee) {}

	@Override
	public void remove(Employee employee) {}

	@Override
	public Employee getChild(int i) {
		return null;
	}

	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public String getDepartment() {
		return department;
	}

	@Override
	public double getSalary() {
		return salary;
	}

	@Override
	public void print() {
		System.out.println("-------------");
	    System.out.println("Name = " + getName());
	    System.out.println("Department = " + getDepartment());
	    System.out.println("Salary = " + getSalary());
	    System.out.println("-------------");
	}
}
