/**
 * City.java
 * This project was made for a mere educational purpose
 * of understading <strong>REST</strong>, Copyright 2011
 * all rights reserved to <strong>Thanatos</strong>.
 */
package org.vehialpes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Defines what a city is and how to be represented in data level.
 * @author Edison Mendez [efmcuiti]
 * @version 1.0
 * @since 1.6
 */
@Entity
@Table(name="CIUDAD")
public class City {

	/** Unique identifier for the current city.*/
	private Integer idCity;
	
	/** User friendly identifier.*/
	private String city;

	/**
	 * @return the idCity
	 */
	@Id
	@Column(name="ID_CIUDAD", nullable=false)
	public Integer getIdCity() {
		return idCity;
	}

	/**
	 * @param idCity the idCity to set
	 */
	public void setIdCity(Integer idCity) {
		this.idCity = idCity;
	}

	/**
	 * @return the city
	 */
	@Column(name="CIUDAD", nullable=false)
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
}
