package zoo;

import java.util.Scanner;

import org.animals.Animals;
import org.animals.Deer;
import org.animals.Elephant;
import org.animals.Giraffe;
import org.animals.Lion;
import org.animals.Monkey;
import org.animals.TIger;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		VandalurZoo zoo = new VandalurZoo();
		System.out.println("1. Lion");
		System.out.println("2. Tiger");
		System.out.println("3. Deer");
		System.out.println("4. Monkey");
		System.out.println("5. Elephant");
		System.out.println("6. Giraffe");
		System.out.println("Enter your choice: ");
		switch(sc.nextInt()) {
		case 1: zoo.setAnimal(new Lion());
				break;
		case 2: zoo.setAnimal(new TIger());
				break;
		case 3: zoo.setAnimal(new Deer());
				break;
		case 4: zoo.setAnimal(new Monkey());
				break;
		case 5: zoo.setAnimal(new Elephant());
				break;
		case 6: zoo.setAnimal(new Giraffe());
				break; 
		}
		Animals animal = zoo.getAnimal();
		animal.sound();
		System.out.println("Is Vegetarian: "+animal.isVegetarian());
		System.out.println("Can Climb: "+animal.canClimb());
		animal.printFields();
		sc.close();
	}

}
