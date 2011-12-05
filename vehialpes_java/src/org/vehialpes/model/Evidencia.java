/**
 * Evidencia.java
 * This project was made for a mere educational purpose
 * of understading <strong>REST</strong>, Copyright 2011
 * all rights reserved to <strong>Thanatos</strong>.
 */
package org.vehialpes.model;

/**
 * How an evidence looks like in the application.
 * @author Edison Mendez [efmcuiti]
 * @version 1.0
 * @since 1.6
 */
public class Evidencia {

	/** Evidence's unique identifier.*/
	private int id;
	/** Mainly the picture of the part.*/
	private String media;
	/** What has the technician to say about the evidence.*/
	private String observaciones;
	/** REST location for access to this evidence.*/
	private String resource_uri;
	/** Distinctive name.*/
	private String titulo;
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
	 * @return the media
	 */
	public String getMedia() {
		return media;
	}
	/**
	 * @param media the media to set
	 */
	public void setMedia(String media) {
		this.media = media;
	}
	/**
	 * @return the observaciones
	 */
	public String getObservaciones() {
		return observaciones;
	}
	/**
	 * @param observaciones the observaciones to set
	 */
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
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
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
}
