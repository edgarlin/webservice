package com.javatpoint;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class HelloWorldClient {
	public static void main(String[] args) throws Exception {

		HelloWorld hello = Service.create(new URL("http://localhost:7779/ws/hello?wsdl"),
				new QName("http://javatpoint.com/", "HelloWorldImplService")).getPort(HelloWorld.class);
		System.out.println(hello.getHelloWorldAsString("javatpoint rpc"));
	}
}