/**
 * SubsResObj.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.samsung.nms.agent.dataType;

public class SubsResObj  implements java.io.Serializable {
    private com.samsung.nms.agent.dataType.SlnInfo slnInfo;

    private com.samsung.nms.agent.dataType.SsvcInfoList ssvcInfoList;

    private com.samsung.nms.agent.dataType.PbxGrpInfoList pbxGrpInfoList;

    private com.samsung.nms.agent.dataType.PbxGrpLineInfo pbxGrpLineInfo;

    private com.samsung.nms.agent.dataType.PbxGrpLineResultList pbxGrpLineResultList;

    public SubsResObj() {
    }

    public SubsResObj(
           com.samsung.nms.agent.dataType.SlnInfo slnInfo,
           com.samsung.nms.agent.dataType.SsvcInfoList ssvcInfoList,
           com.samsung.nms.agent.dataType.PbxGrpInfoList pbxGrpInfoList,
           com.samsung.nms.agent.dataType.PbxGrpLineInfo pbxGrpLineInfo,
           com.samsung.nms.agent.dataType.PbxGrpLineResultList pbxGrpLineResultList) {
           this.slnInfo = slnInfo;
           this.ssvcInfoList = ssvcInfoList;
           this.pbxGrpInfoList = pbxGrpInfoList;
           this.pbxGrpLineInfo = pbxGrpLineInfo;
           this.pbxGrpLineResultList = pbxGrpLineResultList;
    }


    /**
     * Gets the slnInfo value for this SubsResObj.
     * 
     * @return slnInfo
     */
    public com.samsung.nms.agent.dataType.SlnInfo getSlnInfo() {
        return slnInfo;
    }


    /**
     * Sets the slnInfo value for this SubsResObj.
     * 
     * @param slnInfo
     */
    public void setSlnInfo(com.samsung.nms.agent.dataType.SlnInfo slnInfo) {
        this.slnInfo = slnInfo;
    }


    /**
     * Gets the ssvcInfoList value for this SubsResObj.
     * 
     * @return ssvcInfoList
     */
    public com.samsung.nms.agent.dataType.SsvcInfoList getSsvcInfoList() {
        return ssvcInfoList;
    }


    /**
     * Sets the ssvcInfoList value for this SubsResObj.
     * 
     * @param ssvcInfoList
     */
    public void setSsvcInfoList(com.samsung.nms.agent.dataType.SsvcInfoList ssvcInfoList) {
        this.ssvcInfoList = ssvcInfoList;
    }


    /**
     * Gets the pbxGrpInfoList value for this SubsResObj.
     * 
     * @return pbxGrpInfoList
     */
    public com.samsung.nms.agent.dataType.PbxGrpInfoList getPbxGrpInfoList() {
        return pbxGrpInfoList;
    }


    /**
     * Sets the pbxGrpInfoList value for this SubsResObj.
     * 
     * @param pbxGrpInfoList
     */
    public void setPbxGrpInfoList(com.samsung.nms.agent.dataType.PbxGrpInfoList pbxGrpInfoList) {
        this.pbxGrpInfoList = pbxGrpInfoList;
    }


    /**
     * Gets the pbxGrpLineInfo value for this SubsResObj.
     * 
     * @return pbxGrpLineInfo
     */
    public com.samsung.nms.agent.dataType.PbxGrpLineInfo getPbxGrpLineInfo() {
        return pbxGrpLineInfo;
    }


    /**
     * Sets the pbxGrpLineInfo value for this SubsResObj.
     * 
     * @param pbxGrpLineInfo
     */
    public void setPbxGrpLineInfo(com.samsung.nms.agent.dataType.PbxGrpLineInfo pbxGrpLineInfo) {
        this.pbxGrpLineInfo = pbxGrpLineInfo;
    }


    /**
     * Gets the pbxGrpLineResultList value for this SubsResObj.
     * 
     * @return pbxGrpLineResultList
     */
    public com.samsung.nms.agent.dataType.PbxGrpLineResultList getPbxGrpLineResultList() {
        return pbxGrpLineResultList;
    }


    /**
     * Sets the pbxGrpLineResultList value for this SubsResObj.
     * 
     * @param pbxGrpLineResultList
     */
    public void setPbxGrpLineResultList(com.samsung.nms.agent.dataType.PbxGrpLineResultList pbxGrpLineResultList) {
        this.pbxGrpLineResultList = pbxGrpLineResultList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubsResObj)) return false;
        SubsResObj other = (SubsResObj) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.slnInfo==null && other.getSlnInfo()==null) || 
             (this.slnInfo!=null &&
              this.slnInfo.equals(other.getSlnInfo()))) &&
            ((this.ssvcInfoList==null && other.getSsvcInfoList()==null) || 
             (this.ssvcInfoList!=null &&
              this.ssvcInfoList.equals(other.getSsvcInfoList()))) &&
            ((this.pbxGrpInfoList==null && other.getPbxGrpInfoList()==null) || 
             (this.pbxGrpInfoList!=null &&
              this.pbxGrpInfoList.equals(other.getPbxGrpInfoList()))) &&
            ((this.pbxGrpLineInfo==null && other.getPbxGrpLineInfo()==null) || 
             (this.pbxGrpLineInfo!=null &&
              this.pbxGrpLineInfo.equals(other.getPbxGrpLineInfo()))) &&
            ((this.pbxGrpLineResultList==null && other.getPbxGrpLineResultList()==null) || 
             (this.pbxGrpLineResultList!=null &&
              this.pbxGrpLineResultList.equals(other.getPbxGrpLineResultList())));
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
        if (getSlnInfo() != null) {
            _hashCode += getSlnInfo().hashCode();
        }
        if (getSsvcInfoList() != null) {
            _hashCode += getSsvcInfoList().hashCode();
        }
        if (getPbxGrpInfoList() != null) {
            _hashCode += getPbxGrpInfoList().hashCode();
        }
        if (getPbxGrpLineInfo() != null) {
            _hashCode += getPbxGrpLineInfo().hashCode();
        }
        if (getPbxGrpLineResultList() != null) {
            _hashCode += getPbxGrpLineResultList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubsResObj.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "SubsResObj"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("slnInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "slnInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "SlnInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ssvcInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ssvcInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "SsvcInfoList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pbxGrpInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pbxGrpInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "PbxGrpInfoList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pbxGrpLineInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pbxGrpLineInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "PbxGrpLineInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pbxGrpLineResultList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PbxGrpLineResultList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "PbxGrpLineResultList"));
        elemField.setMinOccurs(0);
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
