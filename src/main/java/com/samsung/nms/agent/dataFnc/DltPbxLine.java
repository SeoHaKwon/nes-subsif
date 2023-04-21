package com.samsung.nms.agent.dataFnc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DltPbxLine", propOrder = {
    "emsId",
    "col",
    "type",
    "gdn",
    "gln",
    "iln",
    "idn",
    "mgId",
    "pln",
    "cnt",
    "card",
    "link"
})
public class DltPbxLine {

    @XmlElement(required = true, nillable = true)
    protected int emsId;
    protected String col;
    protected String type;
    protected String gdn;
    protected String gln;
    protected String iln;
    protected String idn;
    protected String mgId;
    protected String pln;
    protected String cnt;
    protected String card;
    protected String link;
    
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getGdn() {
		return gdn;
	}
	public void setGdn(String gdn) {
		this.gdn = gdn;
	}
	public String getGln() {
		return gln;
	}
	public void setGln(String gln) {
		this.gln = gln;
	}
	public String getIln() {
		return iln;
	}
	public void setIln(String iln) {
		this.iln = iln;
	}
	public String getIdn() {
		return idn;
	}
	public void setIdn(String idn) {
		this.idn = idn;
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
	public String getCnt() {
		return cnt;
	}
	public void setCnt(String cnt) {
		this.cnt = cnt;
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
    
}
