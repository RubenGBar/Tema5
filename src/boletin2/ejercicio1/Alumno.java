package boletin2.ejercicio1;

public class Alumno {
	/**
	 * Atributo en el que guardo el nombre del alumno
	 */
	private String nombre = "";
	/**
	 * Atributo en el que guardo la nota media del alumno
	 */
	private int notaMedia = 0;
	/**
	 * Constructor con par�metros
	 * @param nombre Nombre del nuevo objeto alumno
	 * @param notaMedia Nota del nuevo objeto alumno
	 */
	public Alumno(String nombre, int notaMedia) {
		super();
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		if (notaMedia >= 0 && notaMedia <= 10) {
			this.notaMedia = notaMedia;
		}
	}
	/**
	 * Constuctor sin par�metros
	 */
	public Alumno() {
		
	}
	/**
	 * Funci�n para obtener la nota media del alumno
	 * @return Devuelve el atributo notaMedia
	 */
	public int getNotaMedia() {
		return notaMedia;
	}
	/**
	 * Modifico la nota media del alumno
	 * @param notaMedia Nota con la que actualizar la nota media
	 */
	public void setNotaMedia(int notaMedia) {
		this.notaMedia = notaMedia;
	}
	/**
	 * Funci�n para obtener el nombre del alumno
	 * @return Devuelve el atributo nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Funci�n para mostrar la informaci�n de la clase
	 */
	@Override
	public String toString() {
		String cadena = "";
		cadena += "-----------------------------------------------------";
		cadena += "Nombre del Alumno: " + this.nombre + "\n";
		cadena += "Nota media del Alumno: " + this.notaMedia + "\n";
		cadena += "-----------------------------------------------------";
		return cadena;
	}
	
	
	
}
