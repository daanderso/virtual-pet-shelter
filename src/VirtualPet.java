import java.util.Random;

public class VirtualPet {
	String name;
	String petBreed;
	String description;
	int hunger;
	int thirst;
	int boredom;
	int tired;
	
	boolean isHungry;
	boolean isThirsty;
	boolean isBored;
	boolean isTired;
	boolean death; // boolean to start while loop if the pet is alive

	// creating constructors accepting name and breed so they do not set the
	// default value
	public VirtualPet(String newName, String newBreed) {
		name = newName;
		petBreed = newBreed;
		hunger = 45;
		thirst = 25;
		boredom = 40;
	}

	// creating constructor that passes in name, newBreed, hunger, thirst,
	// boredom
	public VirtualPet(String newName, String newBreed, int newHunger, int newThirst, int newBoredom) {
		name = newName;
		petBreed = newBreed;
		hunger = newHunger;
		thirst = newThirst;
		boredom = newBoredom;

	}

	// creating random object r for random number generator in tick method
	Random r = new Random();

	//get pet stats
	
	
	// Methods for a hungry pet
	void feed() {
		hunger = hunger - 10;
		thirst = thirst + 5;
	}

	boolean isHungry() {

		return hunger >= 50;

	}

	int getHunger() {
		return hunger;
	}

	// Methods for a thirsty pet

	void water() {
		thirst = thirst - 10;
		tired = tired + 7;
	}

	boolean isThirsty() {
		return thirst >= 50;
	}

	int getThirst() {
		return thirst;
	}

	// Methods for a bored pet
	void play() {
		boredom = boredom - 10;
		hunger = hunger + 5;
		thirst = thirst + 4;
		tired = tired + 5;
	}

	boolean isBored() {
		return boredom >= 50;
	}

	int getPlayfulness() {
		return boredom;
	}

	// Methods for a tired pet
	void nap() {
		tired = tired - 20;
		hunger = hunger + 10;
	}

	boolean isTired() {
		return tired >= 50;
	}

	int getTiredness() {
		return tired;
	}

	// Tick method
	void tick() {

		hunger = hunger + r.nextInt(10);
		thirst = thirst + r.nextInt(10);
		boredom = boredom + r.nextInt(10);
		tired = tired + r.nextInt(15);

	}
	
	@Override //used to turn object into String  ( toString)
	public String toString() {
		return name +" "+ petBreed +" " +  hunger + " " + thirst +" "+ boredom ;
	}

}// end class bracket
