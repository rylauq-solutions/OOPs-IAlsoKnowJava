package inheritance.single_level_inheritance;

class Loan {
	int number;
	double amount;
	double rateOfInterest;

	Loan() {
		System.out.println("Loan object is Created!");
	}

	Loan(int number, double amount, double rateOfInterest) {
		this();
		this.number = number;
		this.amount = amount;
		this.rateOfInterest = rateOfInterest;
	}

	public void getDetails() {
		System.out.println("Loan Number is: " + number);
		System.out.println("Amount of Loan taken is: " + amount);
		System.out.println("Loan is taken at " + rateOfInterest + "% Rate of Interest");
	}
}