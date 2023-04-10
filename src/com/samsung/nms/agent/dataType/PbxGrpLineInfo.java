/**
 * PbxGrpLineInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.samsung.nms.agent.dataType;

public class PbxGrpLineInfo  implements java.io.Serializable {
    private java.lang.String lln;

    private java.lang.String mgId;

    private java.lang.String pln;

    private java.lang.String lnp_dn;

    private java.lang.String dn;

    private java.lang.String ln_sts;

    private java.lang.String call_sts;

    public PbxGrpLineInfo() {
    }

    public PbxGrpLineInfo(
           java.lang.String lln,
           java.lang.String mgId,
           java.lang.String pln,
           java.lang.String lnp_dn,
           java.lang.String dn,
           java.lang.String ln_sts,
           java.lang.String call_sts) {
           this.lln = lln;
           this.mgId = mgId;
           this.pln = pln;
           this.lnp_dn = lnp_dn;
           this.dn = dn;
           this.ln_sts = ln_sts;
           this.call_sts = call_sts;
    }


    /**
     * Gets the lln value for this PbxGrpLineInfo.
     * 
     * @return lln
     */
    public java.lang.String getLln() {
        return lln;
    }


    /**
     * Sets the lln value for this PbxGrpLineInfo.
     * 
     * @param lln
     */
    public void setLln(java.lang.String lln) {
        this.lln = lln;
    }


    /**
     * Gets the mgId value for this PbxGrpLineInfo.
     * 
     * @return mgId
     */
    public java.lang.String getMgId() {
        return mgId;
    }


    /**
     * Sets the mgId value for this PbxGrpLineInfo.
     * 
     * @param mgId
     */
    public void setMgId(java.lang.String mgId) {
        this.mgId = mgId;
    }


    /**
     * Gets the pln value for this PbxGrpLineInfo.
     * 
     * @return pln
     */
    public java.lang.String getPln() {
        return pln;
    }


    /**
     * Sets the pln value for this PbxGrpLineInfo.
     * 
     * @param pln
     */
    public void setPln(java.lang.String pln) {
        this.pln = pln;
    }


    /**
     * Gets the lnp_dn value for this PbxGrpLineInfo.
     * 
     * @return lnp_dn
     */
    public java.lang.String getLnp_dn() {
        return lnp_dn;
    }


    /**
     * Sets the lnp_dn value for this PbxGrpLineInfo.
     * 
     * @param lnp_dn
     */
    public void setLnp_dn(java.lang.String lnp_dn) {
        this.lnp_dn = lnp_dn;
    }


    /**
     * Gets the dn value for this PbxGrpLineInfo.
     * 
     * @return dn
     */
    public java.lang.String getDn() {
        return dn;
    }


    /**
     * Sets the dn value for this PbxGrpLineInfo.
     * 
     * @param dn
     */
    public void setDn(java.lang.String dn) {
        this.dn = dn;
    }


    /**
     * Gets the ln_sts value for this PbxGrpLineInfo.
     * 
     * @return ln_sts
     */
    public java.lang.String getLn_sts() {
        return ln_sts;
    }


    /**
     * Sets the ln_sts value for this PbxGrpLineInfo.
     * 
     * @param ln_sts
     */
    public void setLn_sts(java.lang.String ln_sts) {
        this.ln_sts = ln_sts;
    }


    /**
     * Gets the call_sts value for this PbxGrpLineInfo.
     * 
     * @return call_sts
     */
    public java.lang.String getCall_sts() {
        return call_sts;
    }


    /**
     * Sets the call_sts value for this PbxGrpLineInfo.
     * 
     * @param call_sts
     */
    public void setCall_sts(java.lang.String call_sts) {
        this.call_sts = call_sts;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PbxGrpLineInfo)) return false;
        PbxGrpLineInfo other = (PbxGrpLineInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lln==null && other.getLln()==null) || 
             (this.lln!=null &&
              this.lln.equals(other.getLln()))) &&
            ((this.mgId==null && other.getMgId()==null) || 
             (this.mgId!=null &&
              this.mgId.equals(other.getMgId()))) &&
            ((this.pln==null && other.getPln()==null) || 
             (this.pln!=null &&
              this.pln.equals(other.getPln()))) &&
            ((this.lnp_dn==null && other.getLnp_dn()==null) || 
             (this.lnp_dn!=null &&
              this.lnp_dn.equals(other.getLnp_dn()))) &&
            ((this.dn==null && other.getDn()==null) || 
             (this.dn!=null &&
              this.dn.equals(other.getDn()))) &&
            ((this.ln_sts==null && other.getLn_sts()==null) || 
             (this.ln_sts!=null &&
              this.ln_sts.equals(other.getLn_sts()))) &&
            ((this.call_sts==null && other.getCall_sts()==null) || 
             (this.call_sts!=null &&
              this.call_sts.equals(other.getCall_sts())));
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
        if (getLln() != null) {
            _hashCode += getLln().hashCode();
        }
        if (getMgId() != null) {
            _hashCode += getMgId().hashCode();
        }
        if (getPln() != null) {
            _hashCode += getPln().hashCode();
        }
        if (getLnp_dn() != null) {
            _hashCode += getLnp_dn().hashCode();
        }
        if (getDn() != null) {
            _hashCode += getDn().hashCode();
        }
        if (getLn_sts() != null) {
            _hashCode += getLn_sts().hashCode();
        }
        if (getCall_sts() != null) {
            _hashCode += getCall_sts().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PbxGrpLineInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "PbxGrpLineInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lln");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lln"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mgId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mgId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pln");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pln"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lnp_dn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lnp_dn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ln_sts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ln_sts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("call_sts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "call_sts"));
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
