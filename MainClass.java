package assignment;

public class MainClass {

	public static void main(String[] args) {
		
		Cow cow = new Cow();
		Dog dog = new Dog();
		
		cow.weight = 80;
		cow.setFood("grass");
		cow.name();
		System.out.printf("It weights about %d kgs and lives on %s\n\n",cow.weight,cow.getFood());
		
		dog.weight = 30;
		dog.setSpeed(40);
		dog.name();
		System.out.printf("It weights about %d kgs and runs at speed of %d kilometers..\n",dog.weight,dog.getSpeed());
	}

}
