package boletin1.ejercicio4;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		// Creo un objeto de la clase Articulo
		Articulo a1 = new Articulo("", 0, 0);
		// Creo un objeto de la clase Scanner
		Scanner sc = new Scanner(System.in);
		// Variable para guardar la opció elegida del menú
		int menu = 0;
		// Variable para guardar el nombre del producto
		String nombre = "";
		// Variable para guardar el precio del producto
		int precio = 0;
		// Variable para guardar los productos que hay en el almacen
		int almacen = 0;
		// Guardo el descuento del producto
		int descuento = 0;
		// Guardo los productos vendidos
		int vendidos = 0;
		// Guardo los productos a amacenar
		int almacenar = 0;
		// Guardo el precio con el IVA del producto
		double PVP = 0;
		// Guardo el precio con el descuento
		double PVPDescuento = 0;
		// Guardo si quiere seguir con el programa
		boolean seguir = true;
		
		// Pido que introduzca la información del producto
		System.out.println("¿Qué producto va a introducir?");
		// Leo el nombre del producto
		nombre = sc.nextLine();
		// Actualizo la información del objeto
		a1.setNombre(nombre);
		
		// Pido que introduzca la información del producto
		System.out.println("¿Cuál es su precio sin IVA?");
		// Leo el precio sin IVA del producto
		precio = sc.nextInt();
		// Actualizo la información del objeto
		a1.setPrecio(precio);
		
		// Pido que introduzca la información del producto
		System.out.println("¿Con qué cantidad cuenta?");
		// Leo la cantidad del producto
		almacen = sc.nextInt();
		// Actualizo la información del objeto
		a1.setCuantosQuedan(almacen);
		
		// Bucle do para repetir el programa hasta que lo desee el usuario
		do {
			// Muestro el menú
			System.out.println(" ------------ Opciones -------------- ");
			System.out.println("|                                    |");
			System.out.println("| 1. Mostrar el precio (PVP)         |");
			System.out.println("| 2. Mostrar el preico con descuento |");
			System.out.println("| 3. Venta de Productos              |");
			System.out.println("| 4. Almacenar Productos             |");
			System.out.println("| 5. Terminar                        |");
			System.out.println("|                                    |");
			System.out.println(" ------------------------------------ ");

			// Leo y guardo la opción elegida
			menu = sc.nextInt();

			switch (menu) {
				case 1 -> {
					// Calculo el precio con el IVA
					PVP = a1.getPVP();
					// Muestro el precio con el IVA
					System.out.println("El precio con el IVA es: " + PVP + " €");
				}
				case 2 -> {
					// Pido el descuento
					System.out.println("¿Cuál es el descuento?");
					// Leo y guardo el descuento
					descuento = sc.nextInt();
					// Calculo el precio con el descuento
					PVPDescuento = a1.getPVPDescuento(descuento);
					// Muestro el precio con el descuento
					System.out.println("El precio con un descuento del " + descuento + "% es el siguinete: " + PVPDescuento);
				}
				case 3 -> {
					// Pido los productos vendidos
					System.out.println("¿Cuántos productos ha vendido?");
					// Leo y guardo los productos vendidos
					vendidos = sc.nextInt();
					// Muestro un mensaje según la valoración de la función
					if(a1.vender(vendidos)) {
						// Muestro la información del producto actualizada
						System.out.println(a1.toString());
					}else {
						// Muestro un mensaje de error
						System.out.println("No se han podido vender los productos ya que no hay suficientes");
					}
				}
				case 4 -> {
					// Pido los productos a almacenar
					System.out.println("¿Cuántos productos nuevos va a almacenar?");
					// Leo y guardo los productos a almacenar
					almacenar = sc.nextInt();
					// Aumento los productos
					a1.almacenar(almacenar);
					// Muestro la información del producto actualizada
					System.out.println(a1);
				}
				case 5 -> {
					// Muestro un mensaje de finalización del programa
					System.out.println("El programa ha terminado");
					// Cambio la variable que controla el bucle a false
					seguir = false;
				}
				default -> {
					// Muestro un mensaje de error
					System.out.println("No se ha encontrado una opción válida");
				}
			}

		} while (seguir);

		// Cierro el Scanner
		sc.close();
	}
}
