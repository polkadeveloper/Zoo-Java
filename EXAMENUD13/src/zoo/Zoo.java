package zoo;

import java.util.ArrayList;

public class Zoo {

	private ArrayList<Habitat> habitats;

	public Zoo() {
		habitats = new ArrayList<>();
	}
	
	public void AnadirHabitat (Habitat habitat) {
		if(!habitats.contains(habitat)) {
			habitats.add(habitat);
		}
		else {
			System.out.println("Ya existe ese habitat en el Zoo");
		}
	}
	
	public void EliminarHabitat(Habitat habitat) {
		if(habitats.contains(habitat)) {
			for(int i=0; i<habitats.size(); i++) {
				if (habitats.get(i).equals(habitat)) {
					habitats.remove(habitats.get(i));
				}
			}
		}
		else {
			System.out.println("No se puede eliminar el habitat porque no existe en el Zoo");
		}
	}
	
	public void AnadirAnimal(Habitat habitat, Animales animal) {
		
		habitat.AnadirAnimal(animal);
	}
	
	public void EliminarAnimal(Habitat habitat, Animales animal) {
		
		habitat.EliminarAnimal(animal);
	}
	
	public Habitat DevolverHabitat(String habitat) {
		for(int i=0; i<habitats.size(); i++) {
			if (habitats.get(i).getNombre().equalsIgnoreCase(habitat)) {
				return habitats.get(i);
			}
		}
		return null;
		
	}

	public ArrayList<Habitat> getHabitats() {
		return habitats;
	}

	public void setHabitats(ArrayList<Habitat> habitats) {
		this.habitats = habitats;
	}

	
	public void imprimirAnimales() {
		for(int i=0; i<habitats.size(); i++) {
			habitats.get(i).imprimirAnimales();
		}
	}
	
	
	
	
	
	
}
