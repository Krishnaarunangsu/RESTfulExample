/**
 * 
 */
package com.krishna.rest.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.krishna.rest.model.Track;

/**
 * @author arunangsu.sahu
 *
 */
public class NetClientGet {
	private final static String GET_URL = "http://localhost:8081/RESTfulExample/json/metallica/get";
	private final static String BLANK = "";

	/**
	 * 
	 */
	public NetClientGet() {
		// No Argument Constructor
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		URL url = null;
		try {

			url = new URL(GET_URL);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HttpURLConnection conn = null;
		try {
			conn = (HttpURLConnection) url.openConnection();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			conn.setRequestMethod("GET");
		} catch (ProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		conn.setRequestProperty("Accept", "application/json");

		try {
			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String output;
		StringBuilder trackJson = new StringBuilder();
		System.out.println("Output from Server .... \n");
		try {
			while ((output = br.readLine()) != null) {
				System.out.println(output);
				trackJson.append(output);
			}
			ObjectMapper objectMapper = new ObjectMapper();
			if (BLANK != trackJson.toString()) {
				Track track = objectMapper.readValue(trackJson.toString(), Track.class);
				System.out.println(track);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		conn.disconnect();

	}

}
