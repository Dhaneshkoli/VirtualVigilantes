package Emppay;

public class parttime extends employee {

	public parttime(String name, double salary) {
		super(name, salary,"part time");
		// TODO Auto-generated constructor stub
	}

	double calculatePay() {
		double deduction = 0.02 * salary;
        return salary - deduction;
		
	}
	
}
