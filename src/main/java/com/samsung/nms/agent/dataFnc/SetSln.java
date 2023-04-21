package com.samsung.nms.agent.dataFnc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.samsung.nms.agent.dataType.SetSlnInfo;
import com.samsung.nms.agent.dataType.SlnInfo;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetSln", propOrder = {
    "emsId",
    "col",
    "setSln"
})
public class SetSln {

    @XmlElement(required = true, nillable = true)
    protected int emsId;
    protected String col;
    @XmlElement(required = false, nillable = true)
    protected SetSlnInfo setSln;
    
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
	public SetSlnInfo getSetSln() {
		return setSln;
	}
	public void setSetSln(SetSlnInfo setSln) {
		this.setSln = setSln;
	}
	
    
}
