package boletin1.ejercicio1;

/**
 * Clase para guardar la informaci�n de una cuenta corriente y sus operaciones b�sicas
 */
public class CuentaCorriente {
	/**
	 * Atributo para guardar el DNI del propietario
	 */
	private String dni = "";
	/**
	 * Atributo para guardar el nombre del propietario
	 */
	private String nombre = "";
	/**
	 * Atributo para guardar el saldo del propietario
	 */
	private double saldo = 0;
	/**
	 * Constructor de la clase objeto para mostrar la informaci�n de la clase con el m�todo
	 * mostrar m�todo
	 * @param dni DNI del propietario
	 * @param nombre Nombre del propietario
	 * @param saldo Saldo del propietario
	 */
	public CuentaCorriente(String dni, String nombre, double saldo) {
		super();
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		this.saldo = saldo;
		if(dni != null && !dni.equals("")) {
			this.dni = dni;
		}
	}
	/**
	 * Constructor para poder realizar las operaciones de la cuenta
	 * @param dni DNI del propietario al que se le va a realizar la operaci�n
	 * @param saldo Saldo en el que realizar las operaciones
	 */
	public CuentaCorriente(String dni, double saldo) {
		super();
		if(dni != null && !dni.equals("")) {
			this.dni = dni;
		}
		this.saldo = saldo;
	}
	
	/**
	 * Funci�n para obtener el atributo nombre de la clase
	 * @return Devuelve el atributo nombre de la clase
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Funci�n que actualiza el atributo nombre
	 * @param nombre Nombre con el que se actuliza el atributo
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Funci�n para obtener el atributo DNI de la clase
	 * @return Devuelve el atributo DNI de la clase
	 */
	public String getDni() {
		return dni;
	}
	/**
	 * Funci�n para obtener el atributo saldo de la clase
	 * @return Devuelve el atributo saldo de la clase
	 */
	public double getSaldo() {
		return saldo;
	}
	/**
	 * Funci�n para sacar dinero
	 * @param saldo Saldo al que sacar el dinero
	 */
	public boolean sacarDinero(double saldo) {
		boolean transaccion = false;
		if(this.saldo > saldo) {
			this.saldo -= saldo;
			transaccion = true;
		}
		return transaccion;
	}
	/**
	 * Funci�n que incremento el saldo de la cuenta
	 * @param saldo Cantidad a aumentar el saldo
	 */
	public void ingresarDinero(double saldo) {
		if(saldo > 0) {
			this.saldo += saldo;
		}
	}
	/**
	 * Funci�n que muestra la informaci�n de la clase
	 */
	public void mostrarInformacion() {
		System.out.println("Cuenta de: " + this.nombre);
		System.out.println("Con DNI: " + this.dni);
		System.out.println("Tu sueldo es: " + this.saldo);
	}
}