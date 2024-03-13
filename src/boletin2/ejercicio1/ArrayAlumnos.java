package boletin2.ejercicio1;

/**
 * Clase para realizar las gestiones necesarias con los alumnos
 * para ello cuenta con un array de alumnos
 */
public class ArrayAlumnos {
	
	/**
	 * Array en el que guardo todos los alumnos de un aula
	 */
	public static Alumno[] arrayAlumnos = new Alumno[30];
	
	/**
	 * Función que imprime la información de los alumnos no nulos
	 */
	public static void listado() {
		for(Alumno alumn : arrayAlumnos) {
			
			if (alumn != null) {
				System.out.println(alumn);
			}
			
		}
		
	}
	
	/**
	 * Función que se encarga de añadir un nuevo alumno
	 * @param nombre Nombre del alumno a añadir
	 * @param notaMedia Nota media del alumno
	 * @return Devuelve true si se ha podido añadir el alumno y false en caso contrario
	 */
	public static boolean nuevoAlumno(String nombre, double notaMedia) {
		Alumno alumn = new Alumno(nombre, notaMedia);
		boolean anadido = false;
		int i = 0;
		
		while (arrayAlumnos.length < i && arrayAlumnos[i] != null) {
			i++;
		}
		
		if(i < arrayAlumnos.length) {
			arrayAlumnos[i] = alumn;
			anadido = true;
		}
		
		return anadido;
	}
	
	/**
	 * Función para modificar la nota de un alumno según el nombre recibido
	 * @param nombre Nombre con el que buscar el alumno a modificar
	 * @param notaMedia Nueva nota con la que modificar la antigua
	 * @return Devuelve true si se ha podido añadir el alumno y false en caso contrario
	 */
	public static boolean modificaAlumno(String nombre, double notaMedia) {
		boolean modificado = false;
		int i = buscaAlumno(nombre);
		
		if (i < arrayAlumnos.length) {
			arrayAlumnos[i].setNotaMedia(notaMedia);
			modificado = true;
		}
		
		return modificado;
	}
	
	/**
	 * Función encargada de eliminar a un alumno 
	 * @param nombre Nombre para saber que alumno eliminar
	 * @return Devuelve true si se ha podido añadir el alumno y false en caso contrario
	 */
	public static boolean eliminaAlumno(String nombre) {
		boolean modificado = false;
		int i = buscaAlumno(nombre);
		
		if (i < arrayAlumnos.length) {
			arrayAlumnos[i] = (null);
			modificado = true;
		}
		
		return modificado;
	}
	
	/**
	 * Función usada para buscar el alumno a eliminar o modificar
	 * @param alumno Nombre del alumno a buscar
	 * @return Devuelve la posición en la que se encuentra ese alumno
	 */
	private static int buscaAlumno(String alumno) {
		int i = 0;
		
		while(i<arrayAlumnos.length && (arrayAlumnos[i]==null || !arrayAlumnos[i].getNombre().equals(alumno))) {
			i++;
		}
		return i;
	}
}
