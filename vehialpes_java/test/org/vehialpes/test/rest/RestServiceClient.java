/**
 * RestServiceClient.java
 * This project was made for a mere educational purpose
 * of understading <strong>REST</strong>, Copyright 2011
 * all rights reserved to <strong>Thanatos</strong>.
 */
package org.vehialpes.test.rest;

import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Test;

/**
 * TODO: What's this class for.
 * @author Edison Mendez [efmcuiti]
 * @version 1.0
 * @since 1.6
 */
public class RestServiceClient {

	/**
	 * Test a generic connection to a python generated rest service.
	 * @throws IOException If couldn't read or write things.
	 */
	@Test
	public void test() throws IOException {
		URL url = new URL("http://vehialpes.lubrigras.net/api/v1/taller/?format=json");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.setRequestProperty("Accept", "application/json");
		
		// If the connection failed.
		if (connection.getResponseCode() != 200){
			throw new RuntimeException("Bad response:> " + connection.getResponseCode());
		}
		System.out.println("Response data-type:> " + connection.getContentType());
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		
		String line = reader.readLine();
		while(line != null) {
			System.out.println(line);
			line = reader.readLine();
		}
		connection.disconnect();
		assertTrue(true);
	}

}
