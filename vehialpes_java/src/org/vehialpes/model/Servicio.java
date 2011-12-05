/**
 * Servicio.java
 * This project was made for a mere educational purpose
 * of understading <strong>REST</strong>, Copyright 2011
 * all rights reserved to <strong>Thanatos</strong>.
 */
package org.vehialpes.model;

/**
 * How a service looks like in the application.
 * @author Edison Mendez [efmcuiti]
 * @version 1.0
 * @since 1.6
 */
public class Servicio {

	/** What's the objective of the service.*/
	private String descripcion;
	/** Unique identifier.*/
	private int id;
	/** Common alias.*/
	private String nombre;
	/** REST location for access to this evidence.*/
	private String resource_uri;
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
}
