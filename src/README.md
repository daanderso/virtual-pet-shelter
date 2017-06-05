    Virtual Pet Shelter
    ====================
    
    Synopsis:
    ---------
    Welcome to the VirtualPet Shelter. The shelter allows a user to select to feed all the pets in the shelter and 
    give water to all pets in the shelter. In addition, the user may enter a single pet, play with a single pet in the shelter,
    and feed a single pet in the shelter. The status of the pets will update accordingly based on the interaction from the user.
    A user may also adopt a pet currently living in the shelter or admit a new pet to the shelter.
    
     VirtualPetShelter Class
     =======================
     Constructor
     ------------
     Creates shelterPets HashMap object
     Map<String, VirtualPet> shelterPets = new HashMap<String, VirtualPet>();

     Methods
     --------	
     addPet - Allows you to put/add a pet to the map
     -----------------------------------------------
     getPet - Gets a single pet from the map
     -------------------------------------------
     feedAllPets - Feeds all Pets in the shelter
     -------------------------------------------
     waterAllPets - Waters all pets
     ------------------------------------------
     playWithOnePet - plays with a single pet
     -----------------------------------------
     adoptPet -adopt a pet method
     -----------------------------------------
     pets -shows the current values/contents of the map		
     --------------------------------------------------	
     tickAllPets - simulates an advance in time for all pets in the shelter
	

   
    VirtualPet Class 
    =========================
    
    Instance variables
    -------------------
    String name;
	String description;
    int hunger
	int thirst
	int boredom
	
	Constructors
	------------
	  constructor accepts name and description(breed) to set the default value
	  public VirtualPet(String newName, String newDescription) {
		name = newName;
		description = newDescription;
		hunger = 45;
		thirst = 25;
		boredom = 40;
	}

	// constructor that passes in name, description, hunger, thirst, boredom
	public VirtualPet(String newName, String newDescription, int newHunger, int newThirst, int newBoredom) {
		name = newName;
		description = newDescription;
		hunger = newHunger;
		thirst = newThirst;
		boredom = newBoredom;

	}
		
	Methods
	--------
	feed () -  will decrease hunger and increase thirst
	-----------------------------------
	water() -  will decrease thirst 
	------------------------------
	play() - will decrease boredom and increase hunger, thirst
	---------------------------------------------
	tick () - simulates an advance in time. It uses a random number to increase hunger, thirst, boredom.
	

