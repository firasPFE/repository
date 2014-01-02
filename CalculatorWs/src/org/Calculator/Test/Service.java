package org.Calculator.Test;

import javax.jws.WebMethod;
import javax.jws.WebService;



@WebService(targetNamespace="http//ws.tuto.org", name="serviceCal")
public interface Service {

	@WebMethod
	public String returnAnything(String param1);
}
