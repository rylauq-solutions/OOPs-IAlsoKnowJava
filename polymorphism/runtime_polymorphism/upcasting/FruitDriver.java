package polymorphism.runtime_polymorphism.upcasting;

public class FruitDriver {
    public static void main(String[] args) {
        // Upcasting: Treating Mango as a Fruit
        Fruit f1 = new FruitMango();

        f1.taste();	// Calling overridden method

        // myFruit.makeJuice(); /* Not allowed, since makeJuice() is not in Fruit class. */
    }
}