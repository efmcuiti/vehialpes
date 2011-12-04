/**
 * Util.java
 * This project was made for a mere educational purpose
 * of understading <strong>REST</strong>, Copyright 2011
 * all rights reserved to <strong>Thanatos</strong>.
 */
package org.tha.rest.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import sun.misc.BASE64Encoder;

/**
 * Groups constants and operation for common development.
 * @author Edison Mendez [efmcuiti]
 * @version 1.0
 * @since 1.6
 */
public class Util {
	/** Main end point.*/
	public static final String BASE_URL="http://vehialpes.lubrigras.net/api/v1/";
	/** For the use on REST invocations.*/
	public static final String USERNAME = "daniel";
	/** For the use on REST invocations.*/
	public static final String PASSWORD = "ejes";

	/**
	 * Performs a get operation of a REST service using JSON and GET.
	 * @param _url Where to connect to.
	 * @return Answer.
	 */
	public static String performJSONGETCall(String _url) {
		try {
			// Encoding the login data.
			BASE64Encoder encoder =  new BASE64Encoder();
			String authData = "daniel:ejes";
			String encoded =  encoder.encode(authData.getBytes());
			URL url = new URL(_url);
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
					return raw;
		} catch (MalformedURLException e) {
			throw new RuntimeException("Bad response", e);
		} catch (ProtocolException e) {
			throw new RuntimeException("Bad response", e);
		} catch (IOException e) {
			throw new RuntimeException("Bad response", e);
		}
	}
}
