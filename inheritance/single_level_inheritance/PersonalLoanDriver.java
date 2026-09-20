package inheritance.single_level_inheritance;

class PersonalLoanDriver {
	public static void main(String[] args) {
		PersonalLoan p1 = new PersonalLoan();
		PersonalLoan p2 = new PersonalLoan(1, 100000, 5.5, "Sohan", "Delhi", 650);
		PersonalLoan p3 = new PersonalLoan(2, 20000, 4.5, "Mohan", "Noida", 780);

		System.out.println("\n<====================>\n");
		p1.getDetails();
		System.out.println("\n<====================>\n");
		p2.getDetails();
		System.out.println("\n<====================>\n");
		p3.getDetails();
	}
}