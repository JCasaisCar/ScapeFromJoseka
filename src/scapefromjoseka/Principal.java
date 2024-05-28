package scapefromjoseka;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean salir = true;
		while (salir) {
			try {
				Scanner leer = new Scanner(System.in);

				boolean salirmenu = true;
				
				int opcion = 0;

				while (salirmenu) {
					System.out.println("Bienvenid@ a Ilerna Sevilla");
					System.out.println("Ahora eres Joseka, un futbolista frustrado por culpa de la clase de DAW al unirse al Fantasy");
					System.out.println("¿Que te apetece hacer?");
					System.out.println("1. Quiero entrar");
					System.out.println("2. Quiero ir a por una cerveza");
					System.out.println("3. Quiero salir ");
					opcion = (int) leer.nextFloat();


					switch (opcion) {
					case 1:
						System.out.println("Felicidades estas en Ilerna Sevilla");
						System.out.println("Estas atrapado en el centro, intenta salir demostrando tus abilidades");
						
						System.out.println("Elige:");
						System.out.println("1. Ir a la porteria");
						System.out.println("2. Subir por las escaleras");
						System.out.println("3. Subir por el ascensor");
						opcion = (int) leer.nextFloat();

							switch (opcion) {
							case 1:
								System.out.println("Estas en la portería");
								System.out.println("Te encuentras la ballesta mítica de Joseka");
								
								System.out.println("Que quieres hacer:");
								System.out.println("1. Coger la ballesta");
								System.out.println("2. Dejarla ahi");
								opcion = (int) leer.nextFloat();

									switch (opcion) {
									case 1:
										System.out.println("Estas en la portería");
										System.out.println("Te encuentras la ballesta mítica de Joseka");
										
										
										break;
									case 2:
										System.out.println("Has empezado de nuevo!!");
										
										break;
									default:
										System.out.println("La opción seleccionada no existe, escribela otra vez");
									}
								
								break;
							case 2:
								System.out.println("Has empezado de nuevo!!");
								
								break;
							case 3:
								System.out.println("Has empezado de nuevo!!");
								break;
							default:
								System.out.println("La opción seleccionada no existe, escribela otra vez");
							}
						
						
						break;
					case 2:
						System.out.println("Joseka llega al rey de la cerveza y al acabarse un barril entero de cerveza saca la ballesta le da al de la barra un ballestazo en la cabeza y se muere debido a que recibe un tiro de un policia que estaba sentado al lado de el");

						System.out.println("Al estar Joseka muerto debes de empezar el juego de nuevo o salir de el");
						
						System.out.println("¿Que quieres hacer?");
						System.out.println("1. Quiero empezar de nuevo");
						System.out.println("2. Quiero salir");
						opcion = (int) leer.nextFloat();

							switch (opcion) {
							case 1:
								System.out.println("Has empezado de nuevo!!");
								
								break;
							case 2:
								System.out.println("Saliste del juego");
								salirmenu = false;
								break;
							default:
								System.out.println("La opción seleccionada no existe, escribela otra vez");
							}
						
						break;
					case 3:
						System.out.println("Saliste del juego");
						salirmenu = false;
						break;
					default:
						System.out.println("La opción seleccionada no existe, escribela otra vez");
					}
				}


				salir = false;
				leer.close();

			} catch (InputMismatchException e) {
				System.out.println("Entrada no válida, no puedes ni meter letras, ni .(los números decimales van con ,)");
				System.out.println("Empezamos de nuevo!!");
			}
		}

	}

}
