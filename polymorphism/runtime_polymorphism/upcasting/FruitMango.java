package polymorphism.runtime_polymorphism.upcasting;

public class FruitMango extends Fruit {

	@Override
	public void taste() {
		System.out.println("Mango is sweet and juicy.");
	}

	public void makeJuice() {
		System.out.println("Mango juice is being prepared.");
	}
}
