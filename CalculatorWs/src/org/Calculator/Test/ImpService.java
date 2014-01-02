package org.Calculator.Test;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(portName="Serviceport", serviceName="ServiceCservice", targetNamespace="http://ws.tuto.org", endpointInterface="org.Calculator.Test.Service")
public class ImpService implements Service {

	@Override
	@WebMethod
	public String returnAnything(String param1) {
		
		return param1;
	}

}
