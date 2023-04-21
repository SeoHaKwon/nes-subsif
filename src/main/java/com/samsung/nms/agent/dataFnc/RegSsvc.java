package com.samsung.nms.agent.dataFnc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.samsung.nms.agent.dataType.SsvcInfo;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegSsvc", propOrder = {
    "emsId",
    "col",
    "dn",
    "ssvc",
    "tdn",
    "odn",
    "mode",
    "ac",
    "time",
    "tmstmr",
    "asgId",
    "sc",
    "ddiCnt"
})
public class RegSsvc {

    @XmlElement(required = true, nillable = true)
    protected int emsId;
    protected String col;
    protected String dn;
    protected SsvcInfo ssvc;
    protected String tdn;
    protected String odn;
    protected String mode;
    protected String ac;
    protected String time;
    protected String tmstmr;
    protected String asgId;
    protected String sc;
    protected String ddiCnt;
    
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
	public String getOdn() {
		return odn;
	}
	public void setOdn(String odn) {
		this.odn = odn;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
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
	public String getTmstmr() {
		return tmstmr;
	}
	public void setTmstmr(String tmstmr) {
		this.tmstmr = tmstmr;
	}
	public String getAsgId() {
		return asgId;
	}
	public void setAsgId(String asgId) {
		this.asgId = asgId;
	}
	public String getSc() {
		return sc;
	}
	public void setSc(String sc) {
		this.sc = sc;
	}
	public String getDdiCnt() {
		return ddiCnt;
	}
	public void setDdiCnt(String ddiCnt) {
		this.ddiCnt = ddiCnt;
	}
    
}
