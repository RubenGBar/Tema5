package boletin1;

/**
 * Clase para guardar la información de una cuenta corriente y sus operaciones básicas
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
	 * Constructor de la clase objeto para mostrar la información de la clase con el método
	 * mostrar método
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
	 * @param dni DNI del propietario al que se le va a realizar la operación
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
	 * Función para sacar dinero
	 * @param saldo Saldo al que sacar el dinero
	 */
	public void sacarDinero(double saldo) {
		if(this.saldo > saldo) {
			
		}
	}
	
}
