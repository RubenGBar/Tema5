package boletin1.ejercicio3;
/**
 * Clase que guarda las propiedades y operaciones que se pueden realizar con puntos en un plano
 */
public class Punto {
	/**
	 * Atributo que guarda la coordenada X del punto
	 */
	private int x = 0;
	/**
	 * Atributo que guarda la coordenada Y del punto
	 */
	private int y = 0;
	/**
	 * Constructor con parámetros para rellenar los atributos de la clase 
	 * @param x
	 * @param y
	 */
	public Punto(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	/**
	 * Función para poder obtener el atributo X
	 * @return Devuelve el valor del atributo X
	 */
	public int getX() {
		return x;
	}
	/**
	 * Función para poder obtener el atributo Y
	 * @return Devuelve el valor del atributo Y
	 */
	public int getY() {
		return y;
	}

	/**
	 * Función para imprimir las coordenadas del punto
	 */
	public void imprime() {
		System.out.println("(" + this.x + "," + this.y + ")");
	}
	/**
	 * Función que cambia el valor de las dos coordenadas
	 * @param x Nuevo valor del atributo x
	 * @param y Nuevo valor del atributo y
	 */
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	/**
	 * Función que desplaza las coordenada la cantidad recibida
	 * @param x Cantidad a desplazar la coordenada X
	 * @param y Cantidad a desplazar la coordenada Y
	 */
	public void desplaza(int x, int y) {
		this.x = this.x + x;
		this.y = this.y + y;
	}
	/**
	 * Funciónn que calcula la distancia entre dos puntos
	 * @param p1 Punto con el que calcular la distancia
	 * @param p2 Segundo punto con el que realizar la distancia
	 * @return Devuelve la distancia entre dos puntos
	 */
	public int distancia(Punto p1, Punto p2) {
		int distancia = 0;
		
		distancia = (int) (
							Math.sqrt(
									  (Math.pow( (p2.getX() - p1.getX()), 2) ) + 
									  (Math.pow( (p2.getY() - p1.getY()), 2) )
									  )
							);
		
		return distancia;
	}
}
