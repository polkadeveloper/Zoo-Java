package zoo;

public class Reptiles extends Animales {

	private String colorEscamas;
	
	public Reptiles(String nombre, char genero, String especie, int edad, Habitat habitat,
			EmpleadoZoo cuidador, String colorEscamas) {
		super(nombre, genero, especie, edad, habitat, cuidador);
		this.colorEscamas = colorEscamas;
	}
	
}
