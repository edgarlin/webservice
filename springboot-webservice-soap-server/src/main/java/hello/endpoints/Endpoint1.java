package hello.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import hello.repositories.Repository1;
import ns.schema.MessageRequest;
import ns.schema.MessageResponse;

@Endpoint
public class Endpoint1 {
	private static final String NAMESPACE_URI = "http://schema.ns";
	
	@Autowired
	private Repository1 repo1;

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "messageRequest")
	@ResponsePayload
	public MessageResponse func(@RequestPayload MessageRequest request) {
		MessageResponse response = new MessageResponse();
		response.setOutputString(repo1.getValue(request.getInputString()));
		return response;
	}
}
