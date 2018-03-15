package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import sample.com.soapserver.OperationRequest;
import sample.com.soapserver.OperationResponse;

@Endpoint
public class Endpoint1 {
	private static final String NAMESPACE_URI = "http://com.sample/soapserver"; // same as xsd tns

	private Repository1 countryRepository;

	@Autowired
	public Endpoint1(Repository1 xxx) {
		this.countryRepository = xxx;
		System.out.println("Endpoint1.Endpoint1");

	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "operationRequest") // same as xsd request name
	@ResponsePayload
	public OperationResponse yyy(@RequestPayload OperationRequest request) {
		System.out.println("Endpoint1.yyy");
		OperationResponse response = new OperationResponse();
		response.setCountry(countryRepository.findCountry(request.getName()));
		return response;
	}
}
