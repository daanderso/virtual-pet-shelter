import java.util.Random;

public class VirtualPet {
	String name;
	String description;
	int hunger;
	int thirst;
	int boredom;
 
	// creating constructors accepting name and breed to set the default value
	public VirtualPet(String newName, String newDescription) {
		name = newName;
		description = newDescription;
		hunger = 45;
		thirst = 25;
		boredom = 40;
	}

	// creating constructor that passes in name, description, hunger, thirst,
	// boredom
	public VirtualPet(String newName, String newDescription, int newHunger, int newThirst, int newBoredom) {
		name = newName;
		description = newDescription;
		hunger = newHunger;
		thirst = newThirst;
		boredom = newBoredom;

	}

	// creating random object r for random number generator in tick method
	Random r = new Random();
	
	
	// Methods for a hungry pet
	void feed() {
		hunger = hunger - 10;
		thirst = thirst + 5;
	}

	// Methods for a thirsty pet
	void water() {
		thirst = thirst - 10;
	}


	// Methods for a bored pet
	void play() {
		boredom = boredom - 10;
		hunger = hunger + 5;
		thirst = thirst + 4;
	}

	// Tick method
	void tick() {

		hunger = hunger + r.nextInt(10);
		thirst = thirst + r.nextInt(10);
		boredom = boredom + r.nextInt(10);

	}
	
	@Override //used to turn object into String  ( toString)
	public String toString() {
		return name +" "+ description +" " +  hunger + " " + thirst +" "+ boredom ;
	}

}// end class bracket
