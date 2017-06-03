
import java.util.Map;
import java.util.Collection;
import java.util.HashMap;

public class VirtualPetShelter {

	//String name;
	//int hunger = 45;
	//int thirst = 20;
	//int boredom = 40;
	boolean startGame;

	// Constructors------------------------------
	Map<String, VirtualPet> shelterPets = new HashMap<String, VirtualPet>();

	// Methods------------------------------------
	// =========
	
	// Allows you to put/add a pet to the map
	void addPet(VirtualPet pet) {
		shelterPets.put(pet.name, pet);
	}
	
	//gets a single pet from the map
	public VirtualPet getPet(String name) {
        return shelterPets.get(name);
    }
	

	
// get pet status -------------------------------------------
//	void displayEntries() {
//        for(VirtualPet current: shelterPets.values()) {
//            System.out.println(current.name+ " " +"\t"+current.hunger +"\t"+current.thirst +"\t"+current.boredom);  
//        }
//    }

	// feed all Pets()-------------------------------------
	void feedAllPets() {
		for (VirtualPet p : shelterPets.values()) {
			p.feed();
		}
	}

	//Prints out whats in the map---------------------------
	public Collection getMap() {
		return shelterPets.values();
	}

	// waterPets() method------------------------------------
	void waterAllPets() {
		for (VirtualPet p : shelterPets.values()) {
			p.water();
		}
	}

	// play with a single pet-------------------------------
	public void playWithOnePet(VirtualPet petName) {
        petName.play();
    }

	// adopt a pet method-----------------------------------
	public void adoptPet(String adoptedPetKey){
		shelterPets.remove(adoptedPetKey);	
	}
	

	// This method shows the current contents of the map-----------------------------------
	
	public Collection<VirtualPet>pets(){
		return shelterPets.values();
		
	}
	
	
	// tickAllPets method-----------------------------------
	void tickAllPets() {
		for (VirtualPet p : shelterPets.values()) {
			p.tick();
		}
	}

}
