package com.example.ws.demo;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.example.ws.jaxb.generated.OutputParamsType;
import com.example.ws.jaxb.generated.ServiceBrokerRequestType;
import com.example.ws.jaxb.generated.ServiceBrokerResponseType;

@Endpoint
public class ServiceBrokerEndPoint {
    private static final String NAMESPACE_URI = "http://example.com/ws/jaxb/generated";

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getData")
    @ResponsePayload
    public ServiceBrokerResponseType getEmployee(@RequestPayload ServiceBrokerRequestType request) {
		ServiceBrokerResponseType sr = new ServiceBrokerResponseType();
		sr.setServiceId("100");
		OutputParamsType val = new OutputParamsType();
		val.getItem().addAll(request.getInputParams().getItem());
		sr.setOutputParams(val );
		
        return sr;
}

}
