package inheritance.single_level_inheritance;

class PersonalLoan extends Loan {
	String name;
	String address;
	int creditScore;

	PersonalLoan() {
		System.out.println("Personal Loan object is Created!");
	}

	PersonalLoan(int number, double amount, double rateOfInterest, String name, String address, int creditScore) {
		super(number, amount, rateOfInterest); // super() Call
		this.name = name;
		this.address = address;
		this.creditScore = creditScore;
	}

	public void getDetails() {
		System.out.println("Name of Person is: " + name);
		System.out.println("Address of Person is: " + address);
		System.out.println("Person's Credit Score is: " + creditScore);
		super.getDetails(); // super Keyword
	}
}