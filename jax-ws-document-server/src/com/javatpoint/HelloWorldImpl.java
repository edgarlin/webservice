package com.javatpoint;

import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "com.javatpoint.HelloWorldInterface")
public class HelloWorldImpl implements HelloWorldInterface{

	@Override
	public String getHelloWorldAsString(String name) {
		return "Hello World JAX-WS " + name;
	}

}