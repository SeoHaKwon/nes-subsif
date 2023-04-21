package com.samsung.nms.agent.dataFnc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.samsung.nms.agent.dataType.SlnInfo;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrteSln", propOrder = {
    "emsId",
    "col",
    "sln"
})
public class CrteSln {

    @XmlElement(required = true, nillable = true)
    protected int emsId;
    protected String col;
    @XmlElement(required = false, nillable = true)
    protected SlnInfo sln;
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
	public SlnInfo getSln() {
		return sln;
	}
	public void setSln(SlnInfo sln) {
		this.sln = sln;
	}
    
}
