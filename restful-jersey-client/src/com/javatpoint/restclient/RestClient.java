package com.javatpoint.restclient;

import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;

public class RestClient {
	public static void main(String[] args) {
		Client client = ClientBuilder.newClient(new ClientConfig());
		WebTarget target = client.target(getBaseURI());

		System.out.println(target.path("rest").path("hello").request().accept(MediaType.TEXT_PLAIN).get(String.class));
		System.out.println(target.path("rest").path("hello").request().accept(MediaType.TEXT_XML).get(String.class));
		System.out.println(target.path("rest").path("hello").request().accept(MediaType.TEXT_HTML).get(String.class));
	}

	private static URI getBaseURI() {
		return UriBuilder.fromUri("http://localhost:8080/restful-jersey-server").build();
	}
}