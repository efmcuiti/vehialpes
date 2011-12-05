/**
 * AllObjectsEntity.java
 * This project was made for a mere educational purpose
 * of understading <strong>REST</strong>, Copyright 2011
 * all rights reserved to <strong>Thanatos</strong>.
 */
package org.vehialpes.model;

import java.util.List;

/**
 * Represents a large set of a given entity.
 * @author Edison Mendez [efmcuiti]
 * @version 1.0
 * @since 1.6
 */
public class AllObjectsEntity<T> {
	/** Meta-data of the set of resources.*/
	private Meta meta;
	/** Set of resultant answer.*/
	private List<T> objects;
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
	public List<T> getObjects() {
		return objects;
	}
	/**
	 * @param objects the objects to set
	 */
	public void setObjects(List<T> objects) {
		this.objects = objects;
	}
}
