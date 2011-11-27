/**
 * Workshop.java
 * This project was made for a mere educational purpose
 * of understading <strong>REST</strong>, Copyright 2011
 * all rights reserved to <strong>Thanatos</strong>.
 */
package org.vehialpes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Defines the workshop entity needed at data level.
 * @author Edison Mendez [efmcuiti]
 * @version 1.0
 * @since 1.6
 */
@Entity
@Table(name="TALLER")
public class Workshop {
	
	/** Unique identifier for the current workshop.*/
	private Integer id;
	
	/** User friendly workshop identifier.*/
	private String name;
	
	/** Physical location of the workshop.*/
	private String address;
	
	/** Fixed dialing communication number.*/
	private String phone;
	
	/** In what city is this workshop located.*/
	private City city;

	/**
	 * @return the id
	 */
	@Id
	@Column(name="ID_TALLER")
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	@Column(name="NOMBRE_TALLER", nullable=false)
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the address
	 */
	@Column(name="DIRECCION", nullable=false)
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the phone
	 */
	@Column(name="TELEFONO", nullable=true)
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the city
	 */
	@ManyToOne
	@JoinColumn(name="ID_CIUDAD")
	public City getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(City city) {
		this.city = city;
	}
}
