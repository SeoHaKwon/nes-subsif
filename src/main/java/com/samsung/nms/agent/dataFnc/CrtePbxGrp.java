package com.samsung.nms.agent.dataFnc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrtePbxGrp", propOrder = {
    "emsId",
    "col",
    "type",
    "gdn",
    "gln",
    "hunt",
    "cha",
    "ansg"
})
public class CrtePbxGrp {

    @XmlElement(required = true, nillable = true)
    protected int emsId;
    protected String col;
    protected String type;
    protected String gdn;
    protected String gln;
    protected String hunt;
    protected String cha;
    protected String ansg;
    
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
	public String getHunt() {
		return hunt;
	}
	public void setHunt(String hunt) {
		this.hunt = hunt;
	}
	public String getCha() {
		return cha;
	}
	public void setCha(String cha) {
		this.cha = cha;
	}
	public String getAnsg() {
		return ansg;
	}
	public void setAnsg(String ansg) {
		this.ansg = ansg;
	}
    
}
