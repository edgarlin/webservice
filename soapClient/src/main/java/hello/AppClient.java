
package hello;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.generated.pkgname.*;

public class AppClient extends WebServiceGatewaySupport {

	public OperationResponse doSomething(String str) {
		OperationRequest request = new OperationRequest();
		request.setName(str);
		OperationResponse response = (OperationResponse) this.getWebServiceTemplate().marshalSendAndReceive(request);
		return response;
	}
}
