/**
 * PbxGrpLineResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.samsung.nms.agent.dataType;

public class PbxGrpLineResult  implements java.io.Serializable {
    private java.lang.String result;

    private java.lang.String reason;

    private java.lang.String gdn;

    private java.lang.String idn;

    public PbxGrpLineResult() {
    }

    public PbxGrpLineResult(
           java.lang.String result,
           java.lang.String reason,
           java.lang.String gdn,
           java.lang.String idn) {
           this.result = result;
           this.reason = reason;
           this.gdn = gdn;
           this.idn = idn;
    }


    /**
     * Gets the result value for this PbxGrpLineResult.
     * 
     * @return result
     */
    public java.lang.String getResult() {
        return result;
    }


    /**
     * Sets the result value for this PbxGrpLineResult.
     * 
     * @param result
     */
    public void setResult(java.lang.String result) {
        this.result = result;
    }


    /**
     * Gets the reason value for this PbxGrpLineResult.
     * 
     * @return reason
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this PbxGrpLineResult.
     * 
     * @param reason
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }


    /**
     * Gets the gdn value for this PbxGrpLineResult.
     * 
     * @return gdn
     */
    public java.lang.String getGdn() {
        return gdn;
    }


    /**
     * Sets the gdn value for this PbxGrpLineResult.
     * 
     * @param gdn
     */
    public void setGdn(java.lang.String gdn) {
        this.gdn = gdn;
    }


    /**
     * Gets the idn value for this PbxGrpLineResult.
     * 
     * @return idn
     */
    public java.lang.String getIdn() {
        return idn;
    }


    /**
     * Sets the idn value for this PbxGrpLineResult.
     * 
     * @param idn
     */
    public void setIdn(java.lang.String idn) {
        this.idn = idn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PbxGrpLineResult)) return false;
        PbxGrpLineResult other = (PbxGrpLineResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              this.result.equals(other.getResult()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason()))) &&
            ((this.gdn==null && other.getGdn()==null) || 
             (this.gdn!=null &&
              this.gdn.equals(other.getGdn()))) &&
            ((this.idn==null && other.getIdn()==null) || 
             (this.idn!=null &&
              this.idn.equals(other.getIdn())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getResult() != null) {
            _hashCode += getResult().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        if (getGdn() != null) {
            _hashCode += getGdn().hashCode();
        }
        if (getIdn() != null) {
            _hashCode += getIdn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PbxGrpLineResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "PbxGrpLineResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gdn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
