package com.example.ws.demo;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="serviceHeaders")
public class ServiceHeaders {
	
    @XmlElement(required = true)
    protected String authentication;
    
    @XmlElement(required = true)
    protected String userId;
    
    @XmlElement(required = true)
    protected String userName;
    
    @XmlElement(required = true)
    protected String clientId;
    
    @XmlElement(required = true)
    protected String systemId;

	public String getAuthentication() {
		return authentication;
	}

	public void setAuthentication(String authentication) {
		this.authentication = authentication;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getSystemId() {
		return systemId;
	}

	public void setSystemId(String systemId) {
		this.systemId = systemId;
	}

	@Override
	public String toString() {
		return "ServiceHeaders [authentication=" + authentication + ", userId=" + userId + ", userName=" + userName
				+ ", clientId=" + clientId + ", systemId=" + systemId + "]";
	}
    
    
}
