package abstraction.interfaces.normal_interface;

interface Vehicle {
	public void start();

	public void stop();

	default void test() { // Java-8 Feature
		System.out.println("Default Method!");
	}
}