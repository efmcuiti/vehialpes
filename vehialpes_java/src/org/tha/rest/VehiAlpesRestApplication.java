/**
 * RestBasixApplication.java
 * This project was made for a mere educational purpose
 * of understading <strong>REST</strong>, Copyright 2011
 * all rights reserved to <strong>Thanatos</strong>.
 */
package org.tha.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import org.tha.rest.resource.WrapperResource;

/**
 * Provides a singleton instance for the resources used in a REST based
 * application.
 * 
 * @author Edison Mendez [efmcuiti]
 * @version 1.0
 * @since 1.6
 */
public class VehiAlpesRestApplication extends Application {
	/** Stores the singleton instances for the resources.*/
	private Set<Object> singletons = new HashSet<Object>();
	/** If the singleton's empty.*/
	private Set<Class<?>> empty = new HashSet<Class<?>>();

	/**
	 * Basic constructor.
	 */
	public VehiAlpesRestApplication() {
		// ADD YOUR RESTFUL RESOURCES HERE
		this.singletons.add(new WrapperResource());
	}

	/* (non-Javadoc)
	 * @see javax.ws.rs.core.Application#getClasses()
	 */
	@Override
	public Set<Class<?>> getClasses() {
		return this.empty;
	}

	/* (non-Javadoc)
	 * @see javax.ws.rs.core.Application#getSingletons()
	 */
	@Override
	public Set<Object> getSingletons() {
		return this.singletons;
	}
}
