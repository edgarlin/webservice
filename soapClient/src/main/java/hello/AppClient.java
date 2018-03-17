
package hello;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.generated.pkgname.*;

public class AppClient extends WebServiceGatewaySupport {

	public OperationResponse doSomething(String str) {
		OperationRequest req = new OperationRequest();
		req.setName(str);
		OperationResponse res = (OperationResponse) this.getWebServiceTemplate().marshalSendAndReceive(req);
		return res;
	}
}
