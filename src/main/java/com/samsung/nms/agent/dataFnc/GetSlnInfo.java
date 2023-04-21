package com.samsung.nms.agent.dataFnc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSlnInfo", propOrder = {
    "emsId",
    "col",
    "dn",
    "mgId",
    "pln",
    "card",
    "link",
    "lln",
    "cnt",
    "mode"
})
public class GetSlnInfo {

    @XmlElement(required = true, nillable = true)
    protected int emsId;
    protected String col;
    protected String dn;
    protected String mgId;
    protected String pln;
    protected String card;
    protected String link;
    protected String lln;
    protected String cnt;
    protected String mode;
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
	public String getPln() {
		return pln;
	}
	public void setPln(String pln) {
		this.pln = pln;
	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getLln() {
		return lln;
	}
	public void setLln(String lln) {
		this.lln = lln;
	}
	public String getCnt() {
		return cnt;
	}
	public void setCnt(String cnt) {
		this.cnt = cnt;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
}
