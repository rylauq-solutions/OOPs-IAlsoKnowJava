package polymorphism.compile_time_polymorphism.method_overloading;

public class WeaponDriver {
	public static void main(String[] args) {
		Weapon w1 = new Weapon();

		w1.displayWeaponInformation("Knife");
		System.out.println("\n<====================>\n");
		w1.displayWeaponInformation("Gun", 40);
		System.out.println("\n<====================>\n");
		w1.displayWeaponInformation("Sword", 70, 2.5);
	}
}
