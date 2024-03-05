package boletin1.ejercicio2;
 /**
  * Clase que guardar� la informaci�n de los libros de una biblioteca
  */
public class Libro {
	 /**
	  * Atributo que guarda el t�tulo del libro
	  */
	private String titulo = "";
	/**
	 * Atributo que guarda el autor del ibro
	 */
	private String autor = "";
	/**
	 * Atriubto que guarda el n�mero de ejemplares disponibles
	 */
	private int ejemplares = 0;
	/**
	 * Atriubto que guarda el n�mero de ejemplares totales
	 */
	private int ejemplaresPrestados = 0;
	/**
	 * Constructor sin par�metros para poder crear objetos de la clase libro a los que no se le pasen par�metros
	 */
	public Libro() {
		super();
		
	}
	/**
	 * Constructor con par�metros para poder crear objetos de la clase libro a los que s� se le pasen par�metros
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
	 * Funci�n para obtener el atributo autor de la clase
	 * @return Devuelve el atributo autor de la clase
	 */
	public String getAutor() {
		return autor;
	}
	/**
	 * Funci�n que actualiza el atributo autor
	 * @param autor Nombre del autor con el que se actuliza el atributo
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}
	/**
	 * Funci�n para obtener el atributo ejemplares de la clase
	 * @return Devuelve el atributo ejemplares de la clase
	 */
	public int getEjemplares() {
		return ejemplares;
	}
	/**
	 * Funci�n que actualiza el atributo ejemplares
	 * @param ejemplares N�mero de ejemplare con el que se actuliza el atributo
	 */
	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}
	/**
	 * Funci�n para obtener el atributo ejemplaresPrestados de la clase
	 * @return Devuelve el atributo ejemplaresPrestados de la clase
	 */
	public int getEjemplaresPrestados() {
		return ejemplaresPrestados;
	}
	/**
	 * Funci�n que actualiza el atributo ejemplaresPrestados
	 * @param ejemplaresPrestados N�mero de ejemplaresPrestados con el que se actuliza el atributo
	 */
	public void setEjemplaresPrestados(int ejemplaresPrestados) {
		this.ejemplaresPrestados = ejemplaresPrestados;
	}
	/**
	 * Funci�n para obtener el atributo titulo de la clase
	 * @return Devuelve el atributo titulo de la clase
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * Funci�n que nos indica si se puede realizar un pr�stamo y realiza las operaciones necesarias
	 * @param ejemplares El n�mero de ejemplares prestados a aumentar
	 * @return Devuelve si se ha podido realizar la operaci�n
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
	 * Funci�n que nos indica si se puede realizar una devoluci�n y realiza las operaciones necesarias
	 * @param ejemplares El n�mero de ejemplares prestados a dismiuir
	 * @return Devuelve si se ha podido realizar la operaci�n
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
