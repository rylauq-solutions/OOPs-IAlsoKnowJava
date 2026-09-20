package polymorphism.runtime_polymorphism.upcasting;

public class WeaponSword extends Weapon {

	@Override
	public void attack() {
		System.out.println("Sword kills the enemy.");
	}

	public void sharpen() {
		System.out.println("Sword is being sharpened.");
	}
}