package com.samsung.nms.agent.dataFnc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.samsung.nms.agent.dataType.SsvcInfo;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActSsvc", propOrder = {
    "emsId",
    "col",
    "dn",
    "ssvc",
    "tmstmr"
})
public class ActSsvc {

    @XmlElement(required = true, nillable = true)
    protected int emsId;
    protected String col;
    protected String dn;
    protected SsvcInfo ssvc;
    protected String tmstmr;
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
	public SsvcInfo getSsvc() {
		return ssvc;
	}
	public void setSsvc(SsvcInfo ssvc) {
		this.ssvc = ssvc;
	}
	public String getTmstmr() {
		return tmstmr;
	}
	public void setTmstmr(String tmstmr) {
		this.tmstmr = tmstmr;
	}
    
    
}
