package Emppay;

public abstract class employee {

	String name;
	double salary;
	String designation;
	
	public employee(String name, double salary, String designation) {
		super();
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "employee [name=" + name + ", salary=" + salary + ", designation=" + designation + "]";
	}
	abstract double calculatePay();
	
}
