package boletin2.ejercicio1;

import java.util.Scanner;

public class Principal {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int opc = 0;
		String nombre = "";
		double notaMedia = 0;
		
		do {
			
			menu();
			opc = sc.nextInt();
			sc.nextLine();
			
			switch (opc) {
				case 1 -> {
					ArrayAlumnos.listado();
				}
				case 2 -> {
					System.out.println("Introduzca el nombre del Alumno a añadir");
					nombre = sc.nextLine();
					
					System.out.println("Introduzca la nota media del Alumno");
					notaMedia = sc.nextDouble();
					sc.nextLine();
					
					if(ArrayAlumnos.nuevoAlumno(nombre, notaMedia)) {
						System.out.println("Alumno añadido correctamente");
					} else {
						System.out.println("No se ha podido añadir el alumno");
					}
					
				}
				case 3 -> {
					System.out.println("Introduzca el nombre del Alumno a modificar");
					nombre = sc.nextLine();
					
					System.out.println("Introduzca la nueva nota media del Alumno");
					notaMedia = sc.nextDouble();
					sc.nextLine();
					
					if(ArrayAlumnos.modificaAlumno(nombre, notaMedia)) {
						System.out.println("Alumno modificado correctamente");
					} else {
						System.out.println("No se ha podido modificar el alumno");
					}
				}
				case 4 -> {
					System.out.println("Introduzca el nombre del Alumno a eliminar");
					nombre = sc.nextLine();
					
					if(ArrayAlumnos.eliminaAlumno(nombre)) {
						System.out.println("Alumno eliinado correctamente");
					} else {
						System.out.println("No se ha podido eliminar el alumno");
					}
				}
			}

		} while (opc != 5);
		
		System.out.println("El programa ha terminado");
		
		sc.close();
	}
	
	public static void menu() {
		System.out.println("ALUMNOS/AS");
		System.out.println("==================");
		System.out.println("1. Listado");
		System.out.println("2. Nuevo Alumno");
		System.out.println("3. Modificar");
		System.out.println("4. Borrar");
		System.out.println("5. Salir");

	}
}
