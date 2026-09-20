package polymorphism.compile_time_polymorphism.constructor_overloading_chaining;

class WeaponDriver {
	public static void main(String[] args) {
		Weapon w1 = new Weapon("Knife");
		Weapon w2 = new Weapon("Sword", 1500);
		Weapon w3 = new Weapon("Crossbow", 2700, 20);
		Weapon w4 = new Weapon("Gun", 1275, 40.5, "Steel");

		System.out.println("\n<====================>\n");
		w1.getDetails();
		System.out.println("\n<====================>\n");
		w2.getDetails();
		System.out.println("\n<====================>\n");
		w3.getDetails();
		System.out.println("\n<====================>\n");
		w4.getDetails();
	}
}
