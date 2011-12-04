/**
 * WrapperResource.java
 * This project was made for a mere educational purpose
 * of understading <strong>REST</strong>, Copyright 2011
 * all rights reserved to <strong>Thanatos</strong>.
 */
package org.tha.rest.resource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.vehialpes.model.Cita;
import org.vehialpes.model.MainAppointmentObject;

import com.google.gson.Gson;

import sun.misc.BASE64Encoder;

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
		
		try {
			// Encoding the login data.
			BASE64Encoder encoder =  new BASE64Encoder();
			String authData = "daniel:ejes";
			String encoded =  encoder.encode(authData.getBytes());
			URL url = new URL("http://vehialpes.lubrigras.net/api/v1/cita/?taller=" + idWorkshop);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Accept", "application/json");
			connection.setRequestProperty("Authorization", "Basic " + encoded);
			
			// If the connection failed.
			if (connection.getResponseCode() != 200){
				throw new RuntimeException("Bad response:> " + connection.getResponseCode());
			}
			
			String raw = "";
			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			
			String line = reader.readLine();
			while(line != null) {
				raw += line;
				line = reader.readLine();
			}
			connection.disconnect();
			
			Gson gSon = new Gson();
			MainAppointmentObject parsed = gSon.fromJson(raw, MainAppointmentObject.class);
			answer = parsed.getObjects();
			return answer;
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (ProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return answer;
	}
}
