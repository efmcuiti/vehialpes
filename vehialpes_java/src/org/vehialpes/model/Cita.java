/**
 * Cita.java
 * This project was made for a mere educational purpose
 * of understading <strong>REST</strong>, Copyright 2011
 * all rights reserved to <strong>Thanatos</strong>.
 */
package org.vehialpes.model;

/**
 * TODO: How's an appointment looks like in the application.
 * @author Edison Mendez [efmcuiti]
 * @version 1.0
 * @since 1.6
 */
public class Cita {
	
	/** When must be performed the reparation of a car.*/
	private String fecha;
	/** Appointment's unique identifier.*/
	private int id;
	/** REST service access for this appointment.*/
	private String resource_uri;
	/** In which workshop shall be performed the reparation of a car.*/
	private Taller taller;
	/** How must be delivered the repaired car to a customer.*/
	private TipoTransporte tipo_transporte_entrega;
	/** How a car had arrived to the workshop in order to be fixed.*/
	private TipoTransporte tipo_transporte_recibo;
	/** To what vehicle shall be executed the appointment.*/
	private Vehiculo vehiculo;
	/**
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}
	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
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
	 * @return the taller
	 */
	public Taller getTaller() {
		return taller;
	}
	/**
	 * @param taller the taller to set
	 */
	public void setTaller(Taller taller) {
		this.taller = taller;
	}
	/**
	 * @return the tipo_transporte_entrega
	 */
	public TipoTransporte getTipo_transporte_entrega() {
		return tipo_transporte_entrega;
	}
	/**
	 * @param tipo_transporte_entrega the tipo_transporte_entrega to set
	 */
	public void setTipo_transporte_entrega(TipoTransporte tipo_transporte_entrega) {
		this.tipo_transporte_entrega = tipo_transporte_entrega;
	}
	/**
	 * @return the tipo_transporte_recibo
	 */
	public TipoTransporte getTipo_transporte_recibo() {
		return tipo_transporte_recibo;
	}
	/**
	 * @param tipo_transporte_recibo the tipo_transporte_recibo to set
	 */
	public void setTipo_transporte_recibo(TipoTransporte tipo_transporte_recibo) {
		this.tipo_transporte_recibo = tipo_transporte_recibo;
	}
	/**
	 * @return the vehiculo
	 */
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	/**
	 * @param vehiculo the vehiculo to set
	 */
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
}
