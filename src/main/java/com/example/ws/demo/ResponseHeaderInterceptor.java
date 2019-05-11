package com.example.ws.demo;
import javax.xml.namespace.QName;

import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.EndpointInterceptor;
import org.springframework.ws.soap.SoapHeaderElement;
import org.springframework.ws.soap.SoapMessage;
public class ResponseHeaderInterceptor implements EndpointInterceptor  {

	@Override
	public boolean handleRequest(MessageContext messageContext, Object endpoint) throws Exception {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean handleResponse(MessageContext messageContext, Object endpoint) throws Exception {
		// TODO Auto-generated method stub
		SoapMessage message = (SoapMessage) messageContext.getResponse();
		QName name = QName.valueOf("SOAP-ENV");
		
		SoapHeaderElement headerele = message.getSoapHeader().addHeaderElement(name);
		
		return true;
	}

	@Override
	public boolean handleFault(MessageContext messageContext, Object endpoint) throws Exception {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void afterCompletion(MessageContext messageContext, Object endpoint, Exception ex) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
