package boletin1.ejercicio3;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		// Creo un objeto de la clase Punto
		Punto p1 = new Punto(0, 0);
		// Creo un objeto de la clase Punto
		Punto p2 = new Punto(0, 0);
		// Creo un objeto de la clase Scanner
		Scanner sc = new Scanner(System.in);
		// Variable para guardar el valor de la coordenada X
		int x = 0;
		// Variable para guardar el valor de la coordenada Y
		int y = 0;
		// Variable para guardar el valor de la distancia entre los dos puntos
		int distancia = 0;
		
		// Pido que introduzca dos coordenadas para el punto 1
		System.out.println("Introduzca la coordenada X e Y del punto: ");
		// Guardo lo introducido por teclado en X e Y respectivamente
		x = sc.nextInt();
		y = sc.nextInt();
		// Actualizo las coordenadas del objeto p1
		p1.setXY(x, y);
		
		// Pido que desplaze los puntos
		System.out.println("\nIntroduzca un desplazamiento para los puntos:");
		// Guardo lo introducido por teclado en X e Y respectivamente
		x = sc.nextInt();
		y = sc.nextInt();
		// Desplazo el punto
		p1.desplaza(x, y);
		// Muestro la nueva posición del punto
		System.out.print("\nLa nueva distancia del punto es la siguiente: ");
		p1.imprime();
		
		// Pido que introduzca dos coordenadas para el punto 2
		System.out.println("\nIntroduzca la coordenada X e Y de otro punto: ");
		// Guardo lo introducido por teclado en X e Y respectivamente
		x = sc.nextInt();
		y = sc.nextInt();
		// Actualizo las coordenadas del objeto p1
		p2.setXY(x, y);
		
		// Calculo la distancia entre los dos puntos y lo muestro
		distancia = p1.distancia(p1, p2);
		System.out.println("\nLa distancia entre el primer y segundo punto es: " + distancia);
		
		// Cierro el Scanner
		sc.close();
	}
}
