package boletin1.ejercicio4;
/**
 * Clase que gaurda los atributos y funciones a realizar con un producto
 */
public class Articulo {
	/**
	 * Cosntante para guardar el IVA de los productos
	 */
	public static final int IVA = 21;
	/**
	 * Atributo que guarda el nombre de un producto
	 */
	private String nombre = "";
	/**
	 * Atributoq ue guarda el precio sin IVA de un producto
	 */
	private int precio = 0;
	/**
	 * Atributo que guarda la cantida de articulos restantes en el almacen
	 */
	private int almacen = 0;
	/**
	 * Constructro que le da valores a los atributos nombre, precio y cuantosQuedan con los 
	 * parámetros de entrada
	 * @param nombre Nombre del artículo
	 * @param precio Precio del artículo
	 * @param almacen Cantidad de artículos en el almacen
	 */
	public Articulo(String nombre, int precio, int almacen) {
		super();
		if(nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		if(precio > 0) {
			this.precio = precio;
		}
		if(almacen > 0) {
			this.almacen = almacen;
		}
	}
	/**
	 * Función para obtener el atributo nombre
	 * @return Devuelve el atributo nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Función que actualiza el atributo nombre
	 * @param nombre Cadena con la que actualizar el atributo nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Función para obtener el atributo precio
	 * @return Devuelve el atributo precio
	 */
	public int getPrecio() {
		return precio;
	}
	/**
	 * Función que actualiza el atributo precio
	 * @param precio Número con el que actualizar el atributo precio
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	/**
	 * Función para obtener el atributo cuantosQuedan
	 * @return Devuelve el atributo ncuantosQuedanombre
	 */
	public int getCuantosQuedan() {
		return almacen;
	}
	/**
	 * Función que actualiza el atributo cuantosQuedan
	 * @param almacen Número con el que actualizar el atributo cuantosQuedan
	 */
	public void setCuantosQuedan(int almacen) {
		this.almacen = almacen;
	}
	/**
	 * Función que calcula el PVP, es decir el precio con IVA incluido
	 * @return Devuelve el precio con el IVA incluido
	 */
	public double getPVP() {
		return this.precio + ((this.precio * IVA) / 100);
	}
	/**
	 * Función que calcula el precio con un descuento 
	 * @param descuento Descuento a aplicar
	 * @return Devuelve el precio con el descuento incluido
	 */
	public double getPVPDescuento(int descuento) {
		return getPVP() - ((getPVP() * descuento) / 100);
	}
	/**
	 * Función que calcula los artículos restantes tras una venta
	 * @param vendidos Cantidad de productos vendidos
	 * @return Devuelve true si ha sido posible realizar la operación, false en caso contrario
	 */
	public boolean vender(int vendidos) {
		boolean posible = false;
		
		if(vendidos < this.almacen) {
			this.almacen -= vendidos;
			posible = true;
		}
		
		return posible;
	}
	/**
	 * Función que añade los nuevos productos al almacen
	 * @param nuevosProductos Nuevos productos a añadir al almacen
	 */
	public void almacenar(int nuevosProductos) {
		this.almacen += nuevosProductos;
	}
	
	/**
	 * Función para imprimir la información de cada producto
	 */
	public String toString() {
		String cadena = "";
		
		System.out.println(" -----Información del producto-----  ");
		System.out.println("                                     ");
		System.out.println("  Nombre: " + this.nombre + "        ");
		System.out.println("  Precio: " + this.precio + "        ");
		System.out.println("  Quedan: " + this.almacen + "       ");
		System.out.println("                                     ");
		System.out.println(" ----------------------------------- ");
		
		return cadena;
	}
	
}
