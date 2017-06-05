import java.util.Map;
import java.util.Collection;
import java.util.HashMap;

public class VirtualPetShelter {

	// Constructor for creating pet shelter map------------------------------
	Map<String, VirtualPet> shelterPets = new HashMap<String, VirtualPet>();

	// Methods------------------------------------

	// Allows you to put/add a pet to the map
	void addPet(VirtualPet pet) {
		shelterPets.put(pet.name, pet);
	}

	// gets a single pet from the map
	public VirtualPet getPet(String name) {
		return shelterPets.get(name);
	}

	// feed all Pets()-------------------------------------
	void feedAllPets() {
		for (VirtualPet pet : shelterPets.values()) {
			pet.feed();
		}
	}

	// water all pets----------------------------------
	void waterAllPets() {
		for (VirtualPet pet : shelterPets.values()) {
			pet.water();
		}
	}

	// play with a single pet-------------------------------
	public void playWithOnePet(VirtualPet petName) {
		petName.play();
	}

	// adopt a pet method-----------------------------------
	public void adoptPet(String adoptedPetKey) {
		shelterPets.remove(adoptedPetKey);
	}

	// This method shows the current contents of the map----

	public Collection<VirtualPet> pets() {
		return shelterPets.values();
	}

	// tickAllPets method-----------------------------------
	void tickAllPets() {
		for (VirtualPet p : shelterPets.values()) {
			p.tick();
		}
	}
	

}
