package polymorphism.runtime_polymorphism.method_overriding;

class PrinterDriver {
	public static void main(String[] args) {
		Printer p1 = new Printer("HP", 1000, "LaserJet");
		Printer p2 = new Printer("Canon", 500, "InkJet");
		Printer p3 = new Printer("HP", 1000, "LaserJet");

		System.out.println(p1);
		System.out.println("\n<====================>\n");

		System.out.println(p2);
		System.out.println("\n<====================>\n");

		System.out.println(p3);
		System.out.println("\n<====================>\n");

		System.out.println("Is p1 equal to p3? " + p1.equals(p3));
		System.out.println("Is p2 equal to p3? " + p2.equals(p3));
	}
}