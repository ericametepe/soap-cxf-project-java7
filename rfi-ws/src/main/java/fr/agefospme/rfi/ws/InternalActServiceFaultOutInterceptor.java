package fr.agefospme.rfi.ws;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.interceptor.Fault;

public class InternalActServiceFaultOutInterceptor extends AbstractSoapInterceptor  {

	public InternalActServiceFaultOutInterceptor(String p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handleMessage(SoapMessage message) throws Fault {
		// TODO Auto-generated method stub
		
	}



}
