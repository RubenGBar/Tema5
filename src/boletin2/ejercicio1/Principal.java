package boletin2.ejercicio1;

import java.util.Scanner;

public class Principal {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int opc = 0;
		
		do {
			
			menu();
			opc = sc.nextInt();
			
			switch (opc) {
			case 1 -> {
				
			}
			case 2 -> {
				
			}
			case 3 -> {
				
			}
			case 4 -> {
				
			}
			}
	
		}while(opc != 5);
		
	}
	
	public static void menu() {
		System.out.println("ALUMNOS/AS");
		System.out.println("==================");
		System.out.println("1. Listado");
		System.out.println("2. Nuevo Alumno");
		System.out.println("3. Modificar");
		System.out.println("4. Borrar");
		System.out.println("5. Añadir");

	}
}
