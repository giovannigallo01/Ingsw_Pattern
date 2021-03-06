package composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Manager implements Employee{

	private String name;
	private String department;
	private double salary;
	
	public Manager(String name, String department, double salary) {
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	
	List<Employee> employees = new ArrayList<Employee>();

	@Override
	public void add(Employee employee) {
		employees.add(employee);
	}

	@Override
	public void remove(Employee employee) {
		employees.remove(employee);
	}

	@Override
	public Employee getChild(int i) {
		return employees.get(i);
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
	  
	  Iterator<Employee> employeeIterator = employees.iterator();
	  while(employeeIterator.hasNext()) {
		  Employee employee = employeeIterator.next();
		  employee.print();
	  }
	}
}
