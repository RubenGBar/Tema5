package boletin1.ejercicio2;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		// Creo un objeto de la clase Cuenta Corriente dandole valores a sus atributos
		Libro l1 = new Libro("One Piece", "Eichiro Oda", 0, 0);
		// Creo un objeto de la clase Scanner
		Scanner sc = new Scanner(System.in);
		// Variable con la que actulizo el los libros prestados
		int actualizarEjemplares = 0;
		// Variable para saber si quiere seguir realizando operaciones
		String seguir;
		
		// Muestro la información inicial del libro
		System.out.println("Obra: " + l1.getTitulo());
		System.out.println("Su autor es: " + l1.getAutor());
		do {
			// Pregunto la cantidad de libros con la que cuenta
			System.out.println("¿Cuántos ejemplares tiene de esa obra?");
			// Guardo y actualizo los ejemplares
			actualizarEjemplares = sc.nextInt();
			l1.setEjemplares(actualizarEjemplares);
			System.out.println("Ejemplares de " + l1.getTitulo() + " es: " + l1.getEjemplares());
			// Pregunto la cantidad de nuevos prestamos
			System.out.println("\n" + "Número de libros prestados: ");
			// Guardo lo introducido en actualizarSueldo
			actualizarEjemplares = sc.nextInt();
			// Compruebo que se pueda realizar la operacion
			if (l1.prestamo(actualizarEjemplares)) {
				// Muestro los libros en prestamo actualizado
				System.out.println("Los libros prestados actualizado son: " + l1.getEjemplaresPrestados() + "\n");
			} else {
				// Muestro un mensaje indicando que no se ha podido realizar la operación
				System.out.println("La cantidad a prestar es mayor que la de libros en nuestro haber.\n");
			}
			// Le pregunto la cantidad de nuevas devoluciones
			System.out.println("Cantidad de libros devueltos: ");
			// Guardo lo introducido en actualizarEjemplares
			actualizarEjemplares = sc.nextInt();
			// Compruebo que se pueda realizar la operacion
			if(l1.devolucion(actualizarEjemplares)) {
				// Muestro los libros en prestamo actualizado
				System.out.println("Los libros prestados actualizado son: " + l1.getEjemplaresPrestados() + "\n");
			}else {
				// Muestro un mensaje indicando que no se ha podido realizar la operación
				System.out.println("La cantidad a devolver es mayor que la de libros en prestamos.\n");
			}
			// Pregunto si quiere seguir realizando operaciones
			System.out.println("¿Quiere seguir realizando operaciones?");
			// Limpio del teclado el caracter \n
			sc.nextLine();
			// Guardo lo introducido en teclado en seguir
			seguir = sc.nextLine();
			
		}while(seguir.equalsIgnoreCase("s"));
		
		// Cierro el Scanner
		sc.close();
	}
}
