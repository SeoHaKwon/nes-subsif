package com.ipageon.subsif.rest.vo;

import com.samsung.nms.agent.dataType.SsvcInfo;

import lombok.Data;

@Data
public class DactSsvcVO {
	private Integer emsId;
	private String col;
	private String dn;
	private SsvcInfo SsvcInfo;
}
