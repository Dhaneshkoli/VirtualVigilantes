package Emppay;

public class Fulltime  extends employee{

	public Fulltime(String name, double salary) {
		super(name, salary, "fulltime");
		// TODO Auto-generated constructor stub
	}

	double calculatePay() {
		double bonus = 0.10 * salary;
        double deduction = 0.05 * salary;
        salary =salary+bonus - deduction;
		return salary;
	}
}
