package com.ipageon.subsif.rest.vo;

import com.samsung.nms.agent.dataType.SsvcInfo;

import lombok.Data;

@Data
public class GetSsvcInfoVO {
	private Integer emsId;
	private String col;
	private String dn;
	private String mgId;
	private SsvcInfo SsvcInfo;
	private String type;
}
