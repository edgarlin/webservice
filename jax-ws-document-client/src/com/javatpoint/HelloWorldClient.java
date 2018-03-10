package com.javatpoint;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class HelloWorldClient {
	public static void main(String[] args) throws Exception {
		HelloWorldInterface hello = Service
				.create(new URL("http://localhost:7777/ws/hello?wsdl"),
						new QName("http://javatpoint.com/", "HelloWorldImplService"))
				.getPort(HelloWorldInterface.class);

		System.out.println(hello.getHelloWorldAsString("from client"));
		System.out.println(hello.getInt(3));

	}

}