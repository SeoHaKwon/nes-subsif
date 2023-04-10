/**
 * PbxGrpInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.samsung.nms.agent.dataType;

public class PbxGrpInfo  implements java.io.Serializable {
    private java.lang.String type;

    private java.lang.String gdn;

    private java.lang.String lnp_dn;

    private java.lang.String gln;

    private java.lang.String ptr;

    private java.lang.String hunt_type;

    private java.lang.String cha_type;

    private java.lang.String ansg_type;

    private java.lang.String busy;

    private java.lang.String total;

    private com.samsung.nms.agent.dataType.PbxGrpLineInfo[] arrayOfPbxGrpLineInfo;

    public PbxGrpInfo() {
    }

    public PbxGrpInfo(
           java.lang.String type,
           java.lang.String gdn,
           java.lang.String lnp_dn,
           java.lang.String gln,
           java.lang.String ptr,
           java.lang.String hunt_type,
           java.lang.String cha_type,
           java.lang.String ansg_type,
           java.lang.String busy,
           java.lang.String total,
           com.samsung.nms.agent.dataType.PbxGrpLineInfo[] arrayOfPbxGrpLineInfo) {
           this.type = type;
           this.gdn = gdn;
           this.lnp_dn = lnp_dn;
           this.gln = gln;
           this.ptr = ptr;
           this.hunt_type = hunt_type;
           this.cha_type = cha_type;
           this.ansg_type = ansg_type;
           this.busy = busy;
           this.total = total;
           this.arrayOfPbxGrpLineInfo = arrayOfPbxGrpLineInfo;
    }


    /**
     * Gets the type value for this PbxGrpInfo.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this PbxGrpInfo.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the gdn value for this PbxGrpInfo.
     * 
     * @return gdn
     */
    public java.lang.String getGdn() {
        return gdn;
    }


    /**
     * Sets the gdn value for this PbxGrpInfo.
     * 
     * @param gdn
     */
    public void setGdn(java.lang.String gdn) {
        this.gdn = gdn;
    }


    /**
     * Gets the lnp_dn value for this PbxGrpInfo.
     * 
     * @return lnp_dn
     */
    public java.lang.String getLnp_dn() {
        return lnp_dn;
    }


    /**
     * Sets the lnp_dn value for this PbxGrpInfo.
     * 
     * @param lnp_dn
     */
    public void setLnp_dn(java.lang.String lnp_dn) {
        this.lnp_dn = lnp_dn;
    }


    /**
     * Gets the gln value for this PbxGrpInfo.
     * 
     * @return gln
     */
    public java.lang.String getGln() {
        return gln;
    }


    /**
     * Sets the gln value for this PbxGrpInfo.
     * 
     * @param gln
     */
    public void setGln(java.lang.String gln) {
        this.gln = gln;
    }


    /**
     * Gets the ptr value for this PbxGrpInfo.
     * 
     * @return ptr
     */
    public java.lang.String getPtr() {
        return ptr;
    }


    /**
     * Sets the ptr value for this PbxGrpInfo.
     * 
     * @param ptr
     */
    public void setPtr(java.lang.String ptr) {
        this.ptr = ptr;
    }


    /**
     * Gets the hunt_type value for this PbxGrpInfo.
     * 
     * @return hunt_type
     */
    public java.lang.String getHunt_type() {
        return hunt_type;
    }


    /**
     * Sets the hunt_type value for this PbxGrpInfo.
     * 
     * @param hunt_type
     */
    public void setHunt_type(java.lang.String hunt_type) {
        this.hunt_type = hunt_type;
    }


    /**
     * Gets the cha_type value for this PbxGrpInfo.
     * 
     * @return cha_type
     */
    public java.lang.String getCha_type() {
        return cha_type;
    }


    /**
     * Sets the cha_type value for this PbxGrpInfo.
     * 
     * @param cha_type
     */
    public void setCha_type(java.lang.String cha_type) {
        this.cha_type = cha_type;
    }


    /**
     * Gets the ansg_type value for this PbxGrpInfo.
     * 
     * @return ansg_type
     */
    public java.lang.String getAnsg_type() {
        return ansg_type;
    }


    /**
     * Sets the ansg_type value for this PbxGrpInfo.
     * 
     * @param ansg_type
     */
    public void setAnsg_type(java.lang.String ansg_type) {
        this.ansg_type = ansg_type;
    }


    /**
     * Gets the busy value for this PbxGrpInfo.
     * 
     * @return busy
     */
    public java.lang.String getBusy() {
        return busy;
    }


    /**
     * Sets the busy value for this PbxGrpInfo.
     * 
     * @param busy
     */
    public void setBusy(java.lang.String busy) {
        this.busy = busy;
    }


    /**
     * Gets the total value for this PbxGrpInfo.
     * 
     * @return total
     */
    public java.lang.String getTotal() {
        return total;
    }


    /**
     * Sets the total value for this PbxGrpInfo.
     * 
     * @param total
     */
    public void setTotal(java.lang.String total) {
        this.total = total;
    }


    /**
     * Gets the arrayOfPbxGrpLineInfo value for this PbxGrpInfo.
     * 
     * @return arrayOfPbxGrpLineInfo
     */
    public com.samsung.nms.agent.dataType.PbxGrpLineInfo[] getArrayOfPbxGrpLineInfo() {
        return arrayOfPbxGrpLineInfo;
    }


    /**
     * Sets the arrayOfPbxGrpLineInfo value for this PbxGrpInfo.
     * 
     * @param arrayOfPbxGrpLineInfo
     */
    public void setArrayOfPbxGrpLineInfo(com.samsung.nms.agent.dataType.PbxGrpLineInfo[] arrayOfPbxGrpLineInfo) {
        this.arrayOfPbxGrpLineInfo = arrayOfPbxGrpLineInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PbxGrpInfo)) return false;
        PbxGrpInfo other = (PbxGrpInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.gdn==null && other.getGdn()==null) || 
             (this.gdn!=null &&
              this.gdn.equals(other.getGdn()))) &&
            ((this.lnp_dn==null && other.getLnp_dn()==null) || 
             (this.lnp_dn!=null &&
              this.lnp_dn.equals(other.getLnp_dn()))) &&
            ((this.gln==null && other.getGln()==null) || 
             (this.gln!=null &&
              this.gln.equals(other.getGln()))) &&
            ((this.ptr==null && other.getPtr()==null) || 
             (this.ptr!=null &&
              this.ptr.equals(other.getPtr()))) &&
            ((this.hunt_type==null && other.getHunt_type()==null) || 
             (this.hunt_type!=null &&
              this.hunt_type.equals(other.getHunt_type()))) &&
            ((this.cha_type==null && other.getCha_type()==null) || 
             (this.cha_type!=null &&
              this.cha_type.equals(other.getCha_type()))) &&
            ((this.ansg_type==null && other.getAnsg_type()==null) || 
             (this.ansg_type!=null &&
              this.ansg_type.equals(other.getAnsg_type()))) &&
            ((this.busy==null && other.getBusy()==null) || 
             (this.busy!=null &&
              this.busy.equals(other.getBusy()))) &&
            ((this.total==null && other.getTotal()==null) || 
             (this.total!=null &&
              this.total.equals(other.getTotal()))) &&
            ((this.arrayOfPbxGrpLineInfo==null && other.getArrayOfPbxGrpLineInfo()==null) || 
             (this.arrayOfPbxGrpLineInfo!=null &&
              java.util.Arrays.equals(this.arrayOfPbxGrpLineInfo, other.getArrayOfPbxGrpLineInfo())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getGdn() != null) {
            _hashCode += getGdn().hashCode();
        }
        if (getLnp_dn() != null) {
            _hashCode += getLnp_dn().hashCode();
        }
        if (getGln() != null) {
            _hashCode += getGln().hashCode();
        }
        if (getPtr() != null) {
            _hashCode += getPtr().hashCode();
        }
        if (getHunt_type() != null) {
            _hashCode += getHunt_type().hashCode();
        }
        if (getCha_type() != null) {
            _hashCode += getCha_type().hashCode();
        }
        if (getAnsg_type() != null) {
            _hashCode += getAnsg_type().hashCode();
        }
        if (getBusy() != null) {
            _hashCode += getBusy().hashCode();
        }
        if (getTotal() != null) {
            _hashCode += getTotal().hashCode();
        }
        if (getArrayOfPbxGrpLineInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArrayOfPbxGrpLineInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArrayOfPbxGrpLineInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PbxGrpInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "PbxGrpInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
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
        elemField.setFieldName("lnp_dn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lnp_dn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gln");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gln"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ptr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ptr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hunt_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hunt_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cha_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cha_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ansg_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ansg_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("busy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "busy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total");
        elemField.setXmlName(new javax.xml.namespace.QName("", "total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrayOfPbxGrpLineInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arrayOfPbxGrpLineInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "PbxGrpLineInfo"));
        elemField.setNillable(false);
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
