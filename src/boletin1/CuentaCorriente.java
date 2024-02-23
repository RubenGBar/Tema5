package boletin1;

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
	 * Funci�n para sacar dinero
	 * @param saldo Saldo al que sacar el dinero
	 */
	public void sacarDinero(double saldo) {
		if(this.saldo > saldo) {
			
		}
	}
	
}
