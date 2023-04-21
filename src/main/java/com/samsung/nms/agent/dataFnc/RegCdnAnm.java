package com.samsung.nms.agent.dataFnc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegCdnAnm", propOrder = {
    "emsId",
    "col",
    "dn",
    "nAc",
    "nPfx",
    "nDn",
    "ci"
})
public class RegCdnAnm {

    @XmlElement(required = true, nillable = true)
    protected int emsId;
    protected String col;
    protected String dn;
    protected String nAc;
    protected String nPfx;
    protected String nDn;
    protected String ci;
    
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
	public String getnAc() {
		return nAc;
	}
	public void setnAc(String nAc) {
		this.nAc = nAc;
	}
	public String getnPfx() {
		return nPfx;
	}
	public void setnPfx(String nPfx) {
		this.nPfx = nPfx;
	}
	public String getnDn() {
		return nDn;
	}
	public void setnDn(String nDn) {
		this.nDn = nDn;
	}
	public String getCi() {
		return ci;
	}
	public void setCi(String ci) {
		this.ci = ci;
	}
    
}
