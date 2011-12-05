/**
 * Vehiculo.java
 * This project was made for a mere educational purpose
 * of understading <strong>REST</strong>, Copyright 2011
 * all rights reserved to <strong>Thanatos</strong>.
 */
package org.vehialpes.model;

/**
 * How's a vehicle represented on the application.
 * @author Edison Mendez [efmcuiti]
 * @version 1.0
 * @since 1.6
 */
public class Vehiculo {

	/** Who's the owner of this vehicle.*/
	private Cliente cliente;
	/** Vehicle's painted color.*/
	private String color;
	/** URL where to find the Vehicle's appearance.*/
	private String foto;
	/** Vehicle's unique identifier.*/
	private int id;
	/** What kind of vehicle is this.*/
	private String linea;
	/** Who constructed this vehicle.*/
	private String marca;
	/** On what year was constructed this vehicle.*/
	private int modelo;
	/** How powerful is the machine behind.*/
	private String motor;
	/** Goverment's official identification.*/
	private String placa;
	/** REST service access for this vehicle.*/
	private String resource_uri;
	/** Manual, automatic, etc.*/
	private String tipo_caja;
	/** How much has been used this car.*/
	private int kilometraje;
	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}
	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the foto
	 */
	public String getFoto() {
		return foto;
	}
	/**
	 * @param foto the foto to set
	 */
	public void setFoto(String foto) {
		this.foto = foto;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the linea
	 */
	public String getLinea() {
		return linea;
	}
	/**
	 * @param linea the linea to set
	 */
	public void setLinea(String linea) {
		this.linea = linea;
	}
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @return the modelo
	 */
	public int getModelo() {
		return modelo;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	/**
	 * @return the motor
	 */
	public String getMotor() {
		return motor;
	}
	/**
	 * @param motor the motor to set
	 */
	public void setMotor(String motor) {
		this.motor = motor;
	}
	/**
	 * @return the placa
	 */
	public String getPlaca() {
		return placa;
	}
	/**
	 * @param placa the placa to set
	 */
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	/**
	 * @return the resource_uri
	 */
	public String getResource_uri() {
		return resource_uri;
	}
	/**
	 * @param resource_uri the resource_uri to set
	 */
	public void setResource_uri(String resource_uri) {
		this.resource_uri = resource_uri;
	}
	/**
	 * @return the tipo_caja
	 */
	public String getTipo_caja() {
		return tipo_caja;
	}
	/**
	 * @param tipo_caja the tipo_caja to set
	 */
	public void setTipo_caja(String tipo_caja) {
		this.tipo_caja = tipo_caja;
	}
	/**
	 * @return the kilometraje
	 */
	public int getKilometraje() {
		return kilometraje;
	}
	/**
	 * @param kilometraje the kilometraje to set
	 */
	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}
}
