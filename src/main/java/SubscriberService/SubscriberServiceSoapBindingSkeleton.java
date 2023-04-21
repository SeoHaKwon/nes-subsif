/**
 * SubscriberServiceSoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package SubscriberService;

public class SubscriberServiceSoapBindingSkeleton implements SubscriberService.OSSSubscriberBean, org.apache.axis.wsdl.Skeleton {
    private SubscriberService.OSSSubscriberBean impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sln"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "SlnInfo"), com.samsung.nms.agent.dataType.SlnInfo.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("crteSln", _params, new javax.xml.namespace.QName("", "crteSlnReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "SubsResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("SubscriberService", "crteSln"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("crteSln") == null) {
            _myOperations.put("crteSln", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("crteSln")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cnt"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("dltSln", _params, new javax.xml.namespace.QName("", "dltSlnReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "SubsResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("SubscriberService", "dltSln"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("dltSln") == null) {
            _myOperations.put("dltSln", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("dltSln")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "setSln"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "SetSlnInfo"), com.samsung.nms.agent.dataType.SetSlnInfo.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("setSln", _params, new javax.xml.namespace.QName("", "setSlnReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "SubsResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("SubscriberService", "setSln"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("setSln") == null) {
            _myOperations.put("setSln", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("setSln")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mgId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pln"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "card"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "link"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "lln"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cnt"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getSlnInfo", _params, new javax.xml.namespace.QName("", "getSlnInfoReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "SubsResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("SubscriberService", "getSlnInfo"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getSlnInfo") == null) {
            _myOperations.put("getSlnInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getSlnInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ssvc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "SsvcInfo"), com.samsung.nms.agent.dataType.SsvcInfo.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tdn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "odn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ac"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "time"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tmstmr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "asgId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ddiCnt"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("regSsvc", _params, new javax.xml.namespace.QName("", "regSsvcReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "SubsResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("SubscriberService", "regSsvc"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("regSsvc") == null) {
            _myOperations.put("regSsvc", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("regSsvc")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ssvc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "SsvcInfo"), com.samsung.nms.agent.dataType.SsvcInfo.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ac"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tdn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "time"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("cancSsvc", _params, new javax.xml.namespace.QName("", "cancSsvcReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "SubsResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("SubscriberService", "cancSsvc"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("cancSsvc") == null) {
            _myOperations.put("cancSsvc", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("cancSsvc")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ssvc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "SsvcInfo"), com.samsung.nms.agent.dataType.SsvcInfo.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tmstmr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("actSsvc", _params, new javax.xml.namespace.QName("", "actSsvcReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "SubsResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("SubscriberService", "actSsvc"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("actSsvc") == null) {
            _myOperations.put("actSsvc", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("actSsvc")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ssvc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "SsvcInfo"), com.samsung.nms.agent.dataType.SsvcInfo.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("dactSsvc", _params, new javax.xml.namespace.QName("", "dactSsvcReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "SubsResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("SubscriberService", "dactSsvc"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("dactSsvc") == null) {
            _myOperations.put("dactSsvc", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("dactSsvc")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nAc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nPfx"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nDn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ci"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("regCdnAnm", _params, new javax.xml.namespace.QName("", "regCdnAnmReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "SubsResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("SubscriberService", "regCdnAnm"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("regCdnAnm") == null) {
            _myOperations.put("regCdnAnm", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("regCdnAnm")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("cancCdnAnm", _params, new javax.xml.namespace.QName("", "cancCdnAnmReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "SubsResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("SubscriberService", "cancCdnAnm"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("cancCdnAnm") == null) {
            _myOperations.put("cancCdnAnm", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("cancCdnAnm")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mgId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ssvc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "SsvcInfo"), com.samsung.nms.agent.dataType.SsvcInfo.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getSsvcInfo", _params, new javax.xml.namespace.QName("", "getSsvcInfoReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "SubsResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("SubscriberService", "getSsvcInfo"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getSsvcInfo") == null) {
            _myOperations.put("getSsvcInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getSsvcInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gdn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gln"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "hunt"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ansg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("crtePbxGrp", _params, new javax.xml.namespace.QName("", "crtePbxGrpReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "SubsResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("SubscriberService", "crtePbxGrp"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("crtePbxGrp") == null) {
            _myOperations.put("crtePbxGrp", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("crtePbxGrp")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gdn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gln"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "iln"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mgId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pln"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cnt"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "card"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "link"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("crtePbxLine", _params, new javax.xml.namespace.QName("", "crtePbxLineReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "SubsResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("SubscriberService", "crtePbxLine"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("crtePbxLine") == null) {
            _myOperations.put("crtePbxLine", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("crtePbxLine")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gdn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gln"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("dltPbxGrp", _params, new javax.xml.namespace.QName("", "dltPbxGrpReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "SubsResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("SubscriberService", "dltPbxGrp"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("dltPbxGrp") == null) {
            _myOperations.put("dltPbxGrp", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("dltPbxGrp")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gdn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gln"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "iln"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mgId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pln"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cnt"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "card"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "link"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("dltPbxLine", _params, new javax.xml.namespace.QName("", "dltPbxLineReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "SubsResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("SubscriberService", "dltPbxLine"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("dltPbxLine") == null) {
            _myOperations.put("dltPbxLine", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("dltPbxLine")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gdn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gln"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "hunt"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ansg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("chgPbxGrp", _params, new javax.xml.namespace.QName("", "chgPbxGrpReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "SubsResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("SubscriberService", "chgPbxGrp"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("chgPbxGrp") == null) {
            _myOperations.put("chgPbxGrp", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("chgPbxGrp")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gdn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gln"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "self"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getPbxGrp", _params, new javax.xml.namespace.QName("", "getPbxGrpReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "SubsResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("SubscriberService", "getPbxGrp"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getPbxGrp") == null) {
            _myOperations.put("getPbxGrp", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getPbxGrp")).add(_oper);
    }

    public SubscriberServiceSoapBindingSkeleton() {
		System.out.println("endpoint?");
        this.impl = new SubscriberService.SubscriberServiceSoapBindingImpl();
    }

    public SubscriberServiceSoapBindingSkeleton(SubscriberService.OSSSubscriberBean impl) {
        this.impl = impl;
    }
    public com.samsung.nms.agent.dataType.SubsResultInfo crteSln(int emsId, java.lang.String col, com.samsung.nms.agent.dataType.SlnInfo sln) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.SubsResultInfo ret = impl.crteSln(emsId, col, sln);
        return ret;
    }

    public com.samsung.nms.agent.dataType.SubsResultInfo dltSln(int emsId, java.lang.String col, java.lang.String dn, java.lang.String cnt) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.SubsResultInfo ret = impl.dltSln(emsId, col, dn, cnt);
        return ret;
    }

    public com.samsung.nms.agent.dataType.SubsResultInfo setSln(int emsId, java.lang.String col, com.samsung.nms.agent.dataType.SetSlnInfo setSln) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.SubsResultInfo ret = impl.setSln(emsId, col, setSln);
        return ret;
    }

    public com.samsung.nms.agent.dataType.SubsResultInfo getSlnInfo(int emsId, java.lang.String col, java.lang.String dn, java.lang.String mgId, java.lang.String pln, java.lang.String card, java.lang.String link, java.lang.String lln, java.lang.String cnt, java.lang.String mode) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.SubsResultInfo ret = impl.getSlnInfo(emsId, col, dn, mgId, pln, card, link, lln, cnt, mode);
        return ret;
    }

    public com.samsung.nms.agent.dataType.SubsResultInfo regSsvc(int emsId, java.lang.String col, java.lang.String dn, com.samsung.nms.agent.dataType.SsvcInfo ssvc, java.lang.String tdn, java.lang.String odn, java.lang.String mode, java.lang.String ac, java.lang.String time, java.lang.String tmstmr, java.lang.String asgId, java.lang.String sc, java.lang.String ddiCnt) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.SubsResultInfo ret = impl.regSsvc(emsId, col, dn, ssvc, tdn, odn, mode, ac, time, tmstmr, asgId, sc, ddiCnt);
        return ret;
    }

    public com.samsung.nms.agent.dataType.SubsResultInfo cancSsvc(int emsId, java.lang.String col, java.lang.String dn, com.samsung.nms.agent.dataType.SsvcInfo ssvc, java.lang.String ac, java.lang.String tdn, java.lang.String time, java.lang.String sc) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.SubsResultInfo ret = impl.cancSsvc(emsId, col, dn, ssvc, ac, tdn, time, sc);
        return ret;
    }

    public com.samsung.nms.agent.dataType.SubsResultInfo actSsvc(int emsId, java.lang.String col, java.lang.String dn, com.samsung.nms.agent.dataType.SsvcInfo ssvc, java.lang.String tmstmr) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.SubsResultInfo ret = impl.actSsvc(emsId, col, dn, ssvc, tmstmr);
        return ret;
    }

    public com.samsung.nms.agent.dataType.SubsResultInfo dactSsvc(int emsId, java.lang.String col, java.lang.String dn, com.samsung.nms.agent.dataType.SsvcInfo ssvc) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.SubsResultInfo ret = impl.dactSsvc(emsId, col, dn, ssvc);
        return ret;
    }

    public com.samsung.nms.agent.dataType.SubsResultInfo regCdnAnm(int emsId, java.lang.String col, java.lang.String dn, java.lang.String nAc, java.lang.String nPfx, java.lang.String nDn, java.lang.String ci) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.SubsResultInfo ret = impl.regCdnAnm(emsId, col, dn, nAc, nPfx, nDn, ci);
        return ret;
    }

    public com.samsung.nms.agent.dataType.SubsResultInfo cancCdnAnm(int emsId, java.lang.String col, java.lang.String dn) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.SubsResultInfo ret = impl.cancCdnAnm(emsId, col, dn);
        return ret;
    }

    public com.samsung.nms.agent.dataType.SubsResultInfo getSsvcInfo(int emsId, java.lang.String col, java.lang.String dn, java.lang.String mgId, com.samsung.nms.agent.dataType.SsvcInfo ssvc, java.lang.String type) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.SubsResultInfo ret = impl.getSsvcInfo(emsId, col, dn, mgId, ssvc, type);
        return ret;
    }

    public com.samsung.nms.agent.dataType.SubsResultInfo crtePbxGrp(int emsId, java.lang.String col, java.lang.String type, java.lang.String gdn, java.lang.String gln, java.lang.String hunt, java.lang.String cha, java.lang.String ansg) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.SubsResultInfo ret = impl.crtePbxGrp(emsId, col, type, gdn, gln, hunt, cha, ansg);
        return ret;
    }

    public com.samsung.nms.agent.dataType.SubsResultInfo crtePbxLine(int emsId, java.lang.String col, java.lang.String type, java.lang.String gdn, java.lang.String gln, java.lang.String iln, java.lang.String idn, java.lang.String mgId, java.lang.String pln, java.lang.String cnt, java.lang.String card, java.lang.String link) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.SubsResultInfo ret = impl.crtePbxLine(emsId, col, type, gdn, gln, iln, idn, mgId, pln, cnt, card, link);
        return ret;
    }

    public com.samsung.nms.agent.dataType.SubsResultInfo dltPbxGrp(int emsId, java.lang.String col, java.lang.String type, java.lang.String gdn, java.lang.String gln) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.SubsResultInfo ret = impl.dltPbxGrp(emsId, col, type, gdn, gln);
        return ret;
    }

    public com.samsung.nms.agent.dataType.SubsResultInfo dltPbxLine(int emsId, java.lang.String col, java.lang.String type, java.lang.String gdn, java.lang.String gln, java.lang.String iln, java.lang.String idn, java.lang.String mgId, java.lang.String pln, java.lang.String cnt, java.lang.String card, java.lang.String link) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.SubsResultInfo ret = impl.dltPbxLine(emsId, col, type, gdn, gln, iln, idn, mgId, pln, cnt, card, link);
        return ret;
    }

    public com.samsung.nms.agent.dataType.SubsResultInfo chgPbxGrp(int emsId, java.lang.String col, java.lang.String type, java.lang.String gdn, java.lang.String gln, java.lang.String hunt, java.lang.String cha, java.lang.String ansg) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.SubsResultInfo ret = impl.chgPbxGrp(emsId, col, type, gdn, gln, hunt, cha, ansg);
        return ret;
    }

    public com.samsung.nms.agent.dataType.SubsResultInfo getPbxGrp(int emsId, java.lang.String col, java.lang.String type, java.lang.String gdn, java.lang.String gln, java.lang.String mode, java.lang.String self) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.SubsResultInfo ret = impl.getPbxGrp(emsId, col, type, gdn, gln, mode, self);
        return ret;
    }

}
