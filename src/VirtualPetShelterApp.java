import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Creating VirtualPet objects
		VirtualPet scout = new VirtualPet("Scout", "lab", 10, 20, 30);
		VirtualPet rubble = new VirtualPet("Rubble", "yorkie", 20, 30, 40);
		// VirtualPet chase = new VirtualPet("Chase", "bull Dog", 50, 40, 30);
		// VirtualPet zuma = new VirtualPet("Zuma", "lab", 15, 30, 45);

		// creating the VirtualPetShelter object shelter
		VirtualPetShelter shelter = new VirtualPetShelter();

		// adding to pets map
		// shelterPets.put("Rubble", rubble);
		shelter.addPet(scout);
		shelter.addPet(rubble);

		writeLine("Thank you for volunteering at Derek's Virtual Pet Shelter\n");
		writeLine("This is the status of your pets\n");

		// Display the status here
		writeLine("Name\tHunger\tthirst\tBoredom");
		writeLine("-----\t------\t------\t--------");

		// Display
		for (VirtualPet current : shelter.pets()) {
			System.out.println(
					current.name + " " + "\t  " + current.hunger + "\t  " + current.thirst + "\t  " + current.boredom);
		}

		// testing getpet values method for status
		// System.out.println(shelter.getPetStatus());

		// Retrieving a status of what's in the map
		// System.out.println(shelter.getMap()); // test

		// BEGIN WHILE GAME LOOP
		boolean startGame = false;
		while (!startGame) {
			// Interaction;
			writeLine("\nWhat do you want to do ?\n");
			writeLine("1. Feed the pets");
			writeLine("2. Water the pets");
			writeLine("3. Play with a pet");
			writeLine("4. Adopt a pet");
			writeLine("5. Admit a pet");
			writeLine("6. Quit\n");

			String enterAction = input.next();

			switch (enterAction) {
			case "1":
				writeLine("Testing 123");
				// Feed All Pets
				shelter.feedAllPets();
				System.out.println(shelter.getMap()); // testing
				break;
			case "2":
				writeLine("Testing 123");
				// Give All Pets water
				shelter.waterAllPets();
				// System.out.println(shelter.getMap()); // testing
				break;
			case "3":
				// Play with A Pet
				writeLine("Who would you like to play with? Type a name.\n");

				// for loop is calling a method pets that goes through the
				// values of the current map
				for (VirtualPet current : shelter.pets()) {
					writeLine("[" + current.name + "] " + current.petBreed);
				}
				String petNameInput = input.next();

				VirtualPet petToPlay = shelter.getPet(petNameInput);
				shelter.playWithOnePet(petToPlay);

				writeLine("You played with " + petNameInput + ". ");
				break;

			case "4":
				writeLine("Testing 123");
				// Adopt a pet
				writeLine("Which charming pet would you like to adopt?");
				String adoptNameInput = input.next();

				shelter.adoptPet(adoptNameInput);
				System.out.println(shelter.getMap());

				break;
			case "5":

				// Admit a pet
				writeLine("What is the admitted pets name?");
				String admittedPetName = input.next();
				writeLine("What breed is your pet?");
				String admittedPetBreed = input.next();

				// create a new constructor object for admitted pet
				VirtualPet admittedPet = new VirtualPet(admittedPetName, admittedPetBreed);

				// adding to shelter
				shelter.addPet(admittedPet);
				System.out.println(shelter.getMap());

				break;
			case "6":
				writeLine(" You have exited the app");
				System.exit(0);
				break;
			}// end switch case

			// Displaying
			writeLine("Name\tHunger\tthirst\tBoredom");
			writeLine("-----\t------\t------\t--------");

			for (VirtualPet current : shelter.pets()) {
				System.out.println(current.name + " " + "\t  " + current.hunger + "\t  " + current.thirst + "\t  "
						+ current.boredom);
			}

			// Tick method for all pets
			shelter.tickAllPets();
			System.out.println(shelter.getMap()); // testing

		} // END WHILE

	}// end main method

	public static void writeLine(String message) {
		System.out.println(message);
	}

}// end class
