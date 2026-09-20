package abstraction.abstract_class;

abstract class Car extends Vehicle {
	public abstract void openGate(); // Abstract Method

	public void playMusic() { // Concrete Method
		System.out.println("Play music in Car!");
	}
}