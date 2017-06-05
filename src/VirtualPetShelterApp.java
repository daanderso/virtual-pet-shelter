import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Creating VirtualPet objects
		VirtualPet scout = new VirtualPet("scout", "lab", 50, 40, 30);
		VirtualPet rubble = new VirtualPet("rubble", "yorkie", 45, 50, 40);


		// creating the VirtualPetShelter object shelter 
		VirtualPetShelter shelter = new VirtualPetShelter();

		// adding to pets to add to populate map
		shelter.addPet(scout);
		shelter.addPet(rubble);

		writeLine("Thank you for volunteering at Derek's Virtual Pet Shelter\n");
		writeLine("This is the status of your pets\n");

		// Display the status here
		writeLine("Name\tHunger\tthirst\tBoredom");
		writeLine("-----\t------\t------\t--------");
		for (VirtualPet current : shelter.pets()) {
			System.out.println(
					current.name + " " + "\t  " + current.hunger + "\t  " + current.thirst + "\t  " + current.boredom);
		}

		// BEGIN WHILE GAME LOOP
		boolean startGame = false;
		while (!startGame) {
			// Interaction;
			writeLine("\nWhat do you want to do ? Enter a number 1-6.\n");
			writeLine("1. Feed the pets");
			writeLine("2. Water the pets");
			writeLine("3. Play with a pet");
			writeLine("4. Adopt a pet");
			writeLine("5. Admit a pet");
			writeLine("6. Quit\n");

			String enterAction = input.next();

			switch (enterAction) {
			case "1":
				// Feed All Pets
				shelter.feedAllPets();
				break;
			case "2":
				// Give All Pets water
				shelter.waterAllPets();
				break;
			case "3":
				// Play with A Pet
				writeLine("Who would you like to play with? Type a name.\n");

				// for loop is calling a method pets that goes through the
				// values of the current map and displays name and description
				for (VirtualPet current : shelter.pets()) {
					writeLine("[" + current.name + "] " + current.description);
				}
				String petNameInput = input.next();

				//getting a pet from the map to pass to play method
				VirtualPet petToPlay = shelter.getPet(petNameInput.toLowerCase());
				shelter.playWithOnePet(petToPlay);

				writeLine("You played with " + petNameInput + ". ");
				break;
			case "4":
				// Adopt a pet
				writeLine("Which charming pet would you like to adopt?");
				
				//Display available pets to adopt
				for (VirtualPet current : shelter.pets()) {
					writeLine("[" + current.name + "] " + current.description);
				}
				
				String adoptNameInput = input.next();
				shelter.adoptPet(adoptNameInput.toLowerCase());

				break;
			case "5":
				// Admit a pet
				writeLine("What is the admitted pets name?");
				String admittedPetName = input.next();
				writeLine("What breed is your pet?");
				String admittedPetDescription = input.next(); 
			
		
				//changing input to lower to avoid any issues with key
				String admittedPetNameLower = admittedPetName.toLowerCase();

				// create a new constructor VirtualPet object  admittedPet to pass to addPet() method
				VirtualPet admittedPet = new VirtualPet(admittedPetNameLower, admittedPetDescription);
				
				// adding a pet to shelter map
				shelter.addPet(admittedPet);
				
				break;
			case "6":
				writeLine(" You have exited the app");
				System.exit(0);
				break;
			}// end switch case

			// Displaying Pet Status
			writeLine("Name\tHunger\tthirst\tBoredom");
			writeLine("-----\t------\t------\t--------");

			for (VirtualPet current : shelter.pets()) {
				System.out.println(current.name + " " + "\t  " + current.hunger + "\t  " + current.thirst + "\t  "
						+ current.boredom);
			}

			// Tick method for all pets
			shelter.tickAllPets();

		} // END WHILE
		
		input.close();

	}// End Main Method

	public static void writeLine(String message) {
		System.out.println(message);
	}

}// End Class
