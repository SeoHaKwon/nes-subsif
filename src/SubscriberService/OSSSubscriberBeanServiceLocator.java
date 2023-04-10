/**
 * OSSSubscriberBeanServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package SubscriberService;

public class OSSSubscriberBeanServiceLocator extends org.apache.axis.client.Service implements SubscriberService.OSSSubscriberBeanService {

    public OSSSubscriberBeanServiceLocator() {
    }


    public OSSSubscriberBeanServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public OSSSubscriberBeanServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SubscriberService
    private java.lang.String SubscriberService_address = "http://localhost:8080/soap2/services/SubscriberService";

    public java.lang.String getSubscriberServiceAddress() {
        return SubscriberService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SubscriberServiceWSDDServiceName = "SubscriberService";

    public java.lang.String getSubscriberServiceWSDDServiceName() {
        return SubscriberServiceWSDDServiceName;
    }

    public void setSubscriberServiceWSDDServiceName(java.lang.String name) {
        SubscriberServiceWSDDServiceName = name;
    }

    public SubscriberService.OSSSubscriberBean getSubscriberService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SubscriberService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSubscriberService(endpoint);
    }

    public SubscriberService.OSSSubscriberBean getSubscriberService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            SubscriberService.SubscriberServiceSoapBindingStub _stub = new SubscriberService.SubscriberServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getSubscriberServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSubscriberServiceEndpointAddress(java.lang.String address) {
        SubscriberService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (SubscriberService.OSSSubscriberBean.class.isAssignableFrom(serviceEndpointInterface)) {
                SubscriberService.SubscriberServiceSoapBindingStub _stub = new SubscriberService.SubscriberServiceSoapBindingStub(new java.net.URL(SubscriberService_address), this);
                _stub.setPortName(getSubscriberServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("SubscriberService".equals(inputPortName)) {
            return getSubscriberService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("SubscriberService", "OSSSubscriberBeanService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("SubscriberService", "SubscriberService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SubscriberService".equals(portName)) {
            setSubscriberServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
