
public class Main {

	public static void main(String[] args) {
		Animal bird = new Bird("Bird", "Birdy");
		Animal dog = new Dog("Dog", "Dogy");
		
		System.out.println(bird.getName() + ": " + bird.tryToFly());
		System.out.println(dog.getName() + ": " + dog.tryToFly());

	}

}
