/**
 * ServiceOrder.java
 * This project was made for a mere educational purpose
 * of understading <strong>REST</strong>, Copyright 2011
 * all rights reserved to <strong>Thanatos</strong>.
 */
package org.vehialpes.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * It's the scientific name for maintenance in data level.
 * @author Edison Mendez [efmcuiti]
 * @version 1.0
 * @since 1.6
 */
@Entity
@Table(name="ORDEN_SERVICIO")
public class ServiceOrder {
	
	/** Unique identifier for the current service order.*/
	private Integer idServiceOrder;
	
	/** Government like unique identifier.*/
	private String plate;
}
