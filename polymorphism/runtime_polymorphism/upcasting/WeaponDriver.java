package polymorphism.runtime_polymorphism.upcasting;

public class WeaponDriver {
	public static void main(String[] args) {
		// Upcasting: Treating Sword as a Weapon
		Weapon w1 = new WeaponSword();

		w1.attack(); // Calling overridden method

		// weapon.sharpen(); /* Not allowed, since sharpen() is not in Weapon class. */
	}
}