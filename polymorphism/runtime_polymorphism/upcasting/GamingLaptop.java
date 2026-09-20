package polymorphism.runtime_polymorphism.upcasting;

public class GamingLaptop extends Laptop {

	@Override
	public void turnOn() {
		System.out.println("Gaming Laptop is booting with high-performance mode.");
	}

	public void enableRGBLighting() {
		System.out.println("RGB lighting enabled.");
	}
}