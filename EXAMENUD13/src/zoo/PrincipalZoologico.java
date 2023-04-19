package zoo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PrincipalZoologico {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		EmpleadoZoo empleadomamiferos = new EmpleadoZoo(1, "Álvaro", "Bárcena Lasala", 1200);
		EmpleadoZoo empleadoaves = new EmpleadoZoo(2, "Manuel", "Fernandez Esteban", 1100);
		EmpleadoZoo empleadoreptiles = new EmpleadoZoo(3, "Laura", "Martínez López", 1500);
		
		
		ArrayList<EmpleadoZoo> empleados = new ArrayList<>();
		empleados.add(empleadomamiferos);
		empleados.add(empleadoaves);
		empleados.add(empleadoreptiles);

		
		Zoo miZoo = new Zoo();
		
		Habitat aviario = new Habitat("aviario");
		Habitat reptiliario = new Habitat("reptiliario");
		Habitat terrario = new Habitat("terrario");
		
		miZoo.AnadirHabitat(terrario);
		miZoo.AnadirHabitat(reptiliario);
		miZoo.AnadirHabitat(aviario);

		

		int option = 0;

		while (option != 8) {

			System.out.println("******MENÚ******");
			System.out.println("1. Agregar y eliminar animales del zoológico.");
			System.out.println("2. Agregar y eliminar hábitats del zoológico.");
			System.out.println("3. Agregar y eliminar cuidadores del zoológico.");
			System.out.println("4. Asignar animales a hábitats específicos.");
			System.out.println("5. Asignar cuidadores a animales específicos.");
			System.out.println("6. Mostrar información detallada de cada animal, hábitat y cuidador.");
			System.out.println("7. Mostrar los animales del zoo ordenados por edad");
			System.out.println("8. Salir");

			option = entrada.nextInt();
			entrada.nextLine();

			if (option == 1) {

				System.out.println("Quieres añadir o eliminar un animal?");
				String respuesta = entrada.nextLine();

				if (respuesta.equalsIgnoreCase("añadir")) {

					System.out.println("Introduce que animal quieres añadir(mamifero, ave, reptil)");
					String tipoAnimal = entrada.nextLine();

					if (tipoAnimal.equalsIgnoreCase("mamifero")) {

						System.out.println("Introduce el habitat");
						String nombreHabitat = entrada.nextLine();

						if (miZoo.getHabitats().contains(miZoo.DevolverHabitat(nombreHabitat))) {

							System.out.println("Introduce el nombre");
							String nombre = entrada.nextLine();
							System.out.println("Introduce el genero (M-F)");
							char genero = entrada.nextLine().charAt(0);
							System.out.println("Introduce la especie");
							String especie = entrada.nextLine();
							System.out.println("Introduce la edad");
							int edad = entrada.nextInt();
							entrada.nextLine();
							System.out.println("Introduce el desplazamiento (“por tierra”, “por mar” o “por aire”).");
							String desplazamiento = entrada.nextLine();
							Mamiferos mamifero = new Mamiferos(nombre, genero, especie, edad, miZoo.DevolverHabitat(nombreHabitat), empleadomamiferos,
									desplazamiento);
							miZoo.DevolverHabitat(nombreHabitat).AnadirAnimal(mamifero);

						}
						else if(!miZoo.getHabitats().contains(miZoo.DevolverHabitat(nombreHabitat))){ {
							Habitat nuevohabitat = new Habitat(nombreHabitat);
							miZoo.AnadirHabitat(nuevohabitat);
							System.out.println("Introduce el nombre");
							String nombre = entrada.nextLine();
							System.out.println("Introduce el genero (M-F)");
							char genero = entrada.nextLine().charAt(0);
							System.out.println("Introduce la especie");
							String especie = entrada.nextLine();
							System.out.println("Introduce la edad");
							int edad = entrada.nextInt();
							entrada.nextLine();
							System.out.println("Introduce el desplazamiento (“por tierra”, “por mar” o “por aire”).");
							String desplazamiento = entrada.nextLine();
							Mamiferos mamifero = new Mamiferos(nombre, genero, especie, edad, nuevohabitat, empleadomamiferos,
									desplazamiento);
							nuevohabitat.AnadirAnimal(mamifero);
						}
						}
							

					}
					if (tipoAnimal.equalsIgnoreCase("ave")) {
						
						System.out.println("Introduce el habitat");
						String nombreHabitat = entrada.nextLine();
						
						if (miZoo.getHabitats().contains(miZoo.DevolverHabitat(nombreHabitat))) {
						
							System.out.println("Introduce el nombre");
							String nombre = entrada.nextLine();
							System.out.println("Introduce el genero (M-F)");
							char genero = entrada.nextLine().charAt(0);
							System.out.println("Introduce la especie");
							String especie = entrada.nextLine();
							System.out.println("Introduce la edad");
							int edad = entrada.nextInt();
							entrada.nextLine();
							System.out.println("Introduce la longitud del pico");
							int longitudPico = entrada.nextInt();
							entrada.nextLine();
							System.out.println("Introduce si es rapaz o no (true-false)");
							boolean rapaz = entrada.nextBoolean();

							Aves ave = new Aves(nombre, genero, especie, edad, miZoo.DevolverHabitat(nombreHabitat), empleadoaves, longitudPico,
									rapaz);
							miZoo.DevolverHabitat(nombreHabitat).AnadirAnimal(ave);
						}
						else if(!miZoo.getHabitats().contains(miZoo.DevolverHabitat(nombreHabitat))) {
							Habitat nuevohabitat = new Habitat(nombreHabitat);
							miZoo.AnadirHabitat(nuevohabitat);
							System.out.println("Introduce el nombre");
							String nombre = entrada.nextLine();
							System.out.println("Introduce el genero (M-F)");
							char genero = entrada.nextLine().charAt(0);
							System.out.println("Introduce la especie");
							String especie = entrada.nextLine();
							System.out.println("Introduce la edad");
							int edad = entrada.nextInt();
							entrada.nextLine();
							System.out.println("Introduce la longitud del pico");
							int longitudPico = entrada.nextInt();
							entrada.nextLine();
							System.out.println("Introduce si es rapaz o no (true-false)");
							boolean rapaz = entrada.nextBoolean();
							Aves ave = new Aves(nombre, genero, especie, edad, nuevohabitat, empleadoaves, longitudPico,
									rapaz);
							nuevohabitat.AnadirAnimal(ave);
							
						}

					}
					
					if(tipoAnimal.equalsIgnoreCase("reptil")) {
						System.out.println("Introduce el habitat");
						String nombreHabitat = entrada.nextLine();
						
						if (miZoo.getHabitats().contains(miZoo.DevolverHabitat(nombreHabitat))) {
							
							System.out.println("Introduce el nombre");
							String nombre = entrada.nextLine();
							System.out.println("Introduce el genero (M-F)");
							char genero = entrada.nextLine().charAt(0);
							System.out.println("Introduce la especie");
							String especie = entrada.nextLine();
							System.out.println("Introduce la edad");
							int edad = entrada.nextInt();
							entrada.nextLine();
							System.out.println("Introduce el color de las escamas");
							String colorEscamas = entrada.nextLine();

							Reptiles reptil = new Reptiles(nombre, genero, especie, edad, miZoo.DevolverHabitat(nombreHabitat), empleadoreptiles, colorEscamas);
							miZoo.DevolverHabitat(nombreHabitat).AnadirAnimal(reptil);
						}
						else if(!miZoo.getHabitats().contains(miZoo.DevolverHabitat(nombreHabitat))) {
							Habitat nuevohabitat = new Habitat(nombreHabitat);
							miZoo.AnadirHabitat(nuevohabitat);
							System.out.println("Introduce el nombre");
							String nombre = entrada.nextLine();
							System.out.println("Introduce el genero (M-F)");
							char genero = entrada.nextLine().charAt(0);
							System.out.println("Introduce la especie");
							String especie = entrada.nextLine();
							System.out.println("Introduce la edad");
							int edad = entrada.nextInt();
							entrada.nextLine();
							System.out.println("Introduce el color de las escamas");
							String colorEscamas = entrada.nextLine();

							Reptiles reptil = new Reptiles(nombre, genero, especie, edad, nuevohabitat, empleadoreptiles, colorEscamas);
							nuevohabitat.AnadirAnimal(reptil);
						}
					}
				}
				
				else if(respuesta.equalsIgnoreCase("eliminar")) {
					System.out.println("Introduce el habitat de donde quieres eliminar un animal");
					String nombreHabitat = entrada.nextLine();
					
					if (miZoo.getHabitats().contains(miZoo.DevolverHabitat(nombreHabitat))) {
						System.out.println("Introduce el nombre del animal a eliminar");
						String animal = entrada.nextLine();
						miZoo.DevolverHabitat(nombreHabitat).EliminarAnimal(miZoo.DevolverHabitat(nombreHabitat).DevolverAnimal(animal));
					}
				}
			}

				if (option == 2) {
					System.out.println("Quieres añadir o eliminar un habitat?");
					String respuesta = entrada.nextLine();

					if (respuesta.equalsIgnoreCase("añadir")) {
						System.out.println("Introduce el nombre del habitat a añadir");
						String nombreHabitat = entrada.nextLine();
						Habitat nuevohabitat = new Habitat(nombreHabitat);
						miZoo.AnadirHabitat(nuevohabitat);
					}
					else if(respuesta.equalsIgnoreCase("eliminar")) {
						System.out.println("Introduce el nombre del habitat a eliminar");
						String nombreHabitat = entrada.nextLine();
						miZoo.EliminarHabitat(miZoo.DevolverHabitat(nombreHabitat));
					}
				}

				if (option == 3) {
					System.out.println("Quieres añadir o eliminar un cuidador?");
					String respuesta = entrada.nextLine();
					
					if (respuesta.equalsIgnoreCase("añadir")) {
						System.out.println("Introduce el numero del cuidador");
						int numerocuidador = entrada.nextInt();
						entrada.nextLine();
						System.out.println("Introduce el nombre del cuidador");
						String nombre = entrada.nextLine();
						System.out.println("Introduce los apellidos del cuidador");
						String apellidos = entrada.nextLine();
						System.out.println("Introduce el salario del cuidador");
						int salario = entrada.nextInt();
						EmpleadoZoo empleadonuevo = new EmpleadoZoo(numerocuidador, nombre, apellidos, salario);
						empleados.add(empleadonuevo);
					}
					else if(respuesta.equalsIgnoreCase("eliminar")) {
						System.out.println("Introduce el nombre del cuidador a eliminar");
						String nombrecuidador = entrada.nextLine();
						for(int i=0; i<empleados.size(); i++) {
							if(empleados.get(i).getNombre().equalsIgnoreCase(nombrecuidador)) {
								empleados.remove(i);
							}
						}
						
					}
					

				}

				if (option == 4) {
					
					System.out.println("Introduce el hábitat donde se encuentra el animal a cambiar de hábitat");
					String nombreHabitat = entrada.nextLine();
					System.out.println("Introduce el nombre del animal");
					String nombre = entrada.nextLine();
					System.out.println("Introduce el habitat nuevo al que añadirlo");
					String nuevohabitat = entrada.nextLine();
					miZoo.DevolverHabitat(nombreHabitat).DevolverAnimal(nombre).setHabitat(miZoo.DevolverHabitat(nuevohabitat));
					
					

				}

				if (option == 5) {
					
					System.out.println("Indica el nombre del cuidador");
					String nombreCuidador = entrada.nextLine();
					System.out.println("Indica el habitat en el que se encuentra el animal");
					String nombreHabitat = entrada.nextLine();
					System.out.println("Indica el nombre del animal al que asignarselo");
					String animal = entrada.nextLine();
					
					
					for(int i=0; i<empleados.size(); i++) {
						if(empleados.get(i).getNombre().equalsIgnoreCase(nombreCuidador)) {
							miZoo.DevolverHabitat(nombreHabitat).DevolverAnimal(animal).setCuidador(empleados.get(i));
						}
					}
				}

				if (option == 6) {
					miZoo.imprimirAnimales();
				}

				if (option == 7) {
					
					for(int i=0; i<miZoo.getHabitats().size(); i++) {
						Collections.sort(miZoo.getHabitats().get(i).getAnimales());
						System.out.println(miZoo.getHabitats().get(i).getNombre());
						System.out.println(miZoo.getHabitats().get(i).getAnimales()+"\n");
						System.out.println();
					}
					
				}

				if (option == 8) {
					System.out.println("Gracias por usar el programa");
				}

				if (option < 1 || option > 8) {
					System.out.println("Opción inválida");
				}

			}

		}

	}

