package com.samsung.nms.agent.dataFnc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.samsung.nms.agent.dataType.SsvcInfo;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSsvcInfo", propOrder = {
    "emsId",
    "col",
    "dn",
    "mgId",
    "ssvc",
    "type"
})
public class GetSsvcInfo {

    @XmlElement(required = true, nillable = true)
    protected int emsId;
    protected String col;
    protected String dn;
    protected String mgId;
    protected SsvcInfo ssvc;
    protected String type;
    
	public int getEmsId() {
		return emsId;
	}
	public void setEmsId(int emsId) {
		this.emsId = emsId;
	}
	public String getCol() {
		return col;
	}
	public void setCol(String col) {
		this.col = col;
	}
	public String getDn() {
		return dn;
	}
	public void setDn(String dn) {
		this.dn = dn;
	}
	public String getMgId() {
		return mgId;
	}
	public void setMgId(String mgId) {
		this.mgId = mgId;
	}
	public SsvcInfo getSsvc() {
		return ssvc;
	}
	public void setSsvc(SsvcInfo ssvc) {
		this.ssvc = ssvc;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
    
}
