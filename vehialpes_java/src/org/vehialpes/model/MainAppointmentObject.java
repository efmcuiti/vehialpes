/**
 * MainAppointmentObject.java
 * This project was made for a mere educational purpose
 * of understading <strong>REST</strong>, Copyright 2011
 * all rights reserved to <strong>Thanatos</strong>.
 */
package org.vehialpes.model;

import java.util.List;

/**
 * Represents an answer of the type of appointments.
 * @author Edison Mendez [efmcuiti]
 * @version 1.0
 * @since 1.6
 */
public class MainAppointmentObject {

	/** Meta-data.*/
	private Meta meta;
	/** Appointments in the answer.*/
	private List<Cita> objects;
	/**
	 * @return the meta
	 */
	public Meta getMeta() {
		return meta;
	}
	/**
	 * @param meta the meta to set
	 */
	public void setMeta(Meta meta) {
		this.meta = meta;
	}
	/**
	 * @return the objects
	 */
	public List<Cita> getObjects() {
		return objects;
	}
	/**
	 * @param objects the objects to set
	 */
	public void setObjects(List<Cita> objects) {
		this.objects = objects;
	}
}
