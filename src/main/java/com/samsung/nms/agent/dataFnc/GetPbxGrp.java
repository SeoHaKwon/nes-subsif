package com.samsung.nms.agent.dataFnc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPbxGrp", propOrder = {
    "emsId",
    "col",
    "type",
    "gdn",
    "gln",
    "mode",
    "self"
})
public class GetPbxGrp {

    @XmlElement(required = true, nillable = true)
    protected int emsId;
    protected String col;
    protected String type;
    protected String gdn;
    protected String gln;
    protected String mode;
    protected String self;
    
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
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getSelf() {
		return self;
	}
	public void setSelf(String self) {
		this.self = self;
	}
    
}
