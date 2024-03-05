package boletin1.ejercicio2;
 /**
  * Clase que guardará la información de los libros de una biblioteca
  */
public class Libro {
	 /**
	  * Atributo que guarda el título del libro
	  */
	private String titulo = "";
	/**
	 * Atributo que guarda el autor del ibro
	 */
	private String autor = "";
	/**
	 * Atriubto que guarda el número de ejemplares disponibles
	 */
	private int ejemplares = 0;
	/**
	 * Atriubto que guarda el número de ejemplares totales
	 */
	private int ejemplaresPrestados = 0;
	/**
	 * Constructor sin parámetros para poder crear objetos de la clase libro a los que no se le pasen parámetros
	 */
	public Libro() {
		super();
		
	}
	/**
	 * Constructor con parámetros para poder crear objetos de la clase libro a los que sí se le pasen parámetros
	 */
	public Libro(String titulo, String autor, int ejemplares, int ejemplaresPrestados) {
		super();
		if(!titulo.equals("") && !titulo.equals(null)) {
			this.titulo = titulo;			
		}
		if (!titulo.equals("") && !titulo.equals(null)) {
			this.autor = autor;
		}
		if(ejemplares > 0) {
			this.ejemplares = ejemplares;
		}
		this.ejemplaresPrestados = ejemplaresPrestados;
	}
	/**
	 * Función para obtener el atributo autor de la clase
	 * @return Devuelve el atributo autor de la clase
	 */
	public String getAutor() {
		return autor;
	}
	/**
	 * Función que actualiza el atributo autor
	 * @param autor Nombre del autor con el que se actuliza el atributo
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}
	/**
	 * Función para obtener el atributo ejemplares de la clase
	 * @return Devuelve el atributo ejemplares de la clase
	 */
	public int getEjemplares() {
		return ejemplares;
	}
	/**
	 * Función que actualiza el atributo ejemplares
	 * @param ejemplares Número de ejemplare con el que se actuliza el atributo
	 */
	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}
	/**
	 * Función para obtener el atributo ejemplaresPrestados de la clase
	 * @return Devuelve el atributo ejemplaresPrestados de la clase
	 */
	public int getEjemplaresPrestados() {
		return ejemplaresPrestados;
	}
	/**
	 * Función que actualiza el atributo ejemplaresPrestados
	 * @param ejemplaresPrestados Número de ejemplaresPrestados con el que se actuliza el atributo
	 */
	public void setEjemplaresPrestados(int ejemplaresPrestados) {
		this.ejemplaresPrestados = ejemplaresPrestados;
	}
	/**
	 * Función para obtener el atributo titulo de la clase
	 * @return Devuelve el atributo titulo de la clase
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * Función que nos indica si se puede realizar un préstamo y realiza las operaciones necesarias
	 * @param ejemplares El número de ejemplares prestados a aumentar
	 * @return Devuelve si se ha podido realizar la operación
	 */
	public boolean prestamo(int ejemplares) {
		boolean realizado = false;
		
		if(this.ejemplares > ejemplares) {
			this.ejemplaresPrestados += ejemplares;
			realizado = true;
		}
		
		return realizado;
	}
	/**
	 * Función que nos indica si se puede realizar una devolución y realiza las operaciones necesarias
	 * @param ejemplares El número de ejemplares prestados a dismiuir
	 * @return Devuelve si se ha podido realizar la operación
	 */
	public boolean devolucion(int ejemplares) {
		boolean realizado = false;
		
		if(this.ejemplaresPrestados > ejemplares) {
			this.ejemplaresPrestados -= ejemplares;
			realizado = true;
		}
		
		return realizado;
	}
	
}
