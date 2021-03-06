/**
 * 
 */
package com.krishna.rest.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.krishna.rest.model.Track;
/**
 * @author arunangsu.sahu
 *
 */
@Path("/json/metallica")
public class JsonService {

	/**
	 * 
	 */
	public JsonService() {
		// No Argument Constructor
	}
	
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Track getTrackInJSON() {

		Track track = new Track();
		track.setTitle("Enter Sandman");
		track.setSinger("Metallica");
		//String output = "Hello, " + msg + "!";
		//String output = "Krishna!";
        //return Response.status(200).entity(output).build();
		return track;

	}

	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTrackInJSON(Track track) {

		String result = "Track saved : " + track;
		return Response.status(201).entity(result).build();
		
	}

}
