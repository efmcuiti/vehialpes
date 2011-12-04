/**
 * WrapperResource.java
 * This project was made for a mere educational purpose
 * of understading <strong>REST</strong>, Copyright 2011
 * all rights reserved to <strong>Thanatos</strong>.
 */
package org.tha.rest.resource;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.tha.rest.util.Util;
import org.vehialpes.model.Cita;
import org.vehialpes.model.MainAppointmentObject;

import com.google.gson.Gson;

/**
 * Provides operations to re-direct the REST requests.
 * @author Edison Mendez [efmcuiti]
 * @version 1.0
 * @since 1.6
 */
@Path("/vehialpes")
public class WrapperResource {
	
	/**
	 * Requests an external REST service for appointments.
	 * @return JSON Representation of the Appointments.
	 */
	@GET
	@Path("/appointments/{idWorkshop}")
	@Produces("application/json")
	public List<Cita> getAppointmentsByWorkshop(@PathParam("idWorkshop") int idWorkshop) {
		List<Cita> answer = new ArrayList<Cita>();

		String url = Util.BASE_URL + "cita/?taller=" + idWorkshop;
		String raw = Util.performJSONGETCall(url);

		Gson gSon = new Gson();
		MainAppointmentObject parsed = gSon.fromJson(raw, MainAppointmentObject.class);
		answer = parsed.getObjects();

		return answer;
	}
}
