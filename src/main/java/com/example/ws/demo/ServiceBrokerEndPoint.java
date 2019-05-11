package com.example.ws.demo;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.springframework.ws.soap.SoapHeaderElement;
import org.springframework.ws.soap.server.endpoint.annotation.SoapHeader;

import com.example.ws.jaxb.generated.OutputParamsType;
import com.example.ws.jaxb.generated.ServiceBrokerRequestType;
import com.example.ws.jaxb.generated.ServiceBrokerResponseType;

@Endpoint
public class ServiceBrokerEndPoint {
    private static final String NAMESPACE_URI = "http://example.com/ws/jaxb/generated";

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "serviceBrokerRequest")
    @ResponsePayload
    public ServiceBrokerResponseType getEmployee(@RequestPayload ServiceBrokerRequestType request,@SoapHeader("serviceHeaders") SoapHeaderElement headerElements) {
		ServiceBrokerResponseType sr = new ServiceBrokerResponseType();
		
		getServiceHeaders(headerElements);
		
		sr.setServiceId("100");
		OutputParamsType val = new OutputParamsType();
		val.getItem().addAll(request.getInputParams().getItem());
		sr.setOutputParams(val );
		
        return sr;
}
	
	private ServiceHeaders getServiceHeaders(SoapHeaderElement header) {
		ServiceHeaders headers = null;
		try {

			JAXBContext context = JAXBContext.newInstance(ServiceHeaders.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			headers = (ServiceHeaders) unmarshaller.unmarshal(header.getSource());
			System.out.println(headers);
			
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return headers;
	}

}
