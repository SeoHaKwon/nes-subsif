package com.samsung.nms.agent.dataFnc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.samsung.nms.agent.dataType.SsvcInfo;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancSsvc", propOrder = {
    "emsId",
    "col",
    "dn",
    "ssvc",
    "tdn",
    "ac",
    "time",
    "sc"
})
public class CancSsvc {

    @XmlElement(required = true, nillable = true)
    protected int emsId;
    protected String col;
    protected String dn;
    protected SsvcInfo ssvc;
    protected String tdn;
    protected String ac;
    protected String time;
    protected String sc;
    
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
	public String getTdn() {
		return tdn;
	}
	public void setTdn(String tdn) {
		this.tdn = tdn;
	}
	public String getAc() {
		return ac;
	}
	public void setAc(String ac) {
		this.ac = ac;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getSc() {
		return sc;
	}
	public void setSc(String sc) {
		this.sc = sc;
	}
    
}
