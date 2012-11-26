package serpis;

import java.util.Random;
import java.util.Scanner;

public class Adivina {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Genera un número aleatorio entre 1 y 1000
		// Pide al usuario que introduzca por teclado un número entre 1 y 1000
		// El juego acaba cuando el usuario encuentra el número aleatorio
		// Nota: se le va dando como pista si es mayor o menor
		Random random= new Random();
		int numeroAleatorio= random.nextInt(1000) + 1;
		
		System.out.println("numeroAleatorio="+numeroAleatorio);
		

		int numeroUsuario, contadorIntentos;
		contadorIntentos=1;
		
		Scanner scanner = new Scanner(System.in);  //escaner asociado al teclado
		
		while (true) {
			System.out.println("Introduce un número: (intento " + contadorIntentos + "): ");
			// System.out.printf("Introduce un número (intento %d): ", contadorIntentos);
			String linea = scanner.nextLine();
			System.out.printf("Has escrito: %s. " , linea);
			numeroUsuario = Integer.parseInt(linea);
			
			if (numeroUsuario == numeroAleatorio)
				break;
			if (numeroUsuario > numeroAleatorio){
				System.out.println("El numero introducido es mayor ");
				contadorIntentos += 1;
			}else{
				System.out.println("El numero introducido es menor ");
				contadorIntentos += 1;
			}
		}			
			System.out.println("Has acertado.  Numero de intentos: " + contadorIntentos );
			
		
		
	}

}
