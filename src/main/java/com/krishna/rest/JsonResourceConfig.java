/**
 * 
 */
package com.krishna.rest;

import java.util.Set;

import org.glassfish.jersey.server.ResourceConfig;

/**
 * @author arunangsu.sahu
 *
 */
public class JsonResourceConfig extends ResourceConfig {

	/**
	 * 
	 */
	public JsonResourceConfig() {
		// Define the package of the service class location
		packages("com.krishna.rest.service");
	}

	/**
	 * @param classes
	 */
	public JsonResourceConfig(Set<Class<?>> classes) {
		super(classes);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param classes
	 */
	public JsonResourceConfig(Class<?>... classes) {
		super(classes);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param original
	 */
	public JsonResourceConfig(ResourceConfig original) {
		super(original);
		// TODO Auto-generated constructor stub
	}

}
