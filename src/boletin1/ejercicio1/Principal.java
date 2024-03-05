package boletin1.ejercicio1;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		// Creo un objeto de la clase Cuenta Corriente dandole valores a sus atributos
		CuentaCorriente c1 = new CuentaCorriente("12345678A", "Pepe", 10);
		// Creo un objeto de la clase Scanner
		Scanner sc = new Scanner(System.in);
		// Variable con la que actulizo el sueldo
		double actualizarSueldo = 0;
		// Variable para saber si quiere seguir realizando operaciones
		String seguir;
		
		// Muestro la información inicial de su cuenta
		System.out.println("Hola " + c1.getNombre());
		System.out.println("Su saldo es: " + c1.getSaldo());
		do {
			// Le pregunto si quiere ingresar dinero
			System.out.println("\n" + "Cantidad de dinero a ingresar: ");
			// Guardo lo introducido en actualizarSueldo
			actualizarSueldo = sc.nextDouble();
			// Actualizo el sueldo con esa cantidad introducida
			c1.ingresarDinero(actualizarSueldo);
			// Muestro el sueldo actualizado
			System.out.println("Su sueldo actualizado: " + c1.getSaldo() + "\n");
			
			// Le pregunto si quiere sacar dinero
			System.out.println("Cantidad de dinero a sustraer: ");
			// Guardo lo introducido en actualizarSueldo
			actualizarSueldo = sc.nextDouble();
			// Compruebo que se pueda realizar la operacion
			if(c1.sacarDinero(actualizarSueldo)) {
				// Muestro el sueldo actualizado
				System.out.println("Su sueldo actualizado: " + c1.getSaldo() + "\n");
			}else {
				// Muestro un mensaje indicando que no se ha podido realizar la operación
				System.out.println("La cantidad a sustraer es mayor que el dinero en la cuenta.\n");
			}
			// Pregunto si quiere seguir realizando operaciones
			System.out.println("Quiere seguir realizando operaciones?");
			// Limpio del teclado el caracter \n
			sc.nextLine();
			// Guardo lo introducido en teclado en seguir
			seguir = sc.nextLine();
			
		}while(seguir.equalsIgnoreCase("s"));
		
		// Cierro el Scanner
		sc.close();
	}

}
