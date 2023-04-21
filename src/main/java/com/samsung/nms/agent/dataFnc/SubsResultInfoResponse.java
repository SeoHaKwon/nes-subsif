//
// 이 파일은 JAXB의 Eclipse 구현에 의해 생성되었습니다 3.0.0 버전을 통해 생성되었습니다. 
// https://eclipse-ee4j.github.io/jaxb-ri를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.04.19 시간 09:43:39 AM KST 
//


package com.samsung.nms.agent.dataFnc;

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
@XmlRootElement(name = "SubsResultInfoResponse")
public class SubsResultInfoResponse {

    @XmlElement(name = "SubsResultInfo", required = true)
    protected SubsResultInfo SubsResultInfo;

	public SubsResultInfo getSubsResultInfo() {
		return SubsResultInfo;
	}

	public void setSubsResultInfo(SubsResultInfo subsResultInfo) {
		SubsResultInfo = subsResultInfo;
	}
}
