/**
 * OSSSubscriberBeanService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package SubscriberService;

public interface OSSSubscriberBeanService extends javax.xml.rpc.Service {
    public java.lang.String getSubscriberServiceAddress();

    public SubscriberService.OSSSubscriberBean getSubscriberService() throws javax.xml.rpc.ServiceException;

    public SubscriberService.OSSSubscriberBean getSubscriberService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
