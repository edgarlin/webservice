
package hello;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import hello.wsdl.GetCountryRequest;
import hello.wsdl.GetCountryResponse;

public class CountryClient extends WebServiceGatewaySupport {

	public GetCountryResponse getCountry(String ticker) {

		GetCountryRequest request = new GetCountryRequest();
		request.setName("Spain");
		
		GetCountryResponse response = (GetCountryResponse) this.getWebServiceTemplate()
				.marshalSendAndReceive("http://localhost:8080/ws",
						request,
						new SoapActionCallback("http://localhost:8080/ws"));
		return response;
	}

}
