/**
 * SsvcInfoList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.samsung.nms.agent.dataType;

public class SsvcInfoList  implements java.io.Serializable {
    private java.lang.Integer emsId;

    private java.lang.String col;

    private com.samsung.nms.agent.dataType.OneOfSsvcInfo oneOfSsvcInfo;

    private com.samsung.nms.agent.dataType.SsvcInfo[] arrayOfSsvcInfo;

    public SsvcInfoList() {
    }

    public SsvcInfoList(
           java.lang.Integer emsId,
           java.lang.String col,
           com.samsung.nms.agent.dataType.OneOfSsvcInfo oneOfSsvcInfo,
           com.samsung.nms.agent.dataType.SsvcInfo[] arrayOfSsvcInfo) {
           this.emsId = emsId;
           this.col = col;
           this.oneOfSsvcInfo = oneOfSsvcInfo;
           this.arrayOfSsvcInfo = arrayOfSsvcInfo;
    }


    /**
     * Gets the emsId value for this SsvcInfoList.
     * 
     * @return emsId
     */
    public java.lang.Integer getEmsId() {
        return emsId;
    }


    /**
     * Sets the emsId value for this SsvcInfoList.
     * 
     * @param emsId
     */
    public void setEmsId(java.lang.Integer emsId) {
        this.emsId = emsId;
    }


    /**
     * Gets the col value for this SsvcInfoList.
     * 
     * @return col
     */
    public java.lang.String getCol() {
        return col;
    }


    /**
     * Sets the col value for this SsvcInfoList.
     * 
     * @param col
     */
    public void setCol(java.lang.String col) {
        this.col = col;
    }


    /**
     * Gets the oneOfSsvcInfo value for this SsvcInfoList.
     * 
     * @return oneOfSsvcInfo
     */
    public com.samsung.nms.agent.dataType.OneOfSsvcInfo getOneOfSsvcInfo() {
        return oneOfSsvcInfo;
    }


    /**
     * Sets the oneOfSsvcInfo value for this SsvcInfoList.
     * 
     * @param oneOfSsvcInfo
     */
    public void setOneOfSsvcInfo(com.samsung.nms.agent.dataType.OneOfSsvcInfo oneOfSsvcInfo) {
        this.oneOfSsvcInfo = oneOfSsvcInfo;
    }


    /**
     * Gets the arrayOfSsvcInfo value for this SsvcInfoList.
     * 
     * @return arrayOfSsvcInfo
     */
    public com.samsung.nms.agent.dataType.SsvcInfo[] getArrayOfSsvcInfo() {
        return arrayOfSsvcInfo;
    }


    /**
     * Sets the arrayOfSsvcInfo value for this SsvcInfoList.
     * 
     * @param arrayOfSsvcInfo
     */
    public void setArrayOfSsvcInfo(com.samsung.nms.agent.dataType.SsvcInfo[] arrayOfSsvcInfo) {
        this.arrayOfSsvcInfo = arrayOfSsvcInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SsvcInfoList)) return false;
        SsvcInfoList other = (SsvcInfoList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.emsId==null && other.getEmsId()==null) || 
             (this.emsId!=null &&
              this.emsId.equals(other.getEmsId()))) &&
            ((this.col==null && other.getCol()==null) || 
             (this.col!=null &&
              this.col.equals(other.getCol()))) &&
            ((this.oneOfSsvcInfo==null && other.getOneOfSsvcInfo()==null) || 
             (this.oneOfSsvcInfo!=null &&
              this.oneOfSsvcInfo.equals(other.getOneOfSsvcInfo()))) &&
            ((this.arrayOfSsvcInfo==null && other.getArrayOfSsvcInfo()==null) || 
             (this.arrayOfSsvcInfo!=null &&
              java.util.Arrays.equals(this.arrayOfSsvcInfo, other.getArrayOfSsvcInfo())));
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
        if (getEmsId() != null) {
            _hashCode += getEmsId().hashCode();
        }
        if (getCol() != null) {
            _hashCode += getCol().hashCode();
        }
        if (getOneOfSsvcInfo() != null) {
            _hashCode += getOneOfSsvcInfo().hashCode();
        }
        if (getArrayOfSsvcInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArrayOfSsvcInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArrayOfSsvcInfo(), i);
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
        new org.apache.axis.description.TypeDesc(SsvcInfoList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "SsvcInfoList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emsId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emsId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("col");
        elemField.setXmlName(new javax.xml.namespace.QName("", "col"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oneOfSsvcInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oneOfSsvcInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "OneOfSsvcInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrayOfSsvcInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arrayOfSsvcInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "SsvcInfo"));
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
