package com.javatpoint;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

//Service Endpoint Interface
@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface HelloWorldInterface {
	@WebMethod
	String getHelloWorldAsString(String name);

	@WebMethod
	int getInt(int i);

}