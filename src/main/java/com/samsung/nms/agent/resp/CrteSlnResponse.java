package com.samsung.nms.agent.resp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.samsung.nms.agent.dataType.SubsResultInfo;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "SubsResultInfo"
})
@XmlRootElement(name = "sub:crteSlnResponse")
public class CrteSlnResponse {
	
    @XmlElement(name = "crteSlnReturn", required = true, type = SubsResultInfo.class)
    protected SubsResultInfo SubsResultInfo;

	public SubsResultInfo getSubsResultInfo() {
		return SubsResultInfo;
	}

	public void setSubsResultInfo(SubsResultInfo subsResultInfo) {
		SubsResultInfo = subsResultInfo;
	}
}
