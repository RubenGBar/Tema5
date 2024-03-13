package boletin2.ejercicio1;

/**
 * Clase alumno que representa los alumnos de un instituto o 
 * un aula los cuales cuentan con un nombre y una nota media
 */
public class Alumno {
	/**
	 * Atributo en el que guardo el nombre del alumno
	 */
	private String nombre = "";
	/**
	 * Atributo en el que guardo la nota media del alumno
	 */
	private double notaMedia = 0;
	/**
	 * Constructor con parámetros
	 * @param nombre Nombre del nuevo objeto alumno
	 * @param notaMedia Nota del nuevo objeto alumno
	 */
	public Alumno(String nombre, double notaMedia) {
		super();
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		if (notaMedia >= 0 && notaMedia <= 10) {
			this.notaMedia = notaMedia;
		}
	}
	/**
	 * Constuctor sin parámetros
	 */
	public Alumno() {
		
	}
	/**
	 * Función para obtener la nota media del alumno
	 * @return Devuelve el atributo notaMedia
	 */
	public double getNotaMedia() {
		return notaMedia;
	}
	/**
	 * Modifico la nota media del alumno
	 * @param notaMedia Nota con la que actualizar la nota media
	 */
	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}
	/**
	 * Función para obtener el nombre del alumno
	 * @return Devuelve el atributo nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Función para mostrar la información de la clase
	 */
	@Override
	public String toString() {
		return this.nombre + " : " + this.notaMedia;
	}
	
	
	
}
