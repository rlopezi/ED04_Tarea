/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cuentas;

/**
 * Clase para crear un cuenta con un nombre de titular, número de cuenta, saldo
 * y tipo de interés
 * 
 * @author Roberto López Ibáñez
 * @version 1.0
 * @since 1.0
 */
public class CCuenta {

	private String nombre;
	private String cuenta;
	private double saldo;
	private double tipoInterés;

	/**
	 * Constructor vacío que crea un objeto CCuenta sin definir atributos
	 */
	public CCuenta() {
	}

	/**
	 * Constructor que crea un objeto CCuenta con los atributos pasados como
	 * parámetro
	 * 
	 * @param nom  nombre del titular
	 * @param cue  número de cuenta
	 * @param sal  saldo de la cuenta
	 * @param tipo tipo de interés de la cuenta
	 */
	public CCuenta(String nom, String cue, double sal, double tipo) {
		nombre = nom;
		setCuenta(cue);
		setSaldo(sal);
	}

	/**
	 * Establece el nombre del titular
	 * 
	 * @param nom nombre del titular
	 */
	public void asignarNombre(String nom) {
		setNombre(nom);
	}

	/**
	 * Devuelve el nombre del titular
	 * 
	 * @return nombre del titular
	 */
	public String obtenerNombre() {
		return getNombre();
	}

	/**
	 * Devuelve el saldo de la cuenta
	 * 
	 * @return saldo de la cuenta
	 */
	public double estado() {
		return getSaldo();
	}

	/**
	 * Ingresa una cantidad en el saldo de la cuenta
	 * 
	 * @param cantidad dinero a ingresar
	 * @throws Exception mensaje de texto si la cantidad es negativa
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		setSaldo(getSaldo() + cantidad);
	}

	/**
	 * Retira una cantidad del saldo de la cuenta
	 * 
	 * @param cantidad dinero a retirar
	 * @throws Exception mensaje de texto si la cantidad es negativa o si no hay
	 *                   suficiente saldo
	 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (estado() < cantidad)
			throw new Exception("No se hay suficiente saldo");
		setSaldo(getSaldo() - cantidad);
	}

	/**
	 * Devuelve el número de cuenta
	 * 
	 * @return número de cuenta
	 */
	public String obtenerCuenta() {
		return getCuenta();
	}

	/**
	 * Devuelve el nombre del titular
	 * 
	 * @return nombre del titular
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Devuelve el nombre del titular
	 * 
	 * @param nombre nombre del titular
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve el tipo de interés
	 * 
	 * @return tipo de interés
	 */
	public double getTipoInterés() {
		return tipoInterés;
	}

	/**
	 * Establece el tipo de interés
	 * 
	 * @param tipoInterés tipo de interés
	 */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	/**
	 * Devuelve el número de cuenta
	 * 
	 * @return número de cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * Establece el número de cuenta
	 * 
	 * @param cuenta número de cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Devuelve el saldo de la cuenta
	 * 
	 * @return saldo de la cuenta
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Establece el saldo de la cuenta
	 * 
	 * @param saldo saldo de la cuenta
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
