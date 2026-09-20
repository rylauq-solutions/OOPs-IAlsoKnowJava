package polymorphism.compile_time_polymorphism.method_overloading;

public class Weapon {
	public void displayWeaponInformation(String name) {
		System.out.println("Weapon is: " + name);
	}

	public void displayWeaponInformation(String name, int damage) {
		System.out.println("Weapon is: " + name + " with Damage of: " + damage + "%.");
	}

	public void displayWeaponInformation(String name, int damage, double weight) {
		System.out.println("Weapon is: " + name + " with Damage of: " + damage + "% and Weight: " + weight + " KG.");
	}
}
