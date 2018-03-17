package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import xsd.tns.soapserver.OperationRequest;
import xsd.tns.soapserver.OperationResponse;

@Endpoint
public class Endpoint1 {
	private static final String NAMESPACE_URI = "http://tns.xsd/soapserver"; // same as xsd tns

	@Autowired
	private Repository1 repo;

//	@Autowired	//constructor
//	public Endpoint1(Repository1 repo) {
//		System.out.println("Endpoint1.Endpoint1");
//		this.repo = repo;
//	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "operationRequest") // same as xsd request name
	@ResponsePayload
	public OperationResponse unknown(@RequestPayload OperationRequest req) {
		System.out.println("Endpoint1.unknown");
		OperationResponse res = new OperationResponse();
		res.setCountry(repo.findCountry(req.getName()));
		return res;
	}
}
